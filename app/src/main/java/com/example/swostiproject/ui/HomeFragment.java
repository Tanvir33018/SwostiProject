package com.example.swostiproject.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.swostiproject.R;
import com.example.swostiproject.databinding.HomeFragmentBinding;
import com.example.swostiproject.network_model.collection_sheet_model.CollectionSheetModel;
import com.example.swostiproject.network_model.member_info_model.MemberInfoModel;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;
    private HomeFragmentBinding mBinding;
    private ArrayAdapter<CharSequence> mAdapterAdd;
    private Spinner mSpinner;
    private MutableLiveData<MemberInfoModel> mMemberInfoModelData;
    private MutableLiveData<CollectionSheetModel> mCollectionSheetModelData;
    private MemberInfoModel mMemberInfoModel;
    private CollectionSheetModel mCollectionSheetModel;
    private static final String TAG = "HomeFragment";

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        mBinding = HomeFragmentBinding.inflate(inflater,container,false);
        initialization();
        spinnerSetup();
        loadData();

        return mBinding.getRoot();
    }

    private void initialization() {
        mMemberInfoModel = new MemberInfoModel();
        mCollectionSheetModel = new CollectionSheetModel();
        mMemberInfoModelData = new MutableLiveData<>();
    }

    private void loadData() {
        mMemberInfoModelData = mViewModel.loadMemberInfo(getContext());
        mMemberInfoModelData.observe(getViewLifecycleOwner(), new Observer<MemberInfoModel>() {
            @Override
            public void onChanged(MemberInfoModel memberInfoModel) {
                mMemberInfoModel = memberInfoModel;
                Log.d(TAG, "onChanged: ");
            }
        });


        mCollectionSheetModelData = mViewModel.loadCollectionSheetModelData(getContext());
        mCollectionSheetModelData.observe(getViewLifecycleOwner(), new Observer<CollectionSheetModel>() {
            @Override
            public void onChanged(CollectionSheetModel collectionSheetModel) {
                mCollectionSheetModel = collectionSheetModel;

                Log.d(TAG, "onChanged: ");
            }
        });

    }

    private void spinnerSetup() {
        mSpinner = mBinding.topSpinner;
        mAdapterAdd = ArrayAdapter.createFromResource(getContext(), R.array.UserType, android.R.layout.simple_spinner_item);
        mAdapterAdd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(mAdapterAdd);
    }


}
package com.example.swostiproject.ui;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.swostiproject.network.NetworkClient;
import com.example.swostiproject.network_model.collection_sheet_model.CollectionSheetModel;
import com.example.swostiproject.network_model.member_info_model.MemberInfoModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeClient extends NetworkClient {
    public HomeClient(Context mContext) {
        super(mContext);
    }

    public MutableLiveData<MemberInfoModel> loadMemberInfo() {
        MutableLiveData<MemberInfoModel> mData = new MutableLiveData<>();
        getmClient().getMemberInfo().enqueue(new Callback<MemberInfoModel>() {
            @Override
            public void onResponse(Call<MemberInfoModel> call, Response<MemberInfoModel> response) {
                if (response.isSuccessful()){
                    mData.setValue(response.body());
                }else{
                    Toast.makeText(getmContext(), "Couldn't Load data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MemberInfoModel> call, Throwable t) {
                Toast.makeText(getmContext(), "Network call error", Toast.LENGTH_SHORT).show();
            }
        });
        return mData;
    }

    public MutableLiveData<CollectionSheetModel> loadCollectionSheetData() {
        MutableLiveData<CollectionSheetModel> mData = new MutableLiveData<>();
        getmClient().getCollectioinSheet().enqueue(new Callback<CollectionSheetModel>() {
            @Override
            public void onResponse(Call<CollectionSheetModel> call, Response<CollectionSheetModel> response) {
                if (response.isSuccessful()){
                    mData.setValue(response.body());
                }else{
                    Toast.makeText(getmContext(), "Couldn't load data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CollectionSheetModel> call, Throwable t) {
                Toast.makeText(getmContext(), "Network Call error", Toast.LENGTH_SHORT).show();
            }
        });

        return mData;
    }
}

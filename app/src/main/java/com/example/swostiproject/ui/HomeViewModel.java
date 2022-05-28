package com.example.swostiproject.ui;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.swostiproject.network_model.collection_sheet_model.CollectionSheetModel;
import com.example.swostiproject.network_model.member_info_model.MemberInfoModel;

public class HomeViewModel extends ViewModel {
    private HomeClient mClient;
    public MutableLiveData<MemberInfoModel> loadMemberInfo(Context context) {
        mClient = new HomeClient(context);
        return mClient.loadMemberInfo();
    }

    public MutableLiveData<CollectionSheetModel> loadCollectionSheetModelData(Context context) {
        mClient = new HomeClient(context);
        return mClient.loadCollectionSheetData();
    }
    // TODO: Implement the ViewModel
}
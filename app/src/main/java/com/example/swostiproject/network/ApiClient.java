package com.example.swostiproject.network;

import com.example.swostiproject.network_model.collection_sheet_model.CollectionSheetModel;
import com.example.swostiproject.network_model.member_info_model.MemberInfoModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiClient {



    @GET("sms/memberInfo.json")
    Call<MemberInfoModel> getMemberInfo();

    @GET("sms/collectionSheet.json")
    Call<CollectionSheetModel> getCollectioinSheet();

}

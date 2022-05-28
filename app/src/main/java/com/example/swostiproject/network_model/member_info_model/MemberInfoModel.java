
package com.example.swostiproject.network_model.member_info_model;

import java.util.List;


import com.example.swostiproject.network_model.member_info_model.BorrowerInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MemberInfoModel {

    @SerializedName("borrowerInfo")
    @Expose
    private List<BorrowerInfo> borrowerInfo = null;

    public List<BorrowerInfo> getBorrowerInfo() {
        return borrowerInfo;
    }

    public void setBorrowerInfo(List<BorrowerInfo> borrowerInfo) {
        this.borrowerInfo = borrowerInfo;
    }

}

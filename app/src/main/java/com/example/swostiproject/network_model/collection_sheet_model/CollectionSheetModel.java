
package com.example.swostiproject.network_model.collection_sheet_model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CollectionSheetModel {

    @SerializedName("isValid")
    @Expose
    private Boolean isValid;
    @SerializedName("uTime")
    @Expose
    private String uTime;
    @SerializedName("loanInfoBean")
    @Expose
    private List<LoanInfoBean> loanInfoBean = null;
    @SerializedName("collectionSheetBean")
    @Expose
    private List<CollectionSheetBean> collectionSheetBean = null;

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getuTime() {
        return uTime;
    }

    public void setuTime(String uTime) {
        this.uTime = uTime;
    }

    public List<LoanInfoBean> getLoanInfoBean() {
        return loanInfoBean;
    }

    public void setLoanInfoBean(List<LoanInfoBean> loanInfoBean) {
        this.loanInfoBean = loanInfoBean;
    }

    public List<CollectionSheetBean> getCollectionSheetBean() {
        return collectionSheetBean;
    }

    public void setCollectionSheetBean(List<CollectionSheetBean> collectionSheetBean) {
        this.collectionSheetBean = collectionSheetBean;
    }

}

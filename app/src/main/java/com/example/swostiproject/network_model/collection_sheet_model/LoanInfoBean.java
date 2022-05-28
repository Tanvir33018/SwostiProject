
package com.example.swostiproject.network_model.collection_sheet_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanInfoBean {

    @SerializedName("swostiNo")
    @Expose
    private String swostiNo;
    @SerializedName("loanOid")
    @Expose
    private String loanOid;
    @SerializedName("wOid")
    @Expose
    private Integer wOid;
    @SerializedName("principalInstallment")
    @Expose
    private Integer principalInstallment;
    @SerializedName("interestInstallment")
    @Expose
    private Integer interestInstallment;
    @SerializedName("withdrawAmt")
    @Expose
    private Integer withdrawAmt;
    @SerializedName("sCharge")
    @Expose
    private Integer sCharge;
    @SerializedName("pPaid")
    @Expose
    private Integer pPaid;
    @SerializedName("iPaid")
    @Expose
    private Integer iPaid;
    @SerializedName("totalInstallment")
    @Expose
    private Integer totalInstallment;
    @SerializedName("firstInstallmentDate")
    @Expose
    private String firstInstallmentDate;

    public String getSwostiNo() {
        return swostiNo;
    }

    public void setSwostiNo(String swostiNo) {
        this.swostiNo = swostiNo;
    }

    public String getLoanOid() {
        return loanOid;
    }

    public void setLoanOid(String loanOid) {
        this.loanOid = loanOid;
    }

    public Integer getwOid() {
        return wOid;
    }

    public void setwOid(Integer wOid) {
        this.wOid = wOid;
    }

    public Integer getPrincipalInstallment() {
        return principalInstallment;
    }

    public void setPrincipalInstallment(Integer principalInstallment) {
        this.principalInstallment = principalInstallment;
    }

    public Integer getInterestInstallment() {
        return interestInstallment;
    }

    public void setInterestInstallment(Integer interestInstallment) {
        this.interestInstallment = interestInstallment;
    }

    public Integer getWithdrawAmt() {
        return withdrawAmt;
    }

    public void setWithdrawAmt(Integer withdrawAmt) {
        this.withdrawAmt = withdrawAmt;
    }

    public Integer getsCharge() {
        return sCharge;
    }

    public void setsCharge(Integer sCharge) {
        this.sCharge = sCharge;
    }

    public Integer getpPaid() {
        return pPaid;
    }

    public void setpPaid(Integer pPaid) {
        this.pPaid = pPaid;
    }

    public Integer getiPaid() {
        return iPaid;
    }

    public void setiPaid(Integer iPaid) {
        this.iPaid = iPaid;
    }

    public Integer getTotalInstallment() {
        return totalInstallment;
    }

    public void setTotalInstallment(Integer totalInstallment) {
        this.totalInstallment = totalInstallment;
    }

    public String getFirstInstallmentDate() {
        return firstInstallmentDate;
    }

    public void setFirstInstallmentDate(String firstInstallmentDate) {
        this.firstInstallmentDate = firstInstallmentDate;
    }

}

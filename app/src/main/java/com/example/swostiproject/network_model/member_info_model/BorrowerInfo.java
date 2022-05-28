
package com.example.swostiproject.network_model.member_info_model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BorrowerInfo {

    @SerializedName("s")
    @Expose
    private String s;
    @SerializedName("m")
    @Expose
    private String m;
    @SerializedName("n")
    @Expose
    private String n;
    @SerializedName("i")
    @Expose
    private String i;
    @SerializedName("c")
    @Expose
    private String c;
    @SerializedName("g")
    @Expose
    private String g;
    @SerializedName("nId")
    @Expose
    private String nId;
    @SerializedName("groupNo")
    @Expose
    private String groupNo;
    @SerializedName("l")
    @Expose
    private Integer l;
    @SerializedName("branchOid")
    @Expose
    private Integer branchOid;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public Integer getBranchOid() {
        return branchOid;
    }

    public void setBranchOid(Integer branchOid) {
        this.branchOid = branchOid;
    }

}

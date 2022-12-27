package com.gaurav.exceluploadtodatabase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class DBTList {

    private String locationCode;
    private String groupNo;
    private String diaryNo;
    @Id
    @Size(min = 10,max = 10)
    private String serviceNo;
    private String consumerName;
    private String consumerAddress;
    private String village;
    @Size(min = 10, max = 10)
    private String mobileNo;
    private String IVRS;
    private String eCashAccountNo;
    private String billMonth;
    private String category;
    @Size(min = 1,max = 3)
    private Integer loadInHP;
    private double subsidy;
    private double fcaCharge;


    public DBTList() {
    }

    public DBTList(String locationCode, String groupNo, String diaryNo, String serviceNo,
                   String consumerName, String consumerAddress, String village, String mobileNo,
                   String IVRS, String eCashAccountNo, String billMonth, String category, Integer loadInHP,
                   double subsidy, double fcaCharge) {
        this.locationCode = locationCode;
        this.groupNo = groupNo;
        this.diaryNo = diaryNo;
        this.serviceNo = serviceNo;
        this.consumerName = consumerName;
        this.consumerAddress = consumerAddress;
        this.village = village;
        this.mobileNo = mobileNo;
        this.IVRS = IVRS;
        this.eCashAccountNo = eCashAccountNo;
        this.billMonth = billMonth;
        this.category = category;
        this.loadInHP = loadInHP;
        this.subsidy = subsidy;
        this.fcaCharge = fcaCharge;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getDiaryNo() {
        return diaryNo;
    }

    public void setDiaryNo(String diaryNo) {
        this.diaryNo = diaryNo;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getIVRS() {
        return IVRS;
    }

    public void setIVRS(String IVRS) {
        this.IVRS = IVRS;
    }

    public String geteCashAccountNo() {
        return eCashAccountNo;
    }

    public void seteCashAccountNo(String eCashAccountNo) {
        this.eCashAccountNo = eCashAccountNo;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getLoadInHP() {
        return loadInHP;
    }

    public void setLoadInHP(Integer loadInHP) {
        this.loadInHP = loadInHP;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public double getFcaCharge() {
        return fcaCharge;
    }

    public void setFcaCharge(double fcaCharge) {
        this.fcaCharge = fcaCharge;
    }
}


package com.lrm.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "invoice")
public class Invoice {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "invoice_type")
    private String invoiceType;

    @Column(name = "invoice_title")
    private String invoiceTitle;

    @Column(name = "tax_number")
    private String taxNumber;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_account")
    private String bankAccount;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "enable_flag")
    private String enableFlag;

    @Column(name = "is_deleted")
    private String isDelete;

    @Column(name = "create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationDate;

    @Column(name = "update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updationDate;

    @Column(name = "dimension")
    private String dimension;

    @Column(name = "status")
    private String invoiceStatus;

    @Column(name = "payment_id")
    private String paymentId;

    @Column(name = "charge_receivable_id")
    private String chargeReceivableId;

    @Column(name = "invoidce_url")
    private String invoiceUrl;

    @Column(name = "invoice_no")
    private String invoiceNo;

    @Column(name = "invoice_code")
    private String invoiceCode;

    @Column(name = "types")
    private String invoiceTypes;

    @Column(name = "house_id")
    private String houseId;

    @Column(name = "charge_cost_date")
    private String chargeCostDate;

    @Column(name = "payment_detail_id")
    private String paymentDetailId;

    @Column(name = "charge_parking_id")
    private String chargeParkingId;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getChargeCostDate() {
        return chargeCostDate;
    }

    public void setChargeCostDate(String chargeCostDate) {
        this.chargeCostDate = chargeCostDate;
    }

    public String getPaymentDetailId() {
        return paymentDetailId;
    }

    public void setPaymentDetailId(String paymentDetailId) {
        this.paymentDetailId = paymentDetailId;
    }

    public String getChargeParkingId() {
        return chargeParkingId;
    }

    public void setChargeParkingId(String chargeParkingId) {
        this.chargeParkingId = chargeParkingId;
    }

    public String getInvoiceTypes() {
        return invoiceTypes;
    }

    public void setInvoiceTypes(String invoiceTypes) {
        this.invoiceTypes = invoiceTypes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }


    public String getDimension() {
        return dimension;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getChargeReceivableId() {
        return chargeReceivableId;
    }

    public void setChargeReceivableId(String chargeReceivableId) {
        this.chargeReceivableId = chargeReceivableId;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }
}

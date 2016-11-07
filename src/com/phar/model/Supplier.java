package com.phar.model;

/**
 * Created by Sam on 11/6/2016.
 */

public class Supplier {

    private String supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierContact;
    private String supplierCategory;
    private double panNo;


    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }

    public String getSupplierCategory() {
        return supplierCategory;
    }

    public void setSupplierCategory(String supplierCategory) {
        this.supplierCategory = supplierCategory;
    }

    public double getPanNo() {
        return panNo;
    }

    public void setPanNo(double panNo) {
        this.panNo = panNo;
    }
}

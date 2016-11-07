package com.phar.model;

import java.util.Date;

/**
 * Created by Sam on 11/7/2016.
 */
public class Product {

    private String productId;
    private String productName;
    private String productQuantity;
    private String productMfdDate;
    private String productExpDate;
    private String productBatchNo;
    private String productCostPrice;
    private String productSellPrice;
    private String productPurchaseDate;
    private String productComposition;
    private boolean purchaseTax;
    private String billNo;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public boolean isPurchaseTax() {
        return purchaseTax;
    }

    public void setPurchaseTax(boolean purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductMfdDate() {
        return productMfdDate;
    }

    public void setProductMfdDate(String productMfdDate) {
        this.productMfdDate = productMfdDate;
    }

    public String getProductExpDate() {
        return productExpDate;
    }

    public void setProductExpDate(String productExpDate) {
        this.productExpDate = productExpDate;
    }

    public String getProductBatchNo() {
        return productBatchNo;
    }

    public void setProductBatchNo(String productBatchNo) {
        this.productBatchNo = productBatchNo;
    }

    public String getProductCostPrice() {
        return productCostPrice;
    }

    public void setProductCostPrice(String productCostPrice) {
        this.productCostPrice = productCostPrice;
    }

    public String getProductSellPrice() {
        return productSellPrice;
    }

    public void setProductSellPrice(String productSellPrice) {
        this.productSellPrice = productSellPrice;
    }

    public String getProductPurchaseDate() {
        return productPurchaseDate;
    }

    public void setProductPurchaseDate(String productPurchasetDate) {
        this.productPurchaseDate = productPurchaseDate;
    }

    public String getProductComposition() {
        return productComposition;
    }

    public void setProductComposition(String productComposition) {
        this.productComposition = productComposition;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
}

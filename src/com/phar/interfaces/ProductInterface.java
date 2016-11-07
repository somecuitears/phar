package com.phar.interfaces;

import com.phar.model.Product;

/**
 * Created by Sam on 11/7/2016.
 */
public interface ProductInterface {

    public boolean addProduct(Product product);
    public boolean updateProduct();
    public boolean deleteProduct();
    public boolean alertWhenAboutToFinish();

}

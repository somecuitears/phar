package com.phar.interfaces;

import com.phar.model.Supplier;
import java.util.List;

/**
 * Created by Sam on 11/6/2016.
 */

public interface SupplierServices  {

    public boolean addSupplier(Supplier supplier);
    public boolean editSupplier();
    public boolean deleteSupplier();
    public List<String> listSupplier();
}

package com.lrm.service;

import com.lrm.dao.ProductDao;
import com.lrm.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2020/8/14 17:47
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> queryProductList() {
        return productDao.queryProductList();
    }
}

package com.lrm.service;

import com.lrm.po.Product;

import java.util.List;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2020/8/14 17:46
 */
public interface ProductService {

    List<Product> queryProductList();
}

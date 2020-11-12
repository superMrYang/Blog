package com.lrm.web;

import com.lrm.dao.ProductDao;
import com.lrm.po.Product;
import com.lrm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2020/8/14 17:49
 */
@RestController
public class ProductController {

    @Autowired
    ProductDao productDao;

    @GetMapping({"/queryList"})
    public List<Product> queryList(){
        return this.productDao.queryProductList();
    }

}

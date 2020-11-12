package com.lrm.dao;

import com.lrm.po.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2020/8/14 17:41
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    @Query("select t from Product t")
    List<Product> queryProductList();
}

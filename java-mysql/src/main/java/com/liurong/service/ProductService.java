package com.liurong.service;

import com.liurong.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List getProducts(){
        return productDao.getProducts();
    }
}

package com.yzm.service.impl;

import com.yzm.bean.Product;
import com.yzm.dubbo.service.ProductDubboService;
import com.yzm.mapper.ProductMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 17:42
 */

@Service
public class ProductDubboServiceImpl implements ProductDubboService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Integer insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }
}

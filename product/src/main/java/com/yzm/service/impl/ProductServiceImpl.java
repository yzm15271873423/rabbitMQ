package com.yzm.service.impl;

import com.yzm.bean.Product;
import com.yzm.dubbo.service.ProductDubboService;
import com.yzm.service.ProductService;
import com.yzm.utils.HttpClientUtil;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 19:24
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Reference
    private ProductDubboService productDubboService;

    @Override
    public int insertProduct(Product product) {

        Random random = new Random();
        product.setId(random.nextInt(50000));

        //保存到数据库中
        Integer i = productDubboService.insertProduct(product);
        if (i==1){
            //数据同步到solr中
            Map<String,String> map = new HashMap<>();
            map.put("id",product.getId()+"");
            map.put("name",product.getName()+"");
            map.put("price",product.getPrice()+"");

            String result = HttpClientUtil.doPost("http://localhost:8989/insert", map);
            boolean resultBoolean = Boolean.parseBoolean(result);

            System.out.println("result:"+resultBoolean);
            if(!resultBoolean){
                //判断为false，把新加到数据库的数据删除。
            }
        }

        return i;
    }
}

package com.yzm.mapper;

import com.yzm.bean.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 17:15
 */
//@Mapper
public interface ProductMapper {
    public Integer insertProduct(Product product);
}

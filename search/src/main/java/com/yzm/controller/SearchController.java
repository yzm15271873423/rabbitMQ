package com.yzm.controller;

import com.yzm.bean.SearchPojo;
import com.yzm.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 21:04
 */


@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert(SearchPojo searchPojo){
        boolean index = searchService.insert(searchPojo);
        return index;
    }
}

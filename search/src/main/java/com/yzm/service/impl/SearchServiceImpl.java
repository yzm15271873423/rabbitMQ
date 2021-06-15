package com.yzm.service.impl;

import com.yzm.bean.SearchPojo;
import com.yzm.service.SearchService;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 20:50
 */

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SolrTemplate solrTemplate;

    @Override
    public boolean insert(SearchPojo searchPojo) {
        UpdateResponse response = solrTemplate.saveBean("testcore", searchPojo);
        solrTemplate.commit("testcore");

        if(response.getStatus()==0){
            return true;
        }
        return false;
    }
}

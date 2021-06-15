package com.yzm.config;

import org.apache.solr.client.solrj.SolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;

/**
 * @Auther: yzm
 * @Date: 2021/6/15 - 06 - 15 - 21:13
 */
@Configuration
public class SearchConfig {

    @Autowired
    private SolrClient solrClient;

    @Bean
    public SolrTemplate solrTemplate(){
        return new SolrTemplate(solrClient);
    }
}

package com.yzm.bean;

import org.apache.solr.client.solrj.beans.Field;
import java.io.Serializable;

public class SearchPojo implements Serializable {

    @Field
    private Integer id;
    @Field
    private String name;
    @Field
    private Double price;

    public SearchPojo() {
    }

    public SearchPojo(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

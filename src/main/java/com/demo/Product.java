package com.demo;

public class Product {

    private Integer sellIn;

    private Integer quality;

    public Product(Integer sellIn, Integer quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public Integer getQuality() {
        return quality;
    }
}

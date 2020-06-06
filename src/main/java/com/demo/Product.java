package com.demo;

public class Product {

    private Integer sellIn;

    private Integer quality;

    public Product(Integer sellIn, Integer quality) {
        if (sellIn < 0 || sellIn > 50) {
            throw new IllegalArgumentException("sellIn must more than 0 and less than 50");
        }
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

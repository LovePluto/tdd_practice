package com.demo;

public class Product implements ProductBehavior {

    private Integer sellIn;

    private Integer quality;

    public Product(Integer sellIn, Integer quality) {
        if (sellIn < 0 || sellIn > 50) {
            throw new IllegalArgumentException("sellIn must more than 0 and less than 50");
        }
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public void update() {
        this.sellIn = this.sellIn - 1;
        if (this.sellIn < 0) {
            this.quality = this.quality - 2;
        } else {
            this.quality = this.quality - 1;
        }
        if (this.quality < 0) {
            this.quality = 0;
        }
    }

    public Integer getSellIn() {
        return sellIn;
    }

    public Integer getQuality() {
        return quality;
    }

    protected void setSellIn(Integer sellIn) {
        this.sellIn = sellIn;
    }

    protected void setQuality(Integer quality) {
        this.quality = quality;
    }
}

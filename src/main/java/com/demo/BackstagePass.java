package com.demo;

public class BackstagePass extends Product implements ProductBehavior {

    public BackstagePass(Integer sellIn, Integer quality) {
        super(sellIn, quality);
    }

    @Override
    public void update() {
        setSellIn(getSellIn() - 1);
        if (getSellIn() <= 10 && getSellIn() > 5) {
            setQuality(getQuality() + 2);
        } else if (getSellIn() <= 5 && getSellIn() > 0) {
            setQuality(getQuality() + 3);
        } else if (getSellIn() > 10) {
            setQuality(getQuality() + 1);
        } else {
            setQuality(0);
        }
    }
}

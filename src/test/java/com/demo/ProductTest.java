package com.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void when_product_has_sellIn_quality_return_same_sellIn_quality(){
        Product product = new Product(10,10);

        assertThat(product.getSellIn(),is(10));
        assertThat(product.getQuality(),is(10));
    }
}
package com.demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProductTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void when_product_has_sellIn_quality_return_same_sellIn_quality() {
        Product product = new Product(10, 10);

        assertThat(product.getSellIn(), is(10));
        assertThat(product.getQuality(), is(10));
    }

    @Test
    public void when_product_sellIn_is_less_than_50_and_moro_than_0_return_not_exception() {
        Product product = new Product(10, 10);
        assertThat(product.getSellIn(), is(10));
        assertThat(product.getQuality(), is(10));
    }

    @Test
    public void when_product_sellIn_is_less_than_0_return_illegal_argument_exception() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("sellIn must more than 0 and less than 50");
        Product product = new Product(-1, 10);
    }

    @Test
    public void when_product_sellIn_is_more_than_50_return_illegal_argument_exception() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("sellIn must more than 0 and less than 50");
        Product product = new Product(60, 10);
    }


}
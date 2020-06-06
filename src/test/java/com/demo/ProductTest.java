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
    public void when_product_has_sellIn_quality_then_same_sellIn_quality() {
        Product product = new Product(10, 10);

        assertThat(product.getSellIn(), is(10));
        assertThat(product.getQuality(), is(10));
    }

    @Test
    public void when_product_sellIn_is_less_than_50_and_moro_than_0_then_not_exception() {
        Product product = new Product(10, 10);
        assertThat(product.getSellIn(), is(10));
        assertThat(product.getQuality(), is(10));
    }

    @Test
    public void when_product_sellIn_is_less_than_0_then_illegal_argument_exception() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("sellIn must more than 0 and less than 50");
        Product product = new Product(-1, 10);
    }

    @Test
    public void when_product_sellIn_is_more_than_50_then_illegal_argument_exception() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("sellIn must more than 0 and less than 50");
        Product product = new Product(60, 10);
    }

    @Test
    public void when_product_update_then_sellId_quality_reduce_1(){
        Product product = new Product(10,10);

        product.update();

        assertThat(product.getSellIn(),is(9));
        assertThat(product.getQuality(),is(9));
    }

    @Test
    public void when_product_sellIn_is_0_and_update_then_sellIn_reduce_1_and_quality_reduce_2(){
        Product product = new Product(0,10);

        product.update();

        assertThat(product.getSellIn(),is(-1));
        assertThat(product.getQuality(),is(8));
    }

    @Test
    public void when_product_quality_is_0_and_update_then_sellIn_reduce_1_and_quality_is_0(){
        Product product = new Product(10,0);

        product.update();

        assertThat(product.getSellIn(),is(9));
        assertThat(product.getQuality(),is(0));
    }

}
package com.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BackstagePassTest {

    @Test
    public void when_backstage_pass_has_sellIn_and_quality_then_same_sellIn_quality(){
        BackstagePass backstagePass = new BackstagePass(10,10);

        assertThat(backstagePass.getSellIn(),is(10));
        assertThat(backstagePass.getQuality(),is(10));
    }

    @Test
    public void when_backstage_pass_update_then_quality_add_1_and_sellIn_reduce_1(){
        BackstagePass backstagePass = new BackstagePass(20,20);

        backstagePass.update();

        assertThat(backstagePass.getSellIn(),is(19));
        assertThat(backstagePass.getQuality(),is(21));
    }

    @Test
    public void when_backstage_pass_sellIn_is_10_then_quality_add_2(){
        BackstagePass backstagePass = new BackstagePass(10,20);

        backstagePass.update();

        assertThat(backstagePass.getSellIn(),is(9));
        assertThat(backstagePass.getQuality(),is(22));
    }

    @Test
    public void when_backstage_pass_sellIn_is_5_then_quality_add_3(){
        BackstagePass backstagePass = new BackstagePass(5,20);

        backstagePass.update();

        assertThat(backstagePass.getSellIn(),is(4));
        assertThat(backstagePass.getQuality(),is(23));
    }

    @Test
    public void when_backstage_pass_sellIn_is_0_then_quality_is_0(){
        BackstagePass backstagePass = new BackstagePass(0,20);

        backstagePass.update();

        assertThat(backstagePass.getSellIn(),is(-1));
        assertThat(backstagePass.getQuality(),is(0));
    }
}
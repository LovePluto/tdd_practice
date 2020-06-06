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

}
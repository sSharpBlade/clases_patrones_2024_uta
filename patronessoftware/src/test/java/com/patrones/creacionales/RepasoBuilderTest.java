package com.patrones.creacionales;

import org.junit.Test;

import com.patrones.creacionales.Builder.RepasoBuilder;

public class RepasoBuilderTest {
    @Test
    public void test() {
        RepasoBuilder repasar = RepasoBuilder.builder("sharpblade", "jjj").start().setName("d").build();
        System.out.println(repasar.toString());
    }
}

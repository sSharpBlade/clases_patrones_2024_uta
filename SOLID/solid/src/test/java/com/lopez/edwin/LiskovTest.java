package com.lopez.edwin;

import org.junit.Test;

import com.lopez.edwin.liskovclase.Adult;
import com.lopez.edwin.liskovclase.Kid;

public class LiskovTest {
    @Test
    public void test1() {
        Adult adult = new Adult("Edwin", "Lopez", "Ambato", "18504200991", "2206936347");
        Kid kid = new Kid("Daniel", "Lopez", "Ambato", adult);
        kid.getAdult().pay();
    }
}

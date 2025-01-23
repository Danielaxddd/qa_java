package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    private Feline feline;

    @Test
    public void felineFoodTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void felineFamilyTest() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void felineKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }
}

package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        MatcherAssert.assertThat("Cписок еды не верный", feline.eatMeat(), equalTo(feline.getFood("Хищник"))
        );
    }

    @Test
    public void felineFamilyTest() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Семья не совпадает","Кошачьи", actualFamily);
    }

    @Test
    public void felineKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }
}

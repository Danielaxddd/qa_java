package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getCatSoundReturn() {
        Cat cat = new Cat(feline);
        String actualCatSound = cat.getSound();
        Assert.assertEquals("Кот издал звук не Мяу","Мяу", actualCatSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}


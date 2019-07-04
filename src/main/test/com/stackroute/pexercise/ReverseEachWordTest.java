package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseEachWordTest {
    ReverseEachWord rev;
    @Before
    public void setUp(){
//        System.out.println("Inside before");
        rev= new ReverseEachWord();
    }
    @After
    public void tearDown(){
//        System.out.println("After");
        rev=null;

    }
    @BeforeClass
    public static void setUpBeforeClass(){
//        System.out.println("Before class");

    }
    @AfterClass
    public static void tearDownBeforeClass(){
//        System.out.println("After class");


    }
    @Test
    public void givenStringThereShouldReturnReversedString(){
        //arange

        //Act
        String result = rev.reverse("a quick brown fox jumps over the lazy dog");



        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    @Test
    public void givenNullThereShouldReturnErrorMessage(){
        //arange

        //Act
        String result = rev.reverse(null);



        //Assert
        assertEquals("Null Value",result);
    }

    @Test
    public void givenNumericStringShouldReturnreversedString(){
        //arange

        //Act
        String result = rev.reverse("A 024 dog");



        //Assert
        assertEquals("A 420 god",result);
    }

    @Test
    public void givenAWordShouldReturnreversedString(){
        //arange

        //Act
        String result = rev.reverse("Arpita");



        //Assert
        assertEquals("atiprA",result);
    }

}
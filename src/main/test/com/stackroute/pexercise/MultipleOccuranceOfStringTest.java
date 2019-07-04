package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class MultipleOccuranceOfStringTest {

    MultipleOccuranceOfString mul;
    @Before
    public void setUp(){
//        System.out.println("Inside before");
        mul= new MultipleOccuranceOfString();
    }
    @After
    public void tearDown(){
//        System.out.println("After");
        mul=null;

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
    public void givenStringThereShouldReturnTheIndex(){
        //arange

        //Act
        String result = mul.multiple("She sells seashells by the seashore","se");



        //Assert
        assertEquals("found at 4-6\n" +
                "found at 10-12\n" +
                "found at 27-29",result);
    }
    @Test
    public void givenStringNotThereShouldReturnZeroValue(){
        //arange

        //Act
        String result = mul.multiple("She sells seashells by the seashore","you");



        //Assert
        assertEquals("Notfound",result);
    }

    @Test
    public void givenNullShouldReturnErrorMessage(){
        //arange
        //Act
        //Assert
        assertEquals("null values", mul.multiple(null,"se"));
        assertEquals("null values", mul.multiple("She sells seashells by the seashore",null));
        assertEquals("null values", mul.multiple(null,null));
    }

}
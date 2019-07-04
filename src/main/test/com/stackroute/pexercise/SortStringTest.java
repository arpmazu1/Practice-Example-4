package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString sort;
    @Before
    public void setUp(){
//        System.out.println("Inside before");
        sort= new SortString();
    }
    @After
    public void tearDown(){
//        System.out.println("After");
        sort=null;

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
    public void givenStringThereShouldReturnCorrectOutput(){
        //arange

        //Act
        String result = sort.sortStr("My name is Arpita.I am a girl,");



        //Assert
        assertEquals("[a, am, Arpita, girl, I, is, My, name]",result);
    }

    @Test
    public void givenStringWithNumbersThereShouldReturnCorrectOutput(){
        //arange

        //Act
        String result = sort.sortStr("My name is Arpita.I am 22 year old.");



        //Assert
        assertEquals("[22, am, Arpita, I, is, My, name, old, year]",result);
    }

    @Test
    public void givenNullStringThereShouldReturnErrorMessage(){
        //arange

        //Act
        String result = sort.sortStr(null);



        //Assert
        assertEquals("nullvalues",result);
    }

}
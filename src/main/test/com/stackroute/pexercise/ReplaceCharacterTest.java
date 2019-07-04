package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter ch;
    @Before
    public void setUp(){
//        System.out.println("Inside before");
        ch= new ReplaceCharacter();
    }
    @After
    public void tearDown(){
//        System.out.println("After");
        ch=null;

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
    public void givenCharacterShouldReturnCorrectMessage(){
        //arange

        //Act
        String result = ch.replaceChar("daily dry");



        //Assert
        assertEquals("faity fry",result);
    }

    @Test
    public void givenCharacterNotThereShouldReturnOriginalString(){
        //arange

        //Act
        String result = ch.replaceChar("Arpita");



        //Assert
        assertEquals("Arpita",result);
    }

    @Test
    public void givenNumberStringShouldReturnOriginalString(){
        //arange

        //Act
        String result = ch.replaceChar("45732");



        //Assert
        assertEquals("45732",result);
    }

    @Test
    public void givenNullShouldReturnErrorMessage(){
        //arange

        //Act
        String result = ch.replaceChar(null);



        //Assert
        assertEquals("Null value",result);
    }
    @Test
    public void givenStringShouldReturnModifiedString(){
        //arange

        //Act
        String result = ch.replaceChar("dairy dry");



        //Assert
        assertEquals("fairy fry",result);
    }
}
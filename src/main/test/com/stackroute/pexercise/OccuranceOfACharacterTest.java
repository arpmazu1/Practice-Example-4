package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class OccuranceOfACharacterTest {
    OccuranceOfACharacter occ;
    @Before
    public void setUp(){
//        System.out.println("Inside before");
        occ= new OccuranceOfACharacter();
    }
    @After
    public void tearDown(){
//        System.out.println("After");
        occ=null;

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
    public void givenCharacterShouldReturnCorrectValue(){
        //arange

        //Act
        int result = occ.occurance("Java is java again java again",'a');



        //Assert
        assertEquals(10,result);
    }

    @Test
    public void givenCharacterNotThereShouldReturnZeroValue(){
        //arange

        //Act
        int result = occ.occurance("Java is java again java again",'z');



        //Assert
        assertEquals(0,result);
    }

    @Test
    public void givenSpaceNotThereShouldReturnCorrectValue(){
        //arange

        //Act
        int result = occ.occurance("Java is java again java again",' ');



        //Assert
        assertEquals(5,result);
    }

    @Test
    public void givenNullStringShouldReturnZeroValue(){
        //arange

        //Act
        int result = occ.occurance(null,'a');



        //Assert
        assertEquals(0,result);
    }

    @Test
    public void givenIntegerShouldReturnZeroValue(){
        //arange

        //Act
        int result = occ.occurance("Java is java again java again",'4');



        //Assert
        assertEquals(0,result);
    }

}
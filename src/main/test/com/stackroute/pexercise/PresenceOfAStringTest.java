package com.stackroute.pexercise;

import org.junit.*;

import static org.junit.Assert.*;

public class PresenceOfAStringTest {
    PresenceOfAString st;
    @Before
    public void setUp(){
//        System.out.println("Inside before");
        st= new PresenceOfAString();
    }
    @After
    public void tearDown(){
//        System.out.println("After");
        st=null;

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
    public void givenStringThereShouldReturnTrueValue(){
        //arange

        //Act
        boolean result = st.findString("this is Harry","Harry");



        //Assert
        assertEquals(true,result);
    }

    @Test
    public void givenStringNotThereShouldReturnFalseValue(){
        //arange

        //Act
        boolean result = st.findString("this is Harry","Henry");



        //Assert
        assertEquals(false,result);
    }

    @Test
    public void givenNullStringShouldReturnFalseValue(){
        //arange
        //Act
        //Assert
        assertEquals(false,st.findString(null,"Henry"));
        assertEquals(false,st.findString(null,null));
        assertEquals(false,st.findString("This is Harry",null));
    }

    @Test
    public void givenStringThereInaWordShouldReturnTrueValue(){
        //arange

        //Act
        boolean result = st.findString("this is avHarrywdc","Harry");



        //Assert
        assertEquals(true,result);
    }

}
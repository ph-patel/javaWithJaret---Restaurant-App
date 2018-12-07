/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Priyesh Hingrajia
 */
public class RegisterTest {
    
    Register validRestaurant ;

            
    public RegisterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        validRestaurant = new Register("Fivepetals" , "123 Dunsmore Street" ,"Barrie" , "burrito" , "Uber Eats" , "64732517" , LocalDate.of(1976, Month.MARCH, 10) ) ;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getResName method, of class Register.
     */
    @Test
    public void testGetResName() {
         System.out.println("getResName");
        Restaurant instance = null;
        String expResult = "Fivepetals";
        String result = validRestaurant.getResName();
        assertEquals(expResult, result);
      }

    /**
     * Test of setResName method, of class Register.
     */
    @Test
    public void testSetResName() {
       System.out.println("setResName");
        String resName = "";
        Restaurant instance = null;
        validRestaurant.setResName("Fivepetals");
        String result = validRestaurant.getResName();
         assertEquals("Fivepetals",result);
    }
    
    @Test
    public void testSetResNameInvalid()
    {
        String resName = "fivepetals";
        try
        {
            validRestaurant.setResName(resName);
            fail("The setResName method with a lowercase name should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    
    /**
     * Test of getAddress method, of class Register.
     */
   
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Restaurant instance = null;
        String expResult = "123 Dunsmore Street";
        String result = validRestaurant.getAddress();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAddress method, of class Restaurant.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Restaurant instance = null;
        validRestaurant.setAddress("123 Dunsmore Street");
        String result = validRestaurant.getAddress();
        assertEquals("123 Dunsmore Street", result);
    }
    
    
    @Test
    public void testSetAddressInvalid()
    {
        String address = "";
        try
        {
            validRestaurant.setAddress(address);
            fail("The SetAddress method with a empty address should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

   /**
     * Test of getCity method, of class Restaurant.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Restaurant instance = null;
        String expResult = "Barrie";
        String result = validRestaurant.getCity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCity method, of class Restaurant.
     */
    @Test
    public void testSetCity() {
        
       
            System.out.println("setCity");
            String city = "";
            Restaurant instance = null;
            validRestaurant.setCity("Barrie");
            String result = validRestaurant.getCity();
            assertEquals("Barrie", result);
       
    }
    
    @Test
    public void testSetCityInvalid()
    {
        String city = "";
        try
        {
            validRestaurant.setCity(city);
            fail("The SetCity method with a empty city should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

   /**
     * Test of getResType method, of class Restaurant. 
     */
    @Test
    public void testGetResType() {
        System.out.println("getResType");
        Restaurant instance = null;
        String expResult = "burrito";
        String result = validRestaurant.getResType();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setResType method, of class Restaurant.
     */
    @Test
    public void testSetResType() {
        System.out.println("setResType");
        String resType = "";
        Restaurant instance = null;
        validRestaurant.setResType("burrito");
        String result = validRestaurant.getResType();
        assertEquals("burrito", result);
    }

    
    @Test
    public void testSetResTypeInvalid()
    {
        String resType = "";
        try
        {
            validRestaurant.setResType(resType);
            fail("The resType method with a empty type should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getDelivery method, of class Register.
     */
    @Test
    public void testGetDelivery() {
        System.out.println("getDelivery");
        Register instance = null;
        String expResult = "Uber Eats";
        String result = validRestaurant.getDelivery();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDelivery method, of class Register.
     */
    @Test
    public void testSetDelivery() {
        System.out.println("setDelivery");
        String delivery = "";
        Register instance = null;
        validRestaurant.setDelivery("Uber Eats");
        String result = validRestaurant.getDelivery();
        assertEquals("Uber Eats", result);
    }

     @Test
    public void testSetDeliveryInvalid()
    {
        String delivery = "";
        try
        {
            validRestaurant.setDelivery(delivery);
            fail("The delivery method with a empty option should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
  
    

    /**
     * Test of getPhoneNum method, of class Register.
     */
    
    @Test
    public void testGetPhoneNum() {
        System.out.println("getPhoneNum");
        Restaurant instance = null;
        String expResult = "64732517";
        String result = validRestaurant.getPhoneNum();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPhoneNum method, of class Restaurant.
     */
    @Test
    public void testSetPhoneNum() {
        System.out.println("setPhoneNum");
        String phoneNum = "";
        Restaurant instance = null;
        validRestaurant.setPhoneNum("64732517");
        String result = validRestaurant.getPhoneNum();
        assertEquals("64732517", result);
    }
    
    @Test
    public void testSetPhoneNumInvalid()
    {
        String phoneNum = "";
        try
        {
            validRestaurant.setPhoneNum(phoneNum);
            fail("The phoneNum method with a less than zero should have triggered an exception.");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

   /**
     * Test of getStartDate method, of class Restaurant.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Restaurant instance = null;
        LocalDate expResult = LocalDate.of(1976, Month.MARCH, 10);
        LocalDate result = validRestaurant.getStartDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStartDate method, of class Restaurant.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Restaurant instance = null;
        LocalDate startDate = LocalDate.of(1976, Month.MARCH, 10);
        LocalDate result = validRestaurant.getStartDate();
        assertEquals(startDate, result);
      
    }
    
     @Test
    public void testSetStartDateInvalid()
    {
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 1);
        try{
            validRestaurant.setStartDate(startDate); 
            fail("setStartDate with invalid date should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    

   /**
     * Test of getAge method, of class Restaurant.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Restaurant instance = null;
        int expResult = 42;
        int result = validRestaurant.getAge();
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of toString method, 
     */
    @Test
    public void testToString() {
        String expResult = "Restaurant named Fivepetals located at 123 Dunsmore Street , Barrie is 42 years old and also provide delivery with Uber Eats";
        String result = validRestaurant.toString();
        assertEquals(expResult, result);
    }
}

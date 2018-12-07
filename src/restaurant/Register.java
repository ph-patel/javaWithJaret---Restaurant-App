
package restaurant;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Priyesh Hingrajia
 */
public class Register {
    String resName , address , city , resType , delivery , driveThru , phoneNum ;
    LocalDate startDate ;

    /**
     * constructor
     * @param resName
     * @param address
     * @param city
     * @param resType
     * @param delivery
     * @param phoneNum
     * @param startDate 
     */
    public Register(String resName, String address, String city, String resType, String delivery, String phoneNum, LocalDate startDate) {
        setResName(resName);
        setAddress(address); 
        setCity(city);  
        setResType(resType);
        setDelivery(delivery); 
        setPhoneNum(phoneNum); 
        setStartDate(startDate); 
    }
/**
 * get method for resName
 * @return 
 */
    public String getResName() {
        return resName;  
    }

    /**
     * set method for resName
     * @param resName 
     */
    public void setResName(String resName) {
        if (resName.matches("[A-Z][a-z]*"))   
             this.resName = resName;  
        else 
             throw new IllegalArgumentException("Restaurant name should start with uppercase letter ");
    }   
     

    /**
     * get method for address
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * set method for address
     * @param address 
     */
    public void setAddress(String address) {
         if (!address.isEmpty()) 
            this.address = address; 
        else 
            throw new IllegalArgumentException("Address should not be empty !! Please enter valid address");
    }   

    
    /**
     * get method for city
     * @return 
     */
    public String getCity() {
        return city;
    }

    /**
     * set method for city
     * @param city 
     */
    public void setCity(String city) {
       if(city.equalsIgnoreCase("Barrie") ||
          city.equalsIgnoreCase("Toronto") ||
          city.equalsIgnoreCase("Orillia")) 
            this.city = city; 
        else 
            throw new IllegalArgumentException("Please select any of the above city ");
    } 

    /**
     * get method  for resType
     * @return 
     */
    public String getResType() {
        return resType;
    }

    
   /**
    * set method for resType
    * @param resType 
    */
    public void setResType(String resType) {
        if (resType.equalsIgnoreCase("burger") ||
             resType.equalsIgnoreCase("Pizza")  ||
             resType.equalsIgnoreCase("burrito")||
             resType.equalsIgnoreCase("Sub"))
             this.resType = resType;
        else 
             throw new IllegalArgumentException("Please select any of the above type of restaurant");
    } 


    /**
     * get method for delivery
     * @return 
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * set method for delivery
     * @param delivery 
     */
    public void setDelivery(String delivery) {
        if (delivery.equalsIgnoreCase("Uber Eats") ||
            delivery.equalsIgnoreCase("Skip the Dishes") ||
            delivery.equalsIgnoreCase("Others"))
            this.delivery = delivery;
        else 
            throw new IllegalArgumentException("Please select any of the above type of Delivery Options");
    }

    
    /**
     * get method for phoneNum
     * @return 
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * set method for phoneNum
     * @return
     */
    public void setPhoneNum(String phoneNum) {
        if(!phoneNum.isEmpty() )
            this.phoneNum = phoneNum;
        else
            throw new IllegalArgumentException("Please enter the valid phone number !!");
    }

    /**
     * get method for localDate
     * @return 
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    
    /**
     * set method for startDate
     * @return 
     */
    public void setStartDate(LocalDate startDate) {
         if (startDate.isBefore(LocalDate.now()))
             this.startDate = startDate;
        else 
             throw new IllegalArgumentException("Start Date should not be in future !!!");
    } 
    
    
    /**
     * get method for age
     * @return 
     */
    public int getAge() {
         int age = Period.between(startDate ,LocalDate.now()).getYears();
         return age ;
    }
    
    
    /**
     * method toString()
     * @return 
     */
    @Override
    public String toString()
    {
        return String.format("Restaurant named %s located at %s , %s is %d years old and also provide delivery with %s", resName, address,city, this.getAge() , delivery);
    }
    
    
    
}

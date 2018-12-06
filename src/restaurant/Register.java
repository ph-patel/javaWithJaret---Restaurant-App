
package restaurant;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Priyesh Hingrajia
 */
public class Register {
    String resName , address , city , resType , delivery , driveThru ;
    int phoneNum ;
    LocalDate startDate ;

    public Register(String resName, String address, String city, String resType, String delivery, String driveThru, int phoneNum, LocalDate startDate) {
        setResName(resName);
        setAddress(address);
        setCity(city);
        setResType(resType);
        setDelivery(delivery);
        setDriveThru(driveThru);
        setPhoneNum(phoneNum);
        setStartDate(startDate);
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        if (resName.matches("[A-Z][a-z]*")) 
             this.resName = resName; 
        else 
             throw new IllegalArgumentException("Restaurant name should start with uppercase letter ");
    }  
     

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
         if (!address.isEmpty()) 
            this.address = address; 
        else 
            throw new IllegalArgumentException("Address should not be empty !! Please enter valid address");
    }   

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
       if(city.equalsIgnoreCase("Barrie") ||
          city.equalsIgnoreCase("Toronto") ||
          city.equalsIgnoreCase("Orillia")) 
            this.city = city; 
        else 
            throw new IllegalArgumentException("Please select any of the above city ");
    } 

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        if (resType.equalsIgnoreCase("burger") ||
             resType.equalsIgnoreCase("Pizza")  ||
             resType.equalsIgnoreCase("burrito")||
             resType.equalsIgnoreCase("Sub"))
             this.resType = resType;
        else 
             throw new IllegalArgumentException("Please select any of the above type of restaurant");
    } 


    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        if (delivery.equalsIgnoreCase("Uber Eats") ||
            delivery.equalsIgnoreCase("Skip the Dishes") ||
            delivery.equalsIgnoreCase("Others"))
            this.delivery = delivery;
        else 
            throw new IllegalArgumentException("Please select any of the above type of Delivery Options");
    }

    public String getDriveThru() {
        return driveThru;
    }

    public void setDriveThru(String driveThru) {
        if(driveThru.equalsIgnoreCase("Yes") ||
           driveThru.equalsIgnoreCase("No"))
            this.driveThru = driveThru;
        else 
            throw new IllegalArgumentException("Please select if this restaurant have drive thru or not !");
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        if(phoneNum > 0)
            this.phoneNum = phoneNum;
        else
            throw new IllegalArgumentException("Please enter the valid phone number !!");
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
         if (startDate.isBefore(LocalDate.now()))
             this.startDate = startDate;
        else 
             throw new IllegalArgumentException("Start Date should not be in future !!!");
    } 
    
    public int getAge() {
         int age = Period.between(startDate ,LocalDate.now()).getYears();
         return age ;
    }
    
    
}

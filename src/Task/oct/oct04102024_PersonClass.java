package Task.oct;
//Create a Person Class with 10 A, 5 Behavior( All types of Methods) and
// use the DC and PC to set the values, Create 5 Objects.

public class oct04102024_PersonClass {
    String person_name;
    String person_city;
    long person_mobileNumber;
    int person_age;
    String person_country;
    char person_gender;
    String person_occupation;
    String person_maritalStatus;
    String person_idProof;
    String person_idNumber;

    //Default Constructor
   void Person(){
        System.out.println("I am a default constructor.");
        person_name = "Dhruvi";
        person_city = "Delhi";
        person_country = "India";
        person_age = 35;
        person_gender ='F';
        person_maritalStatus ="Unmarried";

    }

    //Parameterized constructor
     void Person(String name, String city, String country, int age, char gender,String maritalStatus) {
        System.out.println("I am a parameterised constructor.");
        this.person_name = name;
        this.person_city = city;
        this.person_country = country;
        this.person_age = age;
        this.person_gender = gender;
        this.person_maritalStatus = maritalStatus;
    }

    public void setPerson_occupation(){
        person_occupation = "SDET";
        System.out.println("No Return type No Parameters");
        System.out.println("Occupation: "+person_occupation);
    }
    public void setPerson_mobileNumber(long mobileNumber){
        this.person_mobileNumber = mobileNumber;
        System.out.println("No Return type with Parameters");
        System.out.println("MobileNumber: "+mobileNumber);
    }
    public String setPerson_idProof(String idProof){
        this.person_idProof = idProof;
        System.out.println("Return type with Parameters");
        return idProof;
    }
    public String setPerson_idNumber(){
        String idNumber = "a1234f";
        System.out.println("Return type with No Parameters");
        return idNumber;

    }

    void sleep(){
        System.out.println("I am sleeping");
        System.out.println("Don't wake me");
    }
}

package Task.oct;

public class oct021024_ATBStudent_Class {
    int roll_no=1, age=10;
    String firstname="Praveen";
    String lastname="Raipuria";
    String std="7th";
    String Email="praveenraipuria@gmail.com";
    String address ="Vadodara";
    public  void display_roll_no(){
        System.out.println("Student Information");
        System.out.println("==========================================");
        System.out.println("Student Roll Number: "+roll_no);
    }
    public void display_nam(){
        System.out.println("Student_Name: "+firstname+" " +lastname);
    }
    public void display_address()
    {
        System.out.println("Student_Adress: "+address);
    }
    public void display_age()
    {
        System.out.println("Student_Age : "+age);
    }
    public void display_email()
    {
        System.out.println("Student_Email : "+Email);
    }
//    public static void main(String[] args){
//        Atbstudent get_roll_no = new Atbstudent();
//        get_roll_no.display_roll_no();
//        Atbstudent get_name= new Atbstudent();
//        get_name.display_nam();
//        Atbstudent get_address= new Atbstudent();
//        get_address.display_address();
//        Atbstudent get_age= new Atbstudent();
//        get_age.display_age();
//        Atbstudent get_email= new Atbstudent();
//        get_email.display_email();

    }

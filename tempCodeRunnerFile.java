import java.util.Scanner;
class StudentData {
   private String name;
   private int age;  
   public StudentData(String name, int age){
      this.name = name;
      this.age = age;
   }  
   public StudentData(){
      this(null, 0);
   }  
   public StudentData(String name) {
      this(name, 0);
   }
   public StudentData(int age) {
      this(null, age);
   }  
   public void display(){
      System.out.println("Name of the Student: "+this.name );
      System.out.println("Age of the Student: "+this.age );
   }
   public static void main(String args[]) {  
      //Reading values from user
      Scanner sc = new Scanner(System.in);      
      System.out.println("Enter the name of the student: ");
      String name = sc.nextLine();
     
      System.out.println("Enter the age of the student: ");
      int age = sc.nextInt();      
      System.out.println(" ");
     
      //Calling the constructor that accepts both values
      System.out.println("Display method of constructor that accepts both values: ");
      new StudentData(name, age).display();
      System.out.println(" ");
     
      //Calling the constructor that accepts name
      System.out.println("Display method of constructor that accepts only name: ");
      new StudentData(name).display();
      System.out.println(" ");
     
      //Calling the constructor that accepts age
      System.out.println("Display method of constructor that accepts only age: ");
      new StudentData(age).display();
      System.out.println(" ");
     
      //Calling the default constructor
      System.out.println("Display method of default constructor: ");
      new StudentData().display();
   }
}
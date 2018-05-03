package CS1;
import java.util.Scanner;
public class username {
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       String username = "Shafiq";
       String password = "Shafiq123";
       checkPoint(username,password);
   }
   static void checkPoint(String username,String password){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your username : ");
       String user = input.nextLine();
       System.out.println("Enter your password : ");
       String pass = input.nextLine();
       if (user.equalsIgnoreCase(username)&&!pass.equals(password)) {
           System.out.println("Your password is incorrect!");
       }
       else if (user.equalsIgnoreCase(username)&&pass.equals(password)) {
         System.out.println("Hi "+username+" welcome !");  
       }
       else
         System.out.println("username or password is incorrect !");  
   }
}

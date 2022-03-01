import java.util.Scanner;
public class ProcessAName5026211112{
   public static void main(String[] args){
   String firstName, secondName, userName;

   Scanner Hello = new Scanner(System.in);
   System.out.println("Enter your name:");
   userName = Hello.nextLine();
   
   firstName = userName.substring(0,1);
   secondName = userName.substring(userName.indexOf(" ")+1);
   System.out.println("Hello "+secondName+", " +firstName+".");
   }
}
package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
String person1 = "Cheif Keef";
String person2 = "Bronny Jr";
String verb1 = "run";
String verb2 = "jump";
String verb3 = "swim";
String food = "pumpkin pie";
String dayOfWeek = "Saturday";
String place1 = "bowling alley";
String place2 = "Pizza Hut";
String adjective1 = "sweaty";
String adjective2 = "gigantic";

System.out.println(person1 +" " + "is a programmer who likes to" + " " + verb1 + ".");
System.out.println("Every"+ " " + dayOfWeek + " " + "they make a" + " " + adjective1 + " " + food + " " + "for brakfast and" + " " + verb2 + " " + "at" + " " + place1 + " " + "with" + " " + person2 + ".");
System.out.println("Sometimes, they go to the" + " " + adjective2 + " " + place2 + " " + "with" + " " + person2 + " " + "so that they can" + " " + verb3 + " " + "toegther" + ".");

Scanner input = new Scanner(System.in);

System.out.println("Please put your first name");
String firstName = input.nextLine();

System.out.println("Please put your last name");
String lastName = input.nextLine();

System.out.println("How old are you");
String age = input.nextLine();

System.out.println("What grade are you in");
String grade = input.nextLine();

System.out.println("Please put your favorite color");
String favColor = input.nextLine();

System.out.println("Hello" + " " + firstName + " " + lastName + "," + " you are in " + grade + " " + "grade" + " and you are " + age + " years old." +" " + "Your favorite color is " + favColor + "." );
    }
}
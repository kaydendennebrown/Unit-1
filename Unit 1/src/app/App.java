package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

Scanner input = new Scanner(System.in);

System.out.println("Please put a holiday");
String holiday = input.nextLine();

System.out.println("Please put a noun");
String noun = input.nextLine();

System.out.println("Please put a place");
String place = input.nextLine();

System.out.println("Please put a person");
String person= input.nextLine();

System.out.println("Please put an adjective");
String adjective = input.nextLine();

System.out.println("Please put a body part(Plural)");
String bodypart = input.nextLine();

System.out.println("Please put a verb");
String verb = input.nextLine();

System.out.println("Please put another adjective");
String adjective2 = input.nextLine();

System.out.println("Please put another noun");
String noun2 = input.nextLine();

System.out.println("Please put a food");
String food = input.nextLine();

System.out.println("Please put a plural noun");
String pluralNoun = input.nextLine();

System.out.println("I can't believe its already " + holiday + "!" + "I can't wait to put on my " + noun + " and visit every " + place + " in my neighborhood." + " This year, I am going to dress up as " + person + " with " + adjective + " " + bodypart + "." + " Before I " + verb + "," + " I make sure to grab my " + adjective2 + " " + noun2 + " to hold all of my " + food + "." + " Finally, all of my " + pluralNoun + " are ready to go!");

int count = 0;
String pName = "Kayden";
boolean finished = false;

while (count <= 10) {
    System.out.println("The count is " + count);
    count = count + 1;
}

System.out.println("Count finished");

while (pName == "Kayden") {
    System.out.println("My name is " + pName);
    pName = "Jack";
}

System.out.println("Name finished");

while (finished == false) {
    System.out.println("Not complete");
    finished = true;
}

System.out.println("Complete");
    }
}
package FirstStepsInCoding;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String FirstName = scan.nextLine();
        String LastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String Town = scan.nextLine();

        System.out.println("You are " + FirstName + " " + LastName + ", a " + age + "-years old person from " + Town + ".");
//        изпечатва име, фамилия , и години и град на конзолата

    }
}


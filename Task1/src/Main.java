import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Create an application that:
//        - greets the user and asks for their name
//        - politely echoes the user's name back, and invites them into the opening ceremony

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello YOU, amazing user! Could you please kindly tell us your glorious name?");
        String userName = sc.nextLine();

        System.out.println("Wow, " + userName + ", isn't that just a bloody lovely name. Welcome to the opening ceremony!");

    }
}

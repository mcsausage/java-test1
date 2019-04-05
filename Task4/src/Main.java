import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Task 4: Branding
//
//        Now that we have a hip logo, let's work on our business name. Nowadays all cool brand names are palindromes -
//        words or sentences that read the same from both ends. For example: "level", "step on no pets".
//        We should make our company name palindromic as well, and we should do it quick!
//
//        Create an application that:
//        - prints if your user input is a palindrome or not


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome");
        String word = sc.nextLine();

        int length  = word.length();
        int i, begin, end, middle;

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (word.charAt(begin) == word.charAt(end)) {
                begin++;
                end--;
            }
            else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }

    }
}

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
//
//#### Examples:
//        input|output
//:-|:-:
//        `Amazon`|`no`
//        `Amazama`|`yes`
//
//                **Note:** Java is case-sensitive by default, and by default will consider, say, `E` to be different from `e`

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            System.out.print(c);

        }
    }
}

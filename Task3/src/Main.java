public class Main {

    public static void main(String[] args) {

//        The grand opening day is over and went great!
//        While interacting with potential customers, we got a lot of ideas,
//        for example, about a new logo. Supposedly,
//        you can draw pretty spirals by using the Fibonacci sequence as a guide.
//        The Fibonacci sequence is a sequence of numbers where each new number is generated by adding the two
//        previous numbers. The first few Fibonacci numbers are: `1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .... etc.`
//        To create a really beautiful spiral-logo, the designer needs at least 40 Fibonacci numbers for reference.
//
//                Create an application that:
//        - prints 40 Fibonacci numbers
/

        int x1 = 0;
        int x2 = 1;
        int x3;

        System.out.println(x2);

        for (int i = 0; i <= 40; ++i) {
            x3 = x1 + x2;
                System.out.println(x3);
                x1 = x2;
                x2 = x3;

            }

    }
}

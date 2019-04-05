import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Create an appliction that:
//        - reads as input: the amount of people in the room
//        - reads as input: the amount of people still in the queue
//        - prints if every person in the queue can fit in the room

//        ### Task 2 (extra):
//        Instead of just printing if everyone can make it, print for every person in the queue, if they can make it in
//
//        #### Examples:
//        input1|input2|output
//
//        `54`|`3`|`fit`<br>`fit`<br>`fit`
//        `98`|`5`|`fit`<br>`fit`<br>`can't fit`<br>`can't fit`<br>`can't fit`

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of people in the room:");
        int peepsInRoom = sc.nextInt();

        System.out.println("Enter the amount of people in the queue:");
        int peepsInQueue = sc.nextInt();

        int sumOfPeeps = peepsInRoom + peepsInQueue;
        String canFitStr = "can fit";
        String cantFitStr = "can't fit";
        int canFit = 100 - peepsInRoom;
        int cantFit = sumOfPeeps - 100;

        if (sumOfPeeps <=100) {

            for (int i = 0; i < peepsInQueue; i++)
                System.out.println(canFitStr);
        } else  {
            for (int i = 0; i < canFit; i++)
                System.out.println(canFitStr);

            for (int i = 0; i < cantFit; i++)
                System.out.println(cantFitStr);
        }






    }
}

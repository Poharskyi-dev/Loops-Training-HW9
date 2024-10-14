import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please write array length:");
        Scanner Input = new Scanner(System.in);
        int arrayLength = Input.nextInt();

        int[] newArr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please write index " + i + " array length:");
            newArr[i] = Input.nextInt();
        }
        System.out.println("Numbers that are divisible by 2:");
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] % 2 == 0) {
                System.out.println(newArr[i]);
            }
        }
    }
}

import java.util.Scanner;

public class LonelyNumber {
    private static int number[] = new int[100];

    private static int lonelyInteger(int[] numberArray) {
        for (int aNumberArray : numberArray) {
            number[aNumberArray]++;
        }

        for (int i = 0; i < 100; i++) {
            if (number[i] == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyInteger(a);
        System.out.println(result);
    }
}

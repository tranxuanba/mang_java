import java.util.Scanner;

public class GTLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("moi nhap vao so phan tu trong mang");
            n = sc.nextInt();
            if (n > 20) {
                System.out.println("moi nhap lai so phan tu trong mang");
            }
        } while (n > 20);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("tai san thu " + (i + 1) + " la:");
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("gia tri tai san lon nhat la " + max);
    }
}

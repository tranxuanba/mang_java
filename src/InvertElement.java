import java.util.Scanner;

public class InvertElement {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("so phan tu trong mang la:");
            n = sc.nextInt();
            if (n > 20) {
                System.out.println("qua so phan tu trong mang");
            }
        } while (n > 20);
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap vao phan tu thu: " + (i + 1));
            array[i] = sc.nextInt();
            System.out.println(array[i]);
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.println("mang sau khi duoc dao lai la:" );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

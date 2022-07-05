import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 43, 6, 56, 0, 0};
        int x, index;
        do {
            System.out.println("nhap vao vi tri can chen");
            index = sc.nextInt();
            if (index <= -1 || index >= array.length - 1) {
                System.out.println("khong chen duoc phan tu vao mang");
            }
        }while (index <= -1 || index >= array.length - 1);
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                System.out.println("nhap vao gia tri muon chen");
                x = sc.nextInt();
                int j = i;
                while (j < array.length - 1) {
                    array[array.length - j - 1] = array[array.length - j - 2];
                    j++;
                }
                array[index] = x;
            }
        }
        for (int element:array) {
            System.out.println(element);
        }
    }
}

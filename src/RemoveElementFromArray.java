import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clear;
        int n;
        int[] array;
        int index_del = -1;
        System.out.println("moi nhap vao so phan tu trong mang");
        n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("moi nhap vao phan tu thu " + (i + 1));
            array[i] = sc.nextInt();
            System.out.println("phan tu thu " + i + " la  " + array[i]);
        }
        System.out.println("moi nhap vao phan tu can xoa");
        clear = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (clear == array[i]) {
                index_del = i;
                System.out.println(index_del);
                int j = i;
                while (j<array.length-1){
                    array[j] = array[j+1];
                    array[j+1]=0;
                    j++;
                }
            }
        }
        System.out.println("mang moi la: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

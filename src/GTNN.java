public class GTNN {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 3, 7, 8};
        System.out.println("gia tri nho nhat trong mang la: " + minValue(arr));
    }
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

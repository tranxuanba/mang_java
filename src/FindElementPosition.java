import java.util.Scanner;

public class FindElementPosition {
    public static void main(String[] args) {
        String[] students = {"ba", "bon", "nam", "sau", "bay", "tam"};
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao tu muon tra:");
        String name = sc.nextLine();
        System.out.println("vi tri trong mang la:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println(i);
            }
        }
    }
}

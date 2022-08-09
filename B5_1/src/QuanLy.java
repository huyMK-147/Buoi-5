import java.util.Scanner;

public class QuanLy {
    static Scanner sc = new Scanner(System.in);
    private String maQL;
    private String hoTen;

    public void input()
    {
        System.out.println("  Nhập thông quản lý:");
        System.out.print("    Nhập vào mã quản lý: ");
        maQL = sc.nextLine();
        System.out.print("    Nhập vào họ tên: ");
        hoTen = sc.nextLine();
    }

    public void output()
    {
        System.out.println("  Thông tin quản lý:");
        System.out.println("    Mã quản lý: " + maQL);
        System.out.println("    Họ tên: " + hoTen);
    }
}

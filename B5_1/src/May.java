import java.util.Scanner;

public class May {
    static Scanner sc = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void input()
    {
        System.out.println("  Nhập thông tin máy:");
        System.out.print("    Nhập vào mã máy: ");
        maMay = sc.nextLine();
        System.out.print("    Nhập vào kiểu máy: ");
        kieuMay = sc.nextLine();
        System.out.print("    Nhập vào tình trạng: ");
        tinhTrang = sc.nextLine();
    }

    public void output()
    {
        System.out.println("  Thông tin máy:");
        System.out.println("    Mã máy: " + maMay);
        System.out.println("    Kiểu máy: " + kieuMay);
        System.out.println("    Tình trạng: " + tinhTrang);
    }

}

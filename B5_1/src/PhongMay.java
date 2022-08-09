import java.util.Scanner;

public class PhongMay {
    static Scanner sc = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private int dienTich;
    private QuanLy quanLy = new QuanLy();
    private May may = new May();

    public void input()
    {
        System.out.print("  Nhập vào mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("  Nhập vào tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.print("  Nhập vào diện tích: ");
        dienTich = sc.nextInt();
        sc.nextLine();
        may.input();
        quanLy.input();
    }

    public void output()
    {
        System.out.println("  Mã phòng: " + maPhong);
        System.out.println("  Tên phòng: " + tenPhong);
        System.out.println("  Diện tích: " + dienTich);
        may.output();
        quanLy.output();
    }

    public static void main(String[] args) {
        System.out.print("NHẬP SỐ LƯỢNG PHÒNG: ");
        int n = sc.nextInt();
        sc.nextLine();
        PhongMay obj[] = new PhongMay[n];
        System.out.print("NHẬP THÔNG TIN CÁC PHÒNG\n------------------------\n");
        for (int i=0; i<n; i++)
        {
            obj[i] = new PhongMay();
            System.out.println("Phòng " + (i+1) +": ");
            obj[i].input();
        }
        System.out.print("\nHIỂN THỊ NHẬP THÔNG TIN CÁC PHÒNG\n---------------------------------\n");
        for (int i=0; i<n; i++)
        {
            System.out.println("Thông tin phòng " + (i+1) +": ");
            obj[i].output();
        }
    }
}

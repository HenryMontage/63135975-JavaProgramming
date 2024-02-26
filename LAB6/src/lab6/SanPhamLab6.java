package lab6;
import java.util.Scanner;

public class SanPhamLab6 
{
	private String tenSp;
    private double donGia;
    private String hang;

    public SanPhamLab6(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập hãng: ");
        hang = scanner.nextLine();
    }

    public String getHang() {
        return hang;
    }
}

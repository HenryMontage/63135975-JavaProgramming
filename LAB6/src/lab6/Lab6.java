package lab6;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab6 
{
	public static void Bai1() 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        String ho = "";
        String tenDem = "";
        String ten = "";

        int viTriDauKhoangTrang = hoTen.indexOf(" ");
        int viTriCuoiKhoangTrang = hoTen.lastIndexOf(" ");

        if (viTriDauKhoangTrang != -1 && viTriCuoiKhoangTrang != -1) {
            ho = hoTen.substring(0, viTriDauKhoangTrang).toUpperCase();
            ten = hoTen.substring(viTriCuoiKhoangTrang + 1).toUpperCase();
            tenDem = hoTen.substring(viTriDauKhoangTrang + 1, viTriCuoiKhoangTrang);
        } else {
            System.out.println("Họ và tên không hợp lệ.");
            return;
        }

        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
	}
	public static void Bai2() {
		Scanner scanner = new Scanner(System.in);
        ArrayList<SanPhamLab6> danhSachSanPham = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
            SanPhamLab6 sanPham = new SanPhamLab6("", 0, "");
            sanPham.nhap();
            danhSachSanPham.add(sanPham);
        }

        System.out.println("\nCác sản phẩm có hãng là Nokia:");
        for (SanPhamLab6 sanPham : danhSachSanPham) {
            if (sanPham.getHang().equalsIgnoreCase("Nokia")) {
                sanPham.xuat();
                System.out.println();
            }
        }
	}
	public static void Bai3() 
	{
		Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            SinhVien sinhVien = nhapThongTinSinhVien(scanner);
            danhSachSinhVien.add(sinhVien);
        }

        System.out.println("\nThông tin các sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println();
        }
	}
	private static SinhVien nhapThongTinSinhVien(Scanner scanner) {
        String hoTen, email, soDienThoai, cmnd;

        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();

        do {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (!SinhVien.kiemTraEmail(email)) {
                System.out.println("Email không đúng định dạng. Vui lòng nhập lại.");
            }
        } while (!SinhVien.kiemTraEmail(email));

        do {
            System.out.print("Nhập số điện thoại: ");
            soDienThoai = scanner.nextLine();
            if (!SinhVien.kiemTraSoDienThoai(soDienThoai)) {
                System.out.println("Số điện thoại không đúng định dạng. Vui lòng nhập lại.");
            }
        } while (!SinhVien.kiemTraSoDienThoai(soDienThoai));

        do {
            System.out.print("Nhập số CMND: ");
            cmnd = scanner.nextLine();
            if (!SinhVien.kiemTraCMND(cmnd)) {
                System.out.println("CMND không đúng định dạng. Vui lòng nhập lại.");
            }
        } while (!SinhVien.kiemTraCMND(cmnd));

        return new SinhVien(hoTen, email, soDienThoai, cmnd);
    }

	public static void main(String[] args) 
	{
		Bai1();
		Bai2();
		Bai3();
	}
}

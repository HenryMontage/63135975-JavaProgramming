package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySinhVienBai4 {
	private static ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        int choice;
        do {
            System.out.println("======= MENU =======");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    SVGioi();
                    break;
                case 4:
                    SapXep();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    public static void Nhap() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Điểm: ");
            double diem = scanner.nextDouble();
            danhSachSinhVien.add(new SinhVien(hoTen, diem));
        }
    }

    public static void Xuat() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            System.out.println("======= DANH SÁCH SINH VIÊN =======");
            for (SinhVien sv : danhSachSinhVien) {
                System.out.println("Họ tên: " + sv.getHoTen());
                System.out.println("Điểm: " + sv.getDiem());
                System.out.println("Học lực: " + sv.getHocLuc());
                System.out.println("------------------");
            }
        }
    }

    public static void SVGioi() {
        boolean coSinhVienGioi = false;
        System.out.println("======= DANH SÁCH SINH VIÊN GIỎI =======");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getHocLuc().equals("Giỏi")) {
                System.out.println("Họ tên: " + sv.getHoTen());
                System.out.println("Điểm: " + sv.getDiem());
                System.out.println("------------------");
                coSinhVienGioi = true;
            }
        }
        if (!coSinhVienGioi) {
            System.out.println("Không có sinh viên nào có học lực giỏi.");
        }
    }

    public static void SapXep() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng.");
        } else {
            Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien sv1, SinhVien sv2) {
                    if (sv1.getDiem() < sv2.getDiem()) {
                        return 1;
                    } else if (sv1.getDiem() > sv2.getDiem()) {
                        return -1;
                    }
                    return 0;
                }
            });
            System.out.println("======= DANH SÁCH SINH VIÊN ĐÃ SẮP XẾP =======");
            for (SinhVien sv : danhSachSinhVien) {
                System.out.println("Họ tên: " + sv.getHoTen());
                System.out.println("Điểm: " + sv.getDiem());
                System.out.println("Học lực: " + sv.getHocLuc());
                System.out.println("------------------");
            }
        }
    }
}

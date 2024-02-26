package lab5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Lab5 {
	public static void Bai1() 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Nhập danh sách số thực (nhập 'N' để kết thúc):");
        while (true) 
        {
            System.out.print("Nhập số thực: ");
            double number = scanner.nextDouble();
            list.add(number);

            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine();
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) 
            {
                break;
            }
        }
        System.out.println("Danh sách số thực bạn vừa nhập:");
        for (double num : list) 
        {
            System.out.println(num);
        }
        double sum = 0;
        for (double num : list) 
        {
            sum += num;
        }
        System.out.println("Tổng của danh sách: " + sum);
	}
	
	//Bai2
	public static void Bai2() 
	{
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSachHoTen = new ArrayList<>();

        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    nhapDanhSachHoTen(scanner, danhSachHoTen);
                    break;
                case 2:
                    xuatDanhSach(danhSachHoTen);
                    break;
                case 3:
                    xuatDanhSachNgauNhien(danhSachHoTen);
                    break;
                case 4:
                    sapXepVaXuatDanhSachGiamDan(danhSachHoTen);
                    break;
                case 5:
                    timVaXoaHoTen(scanner, danhSachHoTen);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (luaChon != 6);
	}
	private static void nhapDanhSachHoTen(Scanner scanner, ArrayList<String> danhSachHoTen) {
        scanner.nextLine(); 
        System.out.println("Nhập danh sách họ và tên (kết thúc bằng 'done'):");
        String hoTen;
        while (true) {
            hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("done")) {
                break;
            }
            danhSachHoTen.add(hoTen);
        }
    }
	private static void xuatDanhSach(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }
	private static void xuatDanhSachNgauNhien(ArrayList<String> danhSachHoTen) {
        Collections.shuffle(danhSachHoTen);
        System.out.println("Danh sách họ và tên sau khi xáo trộn:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }
	private static void sapXepVaXuatDanhSachGiamDan(ArrayList<String> danhSachHoTen) {
        Collections.sort(danhSachHoTen, Collections.reverseOrder());
        System.out.println("Danh sách họ và tên sau khi sắp xếp giảm dần:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }
	private static void timVaXoaHoTen(Scanner scanner, ArrayList<String> danhSachHoTen) {
        scanner.nextLine(); 
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        if (danhSachHoTen.remove(hoTenCanXoa)) {
            System.out.println("Đã xóa '" + hoTenCanXoa + "' khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy '" + hoTenCanXoa + "' trong danh sách.");
        }
    }
	
	//Bai3
	public static void Bai3() 
	{
		Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    nhapDanhSachSanPham(scanner, danhSachSanPham);
                    break;
                case 2:
                    sapXepVaXuatSanPhamGiamDan(danhSachSanPham);
                    break;
                case 3:
                    timVaXoaSanPhamTheoTen(scanner, danhSachSanPham);
                    break;
                case 4:
                    xuatGiaTrungBinhCuaSanPham(danhSachSanPham);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (luaChon != 5);
	}
	
	private static void nhapDanhSachSanPham(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); 
        System.out.println("Nhập danh sách sản phẩm (mỗi sản phẩm trên một dòng, nhập 'done' để kết thúc):");
        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            String tenSp = scanner.nextLine();
            if (tenSp.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Nhập giá sản phẩm: ");
            double donGia = scanner.nextDouble();
            danhSachSanPham.add(new SanPham(tenSp, donGia));
            scanner.nextLine(); 
        }
    }
	private static void sapXepVaXuatSanPhamGiamDan(ArrayList<SanPham> danhSachSanPham) {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        };
        Collections.sort(danhSachSanPham, comp);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp);
        }
    }
	private static void timVaXoaSanPhamTheoTen(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); 
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenSpCanXoa = scanner.nextLine();
        boolean found = false;
        for (SanPham sp : danhSachSanPham) {
            if (sp.getTenSp().equalsIgnoreCase(tenSpCanXoa)) {
                danhSachSanPham.remove(sp);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Đã xóa sản phẩm '" + tenSpCanXoa + "' khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy sản phẩm '" + tenSpCanXoa + "' trong danh sách.");
        }
    }
	private static void xuatGiaTrungBinhCuaSanPham(ArrayList<SanPham> danhSachSanPham) {
        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.getDonGia();
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
	
	public static void main(String[] args) 
	{
		Bai1();
		Bai2();
		Bai3();
	}
}

package lab7;

public class MainBai3 {
	public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT("Nguyen Van Tinh", 8.5, 7.0, 9.0);
        svIT.xuat();

        SinhVienBiz svBiz = new SinhVienBiz("Tran Thi Phuong", 7.5, 8.0);
        svBiz.xuat();
    }
}

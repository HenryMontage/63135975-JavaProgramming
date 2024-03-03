package lab7;
import java.util.Scanner;

public class MainBai1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("Nhap chieu dai va chieu rong lan luot HCN: ");
	     double daiCN = scanner.nextDouble();
	     double rongCN = scanner.nextDouble();

	     System.out.println("Nhap canh hinh vuong: ");
	     double canhVuong = scanner.nextDouble();

	     ChuNhatBai1 chunhat = new ChuNhatBai1(daiCN, rongCN);
	     VuongBai1 vuong = new VuongBai1(canhVuong);

	     System.out.println("Thong tin hinh chu nhat:");
	     chunhat.xuat();

	     System.out.println("\nThong tin hinh vuong:");
	     vuong.xuat();
	     scanner.close();
	}
}

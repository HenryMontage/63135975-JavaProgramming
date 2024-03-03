package lab7;

public class ChuNhatBai1 {
	double dai;
	double rong;
	ChuNhatBai1(double dai, double rong){
		this.dai = dai;
		this.rong = rong;
	}
	double getChuVi() {
		return 2 * (dai + rong);
	}
	double getDienTich() {
		return dai * rong;
	}
	void xuat() {
		System.out.println("Chieu dai: " + dai);
		System.out.println("Chieu rong: " + rong);
		System.out.println("Chu vi: " + getChuVi());
		System.out.println("Dien tich: " + getDienTich());
	}
}

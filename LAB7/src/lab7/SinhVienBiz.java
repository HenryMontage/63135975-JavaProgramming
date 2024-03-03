package lab7;

public class SinhVienBiz extends SinhVienPoly{
	private double diemMarketing;
	private double diemSales;
	
	public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
		super(hoTen, "Biz");
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	
	@Override
	public double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}
}

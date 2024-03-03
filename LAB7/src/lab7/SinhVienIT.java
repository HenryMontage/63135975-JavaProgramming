package lab7;

public class SinhVienIT extends SinhVienPoly{
	private double diemJava;
	private double diemHtml;
	private double diemCss;
	
	public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
		super(hoTen, "IT");
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	@Override
	public double getDiem() {
		return (2 * diemJava + diemHtml + diemCss ) / 4;
	}
}

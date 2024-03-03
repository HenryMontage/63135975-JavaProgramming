package lab7;

abstract class SinhVienPoly {
	protected String hoTen;
	protected String nganh;
	
	public SinhVienPoly(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	
	public String getHocLuc() {
		double diem = getDiem();
		if(diem < 5) {
			return "Yeu";
		}else if(diem < 6.5) {
			return "TB";
		}else if(diem < 7.5) {
			return "Kha";
		}else if(diem < 9) {
			return "Gioi";
		}else {
			return "Xuat Sac";
		}
	}
	public void xuat() {
		System.out.println("Ho va ten: " + hoTen);
		System.out.println("Nganh: " + nganh);
		System.out.println("Diem: " + getDiem());
		System.out.println("Hoc luc: " + getHocLuc());
		
	}
}

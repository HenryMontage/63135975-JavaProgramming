package lab7;

public class VuongBai1 extends ChuNhatBai1{
	
	VuongBai1(double canh){
		super(canh, canh);
	}
	
	@Override
	void xuat() {
        System.out.println("Canh: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}
	
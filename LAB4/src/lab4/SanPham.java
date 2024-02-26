package lab4;
import java.util.Scanner;
public class SanPham 
{
	//Bai1
	private static String tenSp;
	private static double donGia;
	private static double giamGia;

    public SanPham(String tenSp, double donGia, double giamGia) 
    {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    //Bai3
    public SanPham(String tenSp, double donGia) 
    {
        this(tenSp, donGia, 0);
    }

    private double getThueNhapKhau() 
    {
        return 0.1 * donGia;
    }

    public void xuat() 
    {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    public void nhap() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = scanner.nextDouble();
    }
    
    //Bai4
    public String getTenSp() 
    {
        return this.tenSp;
    }
    public void setTenSp(String tenSp) 
    {
        this.tenSp = tenSp;
    }
    public double getDonGia() 
    {
        return this.donGia;
    }
    public void setDonGia(double donGia) 
    {
        this.donGia = donGia;
    }
    public double getGiamGia() 
    {
        return this.giamGia;
    }
    public void setGiamGia(double giamGia) 
    {
        this.giamGia = giamGia;
    }
    
    //Bai2
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
    	SanPham sp1 = new SanPham(tenSp, donGia);
        SanPham sp2 = new SanPham(tenSp, donGia);
        //SanPham sp1 = new SanPham("San pham co giam gia", 100.0, 10.0);
        //SanPham sp2 = new SanPham("San pham khong giam gia", 200.0);
        //System.out.println("Thong tin san pham co giam gia:");
        //sp1.xuat();
        //System.out.println("\nThong tin san pham khong giam gia:");
        //sp2.xuat();
        System.out.println("Nhap thong tin san pham 1:");
        sp1.nhap();
        System.out.println("Nhap thong tin san pham 2:");
        sp2.nhap();

        System.out.println("Thong tin san pham 1:");
        sp1.xuat();
        System.out.println("Thong tin san pham 2:");
        sp2.xuat();
    }
}

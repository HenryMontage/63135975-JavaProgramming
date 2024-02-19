package lab3;

import java.util.Scanner;
import java.util.Arrays;

public class Lab3 {
	public static void Bai1() 
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap so nguyen to: ");
	        int N = scanner.nextInt();
	        
	        boolean ok = true;
	        for (int i = 2; i < N - 1; i++) {
	            if (N % i == 0) {
	                ok = false;
	                break;
	            }
	        }
	        
	        if (ok && N > 1) {
	            System.out.println(N + " la so nguyen to");
	        } else {
	            System.out.println(N + " khong phai la so nguyen to");
	        }
	}
	public static void Bai2() 
	{
		for (int i = 1; i <= 9; i++) 
		{
            System.out.printf("Bang cuu chuong cua %d:\n", i);
            for (int j = 1; j <= 10; j++) 
            {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
	}
	public static void Bai3() 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        System.out.println("Nhap cac phan tu mang:");
        for (int i = 0; i < n; i++) 
        {
            mang[i] = scanner.nextInt();
        }
        Arrays.sort(mang);
        System.out.println("Mang sau khi sap xep:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
        int min = mang[0];
        for (int i = 1; i < n; i++) 
        {
            min = Math.min(min, mang[i]);
        }
        System.out.println("Phan tu nho nhat trong mang la: " + min);
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) 
        {
            if (mang[i] % 3 == 0) 
            {
                tong += mang[i];
                dem++;
            }
        }
        double trungBinh = (double) tong / dem;
        System.out.println("Trung binh cong cac phan tu chia het cho 3 la: " + trungBinh);
	}
	public static void Bai4() 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sv: ");
        int n = scanner.nextInt();
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sv thu " + (i + 1) + ":");
            System.out.print("Ho va ten: ");
            scanner.nextLine(); 
            hoTen[i] = scanner.nextLine();
            System.out.print("Diem: ");
            diem[i] = scanner.nextDouble();
        }
        System.out.println("Danh sach sv:");
        for (int i = 0; i < n; i++) {
            String hocLuc = "";
            if (diem[i] < 5) {
                hocLuc = "Yeu";
            } else if (diem[i] >= 5 && diem[i] < 6.5) {
                hocLuc = "TB";
            } else if (diem[i] >= 6.5 && diem[i] < 7.5) {
                hocLuc = "Kha";
            } else if (diem[i] >= 7.5 && diem[i] < 9) {
                hocLuc = "Gioi";
            } else {
                hocLuc = "=Xuat xac";
            }
            System.out.println("Sv " + (i + 1) + ":");
            System.out.println("Ho ten: " + hoTen[i]);
            System.out.println("Diem: " + diem[i]);
            System.out.println("Hoc luc: " + hocLuc);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    double tempDiem = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempDiem;
                    String tempHoTen = hoTen[j];
                    hoTen[j] = hoTen[j + 1];
                    hoTen[j + 1] = tempHoTen;
                }
            }
        }
        System.out.println("Danh sach sv sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sv " + (i + 1) + ": " + hoTen[i] + " - Diem: " + diem[i]);
        }
	}
	public static void main(String[] args) 
	{
		Bai1();
		Bai2();
		Bai3();
		Bai4();
	}
}

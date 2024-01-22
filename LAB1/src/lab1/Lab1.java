package lab1;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) 
	{
		Bai1();
		Bai2();
		Bai3();
		Bai4();
	}
	public static void Bai1() 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %.2f điểm%n", hoTen, diemTB);
	}
	public static void Bai2() 
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập chiều dài của hình chữ nhật: ");
	    double dai = scanner.nextDouble();
	    System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	    double rong = scanner.nextDouble();
	    double chuVi = (dai + rong) * 2;
	    double dienTich = dai * rong;
	    double canhNhoNhat = Math.min(dai, rong);
	    System.out.printf("Chu vi: %.2f%n", chuVi);
	    System.out.printf("Diện tích: %.2f%n", dienTich);
	    System.out.printf("Cạnh nhỏ nhất: %.2f%n", canhNhoNhat);
	}	
	public static void Bai3() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh của một khối lập phương: ");
		double canh = scanner.nextDouble();
		double thetich = Math.pow(canh, 3);
		System.out.printf("Thể tích: %.2f%n",thetich);
	}
	public static void Bai4() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.printf("Căn delta: %.2f%n", canDelta);
        } else {
            System.out.println("Delta âm, không thể tính căn delta.");
        }
	}
}

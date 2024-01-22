package lab2;

import java.util.Scanner;

public class Lab2 {
	public static void Bai1() 
	{
		double a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		if(a == 0)
		{
			if(b == 0)
			{
				System.out.println("Phương trình vô số nghiệm");
			}
			else 
			{
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else 
		{
			double x = -b / a;
			System.out.println("Nghiệm của phương trình là: x = " + x);
		}
	}
	public static void Bai2() 
	{
		double a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
		if(a == 0)
		{
			if(b == 0)
			{
				if(c == 0) 
				{
					System.out.println("Phương trình vô số nghiệm");
				}
				else 
				{
					System.out.println("Phương trình vô nghiệm");
				}
			}
			else 
			{
				double x = -c / b;
				System.out.println("Nghiệm của phương trình là: x = " + x);
			}
		}
		else
		{
			double delta = b * b - 4 * a * c;
			if(delta < 0) 
			{
				System.out.println("Phương trình vô nghiệm");
			}
			else if(delta == 0)
			{
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép là: x = " + x);
			}
			else
			{
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt là: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
	public static void Bai3() 
	{
		int tien;
		int giaduoi50 = 1000;
	    int giavuot50 = 1200;
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Nhập số điện sử dụng của tháng: ");
		int sodien = scanner.nextInt();	
		if(sodien < 50) 
		{
			tien = sodien * giaduoi50;
		}
		else
		{
			tien = 50 * giaduoi50 + (sodien - 50) * giavuot50;
		}
		System.out.println("Số tiền điện cần thanh toán: " + tien + "VND");
	}
	public static void Menu() 
	{
		System.out.println("+---------------------------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("+---------------------------------------------------+");
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int chon;
		do 
		{
			Menu();
			System.out.print("Chọn chức năng: ");
			chon = scanner.nextInt();
			switch(chon) 
			{
			case 1: Bai1();
				break;
			case 2: Bai2();
				break;
			case 3: Bai3();
				break;
			case 4: System.out.println("Kết thúc ứng dụng");
            	break;
			default:
                System.out.println("Không hợp lệ. Mời chọn lại");
			}
		}while(chon != 4);
		scanner.close();
	}
}

package lab8;

public class XPoly {
	public static final double sum(double... x) {
		double Tong = 0;
		for (double num : x) {
			Tong += num;
		}
		return Tong;
	}
	public static final double min(double... x) {
		if (x.length  == 0) {
            throw new IllegalArgumentException("Mang khong duoc de trong!");
        }
		double min = x[0];
		for (int i = 1; i < x.length; i++){
			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}
	public static final double max(double... x) {
		if (x.length  == 0) {
            throw new IllegalArgumentException("Mang khong duoc de trong!");
        }
		double max = x[0];
		for (int i = 1; i < x.length; i++){
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	public static String toUpperFirstChar(String s) {
		String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = Character.toUpperCase(words[i].charAt(0));
                String upperFirstChar = String.valueOf(firstChar);
                words[i] = upperFirstChar + words[i].substring(1);
            }
            result.append(words[i]);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
	}
	public static void main(String[] args) {
		System.out.println("Tong cua 1.5 va 2.5 la: " + sum(1.5, 2.5));
		System.out.println("Tong cua 1, 2, 3, 4 la: " + sum(1, 2, 3, 4));
		
		System.out.println("So nho nhat cua day 1, 2, 3, 4 la: " + min(1, 2, 3, 4));
		System.out.println("So lon nhat cua day 1, 2, 3, 4 la: " + max(1, 2, 3, 4));
		
		String input = "nguyen van teo";
        System.out.println("Chuoi goc: " + input);
        System.out.println("Sau khi chuyen doi chuoi goc sang chuoi Hoa: " + toUpperFirstChar(input));
	}
}

package lab6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
	private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }
    public void xuat() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }

    public static boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean kiemTraSoDienThoai(String soDienThoai) {
        String regex = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        return matcher.matches();
    }

    public static boolean kiemTraCMND(String cmnd) {
        String regex = "^[0-9]{9}$|^[0-9]{12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }
	
}

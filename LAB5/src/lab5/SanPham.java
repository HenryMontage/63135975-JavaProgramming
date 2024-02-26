package lab5;

public class SanPham {
	private String tenSp;
    private double donGia;

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + tenSp + ", Đơn giá: " + donGia;
    }
}

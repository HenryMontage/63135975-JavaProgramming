import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	public ManHinhTinhToan() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("Chương Trình Phép Toán Đơn Giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 48, 171, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(44, 119, 171, 43);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(225, 48, 385, 43);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(225, 119, 385, 43);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý cộng
				//Viết lệnh xử lý ở một thủ tục/hàm rồi gọi 
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(97, 206, 115, 43);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(222, 206, 115, 43);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(347, 206, 115, 43);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(472, 206, 115, 43);
		contentPane.add(btnChia);
		
		JLabel lblKtQuPhp = new JLabel("Kết quả phép toán:");
		lblKtQuPhp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuPhp.setBounds(44, 295, 171, 43);
		contentPane.add(lblKtQuPhp);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(225, 295, 385, 43);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}//Hết hàm tạo
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu từ chuổi sang số tương ứng
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA + soB;
		//Đưa ra hiển thị điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu từ chuổi sang số tương ứng
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA - soB;
		//Đưa ra hiển thị điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu từ chuổi sang số tương ứng
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA * soB;
		//Đưa ra hiển thị điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu từ chuổi sang số tương ứng
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA / soB;
		//Đưa ra hiển thị điều khiển
		if (soB == 0)txtKetQua.setText("Không thể chia với số 0");
		else txtKetQua.setText(String.valueOf(tong));
	}
}

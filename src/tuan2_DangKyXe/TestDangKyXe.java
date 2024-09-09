package tuan2_DangKyXe;

import java.util.Scanner;

public class TestDangKyXe {
	
	static String tieuDe() {
		return String.format("%5s %15s %17s %17s %18s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
	}
	
	public static String nhapChuXe(String thongbao)
	{
		String chuXe;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		chuXe = sc.nextLine();
		return chuXe;
	}
	
	public static String nhapLoaiXe(String thongbao)
	{
		String loaiXe;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		loaiXe = sc.nextLine();
		return loaiXe;
	}
	
	public static int nhapDungTich(String thongbao)
	{
		int dungTich;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		dungTich = sc.nextInt();
		return dungTich;
	}
	
	public static float nhapTriGia(String thongbao)
	{
		float triGia;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		triGia = sc.nextFloat();
		return triGia;
	}
	
	public static DangKyXe nhapDoiTuong()
	{
		String chuXe, loaiXe;
		int dTich;
		float triGia;
		DangKyXe dkx;
		chuXe = nhapChuXe("Nhập tên chủ xe: ");
		loaiXe = nhapLoaiXe("Nhập loại xe: ");
		dTich = nhapDungTich("Nhập dung tích xe: ");
		triGia = nhapTriGia("Nhập trị giá của xe: ");
		dkx = new DangKyXe(chuXe, loaiXe, dTich, triGia);
		return dkx;
	}
	
	public static void nhapCung()
	{
		DangKyXe xe1, xe2;
		xe1 = new DangKyXe("Đỗ Minh Tuấn", "Wave", 130, 15000000);
		xe2 = new DangKyXe("Lưu Quốc Trung", "AB", 200, 45000000);
		System.out.println(xe1);
		System.out.println(xe2);
	}
	
	public static void main(String[] args) {
		DangKyXe xe1, xe2, xe3;
		xe3 = nhapDoiTuong();
		System.out.println(tieuDe());
		System.out.println("====================================================================================");
		nhapCung();
		System.out.println(xe3);
	}
}

package tuan3_CD;

import java.util.Scanner;

public class TestCD {
	public static DSCD ds;
	static void tieuDe()
	{
		System.out.printf("%-10s %-20s %-20s %-15s %-15s\n", "Mã CD", "Tựa CD", "Ca sĩ", "Số bài hát", "Giá thành");
    }
	
	public static int nhapMaCD(String thongbao)
	{
		int maCD;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		maCD = sc.nextInt();
		return maCD;
	}
	
	public static String nhapTuaCD(String thongbao) {
		String tuaCD;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		tuaCD = sc.nextLine();
		return tuaCD;
	}
	
	public static String nhapCaSi(String thongbao) {
		String caSi;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		caSi = sc.nextLine();
		return caSi;
	}
	
	public static int nhapSoBaiHat(String thongbao) {
		int soBaiHat;
		do {
			System.out.println(thongbao);
			Scanner sc = new Scanner(System.in);
			soBaiHat = sc.nextInt();
			if (soBaiHat < 0)
				System.out.println("Số bài hát phải lớn hơn 0.");
		} while (soBaiHat < 0);
		return soBaiHat;
	}
	
	public static float nhapGiaThanh(String thongbao) {
		float giaThanh;
		do {
			System.out.println(thongbao);
			Scanner sc = new Scanner(System.in);
			giaThanh = sc.nextFloat();
			if (giaThanh < 0)
				System.out.println("Giá thành phải lớn hơn 0.");
		} while (giaThanh < 0);
		return giaThanh;
	}
	
	public static CD nhapDoiTuong() throws Exception
	{
		int maCD = nhapMaCD("Nhập mã CD: ");
        String tuaCD = nhapTuaCD("Nhập tựa CD: ");
        String caSi = nhapCaSi("Nhập ca sĩ: ");
        int soBaiHat = nhapSoBaiHat("Nhập số bài hát: ");
        float giaThanh = nhapGiaThanh("Nhập giá thành: ");
        CD cd = new CD(maCD, tuaCD, caSi, soBaiHat, giaThanh);
        return cd;
    }
	
	
	public static void taoMangCD() throws Exception {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng CD: ");
		n = sc.nextInt();
		ds = new DSCD(n);
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập CD thứ " + (i + 1) + ": ");
			CD cd = nhapDoiTuong();
			ds.them(cd);
			System.out.println();
		}
	}
	
	public static void themCD() throws Exception {
		CD cd = nhapDoiTuong();
		ds.them(cd);
		System.out.println();
	}
	
	public static void soLuongCD() {
		System.out.println("Số lượng CD: " + ds.tinhSoLuongCD());
		System.out.println();
	}
	
	public static void tongGiaThanh() {
		System.out.println("Tổng giá thành: " + ds.tongGiaThanh());
		System.out.println();
	}
	
	public static void sapXepGiamGiaThanh() {
		System.out.println("Danh sách CD giảm dần theo giá thành: ");
		tieuDe();
		ds.sapXepGiamGiaThanh();
		xuatMangCD();
		System.out.println();
	}
	
	public static void sapXepTangTuaCD() {
		System.out.println("Danh sách CD tăng dần theo tựa CD: ");
		tieuDe();
		ds.sapXepTangTuaCD();
		xuatMangCD();
		System.out.println();
	}
	
	public static void xuatMangCD() {
		System.out.println("Danh sách CD: ");
		tieuDe();
		ds.xuat();
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		DSCD ds = new DSCD(0);
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Tạo mang CD");
			System.out.println("2. Thêm CD");
			System.out.println("3. Số lượng CD");
			System.out.println("4. Tổng giá thành");
			System.out.println("5. Sắp xếp giảm giá thành");
			System.out.println("6. Sắp xếp tăng tựa CD");
			System.out.println("7. Xuất danh sách CD");
			System.out.println("8. Thoát");
			System.out.println("Chọn: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				taoMangCD();
				break;
			case 2:
				themCD();
				break;
			case 3:
				soLuongCD();
				break;
			case 4:
				tongGiaThanh();
				break;
			case 5:
				sapXepGiamGiaThanh();
				break;
			case 6:
                sapXepTangTuaCD();
				break;
			case 7:
				xuatMangCD();
				break;
			case 8:
				System.out.println("Kết thúc chương trình.");
				break;
			default:
				System.out.println("Lựa chọn bạn nhập không hợp lệ. Vui lòng nhập lại.");
				break;
			}
		} while (chon != 8);
	}
	
	
}

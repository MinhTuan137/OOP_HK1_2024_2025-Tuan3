package tuan3_HangThucPham;

import java.util.Scanner;

public class TestHangThucPham {

	static void tieuDe() {
		System.out.printf("%-10s %-15s %-13s %-18s %-15s\n", "Ma hang", "Ten hang", "Don gia", "Ngay san xuat",
				"Ngay het han");
	}
	
	public static String nhapMaHang(String thongbao)
	{
		String maHang;
		do {
			System.out.println(thongbao);
			Scanner sc = new Scanner(System.in);
			maHang = sc.nextLine();
			if (maHang == null)
				System.out.println("Ma hang khong duoc de trong.");
		} while (maHang == null);
		return maHang;
	}
	
	public static String nhapTenHang(String thongbao) {
		String tenHang;
		do {
			System.out.println(thongbao);
			Scanner sc = new Scanner(System.in);
			tenHang = sc.nextLine();
			if (tenHang == null)
				System.out.println("Ten hang khong duoc de trong.");
		} while (tenHang == null);
		return tenHang;
	}
	
	public static int nhapDonGia(String thongbao) {
		int donGia;
		do {
			System.out.println(thongbao);
			Scanner sc = new Scanner(System.in);
			donGia = sc.nextInt();
			if (donGia < 0)
				System.out.println("Don gia phai lon hon 0.");
		} while (donGia < 0);
		return donGia;
	}
	
	public static Date nhapNgay(String thongbao) {
        int ngay, thang, nam;
        System.out.println(thongbao);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        nam = sc.nextInt();
        Date ngaynhap = new Date(ngay, thang, nam);
        return ngaynhap;
	}
	
	public static Date nhapNgaySX(String thongbao)
	{
		int ngay, thang, nam;
		Date ngaySX = null;
		do {
			System.out.println(thongbao);
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang: ");
			thang = sc.nextInt();
			System.out.println("Nhap nam: ");
			nam = sc.nextInt();
			if (ngay < 0 || thang < 0 || nam < 0)
				System.out.println("Ngay, thang, nam phai lon hon 0.");
			else
				ngaySX = new Date(ngay, thang, nam);
		} while (ngay < 0 || thang < 0 || nam < 0);
		return ngaySX;
	}
	
	public static Date nhapNgayHH(String thongbao)
    {
        int ngay, thang, nam;
        Date ngayHH = null;
        do {
            System.out.println(thongbao);
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ngay: ");
            ngay = sc.nextInt();
            System.out.println("Nhap thang: ");
            thang = sc.nextInt();
            System.out.println("Nhap nam: ");
            nam = sc.nextInt();
            if (ngay < 0 || thang < 0 || nam < 0) 
                System.out.println("Ngay, thang, nam phai lon hon 0.");
            else
                ngayHH = new Date(ngay, thang, nam);
        } while (ngay < 0 || thang < 0 || nam < 0);
        return ngayHH;
    }
	
	public static HangThucPham nhapDoiTuong() {
		String maHang, tenHang;
		int donGia;
		Date ngaySX, ngayHH;
		HangThucPham htp;
		maHang = nhapMaHang("Nhap ma hang: ");
		tenHang = nhapTenHang("Nhap ten hang: ");
		donGia = nhapDonGia("Nhap don gia: ");
		ngaySX = nhapNgaySX("Nhap ngay san xuat: ");
		ngayHH = nhapNgayHH("Nhap ngay het han: ");
		if (ngaySX.kiemTraNgayHetHan(ngayHH) == false)
			try {
                throw new Exception("Ngay san xuat phai truoc ngay het han");
            }
			catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }	
		htp = new HangThucPham(maHang, tenHang, donGia, ngaySX, ngayHH);
		return htp;
	}
	
	public static boolean kiemTraHanSuDung(Date ngayHT, Date ngayHH) {
		if (ngayHT.kiemTraNgayHetHan(ngayHH) == false)
            return false;
        return true;
    }
	
	public static Date ngayHT() {
		int ngay, thang, nam;
        System.out.println("Nhap ngay hien tai: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        nam = sc.nextInt();
        Date ngayht = new Date(ngay, thang, nam);
        return ngayht;
	}
	
	public static void main(String[] args) {
		HangThucPham htp1, htp2, htp3;
		htp1 = nhapDoiTuong();
		if (htp1 == null)
			return;
		htp2 = new HangThucPham("HTP2", "Banh quy", 10000, new Date(1, 7, 2024), new Date(1, 2, 2025));
		htp3 = new HangThucPham("HTP3", "Sua vinamilk", 15000, new Date(1, 5, 2024), new Date(1, 3, 2025));
		tieuDe();
		System.out.println("=========================================================================");
		System.out.println(htp1);
		System.out.println(htp2);
		System.out.println(htp3);
		System.out.println("=========================================================================");
		Date ngayht = ngayHT();
		if (kiemTraHanSuDung(ngayht, htp1.getNgayHH()) == false)
            System.out.println("Mat hang HTP1 da het han");
        else
            System.out.println("Mat hang HTP1 con han su dung");
		if (kiemTraHanSuDung(ngayht, htp2.getNgayHH()) == false)
            System.out.println("Mat hang HTP2 da het han");
        else
            System.out.println("Mat hang HTP2 con han su dung");
		if (kiemTraHanSuDung(ngayht, htp3.getNgayHH()) == false)
            System.out.println("Mat hang HTP3 da het han");
        else
            System.out.println("Mat hang HTP3 con han su dung");
	}
}

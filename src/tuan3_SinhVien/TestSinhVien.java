package tuan3_SinhVien;

import java.util.Scanner;

public class TestSinhVien {
	public static DSSinhVien dssv;	
	
	public static void tieuDe() {
		String title = String.format("%10s %15s %14s %18s", "MSSV", "Họ tên", "Địa chỉ", "Số diện thoại" );
		System.out.println(title);
	}
	
	public static int nhapMssv(String thongbao)
	{
		int mssv;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		mssv = sc.nextInt();
		return mssv;
	}
	
	public static String nhapHoTen(String thongbao) {
		String hoTen;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		hoTen = sc.nextLine();
		return hoTen;
	}
	
	public static String nhapDiaChi(String thongbao) {
		String diaChi;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		diaChi = sc.nextLine();
		return diaChi;
	}
	
	public static String nhapSoDienThoai(String thongbao) {
		String soDienThoai;
		System.out.println(thongbao);
		Scanner sc = new Scanner(System.in);
		soDienThoai = sc.nextLine();
		return soDienThoai;
	}
	
	public static SinhVien nhapDoiTuong() throws Exception
	{
		int mssv;
		String hoTen;
		String diaChi;
		String soDienThoai;
		SinhVien sv;
		mssv = nhapMssv("Nhập mã số sinh viên: ");
		while(dssv.timKiem(mssv) != -1)
		{
			System.out.println("Mã số sinh viên đã tồn tại.");
			mssv = nhapMssv("Nhập mã số sinh viên: ");
		}
		hoTen = nhapHoTen("Nhập họ tên: ");
		diaChi = nhapDiaChi("Nhập địa chỉ: ");
		do
        {
            soDienThoai = nhapSoDienThoai("Nhập số điện thoại: ");
            if(soDienThoai.length() != 7)
                System.out.println("Số điện thoại phải có 7 chữ số.");
        } while(soDienThoai.length() != 7);
		sv = new SinhVien(mssv, hoTen, diaChi, soDienThoai);
		return sv;
	}
	
	public static void nhapDanhSachSV() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        dssv = new DSSinhVien(n);
        for(int i = 0; i < n; i++)
        {
        	System.out.println("Nhập sinh viên thứ " + (i + 1) + ": ");
            SinhVien sv = nhapDoiTuong();
            dssv.them(sv);
            System.out.println();
        }
     }
	
	public static void xuatDanhSachSV()
	{
		for(int i = 0; i < dssv.soLuongHT; i++)
		{
				System.out.println(dssv.dssv[i]);
		}
		System.out.println();
	}
	
	public static void themSV() throws Exception
	{
		SinhVien sv = nhapDoiTuong();
		dssv.them(sv);
		System.out.println();
	}
	
	public static void sapXepMSSV() throws Exception
    {
        SinhVien[] svsx = dssv.sapXepMSSV();
        tieuDe();
        for(int i = 0; i < dssv.soLuongHT; i++)
        {
            System.out.println(svsx[i]);
        }
        System.out.println();
    }

	public static void main(String[] args) throws Exception {
		DSSinhVien dssv = new DSSinhVien(0);
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Nhập danh sách sinh viên.");
			System.out.println("2. Hiển thị danh sách sinh viên");
			System.out.println("3. Sắp xếp danh sách sinh viên");
			System.out.println("4. Thoát");
			System.out.println("Nhập lựa chọn: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				nhapDanhSachSV();
				break;
			case 2:
				tieuDe();
				xuatDanhSachSV();
				break;
			case 3:
				sapXepMSSV();
				break;
			case 4:
				System.out.println("Kết thúc chương trình.");
			    break;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		} while (chon != 4);
	}
}

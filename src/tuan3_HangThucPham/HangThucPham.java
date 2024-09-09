package tuan3_HangThucPham;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private int donGia;
	private Date ngaySX;
	private Date ngayHH;
	
	//-------------------------Constructor-------------------------------
	public HangThucPham(String maHang, String tenHang, int donGia, Date ngaySX, Date ngayHH) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
		this.ngayHH = ngayHH;
	}

	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	//-------------------------Getter & Setter-----------------------------
	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) throws Exception{
		if (maHang == null)
			throw new Exception("Ma hang khong duoc de trong");
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) throws Exception {
		if(tenHang == null)
			throw new Exception("Ten hang khong duoc de trong");
		this.tenHang = tenHang;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) throws Exception {
		if(donGia < 0)
            throw new Exception("Don gia phai lon hon 0");
		this.donGia = donGia;
	}

	public Date getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(Date ngaySX) throws Exception {
		if (ngaySX.kiemTraNgayHetHan(ngayHH) == false || ngaySX == null)
			throw new Exception("Ngay san xuat phai truoc ngay het han");
		this.ngaySX = ngaySX;
	}

	public Date getNgayHH() {
		return ngayHH;
	}

	public void setNgayHH(Date ngayHH) throws Exception {
		if (ngaySX.kiemTraNgayHetHan(ngayHH) == false || ngayHH == null)
            throw new Exception("Ngay het han phai sau nga san xuat");
		this.ngayHH = ngayHH;
	}
	
	//-------------------------toString-----------------------------
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s %-15s %8d %16s %16s", getMaHang(), getTenHang(), getDonGia(), getNgaySX(), getNgayHH());
	}
}

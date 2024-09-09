package tuan3_SinhVien;

public class SinhVien {
	private int mssv;
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
	
	//--------------------------get và set các biến------------------------
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	//---------------------------contructor------------------------------------
	public SinhVien(int mssv, String hoTen, String diaChi, String soDienThoai) {
		super();
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//----------------------------to String--------------------------------------
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%8d \t%-17s %-12s %-12s", getMssv(), getHoTen(), getDiaChi(), getSoDienThoai());
	}
	
}

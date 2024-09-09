package tuan3_ChuyenXe;

public class NgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgayDiDuoc;
	
	//-----------------------------get và set các biến---------------------------
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	//------------------------------Các contructor-------------------------------
	public NgoaiThanh(String maChuyenXe, String hoTen, int soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
		super(maChuyenXe, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	//-----------------------------to String------------------------------------
	@Override
	public String toString() {
		return String.format("%15s %-10d", getNoiDen(), getSoNgayDiDuoc());
	}
	
}

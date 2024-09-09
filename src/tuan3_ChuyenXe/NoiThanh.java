package tuan3_ChuyenXe;

public class NoiThanh extends ChuyenXe{
	
	private int soTuyen;
	private double soKm;
	
	//------------------------get và set các biến----------------------------
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKm() {
		return soKm;
	}
	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	
	//--------------------------Contructor----------------------------------
	public NoiThanh(String maChuyenXe, String hoTen, int soXe, double doanhThu, int soTuyen, double soKm) {
		super(maChuyenXe, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	 
	//--------------------------to String----------------------------------
	@Override
	public String toString() {
		return String.format("%-15d %-10d", getSoTuyen(), getSoKm());
	}
}

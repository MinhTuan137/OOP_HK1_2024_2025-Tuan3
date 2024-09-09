package tuan3_ChuyenXe;

import java.util.Objects;

public class ChuyenXe {
	
	protected String maChuyenXe;
	protected String hoTen;
	protected int soXe;
	protected double doanhThu;
	
	//----------------------get và  set các biến--------------------------------
	public String getMaChuyenXe() {
		return maChuyenXe;
	}
	public void setMaChuyenXe(String maChuyenXe) {
		this.maChuyenXe = maChuyenXe;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) throws Exception{
		if(doanhThu > 0)
			this.doanhThu = doanhThu;
		else
			throw new Exception("Doanh thu phải lớn hơn 0");
	}
	
	//------------------------------ Các Contructor -----------------------------------
	public ChuyenXe(String maChuyenXe, String hoTen, int soXe, double doanhThu) {
		super();
		this.maChuyenXe = maChuyenXe;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//------------------------------hashcode và equals---------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(maChuyenXe);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChuyenXe other = (ChuyenXe) obj;
		return Objects.equals(maChuyenXe, other.maChuyenXe);
	}
	
	//----------------------------------to String-----------------------------------------
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10s %12s %-15d %-15d", getMaChuyenXe(), getHoTen(), getSoXe(), getDoanhThu());
	}
	
}

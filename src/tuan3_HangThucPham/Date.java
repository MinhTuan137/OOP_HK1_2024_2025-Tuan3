package tuan3_HangThucPham;

public class Date {
	private int ngay;
	private int thang;
	private int nam;
	
	public Date(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public boolean kiemTraNgayHetHan(Date hetHan) 
	{
		if (this.nam < hetHan.getNam())
			return true;
		if (this.nam == hetHan.getNam() && this.thang < hetHan.getThang())
			return true;
		if (this.nam == hetHan.getNam() && this.thang == hetHan.getThang() && this.ngay < hetHan.getNgay())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d/%d/%d", getNgay(), getThang(), getNam());
	}
}

package tuan2_DangKyXe;

public class DangKyXe {
	
	String chuXe;
	String loaiXe;
	int dungTich;
	float triGia;
	
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public float getTriGia() {
		return triGia;
	}
	public void setTriGia(float triGia) {
		this.triGia = triGia;
	}
	
	public DangKyXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DangKyXe(String chuXe, String loaiXe, int dungTich, float triGia) {
		super();
		this.chuXe = chuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	
	public float thuePhaiNop() {
		int dTich;
		float tGia, thue;
		dTich = this.dungTich;
		tGia = this.triGia;
		if(dTich < 100)
			thue = (float) (tGia*0.01);
		else if(dTich <= 200)
			thue = (float) (tGia*0.03);
		else
			thue = (float) (tGia*0.05);
		return thue;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-18s %-10s %15d %18.2f %17.2f", getChuXe(), getLoaiXe(), getDungTich(), getTriGia(), thuePhaiNop());
	}
	
	
	
}

package tuan1_HinhChuNhat;

public class HinhChuNhat {
	
	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	int chieuDai, chieuRong;

	public int getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(int cDai) {
		this.chieuDai = cDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int cRong) {
		this.chieuRong = cRong;
	}
	
	public int tinhDienTich() {
		int cDai, cRong;
		int dienTich;
		cDai = this.getChieuDai();
		cRong = this.getChieuRong();
		dienTich = cDai*cRong;
		return dienTich;
	}
	
	public int tinhChuVi() {
		int cDai, cRong;
		int chuVi;
		cDai = this.getChieuDai();
		cRong = this.getChieuRong();
		chuVi = (cDai+cRong)*2;
		return chuVi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%9d %15d %15d %12d", getChieuDai(), getChieuRong(), tinhDienTich(), tinhChuVi());
	}
	
	
}

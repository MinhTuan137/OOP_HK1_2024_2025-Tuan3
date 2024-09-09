package tuan3_CD;

public class CD {
	
	private int maCD;
	private String tuaCD;
	private String caSi;
	private int soBaiHat;
	private float giaThanh;
	
	//----------------------------constructor-------------------------------------
	public CD(int maCD, String tuaCD, String caSi, int soBaiHat, float giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	//----------------------------getter & setter-------------------------------------
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public String getCaSi() {
		return caSi;
	}

	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public float getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	//----------------------------toString-------------------------------------
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s %-20s %-20s %10d %15.2f", getMaCD(), getTuaCD(), getCaSi(), getSoBaiHat(), getGiaThanh());
	}
}

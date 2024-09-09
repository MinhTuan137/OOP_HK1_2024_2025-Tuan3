package tuan3_ChuyenXe;

import java.util.ArrayList;

public class DSChuyenXe {
	public static ChuyenXe[] DSCX;
	public int soLuongHT;
	
	public DSChuyenXe(int soLuong) {
		DSCX = new ChuyenXe[soLuong];
	}
	
	public void tangKichThuoc() throws Exception {
		ChuyenXe temp[] = new ChuyenXe[DSCX.length * 2];
		for (int i = 0; i < DSCX.length; i++) {
			temp[i] = DSCX[i];
		}
		DSCX = temp;
	}
	
	public void them (ChuyenXe xe) throws Exception
	{
		if (soLuongHT == DSCX.length)
			tangKichThuoc();
		if (timKiem(xe.getMaChuyenXe()) == -1) {
			DSCX[soLuongHT] = xe;
			soLuongHT++;
		} else {
			try {
				throw new Exception("Trùng mã.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public int timKiem(String maCX)
	{
		for(int i = 0; i < soLuongHT; i++)
        {
            if (DSCX[i].getMaChuyenXe() == maCX)
                return i;
        }
		return -1;
	}
	
	public double tongDoanhThu() {
		double tong = 0.0;
		for (int i = 0; i < soLuongHT; i++) {
			tong += DSCX[i].getDoanhThu();
		}
		return tong;
	}
}

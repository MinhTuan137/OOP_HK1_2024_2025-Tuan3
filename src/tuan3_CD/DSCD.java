package tuan3_CD;

import java.util.Scanner;

public class DSCD {
	private CD[] dsCD;
	public int soLuongCD = 0;
	

	public DSCD(int soLuong) {
		dsCD = new CD[soLuong];
	}
	
	public void tangKichThuoc() throws Exception {
		CD temp[] = new CD[dsCD.length * 2];
		for (int i = 0; i < dsCD.length; i++) {
			temp[i] = dsCD[i];
		}
		dsCD = temp;
	}
	
	public int timKiem(int maCD) throws Exception
	{
		for (int i = 0; i < soLuongCD; i++) {
			if (maCD == dsCD[i].getMaCD())
				return i;
		}
		return -1;
	}
	
	public void them(CD cd) throws Exception 
	{
		if (soLuongCD == dsCD.length)
			tangKichThuoc();
		if (timKiem(cd.getMaCD()) == -1) // Không tìm thấy mã trùng
		{
			dsCD[soLuongCD] = cd;
			soLuongCD++;
		} else {
			try {
				throw new Exception("Trùng mã.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public int tinhSoLuongCD() 
	{
		return soLuongCD;
	}
	
	public double tongGiaThanh() 
	{
		double tong = 0.0;
		for (int i = 0; i < soLuongCD; i++) {
			tong += dsCD[i].getGiaThanh();
		}
		return tong;
	}
	
	public DSCD sapXepGiamGiaThanh() {
		DSCD temp = new DSCD(soLuongCD);
		temp.dsCD = dsCD;  // sao chép mang ban dau sang mang tam
		for (int i = 0; i < soLuongCD - 1; i++) {
			for (int j = i + 1; j < soLuongCD; j++) {
                if (temp.dsCD[i].getGiaThanh() < temp.dsCD[j].getGiaThanh()) {
                    CD t = temp.dsCD[i];
                    temp.dsCD[i] = temp.dsCD[j];
                    temp.dsCD[j] = t;
                }
            }
		}
		return temp;
    }
	
	public DSCD sapXepTangTuaCD() {
		DSCD temp = new DSCD(soLuongCD);
		temp.dsCD = dsCD; // sao chép mang ban dau sang mang tam
		for (int i = 0; i < soLuongCD - 1; i++) {
			for (int j = i + 1; j < soLuongCD; j++) {
				if (temp.dsCD[i].getTuaCD().compareTo(temp.dsCD[j].getTuaCD()) > 0) {
					CD t = temp.dsCD[i];
					temp.dsCD[i] = temp.dsCD[j];
					temp.dsCD[j] = t;
				}
			}
		}
		return temp;
	}
	
	public void xuat() {
		for (int i = 0; i < soLuongCD; i++) {
			System.out.println(dsCD[i]);
		}
	}
}

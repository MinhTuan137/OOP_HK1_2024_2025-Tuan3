package tuan3_SinhVien;

import java.util.Scanner;

public class DSSinhVien {
	static SinhVien dssv[];
	public int soLuongHT = 0;
	private SinhVien sv;
	
	public DSSinhVien (int soLuong)
	{
		dssv = new SinhVien[soLuong];
	}
	
	public void tangKichThuoc() throws Exception
	{
		SinhVien temp[] = new SinhVien[dssv.length*2];
		for(int i=0; i<dssv.length; i++)
		{
			temp[i] = dssv[i];
		}
		dssv = temp;
	}
	
	public int timKiem(int mssv) throws Exception
	{
		for(int i=0; i<soLuongHT; i++)
		{
			if(mssv == dssv[i].getMssv())
				return i;
		}
		return -1; // khong tim thay
	}
	
	public void them(SinhVien sv) throws Exception
	{
		if(soLuongHT == dssv.length)
			tangKichThuoc();
		if(timKiem(sv.getMssv()) == -1)
		{
			dssv[soLuongHT] = sv;
			soLuongHT ++;
		}
		else
		{
			try {
				throw new Exception("Trùng mã.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public SinhVien[] saoChepMang(SinhVien[] dssv, int length) {
		SinhVien[] temp = new SinhVien[length];
		for (int i = 0; i < length; i++) {
			temp[i] = dssv[i];
		}
		return temp;
	}
	
	public SinhVien[] sapXepMSSV() throws Exception {
		SinhVien[] sapXepSV = saoChepMang(dssv, soLuongHT);
		SinhVien temp;
		int n = soLuongHT;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (sapXepSV[i].getMssv() > sapXepSV[j].getMssv()) {
					temp = sapXepSV[i];
					sapXepSV[i] = sapXepSV[j];
					sapXepSV[j] = temp;
				}
			}
		}
		return sapXepSV;
	} 
	
}

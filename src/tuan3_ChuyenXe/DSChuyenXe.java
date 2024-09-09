package tuan3_ChuyenXe;

import java.util.ArrayList;

public class DSChuyenXe {
	ArrayList<ChuyenXe> DSCX;
	ArrayList k;
	
	public DSChuyenXe()
	{
		DSCX = new ArrayList<ChuyenXe>();
	}
	
	public void them (ChuyenXe xe) throws Exception
	{
		if (DSCX.contains(xe) == false)// hiểu dc nhờ hascode equa của lớp chuyến xe
			DSCX.add(xe);
		else {
			throw new Exception("Mã chuyến xe đã trùng");
		}
	}
	
}

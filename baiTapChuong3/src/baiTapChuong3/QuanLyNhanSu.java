package baiTapChuong3;

import java.util.ArrayList;
import java.util.Iterator;

public class QuanLyNhanSu {
	protected ArrayList<ConNguoi> danhSachNhanSu;

	public QuanLyNhanSu() {
		danhSachNhanSu = new ArrayList<>();
	}

	public void themMoiNhanSu(ConNguoi conNguoi) {
		danhSachNhanSu.add(conNguoi);
	}

	public void lietKeThongTinNhanSu(ArrayList<ConNguoi> nhanSu) {
		if (nhanSu.size() == 0)
			System.out.println("Không có nhân viên nào.");
		else
			for (ConNguoi conNguoi : nhanSu)	
				System.out.println(conNguoi.toString());
	}
	public ArrayList<ConNguoi> timTheoHoTen(String ten){
		ArrayList<ConNguoi>ketQua=new ArrayList<>();
		for(ConNguoi conNguoi:danhSachNhanSu)
			if(conNguoi.getTen().contains(ten))
				ketQua.add(conNguoi);
		return ketQua;
	}

}

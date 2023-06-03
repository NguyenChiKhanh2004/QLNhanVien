package baiTapChuong3;

public class CongNhan extends ConNguoi {
	private int bacNghe;

	public CongNhan(String ten, int namSinh, String gioiTinh, String soDienThoai, int bacNghe) {
		super(ten, namSinh, gioiTinh, soDienThoai);
		this.bacNghe = bacNghe;
	}

	public int getBacNghe() {
		return bacNghe;
	}

	public void setBacNghe(int bacNghe) {
		this.bacNghe = bacNghe;
	}

	@Override
	public String toString() {
		return "Công Nhân => Tên: "+ ten + "| Năm sinh: " + namSinh + "| Giới tính: " + gioiTinh + "| SĐT: " + soDienThoai + "| Bậc Nghề: " + bacNghe;
	}

}

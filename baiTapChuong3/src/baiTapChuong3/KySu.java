package baiTapChuong3;

public class KySu extends ConNguoi {
	private String chuyenNganh;

	public KySu(String ten, int namSinh, String gioiTinh, String soDienThoai, String chuyenNganh) {
		super(ten, namSinh, gioiTinh, soDienThoai);
		this.chuyenNganh = chuyenNganh;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	@Override
	public String toString() {
		return "Kỹ Sư => " +"Tên: "+ ten + "| Sinh năm: " + namSinh + "| Giới tính: " + gioiTinh + "| SĐT: " + soDienThoai + "| Chuyên ngành: " + chuyenNganh;
	}
}

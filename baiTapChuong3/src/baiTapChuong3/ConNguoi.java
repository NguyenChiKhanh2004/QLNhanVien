package baiTapChuong3;

public class ConNguoi {
	protected String ten;
	protected int namSinh;
	protected String gioiTinh;
	protected String soDienThoai;

	// khoi dung
	public ConNguoi(String ten, int namSinh, String gioiTinh, String soDienThoai) {
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
	}

	public String getTen() {
		return ten;

	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getnamSinh() {
		return namSinh;
	}

	public void setnamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
}

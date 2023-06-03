package baiTapChuong3;

public class NhanVien extends ConNguoi {
	private String congViecChinh;

	public NhanVien(String ten, int namSinh, String gioiTinh, String soDienThoai, String congViecChinh) {
		super(ten, namSinh, gioiTinh, soDienThoai);
		this.congViecChinh = congViecChinh;
	}

	public String getCongViecChinh() {
		return congViecChinh;
	}

	public void setCongVieChinh(String congViecChinh) {
		this.congViecChinh = congViecChinh;
	}

	@Override
	public String toString() {
		return "Nhan Vien => Tên" + ten + "| Năm sinh: " + namSinh + "| Giới tính: " + gioiTinh + "| SĐT: "+ soDienThoai + "| Công việc chính" + congViecChinh;
	}

}

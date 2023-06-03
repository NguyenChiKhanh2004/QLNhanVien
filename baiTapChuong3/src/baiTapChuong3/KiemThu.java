package baiTapChuong3;

import java.util.Scanner;

public class KiemThu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyNhanSu quanLyNhanSu = new QuanLyNhanSu();
		do {
			System.out.println("\n QUẢN LÝ NHÂN SỰ CÔNG TY LIÊN DOANH NGUYỄN CHÍ KHANH");
			System.out.println("  Chọn 1 - Thêm mới nhân sự");
			System.out.println("  Chọn 2 - Liệt kê thông tin nhân sự");
			System.out.println("  Chọn 3 - Tìm theo họ tên");
			System.out.println("  Chọn 4 - Thoát khỏi chương trình");
			System.out.println("Bạn chọn mục số: ");
			String chon = scanner.nextLine();
			switch (chon.trim()) {
			case "1": {
				System.out.println("Thêm mới nhân sự");
				System.out.println("   1. Thêm mới Kỹ Sư");
				System.out.println("   2. Thêm mới Công Nhân");
				System.out.println("   3. Thêm mới nhân viên");
				System.out.println("Bạn chọn mục số: ");
				String themMoi = scanner.nextLine();
				switch (themMoi) {
				case "1": {
					System.out.println("Thêm mới Kỹ Sư");
					System.out.print("Nhập tên: ");
					String ten = scanner.nextLine();

					System.out.print("Nhập năm sinh: ");
					int namSinh = scanner.nextInt();
					
					scanner.nextLine(); // xóa bộ nhớ đệm

					System.out.print("Nhập giới tính: ");
					String gioiTinh = scanner.nextLine();

					System.out.print("Nhập số điện thoại: ");
					String soDienThoai = scanner.nextLine();

					System.out.print("Chuyên ngành: ");
					String chuyenNganh = scanner.nextLine();

					ConNguoi kySu = new KySu(ten, namSinh, gioiTinh, soDienThoai, chuyenNganh);
					quanLyNhanSu.themMoiNhanSu(kySu);
					System.out.println(kySu.toString());
					break;
				}
				case "2": {
					System.out.println("Thêm mới Công Nhân");
					System.out.print("Nhập tên: ");
					String ten = scanner.nextLine();

					System.out.print("Nhập năm sinh: ");
					int namSinh = scanner.nextInt();
					scanner.nextLine(); // xóa bộ nhớ đệm

					System.out.print("Nhập giới tính: ");
					String gioiTinh = scanner.nextLine();

					System.out.println("Nhập số điện thoại: ");
					String soDienThoai = scanner.nextLine();

					System.out.println("Nhập bậc nghề: ");
					int bacNghe = scanner.nextInt();
					ConNguoi congNhan = new CongNhan(ten, namSinh, gioiTinh, soDienThoai, bacNghe);
					quanLyNhanSu.themMoiNhanSu(congNhan);
					System.out.println(congNhan.toString());
					scanner.nextLine();
					break;
				}
				case "3": {
					System.out.println("Thêm mới Nhân Viên");
					System.out.print("Nhập tên: ");
					String ten = scanner.nextLine();

					System.out.print("Nhập năm sinh: ");
					int namSinh = scanner.nextInt();
					scanner.nextLine(); // xóa bộ nhớ đệm

					System.out.print("Nhập giới tính: ");
					String gioiTinh = scanner.nextLine();

					System.out.print("Nhập số điện thoại: ");
					String soDienThoai = scanner.nextLine();

					System.out.print("Nhập công việc chính: ");
					String congViecChinh = scanner.nextLine();
					ConNguoi nhanVien = new NhanVien(ten, namSinh, gioiTinh, soDienThoai, congViecChinh);
					quanLyNhanSu.themMoiNhanSu(nhanVien);
					System.out.println(nhanVien.toString());
					break;
				}
				default:
					System.out.println("Bạn chọn sai chỉ được chọn các số như menu. Mờ nhập lại: ");
					break;
				}
				break;
			}
			case "2": {
				System.out.println("Liệt kê thông tin nhân sự");
				quanLyNhanSu.lietKeThongTinNhanSu2(quanLyNhanSu.danhSachNhanSu);
				break;
			}
			case "3": {
				System.out.println("Tìm theo họ tên");
				System.out.println("Nhập vào họ và tên cần tìm: ");
				String hoTen = scanner.nextLine();
				hoTen = hoTen.trim();

				quanLyNhanSu.lietKeThongTinNhanSu(quanLyNhanSu.timTheoHoTen(hoTen));
				break;
			}
			case "4": {
				System.out.println("Đã thoát khỏi chương trình.");
				return;
			}
			default:
				System.out.println("Bạn chọn sai chỉ được chọn các số như menu. Mờ nhập lại: ");
				continue;
			}
		} while (true);
	}
}

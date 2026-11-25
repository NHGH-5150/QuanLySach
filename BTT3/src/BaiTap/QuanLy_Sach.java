package BaiTap;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy_Sach {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Sach> DanhSachSach = new ArrayList<>();

		int Chon;
		do 
		{
			System.out.println("\n--- MENU QUẢN LÝ SÁCH THƯ VIỆN ---");
			System.out.println("1. Nhập thêm sách giáo khoa");
			System.out.println("2. Nhập thêm sách tham khảo");
			System.out.println("3. Xuất danh sách các loại sách");
			System.out.println("4. Tính tổng thành tiền cho từng loại");
			System.out.println("5. Tính trung bình cộng đơn giá của sách tham khảo");
			System.out.println("6. Xuất sách giáo khoa của nhà xuất bản (Nhập tên)");
			System.out.println("7. Thoát chương trình");
			System.out.print("Chọn số (1-7): ");
			Chon = scanner.nextInt();
			scanner.nextLine();

			switch (Chon) 
			{
				case 1: {
					System.out.println("\n- NHẬP SÁCH GIÁO KHOA:");
					System.out.print("Nhập mã sách: ");
					String MaSach = scanner.nextLine();

					System.out.print("Nhập ngày nhập (dd/mm/yyyy): ");
					String NgayNhap = scanner.nextLine();

					System.out.print("Nhập nhà xuất bản: ");
					String NhaXuatBan = scanner.nextLine();

					System.out.print("Nhập tình trạng (moi / cu): ");
					String TinhTrang = scanner.nextLine();

					SachGiaoKhoa Sgk = new SachGiaoKhoa(MaSach, NgayNhap, 1, 0, NhaXuatBan, TinhTrang);
					boolean HopLe;

					do 
					{
						System.out.print("Nhập đơn giá: ");
						double DonGia = scanner.nextDouble();
						HopLe = Sgk.setDonGia(DonGia);
						if (!HopLe) {
							System.out.println("> Lỗi: đơn giá phải > 0");
						}
					} while (!HopLe);

					do 
					{
						System.out.print("Nhập số lượng: ");
						int SoLuong = scanner.nextInt();
						HopLe = Sgk.setSoLuong(SoLuong);
						if (!HopLe) {
							System.out.println("> Lỗi: số lượng phải >= 0");
						}
					} while (!HopLe);

					scanner.nextLine();
					DanhSachSach.add(Sgk);
					System.out.println("---- Đã thêm sách giáo khoa");
					break;
				}

				case 2: 
				{
					System.out.println("\n- NHẬP SÁCH THAM KHẢO:");
					System.out.print("Nhập mã sách: ");
					String MaSach = scanner.nextLine();

					System.out.print("Nhập ngày nhập (dd/mm/yyyy): ");
					String NgayNhap = scanner.nextLine();

					System.out.print("Nhập nhà xuất bản: ");
					String NhaXuatBan = scanner.nextLine();

					SachThamKhao Stk = new SachThamKhao(MaSach, NgayNhap, 1, 0, NhaXuatBan, 0);
					boolean HopLe;

					do 
					{
						System.out.print("Nhập đơn giá: ");
						double DonGia = scanner.nextDouble();
						HopLe = Stk.setDonGia(DonGia);
						if (!HopLe) {
							System.out.println("> Lỗi: đơn giá phải > 0");
						}
					} while (!HopLe);

					do 
					{
						System.out.print("Nhập số lượng: ");
						int SoLuong = scanner.nextInt();
						HopLe = Stk.setSoLuong(SoLuong);
						if (!HopLe) {
							System.out.println("> Lỗi: số lượng phải >= 0");
						}
					} while (!HopLe);

					do 
					{
						System.out.print("Nhập thuế: ");
						double Thue = scanner.nextDouble();
						HopLe = Stk.setThue(Thue);
						if (!HopLe) {
							System.out.println("> Lỗi: thuế phải >= 0");
						}
					} while (!HopLe);

					scanner.nextLine();
					DanhSachSach.add(Stk);
					System.out.println("---- Đã thêm sách tham khảo");
					break;
				}

				case 3: 
				{
					if (DanhSachSach.isEmpty()) {
						System.out.println("\n ko có sách để xuất");
						break;
					}
					System.out.println("\n- DANH SÁCH CÁC LOẠI SÁCH:");
					for (int i = 0; i < DanhSachSach.size(); i++) {
						System.out.println("\n+) Quyển thứ " + (i + 1) + ":");
						DanhSachSach.get(i).HienThiThongTin();
					}
					break;
				}

				case 4: 
				{
					double TongSgk = 0;
					double TongStk = 0;
					for (int i = 0; i < DanhSachSach.size(); i++) {
						Sach s = DanhSachSach.get(i);
						if (s instanceof SachGiaoKhoa) {
							TongSgk += s.TinhThanhTien();
						} else if (s instanceof SachThamKhao) {
							TongStk += s.TinhThanhTien();
						}
					}
					System.out.println("\n- TỔNG THÀNH TIỀN TỪNG LOẠI:");
					System.out.println("-> Tổng thành tiền sách giáo khoa: " + TongSgk);
					System.out.println("-> Tổng thành tiền sách tham khảo: " + TongStk);
					break;
				}

				case 5: 
				{
					double TongDonGiaStk = 0;
					int DemStk = 0;
					for (int i = 0; i < DanhSachSach.size(); i++) {
						Sach s = DanhSachSach.get(i);
						if (s instanceof SachThamKhao) {
							TongDonGiaStk += s.getDonGia();
							DemStk++;
						}
					}
					if (DemStk == 0) {
						System.out.println("\n> Không có sách tham khảo nào để tính trung bình cộng đơn giá!");
					} else {
						double TrungBinh = TongDonGiaStk / DemStk;
						System.out.println("\n-> Trung bình cộng đơn giá sách tham khảo: " + TrungBinh);
					}
					break;
				}

				case 6: 
				{
					System.out.print("\nNhập tên nhà xuất bản cần tìm: ");
					String NxbCanTim = scanner.nextLine();
					boolean TimThay = false;
					System.out.println("\n- SÁCH GIÁO KHOA CỦA NXB " + NxbCanTim + ":");
					for (int i = 0; i < DanhSachSach.size(); i++) 
					{
						Sach s = DanhSachSach.get(i);
						if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(NxbCanTim)) 
						{
							System.out.println("\n+) Kết quả:");
							s.HienThiThongTin();
							TimThay = true;
						}
					}
					if (!TimThay) {
						System.out.println("> Không tìm thấy sách giáo khoa nào của NXB này!");
					}
					break;
				}

				case 7: {
					System.out.println("> Đã thoát chương trình");
					break;
				}

				default: {
					System.out.println("> Chọn sai số");
				}
			}
		} while (Chon != 7); //end do
		
		scanner.close();
	} //end voidmain
} //end class quanlysach
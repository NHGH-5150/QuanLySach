package BaiTap;
import java.util.Scanner;
import java.util.ArrayList;

public class QuanLySach
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int Chon, i, Nxb_phu, Slg_phu, DonGia_phu, NamMoi, SlgMoi, GiaMoi;
		boolean HopLe, TimThay, HopLeSua;
		String MaXoa, MaCanTim, MaSua;
		

		ArrayList<String> MaSach = new ArrayList<>();
		ArrayList<String> TenSach = new ArrayList<>();
		ArrayList<String> TacGia = new ArrayList<>();
		ArrayList<Integer> Nxb = new ArrayList<>();
		ArrayList<Integer> Slg = new ArrayList<>();
		ArrayList<Integer> DonGia = new ArrayList<>();
		
		do 
		{
			System.out.println("\n\n---MENU QUẢN LÝ---");
			System.out.println("1. Thêm sách mới");										//BÀI 3 - TUẦN 6
			System.out.println("2. Hiển thị sách, tính tổng số lượng & tổng giá trị ");	//BÀI 2, 4
			System.out.println("3. Tìm kiếm sách theo mã sách");						//BÀI 2, 3
			System.out.println("4. Xóa sách theo mã sách");								//BÀI 2, 3
			System.out.println("5. Sửa thông tin sách theo mã sách");					//BÀI 3
			System.out.println("6. Mảng nhập số lượng 5 cuốn sách");					//BÀI 1
			System.out.println("7. Thoát chương trình");
			System.out.print("Chọn chức năng (1-7): ");
			Chon = scanner.nextInt();
			scanner.nextLine();
			
			switch (Chon) 
			{
				case 1:
					// BÀI 3: Thêm sách
					System.out.println("\n- NHẬP THÔNG TIN SÁCH MỚI:");
					System.out.print("Nhập mã sách: ");
					MaSach.add(scanner.nextLine());
					
					System.out.print("Nhập tên sách: ");
					TenSach.add(scanner.nextLine());
					
					System.out.print("Nhập tác giả: ");
					TacGia.add(scanner.nextLine());
					
					// Kiểm tra năm xuất bản
					do 
					{
						HopLe = true;
						System.out.print("Nhập năm xuất bản của sách: ");
						Nxb_phu = scanner.nextInt();
						
						if (Nxb_phu > 2026 || Nxb_phu <= 0) 
						{
							System.out.println(">Lỗi: năm xuất bản vượt quá năm hiện tại");
							HopLe = false;
						}
					} while (!HopLe);
					Nxb.add(Nxb_phu);
					
					// Kiểm tra số lượng

					do {
						HopLe = true;
						System.out.print("Nhập số lượng sách: ");
						Slg_phu = scanner.nextInt();
						
						if (Slg_phu < 0) 
						{
							System.out.println(">Lỗi: số lượng phải >= 0");
							HopLe = false;
						}
					} while (!HopLe);
					Slg.add(Slg_phu);
					
					// Kiểm tra đơn giá
					do {
						HopLe = true;
						System.out.print("Nhập giá sách: ");
						DonGia_phu = scanner.nextInt();
						
						if (DonGia_phu <= 0) 
						{
							System.out.println(">Lỗi: giá sách phải > 0");
							HopLe = false;
						}
					} while (!HopLe);
					DonGia.add(DonGia_phu);
					
					scanner.nextLine();
					System.out.println("> Đã thêm sách");
					break;
					//HẾT CASE 1
					
				case 2:
					// BÀI 2 & BÀI 4: Hiển thị với Tính tổng 
					if (MaSach.isEmpty()) 
					{
						System.out.println("\n> Thư viện hiện tại chưa có cuốn sách nào");
						break;
					}
					
					System.out.println("\n- THÔNG TIN CHI TIẾT VÀ TỔNG KẾT:");
					int TongSoLuong = 0;
					double TongGiaTriSach = 0;
					
					for (i = 0; i < MaSach.size(); i++) 
					{
						int ThTien = DonGia.get(i) * Slg.get(i);
						double PhiVC = 0.05 * DonGia.get(i);
						double TongTien = ThTien + PhiVC;
						
						TongSoLuong = TongSoLuong + Slg.get(i);
						TongGiaTriSach = TongGiaTriSach + (double) DonGia.get(i) * Slg.get(i);
						
						System.out.println("\n+) Sách " + (i + 1) + ":");
						System.out.println("   - Mã sách: " + MaSach.get(i));
						System.out.println("   - Tên sách: " + TenSach.get(i));
						System.out.println("   - Tác giả: " + TacGia.get(i));
						System.out.println("   - Năm xuất bản: " + Nxb.get(i));
						System.out.println("   - Số lượng còn: " + Slg.get(i));
						System.out.println("   - Giá sách: " + DonGia.get(i));
						System.out.println("   - Thành Tiền: " + ThTien);
						System.out.println("   - Phí Vận Chuyển: " + PhiVC);
						System.out.println("   - Tổng Tiền Nhập: " + TongTien);
					}
					System.out.println("\n-> Tổng số lượng tất cả sách: " + TongSoLuong);
					System.out.println("-> Tổng giá trị kho sách: " + TongGiaTriSach);
					break;	
				//HẾT CASE 2
							
				case 3:
					// BÀI 2 & BÀI 3: Tìm kiếm sách 
					System.out.print("\n- Nhập mã sách cần tìm: ");
					MaCanTim = scanner.nextLine();
					TimThay = false;
					
					for (i = 0; i < MaSach.size(); i++) 
					{
						if (MaSach.get(i).equalsIgnoreCase(MaCanTim)) 
						{
							int ThTien = DonGia.get(i) * Slg.get(i);
							double PhiVC = 0.05 * DonGia.get(i);
							double TongTien = ThTien + PhiVC;
							
							System.out.println("> Đã tìm thấy sách!");
							System.out.println("+) Mã sách: " + MaSach.get(i));
							System.out.println("+) Tên sách: " + TenSach.get(i));
							System.out.println("+) Tác giả: " + TacGia.get(i));
							System.out.println("+) Năm xuất bản: " + Nxb.get(i));
							System.out.println("+) Số lượng còn: " + Slg.get(i));
							System.out.println("+) Giá Sách: " + DonGia.get(i));
							System.out.println("+) Thành Tiền: " + ThTien);
							System.out.println("+) Phí Vận Chuyển: " + PhiVC);
							System.out.println("+) Tổng Tiền Nhập: " + TongTien);
							TimThay = true;
							break;
						}
					}
					if (!TimThay)
					{
						System.out.println("> Không tìm thấy sách có mã: " + MaCanTim);
					}
					break;
				//HẾT CASE 3
					
				case 4:
					// BÀI 2 & BÀI 3: Xóa sách 
					System.out.print("\n- Nhập mã sách cần xóa: ");
					MaXoa = scanner.nextLine();
					boolean XoaThanhCong = false;
					
					for (i = 0; i < MaSach.size(); i++) 
					{
						if (MaSach.get(i).equalsIgnoreCase(MaXoa)) 
						{
							MaSach.remove(i);
							TenSach.remove(i);
							TacGia.remove(i);
							Nxb.remove(i);
							Slg.remove(i);
							DonGia.remove(i);
							System.out.println("> Đã xóa thành công cuốn sách có mã: " + MaXoa);
							XoaThanhCong = true;
							break;
						}
					}
					if (!XoaThanhCong) 
					{
						System.out.println("> Không tìm thấy mã sách cần xóa!");
					}
					break;
				//HẾT CASE 4
					
				case 5:
					// BÀI 3: Sửa sách 
					System.out.print("\n- Nhập mã sách cần sửa thông tin: ");
					MaSua = scanner.nextLine();
					boolean SuaThanhCong = false;
					
					for (i = 0; i < MaSach.size(); i++) 
					{
						if (MaSach.get(i).equalsIgnoreCase(MaSua)) 
						{
							System.out.println("> Đã tìm thấy sách, hãy nhập thông tin mới:");
							
							System.out.print("Nhập tên sách mới: ");
							TenSach.set(i, scanner.nextLine());
							
							System.out.print("Nhập tác giả mới: ");
							TacGia.set(i, scanner.nextLine());
							
							do 
							{
								HopLeSua = true;
								System.out.print("Nhập năm xuất bản mới: ");
								NamMoi = scanner.nextInt();
								if (NamMoi > 2026 || NamMoi <= 0) 
								{
									System.out.println(">Lỗi: năm không hợp lệ");
									HopLeSua = false;
								}
							} while (!HopLeSua);
							Nxb.set(i, NamMoi);
							
							do 
							{
								HopLeSua = true;
								System.out.print("Nhập số lượng mới: ");
								SlgMoi = scanner.nextInt();
								if (SlgMoi < 0) 
								{
									System.out.println(">Lỗi: số lượng phải >= 0");
									HopLeSua = false;
								}
							} while (!HopLeSua);
							Slg.set(i, SlgMoi);
							

							do 
							{
								HopLeSua = true;
								System.out.print("Nhập giá sách mới: ");
								GiaMoi = scanner.nextInt();
								if (GiaMoi <= 0) 
								{
									System.out.println(">Lỗi: giá phải > 0");
									HopLeSua = false;
								}
							} while (!HopLeSua);
							DonGia.set(i, GiaMoi);
							
							scanner.nextLine();
							System.out.println("> Đã cập nhật thông tin sách thành công!");
							SuaThanhCong = true;
							break;
						}
					}
					if (!SuaThanhCong) 
					{
						System.out.println("> Không tìm thấy mã sách cần sửa!");
					}
					break;
				//HẾT CASE 5
					
				case 6:
					// BÀI 1: Mảng nhập số lượng 5 cuốn sách 
					System.out.println("\n--- MẢNG NHẬP SỐ LƯỢNG 5 CUỐN SÁCH ---");
					int[] SoLuong5Cuon = new int[5];
					int Tong5Cuon = 0;
					int MaxSlg = Integer.MIN_VALUE;
					
					for (i = 0; i < 5; i++) 
					{
						System.out.print("Nhập số lượng cho cuốn sách thứ " + (i + 1) + ": ");
						SoLuong5Cuon[i] = scanner.nextInt();
						Tong5Cuon += SoLuong5Cuon[i];
						if (SoLuong5Cuon[i] > MaxSlg) 
						{
							MaxSlg = SoLuong5Cuon[i];
						}
					}
					scanner.nextLine();
					
					System.out.println("-> Số lượng các cuốn sách vừa nhập:");
					for (i = 0; i < 5; i++) 
					{
						System.out.println("   Sách " + (i + 1) + ": " + SoLuong5Cuon[i]);
					}
					System.out.println("-> Tổng số lượng 5 cuốn: " + Tong5Cuon);
					System.out.println("-> Số lượng lớn nhất trong 5 cuốn: " + MaxSlg);
					break;
				//HẾT CASE 6
					
				case 7:
					System.out.println("> Đã thoát");
					break;
					
				default:
					System.out.println("> Chọn sai số");
			}
		} while (Chon != 7);
		
		scanner.close();
	} //Kết thúc của cái public static void main
} //Kết thúc của public class
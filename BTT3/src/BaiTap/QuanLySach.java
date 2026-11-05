package BaiTap;
import java.util.Scanner;

public class QuanLySach
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int i, N, TongSoLuong;
		double TongGiaTriSach;
		
		System.out.print("Nhập số lượng sách muốn nhập: ");
		N = scanner.nextInt();
		scanner.nextLine();
		String[] MaSach = new String[N];
		String[] TenSach = new String[N];
		String[] TacGia = new String[N];
		int[] Nxb = new int[N];
		int[] Slg = new int[N];
		int[] DonGia = new int[N];
		
		TongSoLuong = 0;
		TongGiaTriSach = 0;
		
		
		//BÀI 1-TUẦN 5
		for (i = 0; i < N; i++) 
		{
			System.out.println("\n- NHẬP THÔNG TIN CHO CUỐN SÁCH THỨ " + (i + 1) + ":");
			System.out.print("Nhập mã sách: ");
			MaSach[i] = scanner.nextLine();
			
			System.out.print("Nhập tên sách: ");
			TenSach[i] = scanner.nextLine();
			
			System.out.print("Nhập tác giả: ");
			TacGia[i] = scanner.nextLine();
			
			boolean HopLe;
			// Kiểm tra năm xuất bản
			do 
			{
				HopLe = true;
				System.out.print("Nhập năm xuất bản của sách: ");
				Nxb[i] = scanner.nextInt();
				if (Nxb[i] > 2026 || Nxb[i] <= 0) 
				{
					System.out.println(">Lỗi: Vượt quá năm hiện tại");
					HopLe = false;
				}
			} while (!HopLe);
			
			// Kiểm tra số lượng
			do 
			{
				HopLe = true;
				System.out.print("Nhập số lượng sách: ");
				Slg[i] = scanner.nextInt();
				if (Slg[i] < 0) 
				{
					System.out.println(">Lỗi: số lượng sách phải >= 0");
					HopLe = false;
				}
			} while (!HopLe);
			
			// Kiểm tra đơn giá
			do 
			{
				HopLe = true;
				System.out.print("Nhập giá sách: ");
				DonGia[i] = scanner.nextInt();
				if (DonGia[i] <= 0) 
				{
					System.out.println(">Lỗi: giá sách phải > 0");
					HopLe = false;
				}
			} while (!HopLe);
			
			scanner.nextLine();
			
			// BÀI 2 - TUẦN 5
			TongSoLuong = TongSoLuong + Slg[i];
			TongGiaTriSach = TongGiaTriSach + (double) DonGia[i] * Slg[i];
		}	
		
		// BÀI 3 - TUẦN 5
				int Chon;
				do 
				{
					System.out.println("\n\n---MENU QUẢN LÝ SÁCH---");
					System.out.println("1. Hiển thị thông tin tất cả các sách và tính tổng");
					System.out.println("2. Tìm kiếm sách theo mã sách (Bài 4)");
					System.out.println("3. Thoát");
					System.out.print("Chọn số (1->3): ");
					Chon = scanner.nextInt();
					scanner.nextLine();
					
					switch (Chon) 
					{
						case 1:
							System.out.println("\n- THÔNG TIN CHI TIẾT CÁC SÁCH TRONG THƯ VIỆN:");
							for (i = 0; i < N; i++) 
							{
								int ThTien = DonGia[i] * Slg[i];
								double PhiVC = 0.05 * DonGia[i];
								double TongTien = ThTien + PhiVC;
								
								System.out.println("\n+) Sách " + (i + 1) + ":");
								System.out.println("   - Mã sách: " + MaSach[i]);
								System.out.println("   - Tên sách: " + TenSach[i]);
								System.out.println("   - Tác giả: " + TacGia[i]);
								System.out.println("   - Năm xuất bản: " + Nxb[i]);
								System.out.println("   - Số lượng còn: " + Slg[i]);
								System.out.println("   - Giá sách: " + DonGia[i]);
								System.out.println("   - Thành Tiền: " + ThTien);
								System.out.println("   - Phí Vận Chuyển: " + PhiVC);
								System.out.println("   - Tổng Tiền Nhập: " + TongTien);
							}
							System.out.println("\n-> Tổng số lượng tất cả sách: " + TongSoLuong);
							System.out.println("-> Tổng giá trị kho sách: " + TongGiaTriSach);
							break;
							
						case 2:
							// BÀI 4 - TUẦN 5
							System.out.print("\nNhập mã sách cần tìm: ");
							String MaCanTim = scanner.nextLine();
							boolean TimThay = false;
							
							for (i = 0; i < N; i++) 
							{
								if (MaSach[i].equalsIgnoreCase(MaCanTim)) 
								{
									int ThTien = DonGia[i] * Slg[i];
									double PhiVC = 0.05 * DonGia[i];
									double TongTien = ThTien + PhiVC;
									
									System.out.println("> Đã tìm thấy sách.");
									System.out.println("+) Mã sách: " + MaSach[i]);
									System.out.println("+) Tên sách: " + TenSach[i]);
									System.out.println("+) Tác giả: " + TacGia[i]);
									System.out.println("+) Năm xuất bản: " + Nxb[i]);
									System.out.println("+) Số lượng còn: " + Slg[i]);
									System.out.println("+) Giá Sách: " + DonGia[i]);
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
							
						case 3:
							System.out.println("> Đã thoát");
							break;
							
						default:
							System.out.println("> Chọn sai số");
					}
				} while (Chon != 3);
				
				scanner.close();
	}
}
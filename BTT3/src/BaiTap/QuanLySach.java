package BaiTap;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach 
{
	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
		
		
		ArrayList<Book> DanhSachSach = new ArrayList<>();
		int Chon;
		do {
			System.out.println("1. Thêm một cuốn sách mới");
			System.out.println("2. Hiển thị sách");
          	System.out.println("3. Thoát chương trình");
          	System.out.print("Chọn chức năng (1-3): ");
          	Chon = scanner.nextInt();
          	scanner.nextLine();
          	
			switch (Chon) 
			{
				case 1:
					System.out.println("\n- NHẬP THÔNG TIN SÁCH MỚI:");
					System.out.print("Nhập mã sách: ");
					String ma = scanner.nextLine();
					
					System.out.print("Nhập tên sách: ");
					String ten = scanner.nextLine();
					
					System.out.print("Nhập tác giả: ");
					String tg = scanner.nextLine();
					
					Book sachMoi = new Book(ma, ten, tg, 2026, 0, 1);
					
					boolean HopLe;
					
					// Kiểm tra năm xuất bản 
					do {
						System.out.print("Nhập năm xuất bản của sách: ");
						int nxb = scanner.nextInt();
						HopLe = sachMoi.setNamXuatBan(nxb);
						if (!HopLe) {
							System.out.println("> năm xuất bản vượt quá năm hiện tại ");
						}
					} while (!HopLe);
					
					// Kiểm tra số lượng 
					do {
						System.out.print("Nhập số lượng sách: ");
						int sl = scanner.nextInt();
						HopLe = sachMoi.setSoLuong(sl);
						if (!HopLe) {
							System.out.println("> số lượng phải >= 0");
						}
					} while (!HopLe);
					
					
					scanner.nextLine();
					DanhSachSach.add(sachMoi);
					System.out.println("> Đã thêm sách");
					break;
					
				case 2: 
					System.out.println("\n- DANH SÁCH CÁC SÁCH TRONG THƯ VIỆN:");
					for (int i = 0; i < DanhSachSach.size(); i++) 
					{
						System.out.println("\n+) Sách thứ " + (i + 1) + ":");
						DanhSachSach.get(i).HienThiThongTin();
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
} //end class QuanLySach








































//package BaiTap;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class QuanLySach 
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Book> DanhSachSach = new ArrayList<>();
//        
//        int Chon;
//        do 
//        {
//            System.out.println("1. Thêm một cuốn sách mới");
//            System.out.println("2. Hiển thị sách");
//            System.out.println("3. Thoát chương trình");
//            System.out.print("Chọn chức năng (1-3): ");
//            Chon = scanner.nextInt();
//            scanner.nextLine(); 
//            
//            switch (Chon) 
//            {
//                case 1:
//                    System.out.println("\n- NHẬP THÔNG TIN SÁCH MỚI:");
//                    System.out.print("Nhập mã sách: ");
//                    String ma = scanner.nextLine();
//                    
//                    System.out.print("Nhập tiêu đề sách: ");
//                    String ten = scanner.nextLine();
//                    
//                    System.out.print("Nhập tác giả: ");
//                    String tg = scanner.nextLine();
//                    
//                    System.out.print("Nhập năm xuất bản: ");
//                    int nxb = scanner.nextInt();
//                    
//                    System.out.print("Nhập số lượng: ");
//                    int sl = scanner.nextInt();
//                    scanner.nextLine();
//                    
//                    Book sachMoi = new Book(ma, ten, tg, nxb, sl);
//                    
//                    
//                    DanhSachSach.add(sachMoi);
//                    System.out.println("> Đã thêm sách");
//                    break;
//                    
//                case 2: 
//                    System.out.println("\n- DANH SÁCH CÁC SÁCH TRONG THƯ VIỆN:");
//                    for (int i = 0; i < DanhSachSach.size(); i++) {
//                        System.out.println("\n+) Sách thứ " + (i + 1) + ":");
//                        DanhSachSach.get(i).HienThiThongTin();
//                    }
//                    break;
//                    
//                case 3:
//                    System.out.println("> Đã thoát");
//                    break;
//                    
//                default:
//                    System.out.println("> Chọn sai số");
//            }
//        } while (Chon != 3);
//        
//        scanner.close();
//    }
//    
//    
//}//end class QuanLySach
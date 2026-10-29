package BaiTap;
import java.util.Scanner;

public class QuanLySach
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String MaSach, TenSach, TacGia;
		int NXB, Slg, DonGia,Th_Tien;
		double Phi_VC, TongTien;
		System.out.print("- NHAP THONG TIN:\nNhap ma sach: "); //MS001, MS092,...
		MaSach = scanner.nextLine();
		System.out.print("Nhap ten sach: ");
		TenSach = scanner.nextLine();
		System.out.print("Nhap tac gia: ");
		TacGia = scanner.nextLine();
		System.out.print("Nhap nam xuat ban cua sach: ");
		NXB = scanner.nextInt();
		System.out.print("Nhap so luong sach: ");
		Slg = scanner.nextInt();
		System.out.print("Nhap gia sach: ");
		DonGia = scanner.nextInt();
		//Tinh
		Th_Tien = DonGia*Slg;
		Phi_VC = 0.05*DonGia;
		TongTien = Th_Tien + Phi_VC;
		//In ra
		System.out.print("\n- THONG TIN SACH:\n+) Ma sach: " + MaSach + "\n+) Ten sach: " + TenSach + "\n+) Ten tac gia: " + TacGia + "\n+) Nam xuat ban: " + NXB + "\n+) So luong con: " + Slg + "\n+) Gia Sach: " + DonGia + "\n+) Thanh Tien: " + Th_Tien + "\n+) Phi Van Chuyen: " + Phi_VC + "\n+) Tong Tien Nhap: " + TongTien);		
		scanner.close();
	}
}

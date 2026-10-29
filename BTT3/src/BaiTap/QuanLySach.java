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
		
		//Tuan 4
		System.out.println("\n\nBAI 1:");
        boolean HopLe = true;
        if(DonGia <= 0) //Kiem tra DonGia
        {
            System.out.println(">Loi: gia sach phai > 0");
            HopLe = false;
        }
        if(Slg < 0) //Kiem tra Slg
        {
            System.out.println(">Loi: so luong sach phai >= 0");
            HopLe = false;
        }
        if(NXB > 2026)
        {
            System.out.println(">Loi: nam xuat ban cua sach vuot qua nam hien tai");
            HopLe = false;
        }

        
        
        if (HopLe) 
        {
        	System.out.println("Nhap dung");
        	System.out.println("\n\nBAI 2:");
            if (DonGia < 50000) 
            {
                System.out.println("+) Phan loai: Sach gia thap");
            } else if (DonGia <= 100000) {
                System.out.println("+) Phan loai: Sach gia trung binh");
            } else if (DonGia <= 200000) {
                System.out.println("+) Phan loai: Sach gia cao");
            } else {
                System.out.println("+) Phan loai: Sach gia dac biet");
            }
            
            System.out.println("\n\nBAI 3:");
            if (Slg == 0) {
                System.out.println("+)Tinh Trang: Het sach");
            } else if (Slg >= 1 && Slg <= 5) {
                System.out.println("+)Tinh Trang: Sap het");
            } else if (Slg >= 6 && Slg <= 20) {
                System.out.println("+)Tinh Trang: Con it");
            } else {
                System.out.println("+)Tinh Trang: Con nhieu");
            }
        } else {
            System.out.println("> Nhap sai");
        }
		
        System.out.println("\n\nBAI 4:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Chon loai sach (1-4): ");
        int chon = scanner.nextInt();
        
        switch (chon) {
            case 1:
                System.out.println(">Da chon sach giao khoa");
                break;
            case 2:
                System.out.println(">Da chon sach tham khao");
                break;
            case 3:
                System.out.println(">Da chon sach chuyen nganh");
                break;
            case 4:
                System.out.println(">Sach khac");
                break;
            default:
                System.out.println(">Chon sai");
        }
		scanner.close();
	}
}
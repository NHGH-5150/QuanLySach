package BaiTap;

public class Book {
	String MaSach;
	String TieuDe;
	String TacGia;
	int NamXuatBan;
	int SoLuong;
	

	
	public Book(String ms, String td, String tg, int nxb, int sl) {
		this.MaSach = ms;
		this.TieuDe = td;
		this.TacGia = tg;
		this.NamXuatBan = nxb;
		this.SoLuong = sl;
	}
	
	public void HienThiThongTin() {
		System.out.println("Ma Sach: " + MaSach);
		System.out.println("Tieu De: " + TieuDe);
		System.out.println("TacGia: " + TacGia);
		System.out.println("Nam Xuat Ban cua sach: " + NamXuatBan);
		System.out.println("So Luong sach con lai: " + SoLuong);
	}
	
} //end class Book
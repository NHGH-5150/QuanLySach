package BaiTap;

public class Book 
{
	private String MaSach;
	private String TieuDe;
	private String TacGia;
	private int NamXuatBan;
	private int SoLuong;
	private int DonGia;

	public Book(String ms, String td, String tg, int nxb, int sl, int dg) 
	{
		MaSach = ms;
		TieuDe = td;
		TacGia = tg;
		NamXuatBan = nxb;
		SoLuong = sl;
		DonGia = dg;
	}

	public String getMaSach() 
	{
		return MaSach;
	}
	public void setMaSach(String ms) 
	{
		MaSach = ms;
	}
	
	
	public String getTieuDe() {
		return TieuDe;
	}
	public void setTieuDe(String td) {
		TieuDe = td;
	}

	
	public String getTacGia() {
		return TacGia;
	}
	public void setTacGia(String tg) {
		TacGia = tg;
	}

	
	public int getNamXuatBan() {
		return NamXuatBan;
	}
	public boolean setNamXuatBan(int nxb) 
	{
		if (nxb > 2026 || nxb <= 0) 
		{
			return false;
		}
		NamXuatBan = nxb;
		return true;
	}

	
	public int getSoLuong() {
		return SoLuong;
	}
	public boolean setSoLuong(int sl) {
		if (sl < 0) {
			return false;
		}
		SoLuong = sl;
		return true;
	}

	public int getDonGia() {
		return DonGia;
	}
	public boolean setDonGia(int dg) {
		if (dg <= 0) {
			return false;
		}
		DonGia = dg;
		return true;
	}

	public void HienThiThongTin() 
	{		
		System.out.println("Ma Sach: " + MaSach);
		System.out.println("Tieu De: " + TieuDe);
		System.out.println("TacGia: " + TacGia);
		System.out.println("Nam Xuat Ban cua sach: " + NamXuatBan);
		System.out.println("So Luong sach con lai: " + SoLuong);
	}
	
} //end class Book
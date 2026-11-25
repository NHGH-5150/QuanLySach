package BaiTap;

public class Sach
{
	protected String MaSach;
	protected String NgayNhap;
	protected double DonGia;
	protected int SoLuong;
	protected String NhaXuatBan;
	
	public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan)
	{
		this.MaSach = maSach;
		this.NgayNhap = ngayNhap;
		this.DonGia = donGia;
		this.SoLuong = soLuong;
		this.NhaXuatBan = nhaXuatBan;
	}
	
	//Ma sach:
	public String getMaSach() {
		return MaSach;
	}
	
	public void setMaSach(String maSach) {
		this.MaSach = maSach;
	}
	
	//Ngay Nhap:
	public String getNgayNhap() {
		return NgayNhap;
	}
	
	public void setNgayNhap(String ngayNhap) {
		this.NgayNhap = ngayNhap;
	}
	
	//Don gia:
	public double getDonGia() {
		return DonGia;
	}
	
	public boolean setDonGia(double donGia) {
		if (donGia <= 0) {
			return false;
		}
		this.DonGia = donGia;
		return true;
	}
	
	//so luong:
	public int getSoLuong() {
		return SoLuong;
	}
	
	public boolean setSoLuong(int soLuong) {
		if(soLuong < 0) {
			return false;
		}
		this.SoLuong = soLuong;
		return true;
	}
	
	//Nha xb:
	public String getNhaXuatBan() {
		return NhaXuatBan;
	}
	
	public void setNhaXuatBan(String nhaXuatBan) {
		this.NhaXuatBan = nhaXuatBan;
	}
	
	
	//Thanh tien:
	public double TinhThanhTien() {
		return SoLuong * DonGia;
	}
	
	//Phuong thuc:
	public void HienThiThongTin() 
	{
		System.out.println("Mã sách: " + MaSach);
		System.out.println("Ngày nhập kho: " + NgayNhap);
		System.out.println("Giá sách: " + DonGia);
		System.out.println("Số lượng còn lại: " + SoLuong);
		System.out.println("Nhà xuất bản cuốn sách: " + NhaXuatBan);
	}


} //end class Book
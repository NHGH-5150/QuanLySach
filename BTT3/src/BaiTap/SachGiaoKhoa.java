package BaiTap;

public class SachGiaoKhoa extends Sach 
{
	protected String TinhTrang; //thuộc tính mới
	
	
	public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) 
	{
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.TinhTrang = tinhTrang;
	}
	
	//Tinh trang:
	public String getTinhTrang() {
		return TinhTrang;
	}
	
	public void setTinhTrang(String tinhTrang) {
		this.TinhTrang = tinhTrang;
	}
	
	//tính tiền sách giáo khoa( mới, cũ):
	@Override
	public double TinhThanhTien()
	{
		if(TinhTrang.equalsIgnoreCase("moi")) {
			return SoLuong * DonGia;
		}
		return SoLuong * DonGia * 0.5;
	}
	
	
	@Override
	public void HienThiThongTin() 
	{
		super.HienThiThongTin();
		System.out.println("Tình trạng của sách: " + TinhTrang);
		System.out.println("Thành tiền (Sách giáo khoa): " + TinhThanhTien() );
	}
	
	
} //end class sgk

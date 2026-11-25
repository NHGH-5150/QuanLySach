package BaiTap;

public class SachThamKhao extends Sach
{
	protected double Thue; //thuộc tính mới
	
	
	public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) 
	{
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.Thue = thue;
	}

	
	//Thuế:
	public double getThue() {
		return Thue;
	}
	
	public boolean setThue(double thue) {
		if(thue <0) {
			return false;
		}
		this.Thue = thue;
		return true;	
	}
	
	//Tính tiền sách tham khảo ( cộng thêm thuế)
	@Override
	public double TinhThanhTien() 
	{
		return SoLuong * DonGia + Thue;
	}
	
	
	
	@Override
	public void HienThiThongTin()
	{
		super.HienThiThongTin();
		System.out.println("Giá thuế của sách: " + Thue);
		System.out.println("Thành tiền (sách tham khảo): " + TinhThanhTien());
	}
} //end class stkhao

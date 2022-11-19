package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietHoaDonPK.class)
public class ChiTietHoaDon {
	
	@Id
	@ManyToOne
	//@JoinColumn(name = "MaHD")
	@JoinColumns({
	    @JoinColumn(name="MaHD", referencedColumnName="MaHD"),
	    @JoinColumn(name="nhanvien", referencedColumnName="MaNV"),
	    @JoinColumn(name="khachhang", referencedColumnName="MaKH")
	})
	private HoaDon hoadon;
	
	@Id
	@ManyToOne
//	@JoinColumn(name = "MaHangHoa")
	@JoinColumns({
	    @JoinColumn(name="maHangHoa", referencedColumnName="MaHangHoa"),
	    @JoinColumn(name="nhacc", referencedColumnName="MaNCC")
	})
	private HangHoa hanghoa;
	
	private int soLuong;
	
	
	
}

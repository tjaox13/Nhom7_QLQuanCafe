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
@IdClass(ChiTietDatHangPK.class)
public class ChiTietDatHang {
	
	@Id
	@ManyToOne
	//@JoinColumn(name = "MaDonDat")
	
	@JoinColumns({
	    @JoinColumn(name="MaDonDat", referencedColumnName="MaDonDat"),
	    @JoinColumn(name="nhanvien", referencedColumnName="MaNV")
	})
	private HoaDonDatHang hoadondathang;
	@Id
	@ManyToOne
	//@JoinColumn(name = "MaHangHoa")
	@JoinColumns({
	    @JoinColumn(name="maHangHoa", referencedColumnName="MaHangHoa"),
	    @JoinColumn(name="nhacc", referencedColumnName="MaNCC")
	})
	private HangHoa hanghoa;
	
	private int soLuong;
	@Column(name = "ThanhTien")
	private double thanhTien;
	
	
	
}

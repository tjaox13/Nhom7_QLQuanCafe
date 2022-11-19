package entity;

import java.awt.Image;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class HangHoa {
	
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaHH")
	private String maHH;
	
	@Column(name = "DonGia")
	private double donGia;
	
	@ManyToOne
	@JoinColumn(name="MaNCC")
	private NhaCC nhacc;
//	@Column(name = "HinhAnh")
//	private Image hinhAnh;
	
	@OneToMany(mappedBy = "hanghoa")
	private List<ChiTietHoaDon> dschitiethoadon;
	
	@OneToMany(mappedBy = "hanghoa")
	private List<ChiTietDatHang> dschitietdathang;
	
	public HangHoa() {
		super();
	}

	public HangHoa(NhaCC nhacc, String maHH, double donGia, List<ChiTietHoaDon> dschitiethoadon,
			List<ChiTietDatHang> dschitietdathang) {
		super();
		this.nhacc = nhacc;
		this.maHH = maHH;
		this.donGia = donGia;
		this.dschitiethoadon = dschitiethoadon;
		this.dschitietdathang = dschitietdathang;
	}

	public NhaCC getNhacc() {
		return nhacc;
	}

	public void setNhacc(NhaCC nhacc) {
		this.nhacc = nhacc;
	}

	public String getMaHH() {
		return maHH;
	}

	public void setMaHH(String maHH) {
		this.maHH = maHH;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public List<ChiTietHoaDon> getDschitiethoadon() {
		return dschitiethoadon;
	}

	public void setDschitiethoadon(List<ChiTietHoaDon> dschitiethoadon) {
		this.dschitiethoadon = dschitiethoadon;
	}

	public List<ChiTietDatHang> getDschitietdathang() {
		return dschitietdathang;
	}

	public void setDschitietdathang(List<ChiTietDatHang> dschitietdathang) {
		this.dschitietdathang = dschitietdathang;
	}

	@Override
	public String toString() {
		return "HangHoa [nhacc=" + nhacc + ", maHH=" + maHH + ", donGia=" + donGia + ", dschitiethoadon="
				+ dschitiethoadon + ", dschitietdathang=" + dschitietdathang + "]";
	}

	
	
}

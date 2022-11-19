package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@IdClass(HangHoaPK.class)
public class HangHoa {
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaNCC")
	private NhaCC nhacc;
	
	@Id
	@Column(name = "MaHangHoa")
	private String maHangHoa;
	
	@Column(name = "DonGia")
	private double donGia;
	
	@OneToMany(mappedBy = "hanghoa")
	private List<ChiTietHoaDon> dschitiethoadon;
	
	@OneToMany(mappedBy = "hanghoa")
	private List<ChiTietDatHang> dschitietdathang;
	
	public HangHoa() {
		super();
	}

	public HangHoa(NhaCC nhacc, String maHangHoa, double donGia, List<ChiTietHoaDon> dschitiethoadon,
			List<ChiTietDatHang> dschitietdathang) {
		super();
		this.nhacc = nhacc;
		this.maHangHoa = maHangHoa;
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

	public String getMaHangHoa() {
		return maHangHoa;
	}

	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
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
		return "HangHoa [nhacc=" + nhacc + ", maHangHoa=" + maHangHoa + ", donGia=" + donGia + ", dschitiethoadon="
				+ dschitiethoadon + ", dschitietdathang=" + dschitietdathang + "]";
	}

	
	
}

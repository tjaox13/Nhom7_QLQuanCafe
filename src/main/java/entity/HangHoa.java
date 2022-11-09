package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
@IdClass(HangHoaPK.class)
public class HangHoa {
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaNCC")
	private NhaCC nhacc;
	
	@Id
	@ManyToOne
//	@JoinColumns({
//		  @JoinColumn(name = "MaNV", insertable = false, updatable = false),
//		  @JoinColumn(name = "MaPhieuNhap", insertable = false, updatable = false)
//		})
	@JoinColumn(name = "MaPhieuNhap")
	private PhieuNhap phieunhap;
	
	@Id
	@Column(name = "MaHangHoa")
	private String maHangHoa;
	
	@Column(name = "SoLuong")
	private int soLuong;
	
	
	public HangHoa() {
		super();
	}

	public HangHoa(NhaCC nhacc, PhieuNhap phieunhap, String maHangHoa, int soLuong) {
		super();
		this.nhacc = nhacc;
		this.phieunhap = phieunhap;
		this.maHangHoa = maHangHoa;
		this.soLuong = soLuong;
	}

	public NhaCC getNhacc() {
		return nhacc;
	}

	public void setNhacc(NhaCC nhacc) {
		this.nhacc = nhacc;
	}

	public PhieuNhap getPhieunhap() {
		return phieunhap;
	}

	public void setPhieunhap(PhieuNhap phieunhap) {
		this.phieunhap = phieunhap;
	}

	public String getMaHangHoa() {
		return maHangHoa;
	}

	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "HangHoa [nhacc=" + nhacc + ", phieunhap=" + phieunhap + ", maHangHoa=" + maHangHoa + ", soLuong="
				+ soLuong + "]";
	}
	
	
	
	
}

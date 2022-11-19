package entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@IdClass(HoaDonDatHangPK.class)
public class HoaDonDatHang {
	@Id
	@ManyToOne
	@JoinColumn(name="MaNV")
	private NhanVien nhanvien;
	@Id
	@Column(name = "MaDonDat")
	private String maDonDat;
	@Column(name = "NgayLap")
	private LocalDate ngayLap;
	
	@OneToMany(mappedBy = "hoadondathang")
	private List<ChiTietDatHang> chitietdathang;
	public HoaDonDatHang() {
		super();
	}
	public HoaDonDatHang(NhanVien nhanvien, String maDonDat, LocalDate ngayLap, List<ChiTietDatHang> chitietdathang) {
		super();
		this.nhanvien = nhanvien;
		this.maDonDat = maDonDat;
		this.ngayLap = ngayLap;
		this.chitietdathang = chitietdathang;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public String getMaDonDat() {
		return maDonDat;
	}
	public void setMaDonDat(String maDonDat) {
		this.maDonDat = maDonDat;
	}
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	public List<ChiTietDatHang> getChitietdathang() {
		return chitietdathang;
	}
	public void setChitietdathang(List<ChiTietDatHang> chitietdathang) {
		this.chitietdathang = chitietdathang;
	}
	@Override
	public String toString() {
		return "HoaDonDatHang [nhanvien=" + nhanvien + ", maDonDat=" + maDonDat + ", ngayLap=" + ngayLap
				+ ", chitietdathang=" + chitietdathang + "]";
	}

	
	
	
}

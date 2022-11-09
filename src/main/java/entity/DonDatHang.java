package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(DonDatHangPK.class)
public class DonDatHang {
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaNV")
	private NhanVien nhanvien;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaNCC")
	private NhaCC nhacc;
	
	@Id
	@Column(name = "MaDonDat")
	private String maDonDat;
	@Column(name = "NgayLap")
	private Date ngayLap;
	public DonDatHang() {
		super();
	}
	public DonDatHang(NhanVien nhanvien, NhaCC nhacc, String maDonDat, Date ngayLap) {
		super();
		this.nhanvien = nhanvien;
		this.nhacc = nhacc;
		this.maDonDat = maDonDat;
		this.ngayLap = ngayLap;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public NhaCC getNhacc() {
		return nhacc;
	}
	public void setNhacc(NhaCC nhacc) {
		this.nhacc = nhacc;
	}
	public String getMaDonDat() {
		return maDonDat;
	}
	public void setMaDonDat(String maDonDat) {
		this.maDonDat = maDonDat;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	@Override
	public String toString() {
		return "DonDatHang [nhanvien=" + nhanvien + ", nhacc=" + nhacc + ", maDonDat=" + maDonDat + ", ngayLap="
				+ ngayLap + "]";
	}
	
	
}

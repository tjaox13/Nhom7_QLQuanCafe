package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(HoaDonPK.class)
public class HoaDon {
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaNV")
	private NhanVien nhanvien;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaKH")
	private KhachHang khachhang;
	
	@Id
	@Column(name = "MaHD")
	private String maHD;
	@Column(name = "NgayLap")
	private Date ngayLap;
	public HoaDon() {
		super();
	}
	public HoaDon(NhanVien nhanvien, KhachHang khachhang, String maHD, Date ngayLap) {
		super();
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.maHD = maHD;
		this.ngayLap = ngayLap;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	public KhachHang getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	@Override
	public String toString() {
		return "HoaDon [nhanvien=" + nhanvien + ", khachhang=" + khachhang + ", maHD=" + maHD + ", ngayLap=" + ngayLap
				+ "]";
	}
	
	
	
	
	
	
}

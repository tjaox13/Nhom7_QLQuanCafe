package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class HoaDon {
	
	@ManyToOne
	@JoinColumn(name="MaNV")
	private NhanVien nhanvien;
	
	@ManyToOne
	@JoinColumn(name="MaKH")
	private KhachHang khachhang;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaHD")
	private String maHD;
	@Column(name = "NgayLap")
	private LocalDate ngayLap;
	
	@OneToMany(mappedBy = "hoadon")
	private List<ChiTietHoaDon> dschitiethoadon;
	public HoaDon() {
		super();
	}
	public HoaDon(NhanVien nhanvien, KhachHang khachhang, String maHD, LocalDate ngayLap,
			List<ChiTietHoaDon> dschitiethoadon) {
		super();
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.maHD = maHD;
		this.ngayLap = ngayLap;
		this.dschitiethoadon = dschitiethoadon;
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
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	public List<ChiTietHoaDon> getDschitiethoadon() {
		return dschitiethoadon;
	}
	public void setDschitiethoadon(List<ChiTietHoaDon> dschitiethoadon) {
		this.dschitiethoadon = dschitiethoadon;
	}
	@Override
	public String toString() {
		return "HoaDon [nhanvien=" + nhanvien + ", khachhang=" + khachhang + ", maHD=" + maHD + ", ngayLap=" + ngayLap
				+ ", dschitiethoadon=" + dschitiethoadon + "]";
	}
	
	
	
	
}

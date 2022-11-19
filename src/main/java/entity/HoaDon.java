package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	private LocalDate ngayLap;
	
	@OneToMany(mappedBy = "hoadon")
	private List<ChiTietHoaDon> chitiethoadon;
	public HoaDon() {
		super();
	}
	public HoaDon(NhanVien nhanvien, KhachHang khachhang, String maHD, LocalDate ngayLap,
			List<ChiTietHoaDon> chitiethoadon) {
		super();
		this.nhanvien = nhanvien;
		this.khachhang = khachhang;
		this.maHD = maHD;
		this.ngayLap = ngayLap;
		this.chitiethoadon = chitiethoadon;
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
	public List<ChiTietHoaDon> getChitiethoadon() {
		return chitiethoadon;
	}
	public void setChitiethoadon(List<ChiTietHoaDon> chitiethoadon) {
		this.chitiethoadon = chitiethoadon;
	}
	@Override
	public String toString() {
		return "HoaDon [nhanvien=" + nhanvien + ", khachhang=" + khachhang + ", maHD=" + maHD + ", ngayLap=" + ngayLap
				+ ", chitiethoadon=" + chitiethoadon + "]";
	}
	
	
	
}

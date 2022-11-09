package entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PhieuNhap {
	
	@Id
	@Column(name = "MaPhieuNhap")
	private String maPhieuNhap;
	
	@Column(name = "NgayLap")
	private Date ngayLap;
	
	//@Id
	@ManyToOne
	@JoinColumn(name="MaNV")
	private NhanVien nhanvien;
	
	
	@OneToMany(mappedBy = "phieunhap")
	private List<HangHoa> dsHangHoa;

	public PhieuNhap() {
		super();
	}

	public PhieuNhap(String maPhieuNhap, Date ngayLap, NhanVien nhanvien, List<HangHoa> dsHangHoa) {
		super();
		this.maPhieuNhap = maPhieuNhap;
		this.ngayLap = ngayLap;
		this.nhanvien = nhanvien;
		this.dsHangHoa = dsHangHoa;
	}

	public String getMaPhieuNhap() {
		return maPhieuNhap;
	}

	public void setMaPhieuNhap(String maPhieuNhap) {
		this.maPhieuNhap = maPhieuNhap;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public NhanVien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public List<HangHoa> getDsHangHoa() {
		return dsHangHoa;
	}

	public void setDsHangHoa(List<HangHoa> dsHangHoa) {
		this.dsHangHoa = dsHangHoa;
	}

	@Override
	public String toString() {
		return "PhieuNhap [maPhieuNhap=" + maPhieuNhap + ", ngayLap=" + ngayLap + ", nhanvien=" + nhanvien
				+ ", dsHangHoa=" + dsHangHoa + "]";
	}
	
	
	
	
}

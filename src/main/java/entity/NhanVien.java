package entity;

import java.time.LocalDate;
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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class NhanVien {
	
	@Id
	@Column(name = "MaNV")
	private String maNV;
	@Column(name = "TenNV", columnDefinition = "nvarchar(255)", nullable = false)
	private String tenNV;
	@Column(name = "NgaySinh")
	private LocalDate ngaysinh;
	
	@Column(name = "DiaChi", columnDefinition = "nvarchar(255)")
	private String diaChi;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private TaiKhoan taikhoan;
	
	@OneToMany(mappedBy = "nhanvien")
	private List<HoaDon> dshoadon;
	
	@OneToMany(mappedBy = "nhanvien")
	private List<HoaDonDatHang> dshoadondathang;

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, String tenNV, LocalDate ngaysinh, String diaChi, TaiKhoan taikhoan,
			List<HoaDon> dshoadon, List<HoaDonDatHang> dshoadondathang) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaysinh = ngaysinh;
		this.diaChi = diaChi;
		this.taikhoan = taikhoan;
		this.dshoadon = dshoadon;
		this.dshoadondathang = dshoadondathang;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public TaiKhoan getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(TaiKhoan taikhoan) {
		this.taikhoan = taikhoan;
	}

	public List<HoaDon> getDshoadon() {
		return dshoadon;
	}

	public void setDshoadon(List<HoaDon> dshoadon) {
		this.dshoadon = dshoadon;
	}

	public List<HoaDonDatHang> getDshoadondathang() {
		return dshoadondathang;
	}

	public void setDshoadondathang(List<HoaDonDatHang> dshoadondathang) {
		this.dshoadondathang = dshoadondathang;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", ngaysinh=" + ngaysinh + ", diaChi=" + diaChi
				+ ", taikhoan=" + taikhoan + ", dshoadon=" + dshoadon + ", dshoadondathang=" + dshoadondathang + "]";
	}

	
	
}

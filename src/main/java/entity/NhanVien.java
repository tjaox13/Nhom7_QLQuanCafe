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
	
//	@OneToOne
//    @JoinColumn(name = "MaNV")
//    private TaiKhoan taikhoan;
	@OneToOne
	@PrimaryKeyJoinColumn
	private TaiKhoan taikhoan;
//	@ManyToOne
//	@JoinColumn(name="maNV")
//	private TaiKhoan taikhoan;
	
	@OneToMany(mappedBy = "nhanvien")
	private List<HoaDon> dshoadon;
	
	@OneToMany(mappedBy = "nhanvien")
	private List<PhieuNhap> dsphieunhap;
	
	@OneToMany(mappedBy = "nhanvien")
	private List<DonDatHang> dsdondathang;

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, String tenNV, LocalDate ngaysinh, String diaChi, TaiKhoan taikhoan,
			List<HoaDon> dshoadon, List<PhieuNhap> dsphieunhap, List<DonDatHang> dsdondathang) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaysinh = ngaysinh;
		this.diaChi = diaChi;
		this.taikhoan = taikhoan;
		this.dshoadon = dshoadon;
		this.dsphieunhap = dsphieunhap;
		this.dsdondathang = dsdondathang;
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

	public List<PhieuNhap> getDsphieunhap() {
		return dsphieunhap;
	}

	public void setDsphieunhap(List<PhieuNhap> dsphieunhap) {
		this.dsphieunhap = dsphieunhap;
	}

	public List<DonDatHang> getDsdondathang() {
		return dsdondathang;
	}

	public void setDsdondathang(List<DonDatHang> dsdondathang) {
		this.dsdondathang = dsdondathang;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", ngaysinh=" + ngaysinh + ", diaChi=" + diaChi
				+ ", taikhoan=" + taikhoan + ", dshoadon=" + dshoadon + ", dsphieunhap=" + dsphieunhap
				+ ", dsdondathang=" + dsdondathang + "]";
	}
	
	
	
	
	
	
}

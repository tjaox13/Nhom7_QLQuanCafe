package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(LoaiNuocPK.class)
public class LoaiNuoc {
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaKH")
	private KhachHang khachhang;
	
	@Id
	@Column(name = "MaNuoc")
	private String maNuoc;
	@Column(name = "TenNuoc", columnDefinition = "nvarchar(255)")
	private String tenNuoc;
	public LoaiNuoc() {
		super();
	}
	public LoaiNuoc(KhachHang khachhang, String maNuoc, String tenNuoc) {
		super();
		this.khachhang = khachhang;
		this.maNuoc = maNuoc;
		this.tenNuoc = tenNuoc;
	}
	public KhachHang getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
	public String getMaNuoc() {
		return maNuoc;
	}
	public void setMaNuoc(String maNuoc) {
		this.maNuoc = maNuoc;
	}
	public String getTenNuoc() {
		return tenNuoc;
	}
	public void setTenNuoc(String tenNuoc) {
		this.tenNuoc = tenNuoc;
	}
	@Override
	public String toString() {
		return "LoaiNuoc [khachhang=" + khachhang + ", maNuoc=" + maNuoc + ", tenNuoc=" + tenNuoc + "]";
	}
	
	
	
	
}

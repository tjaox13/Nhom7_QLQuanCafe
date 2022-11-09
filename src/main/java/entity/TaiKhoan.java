package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class TaiKhoan {

	@Id
	@Column(name = "MaNV")
	private String maNV;
	@Column(name = "MatKhau", columnDefinition = "nvarchar(255)")
	private String matKhau;
	@Column(name = "Quyen", columnDefinition = "nvarchar(255)")
	private String quyen;
	
	@OneToOne
	@MapsId
	@JoinColumn(name="MaNV")
	private NhanVien nhanvien;
	
//	@OneToOne(mappedBy = "taikhoan")
//    private NhanVien nhanvien;

	public TaiKhoan() {
		super();
	}

	public TaiKhoan(String maNV, String matKhau, String quyen, NhanVien nhanvien) {
		super();
		this.maNV = maNV;
		this.matKhau = matKhau;
		this.quyen = quyen;
		this.nhanvien = nhanvien;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getQuyen() {
		return quyen;
	}

	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}

	public NhanVien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maNV=" + maNV + ", matKhau=" + matKhau + ", quyen=" + quyen + ", nhanvien=" + nhanvien + "]";
	}
	
	
	
	
		
}

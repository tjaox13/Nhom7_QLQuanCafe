package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhachHang {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaKH")
	private String maKH;
	@Column(name = "TenKH", columnDefinition = "nvarchar(255)")
	private String tenKH;
	@Column(name = "SoBan")
	private int soBan;
	
	@OneToMany(mappedBy = "khachhang")
	private List<HoaDon> dsHoaDon;

	public KhachHang() {
		super();
	}

	public KhachHang(String maKH, String tenKH, int soBan, List<HoaDon> dsHoaDon) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.soBan = soBan;
		this.dsHoaDon = dsHoaDon;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public int getSoBan() {
		return soBan;
	}

	public void setSoBan(int soBan) {
		this.soBan = soBan;
	}

	public List<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(List<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", soBan=" + soBan + ", dsHoaDon=" + dsHoaDon + "]";
	}


	
	
}

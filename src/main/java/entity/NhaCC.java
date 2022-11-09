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
public class NhaCC {
	
	@Id
	@Column(name = "MaNCC")
	private String maNCC;
	@Column(name = "TenNCC", columnDefinition = "nvarchar(255)", nullable = false)
	private String tenNCC;
	
	@Column(name = "DiaChi", columnDefinition = "nvarchar(255)")
	private String diaChi;
	@Column(name = "SDT", columnDefinition = "nvarchar(255)")
	private String sDT;
	
	@OneToMany(mappedBy = "nhacc")
	private List<DonDatHang> dsdondathang;
	
	@OneToMany(mappedBy = "nhacc")
	private List<HangHoa> dshanghoa;

	public NhaCC() {
		super();
	}

	public NhaCC(String maNCC, String tenNCC, String diaChi, String sDT, List<DonDatHang> dsdondathang,
			List<HangHoa> dshanghoa) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
		this.sDT = sDT;
		this.dsdondathang = dsdondathang;
		this.dshanghoa = dshanghoa;
	}

	public String getMaNCC() {
		return maNCC;
	}

	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}

	public String getTenNCC() {
		return tenNCC;
	}

	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}

	public List<DonDatHang> getDsdondathang() {
		return dsdondathang;
	}

	public void setDsdondathang(List<DonDatHang> dsdondathang) {
		this.dsdondathang = dsdondathang;
	}

	public List<HangHoa> getDshanghoa() {
		return dshanghoa;
	}

	public void setDshanghoa(List<HangHoa> dshanghoa) {
		this.dshanghoa = dshanghoa;
	}

	@Override
	public String toString() {
		return "NhaCC [maNCC=" + maNCC + ", tenNCC=" + tenNCC + ", diaChi=" + diaChi + ", sDT=" + sDT
				+ ", dsdondathang=" + dsdondathang + ", dshanghoa=" + dshanghoa + "]";
	}
	
		
}

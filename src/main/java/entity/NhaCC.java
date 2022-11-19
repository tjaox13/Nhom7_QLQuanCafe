package entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String maNCC;
	@Column(name = "TenNCC", columnDefinition = "nvarchar(255)", nullable = false)
	private String tenNCC;
	
	@Column(name = "DiaChi", columnDefinition = "nvarchar(255)")
	private String diaChi;
	@Column(name = "SDT", columnDefinition = "nvarchar(255)")
	private String sDT;
	
	@OneToMany(mappedBy = "nhacc")
	private List<HangHoa> dsHangHoa;

	public NhaCC() {
		super();
	}

	public NhaCC(String maNCC, String tenNCC, String diaChi, String sDT,
			List<HangHoa> dsHangHoa) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
		this.sDT = sDT;
		this.dsHangHoa = dsHangHoa;
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

	public List<HangHoa> getdsHangHoa() {
		return dsHangHoa;
	}

	public void setdsHangHoa(List<HangHoa> dsHangHoa) {
		this.dsHangHoa = dsHangHoa;
	}

	@Override
	public String toString() {
		return "NhaCC [maNCC=" + maNCC + ", tenNCC=" + tenNCC + ", diaChi=" + diaChi + ", sDT=" + sDT
				+ ", dsdondathang=" + ", dsHangHoa=" + dsHangHoa + "]";
	}
	
		
}

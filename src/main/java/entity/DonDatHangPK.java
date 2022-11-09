package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DonDatHangPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7246485906446023185L;
	private String nhanvien;
	private String nhacc;
	private String maDonDat;
	
	public DonDatHangPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maDonDat == null) ? 0 : maDonDat.hashCode());
		result = prime * result + ((nhacc == null) ? 0 : nhacc.hashCode());
		result = prime * result + ((nhanvien == null) ? 0 : nhanvien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDatHangPK other = (DonDatHangPK) obj;
		if (maDonDat == null) {
			if (other.maDonDat != null)
				return false;
		} else if (!maDonDat.equals(other.maDonDat))
			return false;
		if (nhacc == null) {
			if (other.nhacc != null)
				return false;
		} else if (!nhacc.equals(other.nhacc))
			return false;
		if (nhanvien == null) {
			if (other.nhanvien != null)
				return false;
		} else if (!nhanvien.equals(other.nhanvien))
			return false;
		return true;
	}
	
}

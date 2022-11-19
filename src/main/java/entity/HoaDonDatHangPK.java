package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class HoaDonDatHangPK implements Serializable {
	private static final long serialVersionUID = -7246485906446023185L;
	private String nhanvien;
	private String maDonDat;
	
	public HoaDonDatHangPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maDonDat == null) ? 0 : maDonDat.hashCode());
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
		HoaDonDatHangPK other = (HoaDonDatHangPK) obj;
		if (maDonDat == null) {
			if (other.maDonDat != null)
				return false;
		} else if (!maDonDat.equals(other.maDonDat))
			return false;
		if (nhanvien == null) {
			if (other.nhanvien != null)
				return false;
		} else if (!nhanvien.equals(other.nhanvien))
			return false;
		return true;
	}

	
	
}

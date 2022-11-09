package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PhieuNhapPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7246485906446023185L;
	private String nhanvien;
	private String maPhieuNhap;
	
	public PhieuNhapPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhieuNhap == null) ? 0 : maPhieuNhap.hashCode());
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
		PhieuNhapPK other = (PhieuNhapPK) obj;
		if (maPhieuNhap == null) {
			if (other.maPhieuNhap != null)
				return false;
		} else if (!maPhieuNhap.equals(other.maPhieuNhap))
			return false;
		if (nhanvien == null) {
			if (other.nhanvien != null)
				return false;
		} else if (!nhanvien.equals(other.nhanvien))
			return false;
		return true;
	}
	
	
	
	
}

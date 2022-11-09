package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class HoaDonPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7246485906446023185L;
	private String nhanvien;
	private String khachhang;
	private String maHD;
	
	public HoaDonPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((khachhang == null) ? 0 : khachhang.hashCode());
		result = prime * result + ((maHD == null) ? 0 : maHD.hashCode());
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
		HoaDonPK other = (HoaDonPK) obj;
		if (khachhang == null) {
			if (other.khachhang != null)
				return false;
		} else if (!khachhang.equals(other.khachhang))
			return false;
		if (maHD == null) {
			if (other.maHD != null)
				return false;
		} else if (!maHD.equals(other.maHD))
			return false;
		if (nhanvien == null) {
			if (other.nhanvien != null)
				return false;
		} else if (!nhanvien.equals(other.nhanvien))
			return false;
		return true;
	}

	
	
}

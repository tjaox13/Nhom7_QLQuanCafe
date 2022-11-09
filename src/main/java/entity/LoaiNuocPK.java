package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class LoaiNuocPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7246485906446023185L;
	private String khachhang;
	private String maNuoc;
	
	public LoaiNuocPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((khachhang == null) ? 0 : khachhang.hashCode());
		result = prime * result + ((maNuoc == null) ? 0 : maNuoc.hashCode());
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
		LoaiNuocPK other = (LoaiNuocPK) obj;
		if (khachhang == null) {
			if (other.khachhang != null)
				return false;
		} else if (!khachhang.equals(other.khachhang))
			return false;
		if (maNuoc == null) {
			if (other.maNuoc != null)
				return false;
		} else if (!maNuoc.equals(other.maNuoc))
			return false;
		return true;
	}

	
	
	
}

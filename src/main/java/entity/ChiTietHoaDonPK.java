package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonPK implements Serializable {
	private static final long serialVersionUID = 3303801155409643030L;
	private String hoadon;
	private String hanghoa;
	
	public ChiTietHoaDonPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hoadon == null) ? 0 : hoadon.hashCode());
		result = prime * result + ((hanghoa == null) ? 0 : hanghoa.hashCode());
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
		ChiTietHoaDonPK other = (ChiTietHoaDonPK) obj;
		if (hoadon == null) {
			if (other.hoadon != null)
				return false;
		} else if (!hoadon.equals(other.hoadon))
			return false;
		if (hanghoa == null) {
			if (other.hanghoa != null)
				return false;
		} else if (!hanghoa.equals(other.hanghoa))
			return false;
		return true;
	}
	
	

}

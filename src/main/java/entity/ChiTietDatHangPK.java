package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietDatHangPK implements Serializable{
	private static final long serialVersionUID = 3303801155409643030L;
	private String hoadondathang;
	private String hanghoa;
	
	public ChiTietDatHangPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hanghoa == null) ? 0 : hanghoa.hashCode());
		result = prime * result + ((hoadondathang == null) ? 0 : hoadondathang.hashCode());
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
		ChiTietDatHangPK other = (ChiTietDatHangPK) obj;
		if (hanghoa == null) {
			if (other.hanghoa != null)
				return false;
		} else if (!hanghoa.equals(other.hanghoa))
			return false;
		if (hoadondathang == null) {
			if (other.hoadondathang != null)
				return false;
		} else if (!hoadondathang.equals(other.hoadondathang))
			return false;
		return true;
	}

	
	
}

package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class HangHoaPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7246485906446023185L;
	private String nhacc;
	private String phieunhap;
	private String maHangHoa;
	
	public HangHoaPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHangHoa == null) ? 0 : maHangHoa.hashCode());
		result = prime * result + ((nhacc == null) ? 0 : nhacc.hashCode());
		result = prime * result + ((phieunhap == null) ? 0 : phieunhap.hashCode());
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
		HangHoaPK other = (HangHoaPK) obj;
		if (maHangHoa == null) {
			if (other.maHangHoa != null)
				return false;
		} else if (!maHangHoa.equals(other.maHangHoa))
			return false;
		if (nhacc == null) {
			if (other.nhacc != null)
				return false;
		} else if (!nhacc.equals(other.nhacc))
			return false;
		if (phieunhap == null) {
			if (other.phieunhap != null)
				return false;
		} else if (!phieunhap.equals(other.phieunhap))
			return false;
		return true;
	}

	
	
}

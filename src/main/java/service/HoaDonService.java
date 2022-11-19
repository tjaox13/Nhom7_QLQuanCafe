package service;

import java.util.List;

import entity.HoaDon;

public interface HoaDonService {
	public boolean themHoaDon(HoaDon HoaDon);
	public boolean capnhatHoaDon(HoaDon HoaDon);
	public boolean xoaHoaDon(String maHD);
	public HoaDon getHoaDon(String maHD);
	public List<HoaDon> getDSHoaDon();
}

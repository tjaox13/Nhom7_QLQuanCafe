package service;

import java.util.List;

import entity.KhachHang;

public interface KhachHangService {
	public boolean themKhachHang(KhachHang KhachHang);
	public boolean capnhatKhachHang(KhachHang KhachHang);
	public boolean xoaKhachHang(String maKH);
	public KhachHang getKhachHang(String maKH);
	public KhachHang getKhachHangTheoTenKH(String tenKH);
	public List<KhachHang> getDSKhachHang();
}

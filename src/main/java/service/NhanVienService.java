package service;

import java.util.List;

import entity.NhanVien;

public interface NhanVienService {
	public boolean themNhanVien(NhanVien NhanVien);
	public boolean capnhatNhanVien(NhanVien NhanVien);
	public boolean xoaNhanVien(String maNV);
	public NhanVien getNhanVien(String maNV);
	public NhanVien getNhanVienTheoTenNV(String tenNV);
	public List<NhanVien> getDSNhanVien();
}

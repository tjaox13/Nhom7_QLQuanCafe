package app;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.NhanVienDao;
import entity.HoaDon;
import entity.KhachHang;
import entity.NhanVien;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Nhom7_QLQuanCafe");
//		NhanVienDao nhanvienDao = new NhanVienDao(factory);
//		KhachHangDao khachhangDao = new KhachHangDao(factory);
//		HoaDonDao hoadonDao = new HoaDonDao(factory);
		
//		List<HoaDon> dsHoaDon = new TreeSet<String>();
//		dsHoaDon.add("0913556556");
//		dsHoaDon.add("0914556656");
		
//		NhanVien nhanvien = new NhanVien("NV123", "121/2 Quang Trung Gò Vấp",
//				LocalDate.of(2001, Calendar.APRIL, 10), "Trần Ngọc Mai", null, null, null, null);
//		NhanVien nhanvien2 = new NhanVien("NV124", "Trần Vinh Quang", LocalDate.of(2001, Calendar.APRIL, 10), "121/7 Hà Thị Khéo, Quận 12", null, null, null, null );
//		nhanvienDao.themNhanVien(nhanvien2);
		//TaiKhoan, HoaDon, Phieu Nhap, Don Dat
//		KhachHang khachhang = new KhachHang("KH123", "Phạm Tuấn Tú", 9, null, null);
//		khachhangDao.themKhachHang(khachhang);
//		LoaiNuoc loainuoc = new LoaiNuoc(new KhachHang("KH123", "Phạm Tuấn Tú", 9, null, null), "N001", "Nước Suối");
//		loainuocDao.themLoaiNuoc(loainuoc);
//		HoaDon hoadon = new HoaDon(new NhanVien("NV124", "Trần Vinh Quang", LocalDate.of(2001, Calendar.APRIL, 10), "121/7 Hà Thị Khéo, Quận 12", null, null, null ), new KhachHang("KH124", "Phạm Tuấn Tú", 9, null), "HD123", LocalDate.of(2022, Calendar.DECEMBER, 11));
//		hoadonDao.themHoaDon(hoadon);
	}

}

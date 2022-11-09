package app;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.NhanVienDao;
import entity.NhanVien;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Nhom7_QLQuanCafe");
		NhanVienDao nhanvienDao = new NhanVienDao(factory);
		
		NhanVien nhanvien = new NhanVien("NV123", "121/2 Quang Trung Gò Vấp",
				LocalDate.of(2001, Calendar.APRIL, 10), "Trần Ngọc Mai", null, null, null, null);
		
		nhanvienDao.themNhanVien(nhanvien);
	}

}

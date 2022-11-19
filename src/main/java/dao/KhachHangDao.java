package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.KhachHang;
import service.KhachHangService;


public class KhachHangDao extends AbstractDao implements KhachHangService{

	public KhachHangDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean themKhachHang(KhachHang KhachHang) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.persist(KhachHang);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

	@Override
	public boolean capnhatKhachHang(KhachHang KhachHang) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.merge(KhachHang);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	@Override
	public boolean xoaKhachHang(String maKH) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.remove(em.find(KhachHang.class, maKH));
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	@Override
	public KhachHang getKhachHang(String maKH) {
		return em.find(KhachHang.class, maKH);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<KhachHang> getDSKhachHang() {
		return em
				.createNativeQuery("select * from KhachHang", KhachHang.class)
				.getResultList();
	}

	@Override
	public KhachHang getKhachHangTheoTenKH(String tenKH) {
		KhachHang kh = null;
		String sql = "select * from [dbo].[KhachHang] where tenKH = '"+ tenKH +"'";
		try {
			kh = (KhachHang) em
				.createNativeQuery(sql, KhachHang.class)
				.getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return kh;
	}

}

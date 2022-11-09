package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.NhanVien;
import service.NhanVienService;


public class NhanVienDao extends AbstractDao implements NhanVienService{

	public NhanVienDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean themNhanVien(NhanVien NhanVien) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.persist(NhanVien);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

	@Override
	public boolean capnhatNhanVien(NhanVien NhanVien) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.merge(NhanVien);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	@Override
	public boolean xoaNhanVien(String maNV) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.remove(em.find(NhanVien.class, maNV));
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	@Override
	public NhanVien getNhanVien(String maNV) {
		return em.find(NhanVien.class, maNV);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NhanVien> getDSNhanVien() {
		return em
				.createNativeQuery("select * from NhanVien", NhanVien.class)
				.getResultList();
	}

	@Override
	public NhanVien getNhanVienTheoTenNV(String tenNV) {
		NhanVien nv = null;
		String sql = "select * from [dbo].[NhanVien] where tenNV = '"+ tenNV +"'";
		try {
			nv = (NhanVien) em
				.createNativeQuery(sql, NhanVien.class)
				.getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return nv;
	}

}

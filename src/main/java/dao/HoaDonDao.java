package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.HoaDon;
import service.HoaDonService;


public class HoaDonDao extends AbstractDao implements HoaDonService{

	public HoaDonDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public boolean themHoaDon(HoaDon HoaDon) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.persist(HoaDon);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

	@Override
	public boolean capnhatHoaDon(HoaDon HoaDon) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.merge(HoaDon);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	@Override
	public boolean xoaHoaDon(String maHD) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.remove(em.find(HoaDon.class, maHD));
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	@Override
	public HoaDon getHoaDon(String maHD) {
		return em.find(HoaDon.class, maHD);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HoaDon> getDSHoaDon() {
		return em
				.createNativeQuery("select * from HoaDon", HoaDon.class)
				.getResultList();
	}


}

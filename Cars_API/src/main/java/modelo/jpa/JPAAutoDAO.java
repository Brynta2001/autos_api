package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import modelo.dao.AutoDAO;
import modelo.entidades.Auto;
import modelo.entidades.AutoMarca;

public class JPAAutoDAO extends JPAGenericDAO<Auto, Integer> implements AutoDAO {

	public JPAAutoDAO() {
		super(Auto.class);
	}

	@Override
	public List<Auto> getByBrand(AutoMarca marca) {
		String JPQL = "SELECT a FROM Auto a " 
					+ "WHERE a.marca = :marca";
		Query query = em.createQuery(JPQL);
		query.setParameter("marca", marca);
		return query.getResultList();
	}
}

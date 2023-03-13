package modelo.jpa;

import java.util.List;

import modelo.dao.AutoDAO;
import modelo.entidades.Auto;

public class JPAAutoDAO extends JPAGenericDAO<Auto, Integer> implements AutoDAO {

	public JPAAutoDAO() {
		super(Auto.class);
	}
}

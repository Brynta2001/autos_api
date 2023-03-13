package modelo.jpa;

import modelo.dao.AutoDAO;
import modelo.dao.DAOFactory;

public class JPADAOFactory extends DAOFactory {

	@Override
	public AutoDAO getAutoDAO() {
		return new JPAAutoDAO();
	}

}

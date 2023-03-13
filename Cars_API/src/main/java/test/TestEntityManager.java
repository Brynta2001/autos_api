package test;

import modelo.dao.DAOFactory;
import modelo.entidades.Auto;
import modelo.entidades.AutoMarca;

public class TestEntityManager {

	public static void main(String[] args) {
		
		Auto autoChevrolet = new Auto();
		autoChevrolet.setMarca(AutoMarca.CHEVROLET.getNombreMarca());
		autoChevrolet.setModelo("Captiva");
		autoChevrolet.setAnio("2020");
		autoChevrolet.setPrecio(19999.99);
		
		DAOFactory.getFactory().getAutoDAO().create(autoChevrolet);

	}

}

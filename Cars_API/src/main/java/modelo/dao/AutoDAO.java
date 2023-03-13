package modelo.dao;

import java.util.List;

import modelo.entidades.Auto;
import modelo.entidades.AutoMarca;

public interface AutoDAO extends GenericDAO<Auto, Integer>{
	public List<Auto> getByBrand(String marca);
}

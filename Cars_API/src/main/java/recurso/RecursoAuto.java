package recurso;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import modelo.dao.DAOFactory;
import modelo.entidades.Auto;

@Path("/autos")
public class RecursoAuto {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Auto> getAutos() {
		return DAOFactory.getFactory().getAutoDAO().getAll();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	//http://localhost:8080/nombre_proyecto/personas/3
	public Auto getAutoaByParam(@PathParam("id")int id) {
		return DAOFactory.getFactory().getAutoDAO().getById(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/query")
	//http://localhost:8080/nombre_proyecto/personas/query?id=3
	public Auto getAutoByQueryParam(@QueryParam("id")int id) {
		return DAOFactory.getFactory().getAutoDAO().getById(id);
	}
}

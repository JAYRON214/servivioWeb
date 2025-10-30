/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.post;

import gt.edu.umg.Postulante;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jayron
 */
@Path("/postulantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostulanteResource {
    @Inject
    EntityManager em;

    @GET
    public List<Postulante> listar() {
        return em.createQuery("SELECT p FROM Postulante p", Postulante.class).getResultList();
    }

    @POST
    @Transactional
    public void agregar(Postulante postulante) {
        em.persist(postulante);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void actualizar(@PathParam("id") Long id, Postulante postulante) {
        Postulante existente = em.find(Postulante.class, id);
        if (existente != null) {
            existente.setNombre(postulante.getNombre());
            existente.setApellido(postulante.getApellido());
            existente.setTelefono(postulante.getTelefono());
            existente.setNacionalidad(postulante.getNacionalidad());
        }
    }
}

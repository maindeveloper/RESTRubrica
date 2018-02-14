package ifts.rubrica;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/rubrica")
@Produces(MediaType.APPLICATION_JSON)
public class Rubrica {

    //mettere variabileIniziale
    //mettere listaContatti

    private String nomeIniziale;
    private List<Contatto> rubrica;

    //fare costruttore con todos
    public Rubrica(){

    }

    public Rubrica(String nomeIniziale){
        this.nomeIniziale=nomeIniziale;
        this.rubrica= new ArrayList<Contatto>();
    }

    public int ricercaContatto(String numero){
        for(int i=0; i<rubrica.size(); i++){
            if(rubrica.get(i).getNumero().equals(numero)){
                return i;
            }
        }
        return -1;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postContatto(Contatto contatto){
        int id=ricercaContatto(contatto.getNumero());

        if(contatto.getNome()==null){
            contatto.setNome(nomeIniziale);
        }
        if(id == -1){
            rubrica.add(contatto);
        }

    }

    @GET
    @Path("/{numero}")
    public Contatto getContatto(@PathParam("numero")String numero){
       int id=ricercaContatto(numero);

       if(id != -1){
           return rubrica.get(id);
       }else{
           return null;
       }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{numero}")
    public void putContatto(@PathParam("numero")String numero){
        int id=ricercaContatto(numero);

        if(id != -1){
            rubrica.get(id).setNumero(numero);
        }
    }

    @DELETE
    @Path("/{numero}")
    public void deleteContatto(@PathParam("numero") String numero){
        int id=ricercaContatto(numero);

        if(id != -1){
            rubrica.remove(id);
        }
    }


}

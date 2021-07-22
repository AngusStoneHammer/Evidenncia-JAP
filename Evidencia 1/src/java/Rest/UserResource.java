/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import beans.Usuario;
import beans.IMC;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author nealg
 */
@Path("User")

public class UserResource {
    static final List<Usuario> lista = new ArrayList<>();
    
    @GET
    @Produces("aplication/json")
    public List<Usuario> listarUsuario(String a,String b ,String c,String d, String f) {  
       Usuario p = new Usuario(a,b,c,d,f);
       lista.add(p);
       return lista;
    }
       @POST
       @Produces("aplication/json")
       @Consumes("aplication/json")
       public List<Usuario> guardar (Usuario p){
        lista.add(p);
        return lista;
    }
       static final List<IMC> list = new ArrayList<>();
        @GET
    @Produces("aplication/json")
    public List<IMC> listarIMC(int a,int b) {  
       IMC o = new IMC();
       o.setPeso(a);
       o.setAltura(b);
       o.getIMC();
       o.Fecha();
       list.add(o);
       return list;
    }
       @POST
       @Produces("aplication/json")
       @Consumes("aplication/json")
       public List<IMC> guardarIMC (IMC o){
        list.add(o);
        return list;
    }
       
    }


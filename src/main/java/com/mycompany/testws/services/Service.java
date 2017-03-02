/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testws.services;

import com.mycompany.testws.model.person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kalsara
 */
@Path("Service")
public class Service {
    
    private static Map<Integer,person> persons=new HashMap<Integer,person>();
    
    static {
       for(int i=0;i<10;i++){
       person person=new person();
       int id=i+1;
       person.setId(id);
       person.setFullName("hi"+id);
       person.setAge(new Random().nextInt(40)+1);
       
       persons.put(id,person);
       
       }
    
    }
    
    @GET
    @Path("getpersonByIdXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public person getpersonByIdXML(@PathParam("id")int id){
       
        return persons.get(id);
    }
    
    @GET
    @Path("getpersonByIdJASON/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public person getpersonByIdJASON(@PathParam("id")int id){
       
        return persons.get(id);
    }
    
    
    @GET
    @Path("getAllpersonsInXML/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<person> getAllpersonsInXML(){
       
        return new ArrayList<person>(persons.values());
    }
    
    
}

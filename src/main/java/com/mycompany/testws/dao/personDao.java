/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testws.dao;

import com.mycompany.testws.model.person;
import com.mycompany.testws.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author kalsara
 */
public class personDao {
    
    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    
    public person getpersonById(int id){
    person person=null;
    Session session=null;
    try{
    session=sessionFactory.openSession();
    session.beginTransaction();
    person=(person) session.createQuery("from humans p where p.id=:ID").setParameter("ID", id).uniqueResult();
    session.getTransaction().commit();
    }catch(Exception ex){
    if(session !=null){
    session.getTransaction().rollback();
    }
    
    }
    finally{
    if(session !=null){
         session.close();
    }
    
    }
    return person;
    
    }
    
    public List<person> getAllpersons(){
    List<person> persons=null;
    Session session=null;
    try{
    session=sessionFactory.openSession();
    session.beginTransaction();
    persons=session.createQuery("from Humans p where p").list();
    session.getTransaction().commit();
    }catch(Exception ex){
    if(session !=null){
    session.getTransaction().rollback();
    }
    
    }
    finally{
    if(session !=null){
         session.close();
    }
    
    }
    return persons;
    
    }
    
}

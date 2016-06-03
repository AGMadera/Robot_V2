/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot_v2.DAO;

import com.alfonsogalvanmadera.robot_v2.Modelo.Cliente3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author MBI
 */
public class DAOCliente3 {
    public SessionFactory sessionFactory;
    public Session session;
    public Transaction transaction;

    public DAOCliente3() {
         sessionFactory=HibernateUtilidades.getSessionFactory();
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
    }
     public void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    public void guardarAccion(Cliente3 a)throws Exception{
        session.save(a);
        cerrarTodo();
    }
    
    
    
    
    
}

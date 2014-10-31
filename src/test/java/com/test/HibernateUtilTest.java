/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import com.test.domain.Event;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author cgx1844568
 */
public class HibernateUtilTest {
    
    public HibernateUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSessionFactory method, of class HibernateUtil.
     */
    @Test
    public void testGetSessionFactory() {
        Configuration config = new Configuration();
        config.configure();
        SessionFactory factory = config.buildSessionFactory();  
        Session session = factory.openSession();  
                Transaction tran = session.beginTransaction();  
        Event user = new Event();  
        user.setDate(new Date());
        user.setId(new Long(52));
        user.setTitle("999999");
        session.save(user);  
               //session.persist(user);  
        tran.commit();  
        session.close();
    }
    
}

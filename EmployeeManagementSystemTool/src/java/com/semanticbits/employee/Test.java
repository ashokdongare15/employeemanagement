package com.semanticbits.employee;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author dileep
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = (Employee) session.get(Employee.class, "k.dileep.1990@gmail.com");
        Set roles=employee.getRoleses();
        Iterator iterator=roles.iterator();
        while(iterator.hasNext())
            System.out.println(((Roles)iterator.next()).getRole());
        String hql = "Select E FROM Employee E,Userroles UR, Roles R where E.emailid=UR.id.emailid and UR.id.roleid=R.roleid and R.role='Regular User'";
        Query query = session.createQuery(hql);
        List results = query.list();
        Employee[] employees=new Employee[results.size()];
        for (int i = 0; i < results.size(); i++)
        {
            employees[i] = (Employee) results.get(i);
            System.out.println(employees[i].getEmailid());
            
        }
    }
}

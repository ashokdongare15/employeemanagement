/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semanticbits.employee.action;

import com.semanticbits.employee.Employee;
import javax.annotation.Resource;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dileep
 */
@Repository("actionDao")
public class ActionDao {

    @Resource
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean deleteEmployeeDetails(String emailId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            System.out.println(emailId + "hi");
            Employee employee = (Employee) session.get(Employee.class, emailId);
            session.delete(employee);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public String editEmployeeDetails(String firstname, String lastname, String emailid, String salary, String oldemail) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "UPDATE Employee E set E.firstname='" + firstname + "',E.lastname='" + lastname + "',E.emailid='" + emailid + "',E.salary =" + Double.parseDouble(salary) + ""
                    + " WHERE E.emailid = '" + oldemail + "'";
            System.out.println(hql);
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            tx.commit();
            return "true";
        } 
        catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println("hi");
            e.printStackTrace();
            System.out.println("hi"+e.getMessage());
            if(e.getMessage().contains("Duplicate entry"))
                return "email id already exists please try another one";
            return "unable to edit the employee";
        }
    }
}
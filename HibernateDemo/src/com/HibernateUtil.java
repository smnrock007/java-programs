package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction tran=session.beginTransaction();
			com.Student student=new com.Student();
			student.setStudentId(1005);
			student.setStudentName("Harish Kumar");
			student.setFees(30000);
			session.save(student);
			tran.commit();
			
			System.out.println("Student Record Saved");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
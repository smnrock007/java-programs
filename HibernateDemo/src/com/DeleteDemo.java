package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Student student=(Student)session.load(Student.class,1003);
			
			Transaction tran=session.beginTransaction();
			session.delete(student);
			tran.commit();
			
			session.close();
			System.out.println("Delete Demo is Working");
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}

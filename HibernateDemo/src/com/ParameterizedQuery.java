package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ParameterizedQuery {

	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Query query=session.createQuery("from Student where studentName=:sname");
			
			query.setParameter("sname","Harish Kumar");
			
			List<Student> listStudents=query.list();
			
			for(Student student:listStudents)
			{
				System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getFees());
			}
			session.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}

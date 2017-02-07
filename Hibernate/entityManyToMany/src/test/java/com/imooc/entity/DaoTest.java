package com.imooc.entity;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imooc.util.HibernateUtil;

public class DaoTest {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init () {
		// 创建配置对象
		Configuration config = new Configuration().configure();
		// 创建服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		// 创建会话工厂对象
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		// 会话对象
		session = sessionFactory.openSession();
		//session = sessionFactory.getCurrentSession();

		// 开启事务
		transaction = session.beginTransaction();
	}
	
	@After
	public void destory () {
		// 提交事务
		transaction.commit();
		// 关闭会话
		session.close();
		// 关闭会话工厂
		sessionFactory.close();
	}
	
	@Test
	public void addStudent () {
		Grade grade = new Grade("二班7", "hibernate7");
		Student stu1 = new Student("小明7", "0");
		Student stu2 = new Student("小红7", "1");
		
		grade.getStudents().add(stu1);
		grade.getStudents().add(stu2);
		
		session.save(grade);
		session.save(stu1);
		session.save(stu2);
	}
	
	@Test
	public void findStudentsByGrade () {
		Session session = HibernateUtil.getSession();
		Grade grade = (Grade) session.get(Grade.class, 2);
		System.out.println(grade.getGname() + ", " + grade.getGdesc());
			
		Set<Student> students = grade.getStudents();
		for(Student stu: students) {
			System.out.println(stu.getSname() + ", " + stu.getSex());
		}
		HibernateUtil.closeSession(session);
	}
	
	@Test
	public void update () {
		Grade grade = new Grade("三班", "Java开发");
		Student stu = (Student) session.get(Student.class, 1);
		grade.getStudents().add(stu);
		session.save(grade);
	}
	
	@Test
	public void deleteStu () {
		Student stu = (Student) session.get(Student.class, 4);
		session.delete(stu);
	}
	
	@Test
	public void addStu () {
		Grade grade = new Grade("五班8", "JS8");
		
		//Grade grade = (Grade) session.get(Grade.class, 5);
		
		System.out.println(grade.getGname());
		Student stu1 = new Student("小方", "1");
		Student stu2 = new Student("小五", "2");
		
		stu1.setGrade(grade);
		stu2.setGrade(grade);
		
		session.save(grade);
		session.save(stu1);
		//session.save(stu2);
		
	}
	
	@Test
	public void testProEmp () {
		Project project1 = new Project(1001, "项目1");
		Project project2 = new Project(1002, "项目2");
		
		Employee employee2 = new Employee(2, "小明");
		Employee employee1 = new Employee(1, "小方");

		project1.getEmployees().add(employee1);
		project1.getEmployees().add(employee2);

		project2.getEmployees().add(employee1);
		session.save(project1);
		session.save(project2);	
	}
}

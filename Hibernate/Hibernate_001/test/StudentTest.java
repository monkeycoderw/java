
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StudentTest {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init () {
		// 创建配置对象
		Configuration config = new Configuration().configure();
		System.out.println(config.getProperties());
		// 创建服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		// 创建会话工厂对象
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		// 会话对象
		session = sessionFactory.openSession();
		// 开启事务
		transaction = session.beginTransaction();
	}
	
	@Test
	public void testSaveStudents () {
		// 生成学生对象
		Students stu = new Students(5, "刘明5", "男", new Date(), "一中");
		System.out.println("id: " + stu.getSid());
		System.out.println("name: " + stu.getSname());
		System.out.println("gender: " + stu.getGender());
		System.out.println("birthday: " + stu.getBirthday());
		System.out.println("address: " + stu.getAddress());

		session.save(stu); // 保存对象
	}
	
	@Test
	public void testSaveStuWithAddress () {
		Junior stu = new Junior();
		stu.setSid(100);
		stu.setSname("林逸");
		stu.setGender("男");
		stu.setBirthday(new Date());
		Address address = new Address("10010", "1381111", "北京");
		stu.setAddress(address);
		session.save(stu);
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
}

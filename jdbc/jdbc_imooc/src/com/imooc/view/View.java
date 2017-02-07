package com.imooc.view;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class View {
	private static final String CONTEXT = "��ӭ����Ů�������\n" + "������Ů������Ĺ����б���\n"
			+ "[MAIN/M]:���˵� \n" + "[QUERY/Q]:�鿴Ů���ȫ����Ϣ \n"
			+ "[GET/G]:�鿴ĳλŮ�����ϸ��Ϣ \n" + "[ADD/A]:����Ů����Ϣ \n"
			+ "[UPDATE/U]:����Ů����Ϣ \n" + "[DELETE/D]:ɾ��Ů�� \n"
			+ "[SEARCH/S]:��ѯŮ����Ϣ�������������ֻ�������ѯ�� \n" + "[EXIT/E]:�˳�Ů����� \n"
			+ "[BREAK/B]:�˳���ǰ���ܣ��������˵�";

	private static final String OPERATION_MAIN = "MAIN";

	private static final String OPERATION_QUERY = "QUERY";

	private static final String OPERATION_GET = "GET";

	private static final String OPERATION_ADD = "ADD";

	private static final String OPERATION_UPDATE = "UPDATE";

	private static final String OPERATION_DELETE = "DELETE";

	private static final String OPERATION_SEARCH = "SEARCH";

	private static final String OPERATION_EXIT = "EXIT";

	private static final String OPERATION_BREAK = "BREAK";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CONTEXT);

		// ���ֳ���һֱ����
		Scanner scan = new Scanner(System.in);

		Goddess goddess = new Goddess();
		GoddessAction action = new GoddessAction();
		String prenious = null;
		Integer step = 0;
		while (scan.hasNext()) {
			String in = scan.next().toString();

			if (OPERATION_EXIT.equals(in.toUpperCase())
					|| OPERATION_EXIT.substring(0, 1).equals(in.toUpperCase())) {
				System.out.println("�˳�");
				break;
			} else if (OPERATION_QUERY.equals(in.toUpperCase())
					|| OPERATION_QUERY.substring(0, 1).equals(in.toUpperCase())) {
				try {
					List<Goddess> list = action.query();
					for(Goddess gd: list) {
						System.out.println(gd.getId() + "," + gd.getUser_name());
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (OPERATION_ADD.equals(in.toUpperCase())
					|| OPERATION_ADD.substring(0, 1).equals(in.toUpperCase())
					|| OPERATION_ADD.equals(prenious)) {
				prenious = OPERATION_ADD;
				if(1 == step) {
					goddess.setUser_name(in.toString());
					System.out.println("������Ů��ġ����䡿 ");
				} else if(2 == step) {
					goddess.setAge(Integer.valueOf(in.toString()));
					System.out.println("������Ů��ġ����ա�, ��ʽ��: yyyy-MM-dd");
				} else if(3 == step) {
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
					Date birthday = null;
					try {
						birthday = sf.parse(in.toString());
						goddess.setBirthday(birthday);
						System.out.println("������Ů��ġ����䡿");
					} catch (ParseException e) {
						e.printStackTrace();
						System.out.println("����ĸ�ʽ��������������");
						step--;
					}
				} else if(4 == step) {
					goddess.setEmail(in);
					System.out.println("������Ů��ġ��ֻ��š�");
				} else if(5 == step) {
					goddess.setMobile(in);
					goddess.setSex(0);
					goddess.setCreate_user("admin");
					goddess.setCreate_date(new Date());
					goddess.setUpdate_user("");
					goddess.setIsdel(0);
					try {
						action.add(goddess);
						System.out.println("�����ɹ�");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("����Ů��ʧ��");
					}
				} 
				if(OPERATION_ADD.equals(prenious))	step++;		
				//System.out.println(step);
				if(1 == step) System.out.println("������Ů��ġ������� ");
			} else {
				System.out.println("�������ֵΪ: " + in);
			}

		}
	}

}
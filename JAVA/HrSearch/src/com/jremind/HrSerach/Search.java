package com.jremind.HrSerach;

import java.util.Scanner;

public class Search {
	private HrSearchInterface hrSearch;
	private Scanner sc;
	
	public void run() {
		sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴� ����!");
			System.out.println("====================");
			System.out.println("a. ������� �˻�(�̸�)");
			System.out.println("b. ������� �˻�(�Ի��)");
			System.out.println("c. ���� �����̷� �˻�(��� ID)");
			System.out.println("q. ����");
			String num = sc.next();
			
			if(num.equals("q")) {
				System.out.println("���α׷� ����!!");
				break;
			}else if(num.equals("a")) {
				System.out.print("����� Frist Name �Ǵ� Last name�� �Է��ϼ���: ");
				String name = sc.next();
				hrSearch = new EmployeeName(name); 
			}else if(num.equals("b")) {
				System.out.print("�Ի�⵵�� �Է��ϼ���: ");
				int year = sc.nextInt();
				hrSearch = new EmployeeYear(year);			
			}else if(num.equals("c")) {
				System.out.print("�����ȣ�� �Է��ϼ���: ");
				int id = sc.nextInt();
				hrSearch = new EmployeeHistory(id);
			}else {
				System.out.println("�Է��� �� �� �Ǿ����ϴ�. [a, b, c, q] �߿��� �������ּ���.");
			}
			hrSearch.searchHr();
		}
		sc.close();
	}	
}
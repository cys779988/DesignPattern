package study.prototype;

import java.util.List;

// 프로토타입 패턴은 객체를 생성하는데 비용(시간과 자원)이 많이 들고, 비슷한 객체가 이미 있는 경우에 사용되는 생성 패턴 중 하나
// Original 객체를 새로운 객체에 복사하여 우리의 필요에 따라 수정하는 매커니즘을 제공

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Employees emps = new Employees();
		emps.loadData();
		
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List : " + emps.getEmpList());
		System.out.println("empsNew List : " + list);
		System.out.println("empsNew1 List : " + list1);
	}
}

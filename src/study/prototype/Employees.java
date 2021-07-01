package study.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	
	private List<String> empList;
	
	public Employees() {
		// TODO Auto-generated constructor stub
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		// TODO Auto-generated constructor stub
		this.empList = list;
	}
	
	public void loadData() {
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList(){
		return empList;
	}

	// clone() 메소드를 재정의하기 위해 Cloneable 인터페이스를 구현
	// 여기서 사용되는 clone()은 empList에 대해 깊은복사(deep copy) 실시
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> temp = new ArrayList<String>();
		for (String s : this.empList) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}

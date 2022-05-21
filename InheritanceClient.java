package oops.inheritance;

public class InheritanceClient {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("harsha");
		emp.setGender('M');
		//emp.setBonus(9999);
		
		RegularEmployee reg = new RegularEmployee();
		reg.setId(20);
		reg.setName("harika");
		reg.setGender('F');
		reg.setSalary(9000);
		reg.setBonus(900);
		
		
		ContractEmployee contEmp = new ContractEmployee();
		contEmp.setId(22);
		contEmp.setName("vishnu");
		contEmp.setGender('M');
		contEmp.setHourlyPrice(500);
		contEmp.setDuration(30);
		
		
		System.out.println("Employee info is  : ");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getGender());
		
		System.out.println();
		
		System.out.println("Regular Employee Info is : ");
		System.out.println(reg.getId());
		System.out.println(reg.getName());
		System.out.println(reg.getGender());
		System.out.println(reg.getSalary());
		System.out.println(reg.getBonus());
		
		System.out.println("contract employee info is : ");
		System.out.println(contEmp.getId());
		System.out.println(contEmp.getName());
		System.out.println(contEmp.getGender());
		System.out.println(contEmp.getHourlyPrice());
		System.out.println(contEmp.getDuration());
		
		
		
	}

}

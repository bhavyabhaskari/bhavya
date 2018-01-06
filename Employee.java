
public class Employee {
	int id;
	double sal;
	String name;
	
	Employee(int id,String name,double sal){
		System.out.println("object created");
		this.id=id;
		this.name=name;
		this.sal=sal;
		
		}
	
	public static void main(String[] args) {
		System.out.println("**JVM Enter***");
		int id[]={1001,1002};
		String name[]={"bhavya","chandana"};
		double sal[]={30000,40000};
		
		for (int i=0;i<2;i++){
			Employee emp=new Employee(id[i],name[i],sal[i]);
			
			System.out.println("Employee  info");
			System.out.println("EID:"+emp.id+"\nENAME:"+emp.name+"\nESAL:"+emp.sal);
		}
			
		
		/*
		Employee emp1=new Employee(1001,"bhavya",30000);
		Employee emp2=new Employee(1002,"chandana",40000);
		
		System.out.println("Employee 1 info");
		System.out.println("==========");
		System.out.println("Eid:"+emp1.id);
		System.out.println("Ename:"+emp1.name);
		System.out.println("salary:"+emp1.salary);
		System.out.println("***JVM Exit***");
		
		System.out.println("Employee 2 info");
		System.out.println("==========");
		System.out.println("Eid:"+emp2.id);
		System.out.println("Ename:"+emp2.name);
		System.out.println("salary:"+emp2.salary);*/
		System.out.println("***JVM Exit***");
		
		
	} 
}

	



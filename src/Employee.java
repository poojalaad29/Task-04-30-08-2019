import java.util.HashMap;

public class Employee
{
    int eno,salary;String ename,Designation;
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Chetan",50000,"Software Developer");
		Employee e2=new Employee(2,"Deepak",60000,"Software Developer");
		Employee e3=new Employee(3,"Chandan",25000,"Software Developer");
		Employee e4=new Employee(4,"Shivam",15000,"HR");
		Employee e5=new Employee(5,"Sachin",45000,"Tester");
		HashMap<Employee,Project> hm=new HashMap<>();
		hm.put(e1, Project.p1);
		hm.put(e2, Project.p2);
		hm.put(e3, Project.p3);
		hm.put(e4, Project.p4);
		hm.put(e5, Project.p3);
		
	System.out.println(hm);
		
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + ", ename=" + ename + ", Designation=" + Designation
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Designation == null) ? 0 : Designation.hashCode());
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Designation == null) {
			if (other.Designation != null)
				return false;
		} else if (!Designation.equals(other.Designation))
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	public Employee(int eno,String ename,int salary, String designation) {
		super();
		this.eno = eno;
		this.salary = salary;
		this.ename = ename;
		Designation = designation;
	}

}

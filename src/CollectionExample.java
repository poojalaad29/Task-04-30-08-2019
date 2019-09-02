import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class CollectionExample implements Comparable <CollectionExample>{
	static Scanner sc=new Scanner(System.in);
	int eno;String ename;int salary;String desig;String dept;
	static ArrayList<CollectionExample>arr=new ArrayList<>();
	
	public CollectionExample(int eno,String ename,int salary,String dept,String desig){
		 this.eno=eno;
		 this.ename=ename;
		 this.salary=salary;
		 this.desig=desig;
		 this.dept=dept;
	}
	public CollectionExample() {}
	
	public static void main(String []ar)
	{
		CollectionExample collectionexample=new CollectionExample();
		System.out.println("Select opeation from menu");
		HashMap<Integer,String> hm=new HashMap<>();
		while(true) {
		hm.put(1,"Insert Employee");
		hm.put(2,"View All Employee");
		hm.put(3,"Delete Employee");
		hm.put(4,"Clear Data");
		hm.put(5,"Search Employee");
		hm.put(6, "Change Salary");
		hm.put(7, "Show Employee dept wise");
		hm.put(8,"View Employees in sorted form");
		hm.put(9,"Exit");
		System.out.println(hm);
		int Choice=sc.nextInt();
		switch(Choice)
		{
			case 1:collectionexample.InsertEmp();
			       break;
			case 2:collectionexample.ViewAll();
			        break;
			case 3:collectionexample.Delete();
			       break;
			case 4:collectionexample.ClearData();
			       break;
			case 5:collectionexample.Search();
			       break;
			case 6: collectionexample.ChangeSalary();
			        break;
			case 7: collectionexample.DeptwiseEmp();
			        break;
			case 8: collectionexample.viewSortedEmployee();
			         break;
			case 9: System.exit(1);
			       
	    }
		}
	}
	
	private void viewSortedEmployee() {
		System.out.println("Enter the criteria on which you to sort  1.Employee number  2. Salary");
		int sort=sc.nextInt();
		System.out.println("SORTING NOW : ");
		if(sort==1)
		Collections.sort(arr,new Comparator<CollectionExample>() 
			{@Override
			public int compare(CollectionExample e1, CollectionExample e2) {
				if(e1.eno==e2.eno)  
					return 0;  
					else if(e1.eno>e2.eno)  
					return 1;  
					else  
					return -1;
			
		}
		 });
		else if(sort==2)
			Collections.sort(arr,new Comparator<CollectionExample>() 
			{@Override
			public int compare(CollectionExample e1, CollectionExample e2) {
				if(e1.eno==e2.eno)  
					return 0;  
					else if(e1.eno>e2.eno)  
					return 1;  
					else  
					return -1;
		}
		    
		});	
		for(int i=0;i<arr.size();i++)
  	  {
     	System.out.println();
        System.out.println("Employee no is "+arr.get(i).eno);
  	    System.out.println("Employee name is "+arr.get(i).ename);
  	    System.out.println("Employee department is "+arr.get(i).dept);
  	  System.out.println("Employee salary is "+arr.get(i).salary);
  	  System.out.println("Employee designation is "+arr.get(i).desig);
  	  }
   	  }
		
	public void InsertEmp() {
		System.out.println("Enter Eno.");
		eno=sc.nextInt();
		System.out.println("Enter Ename");
		ename=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextInt();
		System.out.println("Enter dept");
		dept=sc.next();
		System.out.println("Enter designation");
		desig=sc.next();
		
		CollectionExample obj=new CollectionExample(eno, ename,salary, dept, desig);
		arr.add(obj);
				
	}
      public void ViewAll() {
         if(arr.isEmpty())
    	  System.out.println("No Employee found");
         Collections.sort(arr,new Comparator<CollectionExample>() {
 			@Override
 			public int compare(CollectionExample e1, CollectionExample e2) {
 				if(e1.eno==e2.eno)  
 					return 0;  
 					else if(e1.eno>e2.eno)  
 					return 1;  
 					else  
 					return -1;
 		}
 		    
 		});
 		for(int i=0;i<arr.size();i++)
   	  {
      	System.out.println();
         System.out.println("Employee no is "+arr.get(i).eno);
   	  System.out.println("Employee name is "+arr.get(i).ename);
   	  System.out.println("Employee department is "+arr.get(i).dept);
   	  System.out.println("Employee salary is "+arr.get(i).salary);
   	  System.out.println("Employee designation is "+arr.get(i).desig);
   	  }
   }
 		
     public void ClearData() {
    	 arr.clear();
  		
  	}
     public void Delete() {
    	 System.out.println("Enter Eno of employee whom you want to delete");
    	 int del=sc.nextInt();
    	 for(int i=0;i<arr.size();i++)
    	 { 
    		 if(arr.get(i).eno==del)
    	     arr.remove(arr.get(i));
    		 System.out.println("Employee Deleted");
    	 }
      }
     public void Search() {
    	 System.out.println("Enter Eno of employee whom you want to search");
    	 int srch=sc.nextInt();
    	 for(int i=0;i<arr.size();i++)
    	 { 
    		 if(arr.get(i).eno==srch)
    	 {System.out.println("Employee no is "+arr.get(i).eno);
       	  System.out.println("Employee name is "+arr.get(i).ename);
       	  System.out.println("Employee department is "+arr.get(i).dept);
       	  System.out.println("Employee salary is "+arr.get(i).salary);
       	  System.out.println("Employee designation is "+arr.get(i).desig);
    	     
    	 }
    	 }
	
    }
     public void ChangeSalary() {
    	 System.out.println("Enter Eno of employee whom you want to change salary");
    	 int chgsal=sc.nextInt();
    	 for(int i=0;i<arr.size();i++)
    	 { 
    		 if(arr.get(i).eno==chgsal)
    		 {
    			 System.out.println("Insert the new salary you want");
    			 int newsal=sc.nextInt();
    			 arr.get(i).salary=newsal;
    			 System.out.println("salary Changed");
    		 }
    	 }
     }
     public void DeptwiseEmp() {
    	 System.out.println("Enter departmant you want to list out");
    	 String department=sc.next();	
    	 for(int i=0;i<arr.size();i++)
    	 {
    		 if(arr.get(i).dept.equals(department))
    		 {
    		  System.out.println("Employee no is "+arr.get(i).eno);
          	  System.out.println("Employee name is "+arr.get(i).ename);
          	  System.out.println("Employee department is "+arr.get(i).dept);
          	  System.out.println("Employee salary is "+arr.get(i).salary);
          	  System.out.println("Employee designation is "+arr.get(i).desig);
       	     
       	 }
    	 }
 }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((desig == null) ? 0 : desig.hashCode());
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
		CollectionExample other = (CollectionExample) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (desig == null) {
			if (other.desig != null)
				return false;
		} else if (!desig.equals(other.desig))
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

	@Override
	public int compareTo(CollectionExample e1) {
		if(eno>e1.eno){
			return 1;
			}else if(eno<e1.eno){
			return -1;
			}else{
			int n=ename.compareTo(e1.ename);
			return n;
			}

	}
	
	

}

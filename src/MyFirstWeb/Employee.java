package MyFirstWeb;


public class Employee {

	 String name;
	 int age;
	int salary;
	  public Employee() {
			// TODO Auto-generated constructor stub
		}

	
     public Employee(String name, int age, int salary){
    	 
    	 super();
    	 
    	 this.name=name;
    	 this.age=age;
    	 this.salary=salary;
    	 
     }
     
     
   
    




	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


//
//	public String getName(){
//    	  
//    	  return name;
//    	  
//      }
//	
//	  public void setName(String name){
//    	  
//    	  this.name=name;
//    	  
//      }
//	
//      public int getAge(){
//    	  
//    	  return age;
//    	  
//      }
//	
//	  public void setAge(int age){
//    	  
//    	  this.age=age;
//    	  
//      }
//	  
//     public int getSalary(){
//    	  
//    	  return salary;
//    	  
//      }
//	
//	  public void setSalary(int salary){
//    	  
//    	  this.salary=salary;
//    	  
//      }
}

package assignment2;

public class employeetest {

	public static void main(String[] args) {
		
		employee emp1 = new employee();
		
        employee emp2 = new employee();
        
        System.out.printf(
        emp1.getFirstname(),emp1.getLastname(),emp1.getSalary()*12);
        		
        
        System.out.printf(
        		emp2.getFirstname(),emp2.getLastname(),emp2.getSalary()*12);

        
       emp1.setSalary(emp1.getSalary()*0.1);
       emp2.setSalary(emp2.getSalary()*0.1);
       
       
       
       
       System.out.printf(
    	        emp1.getFirstname(),emp1.getLastname(),emp1.getSalary()*12);
    	        		
    	        
    	        System.out.printf(
    	        		emp2.getFirstname(),emp2.getLastname(),emp2.getSalary()*12);
       
        
	}

}

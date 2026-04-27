package assignment5;

public class Q22 {
	
	public static boolean ispalendrom (String s,int i,int j) {
		if (i>j) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
			
		}
		return  ispalendrom(s,i+1,j-1);
		
		
	 
		  
	  }
	 public static  void main(String args[]) {		
		 
		 String a ="swapnil";
		 a=a.toLowerCase();
		 
		 System.out.println(ispalendrom(a, 0, a.length()-1));
	 }
	

}

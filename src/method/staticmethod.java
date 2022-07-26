package method;

public class staticmethod {
	//method declare
		public static void display()
		{
			System.out.println("Welcome");
		}
		public static void given()
		{
			System.out.println("Welcome to velocity");
		}
		public static void display2()
		{
			System.out.println("show the output");
		}
		public static void show()
		{
			System.out.println(" Static method is executing");
		
		}
		public static void main(String[] args) 
		{		
			display();//method call from same class
		    given();
		    display2();
			show();
			staticmethodex2.message(); //method call from different class
			
		}


}

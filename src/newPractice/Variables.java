package newPractice;

 public class Variables {
	
	//local variable
	
	public void localvar()
	{
		int a = 10;//can't make local var static and can't use it outside method. Scope is limited to method, only var
		//can be made as final
		// we have to initialize local variable like int a =10
		// 
		a =20; // we can assign diff values to same variable, latest one will be picked.
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		Variables v = new Variables();
		v.localvar();
	}
}
 
 class Instvar
 {
	 // instance variab
	 int a; //instance var need not to initialize , by default value will b 0
	 int b;
	 int c;
	 
	public static void main(String[] args)
	{
		
		//we can create multiple objects and use same variables in multiple objects , it will create multiple
		//instances for variables for different objects.
		//we can also use access specifiers with instance var but not with local 
		Instvar v = new Instvar();
		v.a = 10;
		v.b= 20;
		v.c=100;
		//v.c = 40; //if we declaring same variables twice with two values then latest one will be printed
		
		Instvar c = new Instvar();
		c.a = 100;
		c.b = 90;
		c.c = 80;
		
		System.out.println(v.a);
		System.out.println(c.a);
	}
 }
 
 class statvar
 {
	 //static variable, static var can be called with classname directly. there is no need to create an object for calling
	 // its same as that of instance variable but only static word is used with it.
	 // its default value is 0, no need to initialize
	 //only one copy of variable is created which means even if we creating multiple objects and assign diff values
	 // it will give error.
	 
	 static int a;
	 static String s = "harish";
	 
	 public static void main(String[] args)
	 {
		 statvar s = new statvar();
		 s.a = 10; //this value will not be used because its a static var, only one copy will be created so always
		 //latest one will be picked which is 20
		 
		 statvar d = new statvar();
		 d.a = 20;
		 
		 System.out.println(s.a);
		 System.out.println(d.a);
	 }
 }


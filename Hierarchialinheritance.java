package javalab;


	 class A
	 {
		 void methodA()
		 {
			 System.out.println("Hello");
			 
		 } 
	 }
    class B extends A
    {
    	void methodB()
    	{
    		System.out.println("world");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    		
    	}
    }
    class C extends A
    {
    	void methodC()
    	{
    		System.out.println("Smile");
    	}
    }
    public class Hierarchialinheritance
    {
    	public static void main(String[]args)
    	{
        
    	B obj1 = new B();
    	C obj2 = new C();
    	
    	obj1.methodA();
    	obj2.methodA();
    	}
    }
package inheritence;

 public class Multi {
	 
	 void grand() {
		 System.out.println("grand  class show method");
	 }
 }
 class Par extends Multi 
 {
	 void parent()
	 {
		 System.out.println("Parent classs show method");
		 
	 }
 }
 class Chi extends Par
 {
	 void child()
	 {
		 System.out.println("child class show method");
		 
	 }
 
public static void main(String a[])
{
	Chi c=new Chi();
	c.grand();
	c.parent();
	c.child();
}
}
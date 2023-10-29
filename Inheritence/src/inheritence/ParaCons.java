package inheritence;

class ParaCons {
  ParaCons(int no){
	  System.out.println("Grand cons"+no);
	  
  }
}
class Parents extends ParaCons
{
	Parents (int no)
	{
		super(20);
		System.out.println("parent cons"+no);
		
	}
}
class Sub extends Parents
{
	Sub(int no)
	{
		super( no);
		System.out.println("child cons"+no);
		
	}
	public static void main(String args[]) {
		Sub s=new Sub(10);
		
	}
}
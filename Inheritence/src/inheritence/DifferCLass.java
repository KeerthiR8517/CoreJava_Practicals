package inheritence;

class DifferClass {
	static void showGrand() {
		System.out.println("Grand");
	}
}
class Parent extends DifferClass
{
	static void showParent()
	{
		System.out.println("Parent");
		
	}
}
class Child extends Parent
{
	static void showChild()
	{
		System.out.println("Child");
	}

}
class User
{
	public static void main(String a[]) {
		Child.showGrand();
		Child.showParent();
		Child.showChild();
	}
}

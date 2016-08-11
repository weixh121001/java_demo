class person
{
	String name;
	int age;
	public void tell(){
		System.out.println("ĞÕÃû:"+name+", ÄêÁä£º"+age);
	}
}


public class demo8
{
	public static void main(String args[]){
		person per1 = new person();
		person per2 = new person();
		per1.name="ÎºÏş»Ô";
		per1.age=30;

		per2.name="Òüº½";
		per2.age=31;

		System.out.println("----------------------------");
		per1.tell();

		System.out.println("----------------------------");
		per2.tell();


	}
}
class person
{
	String name;
	int age;
	public void tell(){
		System.out.println("����:"+name+", ���䣺"+age);
	}
}


public class demo8
{
	public static void main(String args[]){
		person per1 = new person();
		person per2 = new person();
		per1.name="κ����";
		per1.age=30;

		per2.name="����";
		per2.age=31;

		System.out.println("----------------------------");
		per1.tell();

		System.out.println("----------------------------");
		per2.tell();


	}
}
class person
{
	private String name;
	private int age;
	public void tell(){
		System.out.println("������"+name+", ���䣺"+age);
	}

	public String getName(){         //ȡ������
		return name;
	}
	public void setName(String n){           //��������
		name=n;
	}

	public int getAge(){             //ȡ������
		return age;
	}
	public void setAge(int a){              //��������
		if(a>=0&&a<150){
		age=a;
		}
	}

}

public class demo9
{
	public static void main(String args[]){
		person per = new person();
		per.setName("����");
		per.setAge(-30);
		per.tell();

	}
}
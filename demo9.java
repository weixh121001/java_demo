class person
{
	private String name;
	private int age;
	public void tell(){
		System.out.println("姓名："+name+", 年龄："+age);
	}

	public String getName(){         //取得姓名
		return name;
	}
	public void setName(String n){           //设置姓名
		name=n;
	}

	public int getAge(){             //取得年龄
		return age;
	}
	public void setAge(int a){              //设置年龄
		if(a>=0&&a<150){
		age=a;
		}
	}

}

public class demo9
{
	public static void main(String args[]){
		person per = new person();
		per.setName("张三");
		per.setAge(-30);
		per.tell();

	}
}
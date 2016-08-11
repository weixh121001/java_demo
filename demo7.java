public class demo7 { 
    /*public static void main(String[] agrs){ 
     long n=1;long s=0; 
     for(int i=1;i<=30;i++){ 
     n=1;  //问题出在这里!你的n在计算下一个阶乘前没有清1 
      for(int j=1;j<=i;j++) 
       n=n*j; 
    s=s+n;} 
  System.out.print(s); 
}*/

public static void main(String args[]){
	person per=new person();
		per.name="魏晓辉";
	    per.age=22;
		per.tell();
}

}




class person
{
	String name;
	int age;
	public void tell(){
		System.out.println("姓名："+name+"，年龄："+age);
	}

}
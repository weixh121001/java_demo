public class demo7 { 
    /*public static void main(String[] agrs){ 
     long n=1;long s=0; 
     for(int i=1;i<=30;i++){ 
     n=1;  //�����������!���n�ڼ�����һ���׳�ǰû����1 
      for(int j=1;j<=i;j++) 
       n=n*j; 
    s=s+n;} 
  System.out.print(s); 
}*/

public static void main(String args[]){
	person per=new person();
		per.name="κ����";
	    per.age=22;
		per.tell();
}

}




class person
{
	String name;
	int age;
	public void tell(){
		System.out.println("������"+name+"�����䣺"+age);
	}

}
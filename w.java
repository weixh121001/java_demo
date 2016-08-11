import java.util.Scanner;

	public class wei{
		public static void main(String[] args){
			int sum =0;
			int day=0;
			boolean mark=false;
			boolean mark1=false;
			Scanner in=new Scanner (System.in);
			System.out.println("请输入年份：");
			int year=in.nextInt();
			System.out.println("请输入月份：");
			int mouth=in.nextInt();
			for(int i=1900;i<year;i++){
				if(i%4==0&&i%100!=0||i%400==0){
					sum=sum+366;
				}else{
					sum=sum+365;
					mark=true;
				}
			}
			for(int i=1;i<mouth;i++){
				if(i==2){
					if( year%4==0&&year%100!=0||year%400==0){
						sum+=29;
					}else{
						sum+=28;
					} 
				}else {
					if(i==4||i==6||i==9||i==11 ){
						sum+=30;
					}else{
						sum+=31;
					}   
				}
			}
			sum+=1;
			int wekday=sum%7;
			 if(mark==true){
				 if(mouth==2){
					 day=28;
				 }else if(mouth==4||mouth==6||mouth==9||mouth==11){
					 day=30;
					 
				 }else{
					 day=31;
				 }
			 }else {
				 if(mouth==2){
					 day=29;
				 }else if(mouth==4||mouth==6||mouth==9||mouth==11){
					 day=30;
				 }else{
					 day=31;
				 }
			 } 
		    
			System.out.println(year+"年"+mouth+"月");
			System.out.println("***************************");
			System.out.println("日\t一\t二\t三\t四\t五\t六"); 
			for(int i=0;i<wekday;i++){
				System.out.print("\t");
			}
			for(int i=1;i<=day;i++){
				if(sum%7==6){
					System.out.print(i+"\n");
				}else{
					System.out.print(i+"\t");
				}
				sum++;

			}
		}
	}
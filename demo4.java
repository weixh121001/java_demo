public class demo4
{
	public static void main(String args[]){
		int scr[]={67,78,98,63,99};
		int max = 0;
		int min = 0;
		max=min=scr[0];

		for(int x=0;x<scr.length;x++){
			if(scr[x]>max){
			max=scr[x];
			}
			if(scr[x]<min){
			min=scr[x];
			}
		}
		System.out.println("最高成绩："+max);
		System.out.println("最低成绩："+min);
		
	}
}
public class demo5
{
	public static void main(String args[])
		{
		int scr[]={12,14,16,5,8,10,18};
		for(int x=1;x<scr.length;x++)
			{
			for(int y=0;y<scr.length;y++)
				{
				if(scr[x]<scr[y]){

					int z=scr[y];
					scr[y]=scr[x];
					scr[x]=z;
				}
			}
			
		}
		for(int x=0;x<scr.length;x++)
			System.out.println(scr[x]+"\t");
		
	}
}
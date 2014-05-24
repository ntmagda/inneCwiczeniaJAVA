package continueibreak;

public class proba 
{
	public static void main(String[] args)
	{
		etykieta1:
		for(;true;)
		{
			etykieta2:
			for (int i =0; i <10; i++)
			{
				System.out.println("i = " +i);
				if(i==2)
				{
					System.out.println("continue");
					continue;
				}
				
				if (i==3)
				{
					System.out.println("break");
					i++;
					break;
				}
				if(i==7)
				{
					System.out.println("continue etykieta1");
					i++;
					continue etykieta1;
				}
				if ( i ==8)
				{
					System.out.println("break z etykieta1");
					break etykieta1;
				}
				for ( int k=0; k<3; k++)
				{
					if(k==3)
					{
						System.out.println("continue etykieta2");
						continue;
					}
				}
		
			}
	
		}	
	}
}

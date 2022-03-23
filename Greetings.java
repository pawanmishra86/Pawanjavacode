
public class Greetings 
    {

	public static void main(String[] args) 
	{
	
		findintrest(10,20,30);
		learning();
		timeofendtraining();
		String time = timeofendtraining();
		System.out.println(time +"");
		areaofcircle(5);
        
	}
	
	static void learning ()
      {

     System.out.println("hi i am trying to learn ....." );


	  }
	static int findintrest(int p, int r,int t)
    {
      int SI = (p*r*t) /100;
      System.out.println(SI );
      return SI;
     
    }
	
	static String timeofendtraining()
	{
		return ("7 pm");
	}
	
	static void areaofcircle(int r)
	{
		
		float area= r*r*3.14f;
	System.out.println(area + "" );
		
	}
      
}

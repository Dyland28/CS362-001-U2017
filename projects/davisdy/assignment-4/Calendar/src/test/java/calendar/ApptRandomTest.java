package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"isValid","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
	
   /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					
					int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
					int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 61);
					int startDay=ValuesGenerator.getRandomIntBetween(random, 0, 32);
					int startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 14);
					int startYear=ValuesGenerator.getRandomIntBetween(random, 1900, 2100);
					String title="Birthday Party";
					String description="This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt = new Appt(startHour,
										 startMinute ,
										 startDay ,
										 startMonth ,
										 startYear ,
										 title,
										 description);

					   if (methodName.equals("isValid")){
						   boolean vld = appt.getValid();
						   if (startHour < 0 || startHour > 24){
							   assertFalse(vld);
						   }
						   else if (startMinute < 0 || startMinute > 60){
							   assertFalse(vld);
						   }
						   else if (startDay < 1 || startDay > 31){
							   assertFalse(vld);
						   }
						   else if (startMonth < 1 || startMonth > 13){
							   assertFalse(vld);
						   }
						   else{
							   assertTrue(vld);
						   }
						}
					   else if (methodName.equals("setDescription")){
						   String newDescription=(String) ValuesGenerator.getString(random);
						   appt.setDescription(newDescription);

						   String testString = appt.getDescription();
						   if (newDescription == null){
						      assertEquals(testString, "");
						   }
						   else{
						      assertEquals(newDescription, testString);
						   }
					  }				
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 ){
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
				 }
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }


	
}

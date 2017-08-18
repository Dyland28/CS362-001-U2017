package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	


    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");

		 try{
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis(); //10
				 //System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);
				 GregorianCalendar g1 = new GregorianCalendar(2018, 6, 20);
				 CalDay c1 = new CalDay(g1);
				 int size1 = 0;

				 for (int i = 0; i < NUM_TESTS; i++) {

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

					 c1.addAppt(appt);
					 if(appt.getValid()){					 
						 size1 = size1 + 1;
					 }
					 assertEquals(size1, c1.getSizeAppts());
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

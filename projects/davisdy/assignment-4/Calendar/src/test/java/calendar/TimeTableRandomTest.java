package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

    public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"deleteAppt","getApptRange"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}

	

    /**
     * Generate Random Tests that tests TimeTable Class.
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
				 TimeTable t1 = new TimeTable();

				 for (int i = 0; i < NUM_TESTS; i++) {
					 String methodName = TimeTableRandomTest.RandomSelectMethod(random);
					 LinkedList<Appt> appts = new LinkedList<Appt>();

					 for (in j = 0; j < 10; j++){
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
						 appts.add(appt);
					 }
					 if (methodName.equals("deleteAppt")){
						 int index1 = ValuesGenerator.getRandomIntBetween(random, 0, 9);
						 t1.deleteAppt(appts, appts.get(index1));

						 assertEquals(appts.size(), 9);
					 }
					 else if (methodName.equals("getApptRange")){
						 do{
							 int stDay=ValuesGenerator.getRandomIntBetween(random, 0, 32);
							 int stMonth=ValuesGenerator.getRandomIntBetween(random, 0, 14);
							 int stYear=ValuesGenerator.getRandomIntBetween(random, 1900, 2100);

							 GregorianCalendar g1 = new GregorianCalendar(stYear, stMonth, stDay);

							 int enDay=ValuesGenerator.getRandomIntBetween(random, 0, 32);
							 int enMonth=ValuesGenerator.getRandomIntBetween(random, 0, 14);
							 int enYear=ValuesGenerator.getRandomIntBetween(random, 1900, 2100);

							 GregorianCalendar g2 = new GregorianCalendar(enYear, enMonth, enDay);
						 }while(g2.before(g1));
						 appts = t1.getApptRange(appts, g1, g2);

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

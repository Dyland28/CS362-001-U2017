package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=25;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
		 // assertions
         assertFalse(appt.getValid());
         assertEquals(25, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(04, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

	 }

     @Test
	 public void test03()  throws Throwable  {
         int startHour=13;
         int startMinute=61;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         // assertions
         assertFalse(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(61, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(04, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }
	/*
     @Test
     public void test04()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=31;
         int startMonth=4;
         int startYear=2017;
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
         // assertions
         assertFalse(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(31, appt.getStartDay());
         assertEquals(04, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test05()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=13;
         int startYear=2017;
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
         // assertions
         assertFalse(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(13, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }
	*/
     @Test
     public void test06()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
		 appt.setStartHour(14);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(14, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test07()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         appt.setStartMinute(31);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(31, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test08()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         appt.setStartDay(11);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(11, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test09()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         appt.setStartMonth(5);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(5, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test10()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         appt.setStartYear(2018);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2018, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test11()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         appt.setTitle("Birthday Part");
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Part", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test12()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
		 String nstr = null;
         appt.setTitle(nstr);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("", appt.getTitle());
         assertEquals("This is my birthday party.", appt.getDescription());

     }

     @Test
     public void test13()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
         appt.setDescription("This is my birthday part.");
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("This is my birthday part.", appt.getDescription());

     }

     @Test
     public void test14()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
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
		 String nstr = null;
         appt.setDescription(nstr);
         // assertions
         assertTrue(appt.getValid());
         assertEquals(13, appt.getStartHour());
         assertEquals(30, appt.getStartMinute());
         assertEquals(10, appt.getStartDay());
         assertEquals(4, appt.getStartMonth());
         assertEquals(2017, appt.getStartYear());
         assertEquals("Birthday Party", appt.getTitle());
         assertEquals("", appt.getDescription());

     }

	@Test
	public void test15() {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		int rd[] = {1, 3, 5};
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
							 startMinute ,
							 startDay ,
							 startMonth ,
							 startYear ,
							 title,
							 description);
		appt.setRecurrence(rd, 2, 3, 4);
		assertEquals(4, appt.getRecurNumber());
		assertEquals(2, appt.getRecurBy());
		assertEquals(rd, appt.getRecurDays());
		assertTrue(appt.isRecurring());
		assertEquals(3, appt.getRecurIncrement());
	}

	@Test
	public void test16() {
        int startHour=13;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        int rd[] = {1, 3, 5};
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
		assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
	}

//add more unit tests as you needed
	
}

class Date{
	int day;
	int month;
	int year;
    	String dow;
	}
// Date class end here

class TestDate{
	public static void main(String[] args)
	{
	Date d1; //reference
	d1 =new Date(); // class ka variable
        d1.day= 21;
    	d1.month = 8;
	d1.year=2026;
	d1.dow="Friday";

	System.out.println("Day is: "+d1.day);
        System.out.println("Month is: "+d1.month);
 	System.out.println("Year id: "+d1.year);
	System.out.println("Day Of Week: "+d1.dow);
        }
}
  
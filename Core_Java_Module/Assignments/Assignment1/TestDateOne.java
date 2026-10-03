class Date{
	int day;
	int month;
	int year;
	String dow;
   	
	void setDay(int d){
		this.day=d;
		}
	void setMonth(int m){
		this.month=m;
		}
 	void setYear(int y){
		this.year=y;
		}
	void setDOW(String s){
		this.dow=s;
		}
 	void display(){
		System.out.println("Day is: "+this.day);
		System.out.println("Month is: "+this.month);
		System.out.println("Year is: "+this.year);
		System.out.println("Day of week is: "+this.dow);
		}
	int getDay(){
		return this.day;
		}


	}


class TestDateOne{
	
	public static void main(String[] args)
	{
	Date d1;//reference
   	d1=new Date();//class ka variable
	d1.setDay(21);
	d1.setMonth(8);
	d1.setYear(2026);
	d1.setDOW("Monday");
	//setDay(d1,21);
	Date d2;
 	d2=new Date();
	d2.setDay(27);
	d2.setMonth(8);
	d2.setYear(2026);
	d2.setDOW("Monday");
	
	if(d1.getDay() > d2.getDay()){
		System.out.println("d2 is elder!!!");
	}else{
		System.out.println("d1 is elder!!!");
		}


	}
}
package TW;
public class chsong {
	private static String[] verses;
	private static int day;
	private String suffix;
	public final int total_day =12;
	
	public chsong(){
		day=1;
		suffix ="st";
		verses = new String[] {
				" ",
				"a Partridge in a Pear Tree.",
				"two Turtle Doves",
				"three French Hens",
				"four Calling Birds",
				"five Gold Rings",
				"six Geese-a-Laying",
				"seven Swans-a-Swimming",
				"eight Maids-a-Milking",
				"nine Ladies Dancing",
				"ten Lords-a-Leaping",
				"eleven Pipers Piping",
				"twelve Drummers Drumming"
		};
	}
	public void getVerses() {
		for (int c=0;c<total_day;c++) {
			setSuffix();
			System.out.println(getFirstVerse(c+1));
			for(int i=day; i>0;i--) {
				if(i==1 && day!=1) 
					System.out.println("and "+ verses[i]);
				else 
					System.out.println(verses[i]);
				
			}
			setDay();
			System.out.println();
			
		}
	}
	public String getFirstVerse(int currentDay) {
		return "On the "+currentDay+ getSuffix() +" day of Christmas my true love gave to me";
	}
	
	public static void setDay() {
		day++;
	}
	public static int getDay() {
		return day;
	}
	public void setSuffix() {
		switch(day) {
		case 1:
			suffix= "st";
			break;
		case 2:
			suffix="nd";
			break;
		case 3:
			suffix="rd";
			break;
		default :
				suffix ="th";
				break;
		}
	}
	
	public String getSuffix() {
		return suffix;
	}
	

}


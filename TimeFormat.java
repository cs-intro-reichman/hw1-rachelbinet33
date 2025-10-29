// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String ampm = "";
		String formatted_hours = "" + hours;
		String formatted_minutes ="" + minutes;

		//while(hours<=23 && hours>=0 && minutes>=0 && minutes<=59){
			if(hours == 0 ){
				hours = 12;
				ampm = "PM";}
			else if(hours >= 12){ ampm= "PM";
			formatted_hours  = ""+ (hours - 12);
		}
		else{ ampm = "AM";
				if(hours<10){formatted_hours = ("0" + hours);}
			}
			if (minutes<10) {
				formatted_minutes = "0" + minutes;
			}
		
		System.out.println(formatted_hours+":"+formatted_minutes + " " + ampm);
		}
	}
//}
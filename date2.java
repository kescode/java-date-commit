import java.util.Scanner;
import java.time.LocalDate;


public class date2 {
	
	
   public static void main(String[] args){
      
		LocalDate myObj1 = LocalDate.now(); 
	    System.out.println("Today's date is: " + myObj1);
	   
	   
	   Scanner myObj = new Scanner(System.in);
	   System.out.println("Enter your birthdate: ");
    
	   String birthday = myObj.nextLine();
	   System.out.println("Your birthdate is: " + birthday);
	  
	   String[] temp;
	   
	   temp = birthday.split("/");
	   
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
	   
		int day = Integer.parseInt(temp[0]);
		int month = Integer.parseInt(temp[1]);
		int year = Integer.parseInt(temp[2]);
	 

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("You were born in a leap year.");
      else
         System.out.println("You were not born in a leap year.");
      
      if ((month == 01) && (day >= 20) || (month == 02) && (day <= 18))  {
	    	System.out.println("Your zodiac sign is: Aquarius.");
	    }
	    if ((month == 02) && (day >= 19) || (month == 03) && (day <= 20))  {
	    	System.out.println("Your zodiac sign is: Pisces.");
	    } 
	    if ((month == 03) && (day >= 21) || (month == 04) && (day <= 19))  {
	    	System.out.println("Your zodiac sign is: Aries.");
	    } 
	    if ((month == 04) && (day >= 20) || (month == 05) && (day <= 20))  {
	    	System.out.println("Your zodiac sign is: Taurus.");
	    }
	    if ((month == 05) && (day >= 21) || (month == 06) && (day <= 20))  {
	    	System.out.println("Your zodiac sign is: Gemini.");
	    }
	    if ((month == 06) && (day >= 21) || (month == 07) && (day <= 22))  {
	    	System.out.println("Your zodiac sign is: Cancer.");
	    }
	 //   if ((month == 07) && (day >= 23) || (month == 08) && (day <= 22))  {
	 //   	System.out.println("Your zodiac sign is: Leo.");
	 //   }
	  //  if ((month == 08) && (day >= 23) || (month == 09) && (day <= 22))  {
	  //  	System.out.println("Your zodiac sign is: Virgo.");
	 //   }
	 //   if ((month == 09) && (day >= 23) || (month == 10) && (day <= 22))  {
	  //  	System.out.println("Your zodiac sign is: Libra.");
	 //   }
	    if ((month == 10) && (day >= 23) || (month == 11) && (day <= 21))  {
	    	System.out.println("Your zodiac sign is: Scorpio.");
	    }
	    if ((month == 11) && (day >= 22) || (month == 12) && (day <= 21))  {
	    	System.out.println("Your zodiac sign is: Saggitarius.");
	    }
	    if ((month == 12) && (day >= 22) || (month == 01) && (day <= 19))  {
	    	System.out.println("Your zodiac sign is: Capricorn.");
	    }
      
      
      
      
      
	   System.out.println("Enter someone else's birthdate: ");
   
	   String otherbirthday = myObj.nextLine();
	   System.out.println("Their birthdate is: " + otherbirthday);
      
	   
	   String[] othertemp;
	   
	   othertemp = otherbirthday.split("/");
	   
		System.out.println(othertemp[0]);
		System.out.println(othertemp[1]);
		System.out.println(othertemp[2]);
	   
		int otherday = Integer.parseInt(othertemp[0]);
		int othermonth = Integer.parseInt(othertemp[1]);
		int otheryear = Integer.parseInt(othertemp[2]);
		
		 if (((otheryear % 4 == 0) && (otheryear % 100!= 0)) || (otheryear%400 == 0))
	         System.out.println("They were born in a leap year.");
	      else
	         System.out.println("They were not born in a leap year.");
		 
		 

	    
	    
	    if ((othermonth == 01) && (otherday >= 20) || (othermonth == 02) && (otherday <= 18))  {
	    	System.out.println("Their zodiac sign is: Aquarius.");
	    }
	    if ((othermonth == 02) && (otherday >= 19) || (othermonth == 03) && (otherday <= 20))  {
	    	System.out.println("Their zodiac sign is: Pisces.");
	    } 
	    if ((othermonth == 03) && (otherday >= 21) || (othermonth == 04) && (otherday <= 19))  {
	    	System.out.println("Their zodiac sign is: Aries.");
	    } 
	    if ((othermonth == 04) && (otherday >= 20) || (othermonth == 05) && (otherday <= 20))  {
	    	System.out.println("Their zodiac sign is: Taurus.");
	    }
	    if ((othermonth == 05) && (otherday >= 21) || (othermonth == 06) && (otherday <= 20))  {
	    	System.out.println("Their zodiac sign is: Gemini.");
	    }
	    if ((othermonth == 06) && (otherday >= 21) || (othermonth == 07) && (otherday <= 22))  {
	    	System.out.println("Theirr zodiac sign is: Cancer.");
	    }
	 //   if ((othermonth == 07) && (otherday >= 23) || (othermonth == 08) && (otherday <= 22))  {
	 //   	System.out.println("Their zodiac sign is: Leo.");
	 //   }
	  //  if ((othermonth == 08) && (otherday >= 23) || (othermonth == 09) && (otherday <= 22))  {
	  //  	System.out.println("Their zodiac sign is: Virgo.");
	 //   }
	 //   if ((othermonth == 09) && (otherday >= 23) || (othermonth == 10) && (otherday <= 22))  {
	  //  	System.out.println("Their zodiac sign is: Libra.");
	 //   }
	    if ((othermonth == 10) && (otherday >= 23) || (othermonth == 11) && (otherday <= 21))  {
	    	System.out.println("Their zodiac sign is: Scorpio.");
	    }
	    if ((othermonth == 11) && (otherday >= 22) || (othermonth == 12) && (otherday <= 21))  {
	    	System.out.println("Their zodiac sign is: Saggitarius.");
	    }
	    if ((othermonth == 12) && (otherday >= 22) || (othermonth == 01) && (otherday <= 19))  {
	    	System.out.println("Their zodiac sign is: Capricorn.");
	    }
	    
	    
	    
	    
		if (otheryear > year) {
			System.out.println("They are younger than you.");
		}
			else if (otheryear < year) {
				System.out.println("They are older than you.");
			}
				else if (otheryear == year) {
					if (othermonth > month) {
						System.out.println("They are younger than you.");
					}
						else if (othermonth < month) {
							System.out.println("They are older than you.");
						}
							else if (othermonth == month) {
								if (otherday > day) {
									System.out.println("They are younger than you.");
								}
									else if (otherday < day) {
										System.out.println("They are older than you.");
									}
										else if (otherday == day) {
											System.out.println("They are the exact same age as you.");
										}

										}

									}
	  
								}
								
							
							

						

					
				
		

		
   }


public class SDate 
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year
   private String[] months = new String[]{ "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december" }; 


   // constructor: call checkMonth to confirm proper value for month; 
   // call checkDay to confirm proper value for day
   public SDate( int theYear, int theMonth, int theDay )
   {
	  year = theYear; // could validate year
	  month = checkMonth( theMonth ); // validate month
      day = checkDay( theDay ); // validate day

      System.out.printf( 
         "Datoen object constructor for date %s\n", this );
   } // end Date constructor

   
   public SDate(int y, String m, int d){
	   	   	
	   year = y; // could validate year
	   month = checkMonth( convertMonthToInt(m) ); // validate month
	   day = checkDay( d ); // validate day

			System.out.printf( 
			   "Datoen object constructor for date %s\n", this );   
	}
		   
	   

   public SDate( int y, int m ){
       this(m,0, y);
   }

   //Convert months string to int
   private int convertMonthToInt (String m){
	   switch (m)
       {
           case "January": return 1;
           case "Jan": return 1;
           case "February": return 2;
           case "Feb": return 2;
           case "March": return 3;
           case "Mar": return 3;
           case "April": return 4;
           case "Apr": return 4;
           case "May": return 5;
           case "June": return 6;
           case "Jun": return 6;
           case "July": return 7;
           case "Jul": return 7;
           case "August": return 8;
           case "Aug": return 8;
           case "September": return 9;
           case "Sep": return 9;
           case "October": return 10;
           case "Oct": return 10;
           case "November": return 11;
           case "Nov": return 11;
           case "December": return 12;
           case "Dec": return 12;
           default: return 0;          
       }   
   }
   

   // utility method to confirm proper month value
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid 
      { 
         System.out.printf( 
            "Invalid month (%d) set to 1.", testMonth );
         return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      int[] daysPerMonth = 
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;

      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;

      System.out.printf( "Invalid day (%d) set to 1.", testDay );
      return 1;  // maintain object in consistent state
   } // end method checkDay

   public String getMonthString(int month){
        return months[month];
        }

   
   
   //Returns the months as a Sting
   public String monthAsString()
   {
       //returns month as a string rather than an integer
       switch (month)
       {
           case 1: return "January";
           case 2: return "February";
           case 3: return "March";
           case 4: return "April";
           case 5: return "May";
           case 6: return "June";
           case 7: return "July";
           case 8: return "August";
           case 9: return "September";
           case 10: return "October";
           case 11: return "November";
           case 12: return "December";
           default: return "";          
       }         
   }

   
   //Adds 1 day to date
   public void addDay(int add1Day){
	   	   
	   int[] daysPerMonth = 
	         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	   
	   		this.day = this.day + add1Day;
	   
	   	  // check if day in range for month
	      if ( this.day > 0 && this.day <= daysPerMonth[ month ] ){
	    	  
	      }
	    
	      // check for leap year
	      else if ( month == 2 && this.day == 29 && ( year % 400 == 0 || 
	           ( year % 4 == 0 && year % 100 != 0 ) ) ){
	      }
	      
	      else{ //reste day counter and switch month
	    	  this.day = 1;
	      	  addMonth(1);
	      }
	    	   	      
   }
   
   
   //Calls when addDay get to a new months
   private void addMonth(int add1Month){
   	   
	   this.month = this.month + add1Month;
	   
	   if ( this.month > 0 && this.month <= 12 ){ // validate month
	   }
	   else{ //reset month counter and switch year
		   this.month = 1;
		   this.year = this.year + 1;
	   }
	            
   }
   
  
   // return a String of the form year/month/day
   public String toString()
   { 
      return String.format( "%d/%s/%d", year, monthAsString(), day ); 
   } // end method toString
} // end class SDate






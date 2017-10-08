import java.util.ArrayList;
import java.util.List;

public class Main {

   
	
    public static void main(String[] args) {
    	
    	
    	List<Object> downlineArray = new ArrayList<>();
        
    	final int day = 1; //Can only add 1 day at the time
    	
    	//startDate day , month and year
    	int startDay = 15;
    	String startMonth = "Feb";
    	int startYear = 2017;
    	
    	//endDate day , month and year
    	int endDay = 3;
    	String endMonth = "Aug";
    	int endYear = startYear + 0 ;
    	
    	
    	//
    	//mainUser
    	/*
    	int tmpAntalBuys;
    	String tmpDownlineArraylistDate;
    	int tmpDownlineArraylistGeneration;
    	int tmpDownlineArrayListPacket;
    	*/
    	     	
    	boolean keepSearching = false; //help to find out when startDate is equals to endDate
    	
    	
    	SDate startDate = new SDate (startYear, startMonth, startDay); //this numbers have to comes from main user
        SDate endDate = new SDate (endYear, endMonth, endDay); //this numbers well be main user plus x years
          
    	
 //   	CreateCalculatorArray createCalculatorArray = new CreateCalculatorArray();
//    	createCalculatorArray.addHeadderToDaysOfInfo("antalDage", "date", "antalNyePakker", "antalPakkerUdløber", "aktivePakker", "købtPakkerFor", "dagensBeløb", "downlineIalt", "downlines1Generation", "downlines2Generation", "downlines3Generation", "downlines4Generation", "downlines5Generation", "downlines6Generation", "arbejdeneSaldo", "salgfremmendeSaldo", "licens", "euroCredits", "hævetPrDag", "hævetPrMåned", "hævetPrÅr");
        
//        System.out.println(createCalculatorArray.toString()); 
        //henter data ud af CreateDownlineArray
      /*
    	CreateDownlineArray cda = new CreateDownlineArray();
    	
    	cda.addBuyToArray(startDate.toString(), 1, 20);
    	cda.addBuyToArray(startDate.toString(), 2, 10);
    	cda.addBuyToArray(endDate.toString(), 1, 20);
    	
    	
    	System.out.println(cda.upline.size());
    	tmpAntalBuys = cda.upline.size();
    	
    	System.out.println(cda.upline);
    	
    	
    	int j = 0;
    	for (int  i = 0 ; i <= (tmpAntalBuys / 3)-1 ; i++){
    		//System.out.println(i);
    		System.out.println(cda.upline.get(j)); //Dato tilsammenlining
        	System.out.println(cda.upline.get(j+1)); //hvilken generation
        	System.out.println(cda.upline.get(j+2)); //antal pakker
        	j = j + 3;
    		
    	}
    	*/  
    	
    	
    	/*
    	System.out.println(CDA.upline.get(0));
    	System.out.println(CDA.upline.get(1));
    	System.out.println(CDA.upline.get(2));
    	   	
    	tmpDownlineArraylistDate = (String) CDA.upline.get(0);
    	System.out.println(tmpDownlineArraylistDate);
    	tmpDownlineArraylistGeneration = (int) CDA.upline.get(1);
    	System.out.println(tmpDownlineArraylistGeneration);
    	tmpDownlineArrayListPacket = (int) CDA.upline.get(2);
    	System.out.println(tmpDownlineArrayListPacket);
    	*/
    	
    	
    	
    	
        System.out.println("Start dato: " + startDate.toString());
    	System.out.println("end dato: " + endDate.toString());
    	
    	System.out.println("Start dato er ikke lige med slutdato: " + startDate.toString().equals(endDate.toString()));
    	
    	Calculator mainUser = new Calculator(startDate.toString(), 20, 5000, 4999); //date, packets numbers, userID, UplineID
    	Calculator downlineUser1Genration = new Calculator(startDate.toString(), 20, 5001, 5000);
    	Calculator downlineUser2Genration = new Calculator(startDate.toString(), 20, 5002, 5001);
    	Calculator downlineUser1_1Genration = new Calculator(startDate.toString(), 20, 5003, 5000);
    	
    	List<Object> useres = new ArrayList<>();
    	
    	useres.add(mainUser);
    	useres.add(downlineUser1Genration);
        
        	
        	while (keepSearching == false){
        		if(startDate.toString().equals(endDate.toString())){
        			keepSearching = true;
    //    			System.out.println(" insite IF in the  While loop " + startDate.toString());
        		}
        		else{
     //   			System.out.println("instie ELSE in the while loop");   			 
        			
        			downlineUser1_1Genration.calculatorNumbers();
        			downlineArray = downlineUser1_1Genration.getCreateDownlineList(); 
        			
        			System.out.println(downlineArray.toString());	
        			int n = 0;
        			for (int i = 0 ; i < downlineArray.size()/4 ; i++ ){
        			
        			mainUser.setDownlineArray((String) downlineArray.get(n), (int) downlineArray.get(n+1), (int) downlineArray.get(n+2), (int) downlineArray.get(n+3));
        			n = n + 4;
        			}
        			
        			
        			
        			
        			
        			
        			downlineUser2Genration.calculatorNumbers();
        			downlineArray.clear();
        			downlineArray = downlineUser2Genration.getCreateDownlineList();
        			
        			System.out.println(downlineArray.toString());	
        			int m = 0;
        			for (int i = 0 ; i < downlineArray.size()/4 ; i++ ){
        			
        			mainUser.setDownlineArray((String) downlineArray.get(m), (int) downlineArray.get(m+1), (int) downlineArray.get(m+2), (int) downlineArray.get(m+3));
        			m = m + 4;
        			}
        			
        			
        			
        			
        			downlineUser1Genration.calculatorNumbers();
        			downlineArray.clear();
        			downlineArray = downlineUser1Genration.getCreateDownlineList();
        			
        			System.out.println(downlineArray.toString());
        			System.out.println(downlineArray.size());
        			//downlineUser1Genration.setDownlineArray(date, amountsOfPackets, uplineID, generationsID);
        			
        			
        			System.out.println(downlineArray.toString());	
        			int o = 0;
        			for (int i = 0 ; i < downlineArray.size()/4 ; i++ ){
        			
        				
        				
        				
        				
        			mainUser.setDownlineArray((String) downlineArray.get(o), (int) downlineArray.get(o+1), (int) downlineArray.get(o+2), (int) downlineArray.get(o+3));
        			o = o + 4;
        			
        			}
        			//mainUser.setDownlineArray("Null", 0, 0, 0);
        			
        			mainUser.calculatorNumbers();
        			System.out.println(mainUser.calculatorArrayList.toString());
        			 //Arraylist one use at the time all days from last add to first
        			//køre bruger beregninge
        			startDate.addDay(day);
        			downlineUser1Genration.setDate(startDate.toString());
        			mainUser.setDate(startDate.toString());
        			System.out.println("Datoen er nu : " + startDate.toString());
        			
        		}
            
        	}
        /*	
        	System.out.println("The end of the world: " + endDate.toString());
        	System.out.println(keepSearching);
        	System.out.println("Alle dataer som skal bruges til at vise statistick");
        	System.out.println("Antal pladser i List : " + mainUser.creatCalculatorArray.daysOfInfo.size());
        	System.out.println("Antal dage i Listen : " + mainUser.creatCalculatorArray.daysOfInfo.size()/21);
        */	
        	
        	int e = 0;
        	for (int i = 0; i < downlineUser1Genration.creatCalculatorArray.daysOfInfo.size()/21; i++){
        		
        		System.out.println(downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e) + "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+1)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+2)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+3)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+4)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+5)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+6)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+7)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+8)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+9)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+10)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+11)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+12)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+13)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+14)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+15)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+16)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+17)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+18)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+19)+ "," + downlineUser1Genration.creatCalculatorArray.daysOfInfo.get(e+20));
        		e = e + 21;
        	}
        	/*
        	int k = 0;
        	for (int i = 0; i < mainUser.creatCalculatorArray.daysOfInfo.size()/21; i++){
        		
        		System.out.println(mainUser.creatCalculatorArray.daysOfInfo.get(k) + "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+1)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+2)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+3)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+4)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+5)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+6)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+7)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+8)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+9)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+10)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+11)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+12)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+13)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+14)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+15)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+16)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+17)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+18)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+19)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(k+20));
        		k = k + 21;
        	}*/
        	
        	int j = 0;
        	for (int i = 0; i < mainUser.creatCalculatorArray.daysOfInfo.size()/21; i++){
        		
        		System.out.println(mainUser.creatCalculatorArray.daysOfInfo.get(j) + "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+1)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+2)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+3)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+4)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+5)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+6)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+7)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+8)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+9)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+10)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+11)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+12)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+13)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+14)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+15)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+16)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+17)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+18)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+19)+ "," + mainUser.creatCalculatorArray.daysOfInfo.get(j+20));
        		j = j + 21;
        	}
        	
        	
        	
        	//System.out.println(mainUser.creatCalculatorArray.toString());
        
    }

}
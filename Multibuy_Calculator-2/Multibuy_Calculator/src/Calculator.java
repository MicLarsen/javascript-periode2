
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;





public class Calculator {
	
	public Calculator(){	
	}
		
	public Calculator (String date, int startPackets, int userID, int uplineID){
		this.date = date;
		this.startPackets= startPackets;
		this.userID = userID;
		this.uplineID = uplineID;
		}

	public void setDate(String date){
		this.date = date;
	}
	
	//Hentes via brugeren eventuelt via en konstrukter
	String companyname = "ProfilMultibuy"; //skal hentes fra bruger
	String date = ""; //skal hentes fra Bruger    //ikke sikker på om det skal være en string
	int amountOfNewPackets = 0; //skal hentes fra Bruger
	int uplineID  = 9999; //skal hentes fra bruger  //1-6
	int userID = 5000; //skal hentes fra bruger
	double withdrawProcent = 0.00; //skal hentes fra bruger
	boolean withdrawDownlineEarning = false;
	int startPackets = 0;
	
	//Hentes via firmaProfilen
	int maxPackets = 1000; //hentes fra firmaProfil
	int packetsHolds = 172; //skal hentes fra firmaProfil. (antal dage)
	double tmpPacketsHolds = this.packetsHolds;
	double packetsPrice = 50.00; //Hentees fra firmaProfil
	String valutaType = "€"; // skal hentes fra firmaProfil. ( fx. $ , € , DKK)
	double promotionalBalanceProcent = 0.05; // skal hentes fra FirmaProfil.
	double licens = 0.00; //skal hentes fra FirmaProfil.
	int euroCredits = 0;
	double profitPerPackage = 1.20;
	double downline1GenerationsProcent = 0.08;
	double downline2GenerationsProcent = 0.05;
	double downline3GenerationsProcent = 0.04;
	double downline4GenerationsProcent = 0.03;
	double downline5GenerationsProcent = 0.02;
	double downline6GenerationsProcent = 0.01;
	
	//Bliver sent fra evt. downlines via til funktions DownlineArray 
	double downline1Generation = 0.00;
	double downline2Generation = 0.00;
	double downline3Generation = 0.00;
	double downline4Generation = 0.00;
	double downline5Generation = 0.00;
	double downline6Generation = 0.00;
	
	
	//Ting der bliver beregnet her i klassen
	int amountOfDays = 0; //Bruges til at deaktiver pakker ved udløb.
	int amountOfPacketsExpance = 0; //bliver beregner her
	int amountOfActivePackets = 0; //bliver beregner her
	double reInvested = 0.00; //beregnes her
	double todaysAmount = 0.00;
	double downlineIAlt = 0.00;
	double promotionalBalance = 0.00; //beregnes her
	double workingBalance = 0.00; //beregnes her
	double workingBalanceProcent = 1.00 - promotionalBalanceProcent;
	double withdrawEachDay = 0.00;
	double withdrawEachMonth = 0.00;
	double withdrawEachYear = 0.00;
	boolean calculatorHeadderIsCreatet = false;
	double earingFromPacketEachDay = (packetsPrice * profitPerPackage) / tmpPacketsHolds; //skal hentes fra firmaProfil.
	final int generationsID = 1;
	
	
	
	
	
	String[] arrayHeadder = new String[21];
	int[] arrayPakkerHolder = new int[packetsHolds]; //beregnings array til calculatoren
	ArrayList<Object> listdownlineArrayList = new ArrayList<Object>();
	ArrayList<Object> calculatorArrayList = new ArrayList<Object>();
	ArrayList<Object> createDownlineList = new ArrayList<Object>();	
	CreateCalculatorArray creatCalculatorArray = new CreateCalculatorArray();	
	ArrayList<Object> downline1Generations = new ArrayList<Object>();
	ArrayList<Object> downline2Generations = new ArrayList<Object>();
	ArrayList<Object> downline3Generations = new ArrayList<Object>();
	ArrayList<Object> downline4Generations = new ArrayList<Object>();
	ArrayList<Object> downline5Generations = new ArrayList<Object>();
	ArrayList<Object> downline6Generations = new ArrayList<Object>();
	
	
	
	//Tager første plads i arrayet og gemmer den i variablen antalPakkerUdløber, Derefter flytter den alle pladser i arrayet en ned.
	private void trackPacketsLifeRemove(){
		
		int amountOfPacketsExpance = 0; //Ny variabel til denne funktion
				    
	    amountOfPacketsExpance = this.arrayPakkerHolder[0]; //sætter variablen lig med plads 0 i arrayet

	    // Kopiering af array / udtagning af element     
	    int[] tmp=new int[this.packetsHolds]; // Nyt array med 172 int

	    // bemærk at elementet der skal fjernes ikke kopieres
	    for (int n=0; n<0; n++) tmp[n]=this.arrayPakkerHolder[n]; //fjerne plads 0
	    for (int n=0+1; n<this.arrayPakkerHolder.length; n++) tmp[n-1]=this.arrayPakkerHolder[n]; //rykker alle pladser frem i array 
	    this.arrayPakkerHolder = tmp; // Nu refererer arrayPakkerHolder til det nye array med 172 elementer
	    this.amountOfPacketsExpance = amountOfPacketsExpance;
	    this.amountOfActivePackets = this.amountOfActivePackets - this.amountOfPacketsExpance;//Retter antallet af aktive pakker
	}
	

	//Gemmer antallet af nye pakker sidst i arrayet
	private void trackPacketsLifeAdd(int amountOfNewPackets){
		this.arrayPakkerHolder[this.packetsHolds-1] = amountOfNewPackets; //lækker antalet af nye pakker bagerst i Arrayet 
	}
	
		
	    //Will sort out what generation the data comes from
		public void setDownlineArray(String date, int amountsOfPackets, int uplineID, int generationsID){
		 //en funktion til at læse fra arrayliste (while)
			System.out.println("Sent date via setDownlineArray : " + date);
			System.out.println("Date som er sat i classen : " + this.date);
			System.out.println("String date " + this.date.equals(date));
			System.out.println("uplineID er : " + uplineID);
			System.out.println("generationsID : " + generationsID);
			 
			System.out.println("userID er : " + this.userID + " uplineID er : " + uplineID);
			System.out.println("kommer vi ind here 1");
			
			System.out.println("Dato : " + date + " Antal pakker : " + amountsOfPackets + " uplineID : " + uplineID + " generationsID : " + generationsID);
			
			
			System.out.println();
		if (uplineID == this.userID && this.date.equals(date)){
			
				System.out.println("kommer vi ind here 3");
				switch (generationsID){
		
					//add to arraylist 1.generations
				case 1:	System.out.println("Skrive til downline1Generation today : " + date);
						this.downline1Generation = this.downline1Generation + (amountsOfPackets * this.packetsPrice * this.downline1GenerationsProcent);			
						System.out.println("Beløb lagt til downline1Generation" + this.downline1Generation);
						generationsID = 2;
						uplineID = this.uplineID;
						createDownlineArray(date, amountsOfPackets, uplineID, generationsID);
						break;
				
				case 2: System.out.println("Skrive til downline2Generation");
						this.downline2Generation = this.downline2Generation + (amountsOfPackets * this.packetsPrice * this.downline2GenerationsProcent);
						generationsID = 3;
						uplineID = this.uplineID;
						createDownlineArray(date, amountsOfPackets, uplineID, generationsID);
						break;
						
				case 3: System.out.println("Skrive til downline3Generation");
						this.downline3Generation = this.downline3Generation + (amountsOfPackets * this.packetsPrice * this.downline3GenerationsProcent);
						generationsID = 4;
						uplineID = this.uplineID;
						createDownlineArray(date, amountsOfPackets, uplineID, generationsID);
						break;
						
				case 4: System.out.println("Skrive til downline4Generation");
						this.downline4Generation = this.downline4Generation + (amountsOfPackets * this.packetsPrice * this.downline4GenerationsProcent);
						generationsID = 5;
						uplineID = this.uplineID;
						createDownlineArray(date, amountsOfPackets, uplineID, generationsID);
						break;
						
				case 5: System.out.println("Skrive til downline5Generation");
						this.downline5Generation = this.downline5Generation + (amountsOfPackets * this.packetsPrice * this.downline5GenerationsProcent);
						generationsID = 6;
						uplineID = this.uplineID;
						createDownlineArray(date, amountsOfPackets, uplineID, generationsID);
						break;
						
				case 6: System.out.println("Skrive til downline6Generation");
						this.downline6Generation = this.downline6Generation + (amountsOfPackets * this.packetsPrice * this.downline6GenerationsProcent);
						break;
						
				default: System.out.println("Noget gik galt i setDownlineArray switch case funktionen");
						break;
				}
			}
		}

	

//	public void getDownlineArray(){
		
//	}
	
		//Calls when a user buys some packets
	private void createDownlineArray(String date, int amountOfNewPackets, int uplineID, int generationsID){
		
		int[] intUpline = new int[3];
		String[] stringUpline = new String[1];

		
				//saves Strings in a String array, and int in to a int Array
				stringUpline[0] = date;
				intUpline[0] = amountOfNewPackets;
				intUpline[1] = uplineID;
				intUpline[2] = generationsID;
				
				
				//add the String array in to a list, then add the 
				this.createDownlineList.add(stringUpline[0].toString());
				this.createDownlineList.add(intUpline[0]);
				this.createDownlineList.add(intUpline[1]);
				this.createDownlineList.add(intUpline[2]);
			}
	
	public ArrayList<Object> getCreateDownlineList(){
		return this.createDownlineList;
	}
	
		
	private void firstDay(){	
		
		//this.downlineIAlt = this.downline1Generation + this.downline2Generation + this.downline3Generation
		//          + this.downline4Generation + this.downline5Generation + this.downline6Generation; //beregner den totale indkomst fra downlines
		//System.out.println("This is first day :");
		//downlineArray(date); //tjekker om der er nogle indkomst fra downlines ved start dato
		//System.out.println("arbejdeneSaldo er : " + this.workingBalance);
		this.workingBalance = this.downlineIAlt + this.workingBalance; //beregner arbejenesaldo
		//System.out.println("arbejdeneSaldo er : " + this.workingBalance);		
		//er kun aktuel hvis der er en upline
		//System.out.println("Er du mainUser?");
		if (userID != 5000){
			//System.out.println("nej jeg er ikke mainUser");
			createDownlineArray(this.date, this.startPackets, this.uplineID, this.generationsID); //Sent the date and amount of packets when a user buys packets
		}
			
				
	}
		
		//Will calculate all the 
	private void anyDay(){
		//System.out.println("This is anyDay :");
		//this.downlineIAlt = this.downline1Generation + this.downline2Generation + this.downline3Generation
		//          + this.downline4Generation + this.downline5Generation + this.downline6Generation; //beregner den totale indkomst fra downlines
		double amountOfAktivePackets = this.amountOfActivePackets;
		this.todaysAmount = amountOfAktivePackets * this.earingFromPacketEachDay; //beregner dagens indtægt
		this.workingBalance = this.workingBalance + this.downlineIAlt + (this.todaysAmount * this.workingBalanceProcent);
		this.promotionalBalance = this.promotionalBalance + (this.todaysAmount * this.promotionalBalanceProcent);
		this.amountOfActivePackets = (int) amountOfAktivePackets;
	
	
		
		
	}
		
	//Check on "can we buy a packet"
	private void canYouBuyAPacket(){
		
		//System.out.println("Her starter canYouBuyAPacket");
		if (amountOfDays == 0){
			//System.out.println("Dette er den første dag, købs rutine er derfor anderledes");
			willYouWithdrawCommisionFromDownlines();
			double amountOfNewPackets = this.amountOfNewPackets;
			amountOfNewPackets = this.workingBalance / this.packetsPrice; //beregner antallet af nye pakker der kan købes
			this.amountOfNewPackets = (int) amountOfNewPackets; //konventer fra double til int
			
			
		}
		// laver en beregninge på om der kan købes nye pakker
		
		else if (this.amountOfActivePackets <= this.maxPackets){
				//System.out.println("Antal Aktive Pakker er <= max pakker");
				//System.out.println("Tjek 1 antal nye pakker : " + this.amountOfNewPackets);
				double maxPackets = this.maxPackets; //konventer fra int til double
				double amountOfAktivePackets = this.amountOfActivePackets; //konventer fra int til double
				willYouWithdrawCommisionFromDownlines();
				
				    //1000    -  990      >=      17
				if (maxPackets - amountOfAktivePackets >= workingBalance / packetsPrice){
					//System.out.println(" max pakker - antalAktivePakker >= arbejdeneSaldo / pakkePris");
					
						if (workingBalance >= packetsPrice){	
							//System.out.println(workingBalance > packetsPrice);
							double amountOfNewPackets = this.workingBalance / this.packetsPrice; //Antallet af nye pakker some double!
							this.amountOfNewPackets = (int) amountOfNewPackets; //konventer fra double til int
							double amountOfNewPacketsCleanNumber = this.amountOfNewPackets;
							this.reInvested = amountOfNewPacketsCleanNumber * this.packetsPrice; //sætter prisen der er genkøbt for
							amountOfNewPacketsCleanNumber = 0.00;
							
							if (userID != 5000){
								createDownlineArray(this.date, this.amountOfNewPackets, this.uplineID, this.generationsID); //sender dato, uplineID og "antal nye pakker" til createDownlineArray
							}	
						}
						
				}
				
				else{
					this.maxPackets = (int) maxPackets;
					this.amountOfActivePackets = (int) amountOfAktivePackets;
					this.amountOfNewPackets = this.maxPackets - this.amountOfActivePackets;
					this.maxPackets = (int) maxPackets;
					this.amountOfActivePackets = (int) amountOfAktivePackets;
										
					if (userID != 5000){
						createDownlineArray(this.date, this.amountOfNewPackets, this.uplineID, this.generationsID); //sender dato, uplineID og "antal nye pakker" til createDownlineArray
					}		
				}
			}
		}
		
	
	private void reInvested(){
		this.reInvested = this.amountOfNewPackets * this.packetsPrice; //sætter prisen der er genkøbt for
		this.amountOfNewPackets = this.amountOfNewPackets + this.startPackets; //lægger startPakker til nyePakker så lifetracker kan finden ud af det
		this.amountOfActivePackets = this.amountOfActivePackets + this.amountOfNewPackets;
		this.workingBalance = this.workingBalance - this.reInvested; //Remove the reinvested amount from working balance 
	}
	
	//calculate how much you can withdraw of you personnel earing
	private void canYouWithdraw(){
		
			if (this.amountOfActivePackets == this.maxPackets){
				this.withdrawEachDay = this.withdrawEachDay + (this.workingBalance - (packetsPrice * 4));
				if (this.withdrawEachDay <= 0.00)
					this.withdrawEachDay = 0.00;
					
				}
			}
		
	
	
	//calculate how much you can withdraw of you commission from downlines
	private void willYouWithdrawCommisionFromDownlines(){
		//downlineArray(date); //tjekker om der er nogle indkomst fra downlines ved start dato
		// funktionen skal laves
		
		this.downlineIAlt = downline1Generation + downline2Generation + downline3Generation
		          + downline4Generation + downline5Generation + downline6Generation; //beregner den totale indkomst fra downlines
		
		if (withdrawDownlineEarning == true){
			this.withdrawEachDay = downlineIAlt;
			
		}
		else{
			this.workingBalance = this.workingBalance + this.downlineIAlt;
		}
		
	}
		
		
		
	private void createUserData(){
		if (this.userID == 5000){
			  
			if (calculatorHeadderIsCreatet == false){
			  	calculatorHeadder();
			  	calculatorHeadderIsCreatet = true;
			}
			
		//	System.out.println(crea);
			creatCalculatorArray.add1DaysOfInfo (this.amountOfDays, this.date, this.amountOfNewPackets, this.amountOfPacketsExpance, this.amountOfActivePackets, this.euroCredits, this.reInvested, this.todaysAmount, this.downlineIAlt, this.downline1Generation, this.downline2Generation, this.downline3Generation, this.downline4Generation, this.downline5Generation, this.downline6Generation, this.workingBalance, this.promotionalBalance, this.licens, this.withdrawEachDay, this.withdrawEachMonth, this.withdrawEachYear);
			//calculatorArrayList.add(creatCalculatorArray.toString());
			//System.out.println(creatCalculatorArray.toString());
			//System.out.println(this.calculatorArrayList.toString());
						  
		}
	}
	
		
		//Create a header to show on screen.
	private	void calculatorHeadder(){
			
		creatCalculatorArray.addHeadderToDaysOfInfo
					("Antal dage", "Dato",
					"Antal nye pakker", "Antal pakker udløber",
					"Aktive pakker", "Købt pakker for",
					"Dagens beløb", "Downlines i alt",
					"Downlines 1. generation", "Downlines 2. generation",
					"Downlines 3. generation", "Downlines 4. generation",
					"Downlines 5. generation", "Downlines 6. generation",
					"Arbejdene saldo", "Salgsfremmende saldo",
					"Licens", "'Euro Credits'",
					"Hævet pr. dag", "Hævet pr. måned",
					"Hævet pr. år");
			
			
		}
		
		
		
	//The Main calculator
	public void calculatorNumbers(){
		System.out.println("This is UserID : " + userID);
			//Earing calculations 
		if (this.amountOfDays == 0 )
			firstDay(); //Calculate first day
		else
			anyDay(); //Calculate any other day
		trackPacketsLifeRemove();  //Remove packet from the life tracker and set the packets that expire
		canYouBuyAPacket(); //Can we buy any new packets
		
		reInvested(); //Calculate the amount that have bin reinvested
		trackPacketsLifeAdd(this.amountOfNewPackets); //Adds packets to the life tracker
		
		canYouWithdraw(); //Take out cash from working balance
		createUserData(); //Create date stream if it is the main user!
		
		//Reset all the variable to default value  
		this.amountOfDays++;
		this.startPackets = 0;
		this.amountOfNewPackets = 0;
		this.reInvested = 0.00;
		this.todaysAmount = 0.00;
		this.downlineIAlt = 0.00;
		this.downline1Generation = 0.00;
		this.downline2Generation = 0.00;
		this.downline3Generation = 0.00;
		this.downline4Generation = 0.00;
		this.downline5Generation = 0.00;
		this.downline6Generation = 0.00;
		this.licens = 0.00;
		this.euroCredits = 0;
		this.withdrawEachDay = 0.00;
		this.withdrawEachMonth = 0.00;
		this.withdrawEachYear = 0.00;
		
	}
	
	
	@Override
	public String toString() {
		return "Calculator [calculatorArrayList=" + calculatorArrayList.toString() + "]";
	}
	
	
}
	
	



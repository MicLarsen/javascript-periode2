import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;


public class CreateCalculatorArray {

String[] stringCalculatorArray = new String[21];
String[] stringDate = new String[1];
int[] intDate = new int[1];
int[] intCalculatorArray = new int[4];
double[] doubleCalculatorArray = new double[15];
List<Object> daysOfInfo = new ArrayList<>();

public CreateCalculatorArray(){
	
}


		public void addHeadderToDaysOfInfo(String numbersOfDaysFromStart, String date, String amountOfNewPackets, String amountOfPacketsExpance, String activePackets, String reInvested, String todaysAmount, String downlineIalt, String downlines1Generation, String downlines2Generation, String downlines3Generation, String downlines4Generation, String downlines5Generation, String downlines6Generation, String workingBalance, String promotionalBalance, String licens, String euroCredits, String withdrawEachDay, String withdrawEachMonth, String withdrawEachYear){
		
		this.stringCalculatorArray[0] = numbersOfDaysFromStart;
		this.stringCalculatorArray[1] = date;
		this.stringCalculatorArray[2] = amountOfNewPackets;
		this.stringCalculatorArray[3] = amountOfPacketsExpance;
		this.stringCalculatorArray[4] = activePackets;
		this.stringCalculatorArray[5] = reInvested;
		this.stringCalculatorArray[6] = todaysAmount;
		this.stringCalculatorArray[7] = downlineIalt;
		this.stringCalculatorArray[8] = downlines1Generation;
		this.stringCalculatorArray[9] = downlines2Generation;
		this.stringCalculatorArray[10] = downlines3Generation;
		this.stringCalculatorArray[11] = downlines4Generation;
		this.stringCalculatorArray[12] = downlines5Generation;
		this.stringCalculatorArray[13] = downlines6Generation;
		this.stringCalculatorArray[14] = workingBalance;
		this.stringCalculatorArray[15] = promotionalBalance;
		this.stringCalculatorArray[16] = licens;
		this.stringCalculatorArray[17] = euroCredits;
		this.stringCalculatorArray[18] = withdrawEachDay;
		this.stringCalculatorArray[19] = withdrawEachMonth;
		this.stringCalculatorArray[20] = withdrawEachYear;
		
		daysOfInfo.add(stringCalculatorArray[0].toString());
		daysOfInfo.add(stringCalculatorArray[1].toString());
		daysOfInfo.add(stringCalculatorArray[2].toString());
		daysOfInfo.add(stringCalculatorArray[3].toString());
		daysOfInfo.add(stringCalculatorArray[4].toString());
		daysOfInfo.add(stringCalculatorArray[5].toString());
		daysOfInfo.add(stringCalculatorArray[6].toString());
		daysOfInfo.add(stringCalculatorArray[7].toString());
		daysOfInfo.add(stringCalculatorArray[8].toString());
		daysOfInfo.add(stringCalculatorArray[9].toString());
		daysOfInfo.add(stringCalculatorArray[10].toString());
		daysOfInfo.add(stringCalculatorArray[11].toString());
		daysOfInfo.add(stringCalculatorArray[12].toString());
		daysOfInfo.add(stringCalculatorArray[13].toString());
		daysOfInfo.add(stringCalculatorArray[14].toString());
		daysOfInfo.add(stringCalculatorArray[15].toString());
		daysOfInfo.add(stringCalculatorArray[16].toString());
		daysOfInfo.add(stringCalculatorArray[17].toString());
		daysOfInfo.add(stringCalculatorArray[18].toString());
		daysOfInfo.add(stringCalculatorArray[19].toString());
		daysOfInfo.add(stringCalculatorArray[20].toString());
		
	}
	
		public void add1DaysOfInfo(int amountOfDaysFromStart, String date, int amountsOfNewPackets,
				int amountOfPacketsExpance, int amountOfActivePackets, int euroCredits,
				double reInvested, double todaysAmount, double downlineIAlt,
				double downline1Generation, double downline2Generation, double downline3Generation,
				double downline4Generation, double downline5Generation, double downline6Generation,
				double workingBalance, double promotionalBalance, double licens,
				double withdrawEachDay, double withdrawEachMonth, double withdrawEachYear){
				
				this.intDate[0] = amountOfDaysFromStart;
				
				this.stringDate[0] = date;
				
				this.intCalculatorArray[0] = amountsOfNewPackets;
				this.intCalculatorArray[1] = amountOfPacketsExpance;
				this.intCalculatorArray[2] = amountOfActivePackets;
				this.intCalculatorArray[3] = euroCredits;
			
				this.doubleCalculatorArray[0] = reInvested;
				this.doubleCalculatorArray[1] = todaysAmount;
				this.doubleCalculatorArray[2] = downlineIAlt;
				this.doubleCalculatorArray[3] = downline1Generation;
				this.doubleCalculatorArray[4] = downline2Generation;
				this.doubleCalculatorArray[5] = downline3Generation;
				this.doubleCalculatorArray[6] = downline4Generation;
				this.doubleCalculatorArray[7] = downline5Generation;
				this.doubleCalculatorArray[8] = downline6Generation;
				this.doubleCalculatorArray[9] = workingBalance;
				this.doubleCalculatorArray[10] = promotionalBalance;
				this.doubleCalculatorArray[11] = licens;
				this.doubleCalculatorArray[12] = withdrawEachDay;
				this.doubleCalculatorArray[13] = withdrawEachMonth;
				this.doubleCalculatorArray[14] = withdrawEachYear;
				
				daysOfInfo.add(intDate[0]);
				daysOfInfo.add(stringDate[0].toString());
				daysOfInfo.add(intCalculatorArray[0]);
				daysOfInfo.add(intCalculatorArray[1]);
				daysOfInfo.add(intCalculatorArray[2]);
				daysOfInfo.add(intCalculatorArray[3]);
				daysOfInfo.add(doubleCalculatorArray[0]);
				daysOfInfo.add(doubleCalculatorArray[1]);
				daysOfInfo.add(doubleCalculatorArray[2]);
				daysOfInfo.add(doubleCalculatorArray[3]);
				daysOfInfo.add(doubleCalculatorArray[4]);
				daysOfInfo.add(doubleCalculatorArray[5]);
				daysOfInfo.add(doubleCalculatorArray[6]);
				daysOfInfo.add(doubleCalculatorArray[7]);
				daysOfInfo.add(doubleCalculatorArray[8]);
				daysOfInfo.add(doubleCalculatorArray[9]);
				daysOfInfo.add(doubleCalculatorArray[10]);
				daysOfInfo.add(doubleCalculatorArray[11]);
				daysOfInfo.add(doubleCalculatorArray[12]);
				daysOfInfo.add(doubleCalculatorArray[13]);
				daysOfInfo.add(doubleCalculatorArray[14]);
				
				
						
			}
	
		
	@Override
	public String toString() {
		return "CreateCalculatorArray [daysOfInfo=" + daysOfInfo.toString() + "]";
	}
	
	
	
}

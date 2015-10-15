import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataSetReader {
	private static final String COMMA_DELIMITER = ",";
	private static final String csvFile = "C:/Users/andrew/Documents/Year4/DataMining/WebCrawler/combineData.csv";
	private BufferedReader br = null; 
	private String line = "";
	private final String splitBy = ",";
	
	public static void main(String[] args) {
		DataSetReader obj = new DataSetReader();
		obj.run(csvFile);

		
	}

	public void run(String csvFile) {

		int count =0;


		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			System.out.println(line);
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String year = b[0];
					String name = b[1];
					String position = b[4];
					String heightFeet = b[5];
					String heightInches = b[6];
				    double heightFeetDouble = Double.parseDouble(heightFeet);
					double heightInchesDouble = Double.parseDouble(heightInches);
					String weight = b[7];
					double weightDouble = Double.parseDouble(weight);
					String arms = b[8];
					double armsDouble = Double.parseDouble(arms);
					String fortyYd = b[10];
					double fortyYdDouble = Double.parseDouble(fortyYd);
					String twentyyd = b[12];
					double twentyydDouble = Double.parseDouble(twentyyd);
					String tenyd = b[13];
					double tenydDouble = Double.parseDouble(tenyd);
					String twentyss = b[14];
					double twentyssDouble = Double.parseDouble(twentyss);
					String threecone = b[15];
					double threeconeDouble = Double.parseDouble(threecone);
					String vertical = b[16];
					double verticalDouble = Double.parseDouble(vertical);
					String broad = b[17];
					double broadDouble = Double.parseDouble(broad);
					String bench = b[18];
					double benchDouble = Double.parseDouble(bench);
					String nflgrade = b[25];
					double nflgradeDouble = Double.parseDouble(nflgrade);
	
					
//					System.out.println(year
//							+ " "
//							+name
//							+" "
//							+position
//							+" "
//							+heightFeetDouble
//							+" "
//							+heightInchesDouble
//							+" "	
//							+weightDouble
//							+" "	
//							+armsDouble
//							+" "	
//							+fortyYdDouble
//							+" "	
//							+twentyydDouble
//							+" "	
//							+tenydDouble
//							+" "	
//							+twentyssDouble
//							+" "
//							+threeconeDouble
//							+" "
//							+verticalDouble
//							+" "
//							+broadDouble
//							+" "
//							+benchDouble
//							+" "
//							+nflgradeDouble
//							+" ");
	
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}System.out.println("Done");
		System.out.println("-------------------------------------------");
		System.out.println("              MEAN Analysis                ");
		System.out.println("-------------------------------------------");
		heightMean();
		weightMean();
		armsMean();
		fortyydMean();
		nflGradeMean();
		benchMean();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("             MEDIAN Analysis               ");
		System.out.println("-------------------------------------------");
		heightMedian();
		weightMedian();
		armsMedian();
		fortyydMedian();
		nflGradeMedian();
		benchMedian();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("              MODE Analysis                ");
		System.out.println("-------------------------------------------");
		heightMode();
		weightMode();
		armsMode();
		fortyydMode();
		nflGradeMode();
		benchMode();
	}
	
	/********************************************************************************************************************
	 * 										Gets MEAN value for all attributes
	 *******************************************************************************************************************/
	//Gets Height Mean 
	public void heightMean(){
		double sumOfHeight =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String heightFeet = b[5];
					String heightInches = b[6];
				    double heightFeetDouble = Double.parseDouble(heightFeet);
					double heightInchesDouble = Double.parseDouble(heightInches);
					heightInchesDouble = heightInchesDouble/10;
					heightFeetDouble = heightFeetDouble + heightInchesDouble;
					
					sumOfHeight = sumOfHeight + heightFeetDouble;
					count++;
				}
				
			}
			average = sumOfHeight/count;
			System.out.println("Average Height: " + average);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Weight Mean 
	public void weightMean(){
		double sumOfWeight =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String weight = b[7];
					double weightDouble = Double.parseDouble(weight);
					
					sumOfWeight = sumOfWeight + weightDouble;
					count++;
				}
				
			}
			average = sumOfWeight/count;
			System.out.println("Average Weight: " + average);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Arms Strength Mean
	public void armsMean(){
		double sumOfArms =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String arms = b[8];
					double armsDouble = Double.parseDouble(arms);
					
					sumOfArms = sumOfArms + armsDouble;
					count++;
				}
				
			}
			average = sumOfArms/count;
			System.out.println("Average Arms: " + average);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Forty Yard Mean
	public void fortyydMean(){
		double sumOfFortyyd =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String fortyYd = b[11];
					double fortyYdDouble = Double.parseDouble(fortyYd);
					sumOfFortyyd = sumOfFortyyd + fortyYdDouble;
					count++;
				}
				
			}
			average = sumOfFortyyd/count;
			System.out.println("Average Forty-Yard: " + average);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets NFL-Grade Mean
	public void nflGradeMean(){
		double sumOfGrade =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String nflgrade = b[25];
			    double nflgradeDouble = Double.parseDouble(nflgrade);
			    
				if(line.contains("QB") && nflgradeDouble > 0){
				    sumOfGrade = sumOfGrade + nflgradeDouble;
					count++;
				}
				
			}
			average = sumOfGrade/count;
			System.out.println("Average NFL-Grade: " + average);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets bench Mean
	public void benchMean(){
		double sumOfBench =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
			    String bench = b[18];
			    double benchDouble = Double.parseDouble(bench);
			    
				if(line.contains("QB") && benchDouble > 0){
					sumOfBench = sumOfBench + benchDouble;
					count++;
				}
				
			}
			average = sumOfBench/count;
			System.out.println("Average bench: " + average);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/********************************************************************************************************************
	 * 										Gets Median value for all attributes
	 *******************************************************************************************************************/
	
	//Height Median
	public void heightMedian(){
		List<Double> bag = new ArrayList<>();
		double sumOfHeight =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[5];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String heightFeet = b[5];
					String heightInches = b[6];
				    double heightFeetDouble = Double.parseDouble(heightFeet);
					double heightInchesDouble = Double.parseDouble(heightInches);
					heightInchesDouble = heightInchesDouble/10;
					heightFeetDouble = heightFeetDouble + heightInchesDouble;
					bag.add(heightFeetDouble);
					count++;
				}
				
			}
			getMedian(bag, attribute, count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void weightMedian(){
		List<Double> bag = new ArrayList<>();
		double sumOfWeight =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[7];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String weight = b[7];
					double weightDouble = Double.parseDouble(weight);
					bag.add(weightDouble);
					count++;
				}
				
			}
			getMedian(bag, attribute, count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Forty-Yard Median
	public void fortyydMedian(){
		List<Double> bag = new ArrayList<>();
		double sumOfFortyyd =0;
		double average=0;
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int count=0;
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[11];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String fortyYd = b[11];
					double fortyYdDouble = Double.parseDouble(fortyYd);
					bag.add(fortyYdDouble);
					count++;
				}
				
			}
			getMedian(bag, attribute, count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Arm Strength Median
	public void armsMedian(){
		List<Double> bag = new ArrayList<>();
		double sumOfFortyyd =0;
		double average=0;
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int count=0;
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[9];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String fortyYd = b[9];
					double fortyYdDouble = Double.parseDouble(fortyYd);
					bag.add(fortyYdDouble);
					count++;
				}
				
			}
			
			getMedian(bag, attribute,count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets NFL-Grade Median
	public void nflGradeMedian(){
		List<Double> bag = new ArrayList<>();
		double sumOfFortyyd =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[25];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String nflgrade = b[25];
				double nflgradeDouble = Double.parseDouble(nflgrade);
				if(line.contains("QB") && nflgradeDouble > 0){
				    bag.add(nflgradeDouble);
					count++;
				}
				
			}
			getMedian(bag, attribute,count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets bench Median
	public void benchMedian(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[18];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String bench = b[18];
			    double benchDouble = Double.parseDouble(bench);
			    
				if(line.contains("QB") && benchDouble > 0){
					bag.add(benchDouble);
					count++;
				}
				
			}
			getMedian(bag, attribute,count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Median For all Attributes
	public void getMedian(List<Double> bag, String attribute,int count){
		double median=0;
		Collections.sort(bag);
		//System.out.println(bag);
		//System.out.println(count);
		if(count%2==0){
			int v1 = (count/2);
			int v2 = (count/2)+1;
			median = bag.get(v1)+bag.get(v2);
			median = median/2;
		}else median = bag.get(count/2);
		
		System.out.println("Median " + attribute+ ": "+ median);
	}
	
	/********************************************************************************************************************
	 *										 Gets the Mode for each Attribute
	  *******************************************************************************************************************/	
	//Forty-Yard Mode
	public void fortyydMode(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[11];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String fortyYd = b[11];
					double fortyYdDouble = Double.parseDouble(fortyYd);
					bag.add(fortyYdDouble);
					count++;
				}
				
			}
			getMode(bag, attribute);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Height Mode
	public void heightMode(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[5];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String heightFeet = b[5];
					String heightInches = b[6];
				    double heightFeetDouble = Double.parseDouble(heightFeet);
					double heightInchesDouble = Double.parseDouble(heightInches);
					heightInchesDouble = heightInchesDouble/10;
					heightFeetDouble = heightFeetDouble + heightInchesDouble;
					bag.add(heightFeetDouble);
					
					count++;
				}
				
			}
			getMode(bag, attribute);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Weight Mode
	public void weightMode(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[8];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String weight = b[8];
					double weightDouble = Double.parseDouble(weight);
					bag.add(weightDouble);
					
					count++;
				}
				
			}
			getMode(bag, attribute);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets Arm Strength Mode
	public void armsMode(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[9];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String arms = b[9];
					double armsDouble = Double.parseDouble(arms);
					bag.add(armsDouble);
					
					count++;
				}
				
			}
			getMode(bag, attribute);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Gets NFL-grade MODE
	public void nflGradeMode(){
		List<Double> bag = new ArrayList<>();
		double sumOfFortyyd =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[25];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				
				String nflgrade = b[25];
				double nflgradeDouble = Double.parseDouble(nflgrade);
				if(line.contains("QB") && nflgradeDouble > 0){
				    bag.add(nflgradeDouble);
					count++;
				}
				
			}
			getMode(bag, attribute);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//Gets bench Median
	public void benchMode(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[18];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String bench = b[18];
			    double benchDouble = Double.parseDouble(bench);
			    
				if(line.contains("QB") && benchDouble > 0){

					bag.add(benchDouble);
					count++;
				}
				
			}
			getMode(bag, attribute);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//Get Mode for all Attributes, Pprevents re-writing this in each method 
	public void getMode(List<Double> bag, String attribute ){
		double bagValue=0;
		double mostOccured=0;
		int maxCount=0;
		int occurrences=0;
		int index=0;
		
		Collections.sort(bag);
		for(double xs: bag){
			bagValue= bag.get(index);
			occurrences = Collections.frequency(bag, bagValue);
			if(occurrences > maxCount){
				maxCount = occurrences;
				mostOccured = bag.get(index);
			}
			index++;
		}
		occurrences = Collections.frequency(bag, mostOccured);
		
		//System.out.println(bag);
		System.out.println("Mode "+ attribute +": " +mostOccured + "    Occurrences: " +occurrences);
	}
}
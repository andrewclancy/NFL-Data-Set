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
	private static final String csvFile = "C:/Users/andrew/git/NFL-Data-Set/QB.csv";
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
				//System.out.println(line);
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
		fortyydMean();
		verticalMean();
		nflGradeMean();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("             MEDIAN Analysis               ");
		System.out.println("-------------------------------------------");
		heightMedian();
		weightMedian();
		fortyydMedian();
		virticalMedian();
		nflGradeMedian();
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("              MODE Analysis                ");
		System.out.println("-------------------------------------------");
		heightMode();
		weightMode();
		fortyydMode();
		virticalMode();	
		nflGradeMode();
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
					String heightInches = b[3];
					double heightInchesDouble = Double.parseDouble(heightInches);
					
					sumOfHeight = sumOfHeight + heightInchesDouble;
					count++;
				}
				
			}
			average = sumOfHeight/count;
			System.out.println("average heightinchestotal: " + average);
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
					String weight = b[4];
					double weightDouble = Double.parseDouble(weight);
					
					sumOfWeight = sumOfWeight + weightDouble;
					count++;
				}
				
			}
			average = sumOfWeight/count;
			System.out.println("average weight: " + average);
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
					String fortyYd = b[5];
					double fortyYdDouble = Double.parseDouble(fortyYd);
					sumOfFortyyd = sumOfFortyyd + fortyYdDouble;
					count++;
				}
				
			}
			average = sumOfFortyyd/count;
			System.out.println("average fortyyd: " + average);
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
				String nflgrade = b[11];
			    double nflgradeDouble = Double.parseDouble(nflgrade);
			    
				if(line.contains("QB") && nflgradeDouble > 0){
				    sumOfGrade = sumOfGrade + nflgradeDouble;
					count++;
				}
				
			}
			average = sumOfGrade/count;
			System.out.println("average nflgrade: " + average);
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
	
	//Gets vertical Mean
	public void verticalMean(){
		double sumOfvirtical =0;
		double average=0;
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String vertical = b[7];
			    double verticalDouble = Double.parseDouble(vertical);
			    
			    if(line.contains("QB") && verticalDouble > 0){
			    	sumOfvirtical = sumOfvirtical + verticalDouble;
			    	count++;
				}
				
			}
			average = sumOfvirtical/count;
			System.out.println("average vertical: " + average);
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
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[3];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String heightInches = b[3];
					double heightInchesDouble = Double.parseDouble(heightInches);
					bag.add(heightInchesDouble);
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
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[4];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String weight = b[4];
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
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int count=0;
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[5];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String fortyYd = b[5];
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
			String attribute = a[11];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String nflgrade = b[11];
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
	
	//Gets vertical Median
	public void virticalMedian(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[7];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String virtical = b[7];
			    double virticalDouble = Double.parseDouble(virtical);
			    
			    if(line.contains("QB") && virticalDouble > 0){
					bag.add(virticalDouble);
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
			String attribute = a[5];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String fortyYd = b[5];
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
		try {
			br = new BufferedReader(new FileReader(csvFile));

			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[3];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String heightInches = b[3];
				    double heightInchesDouble = Double.parseDouble(heightInches);
					bag.add(heightInchesDouble);	
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
			String attribute = a[4];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				if(line.contains("QB")){
					String weight = b[4];
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
			String attribute = a[11];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				
				String nflgrade = b[11];
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
	
	//Gets virtical Mode
	public void virticalMode(){
		List<Double> bag = new ArrayList<>();
		int count=0;
		try {
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			String[] a = line.split(splitBy);
			String attribute = a[7];
			while ((line = br.readLine()) != null) {	
				String[] b = line.split(splitBy);
				String virtical = b[7];
			    double virticalDouble = Double.parseDouble(virtical);
			    
				if(line.contains("QB") && virticalDouble > 0){
					bag.add(virticalDouble);
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
	
	//Get Mode for all Attributes, prevents re-writing this in each method 
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class showProducts {
	
	private static int i, lineCounterForID = 0, lineCounterForName = 0, lineCounterForCategory = 0, lineCounterForSupplier = 0, lineCounterForQuantity = 0, lineCounterForPrice = 0;
	private static String [] nameArray = new String [500];
	private static String [] categoryArray = new String [500];
	private static String [] supplierArray = new String [500];
	
	private static product [] productInfo = new product[500];
	
	private static File fileID = new File("productID.txt");
	private static File fileName = new File("productName.txt");
	private static File fileCategory = new File("productCategory.txt");
	private static File fileSupplier = new File("supplierName.txt");
	private static File fileQuantity = new File("productQuantity.txt");
	private static File filePrice = new File("productPrice.txt");
	
	private static String [] id = new String[500];
	private static String [] name = new String[500];
	private static String [] category = new String[500];
	private static String [] supplier = new String[500];
	private static int [] quantity = new int[500];
	private static double [] price = new double[500];
	
	public showProducts() throws IOException {
		
		Scanner scanLineForFileID = new Scanner(fileID);
		Scanner scanLineForFileName = new Scanner(fileName);
		Scanner scanLineForFileCategory = new Scanner(fileCategory);
		Scanner scanLineForFileSupplier = new Scanner(fileSupplier);
		Scanner scanLineForFileQuantity = new Scanner(fileQuantity);
		Scanner scanLineForFilePrice = new Scanner(filePrice);
		
		while(scanLineForFileID.hasNextLine()) {
			lineCounterForID ++;
			scanLineForFileID.next();
		}
		
		//Counts the number of lines from productName and keeps it in "lineCounterForFileName".
		while(scanLineForFileName.hasNextLine()) {
			lineCounterForName ++;
			scanLineForFileName.next();
			
		}
		
		//Counts the number of lines from Words-hard and keeps it in "lineCounterForHard".
		while(scanLineForFileCategory.hasNextLine()) {
			lineCounterForCategory ++;
			scanLineForFileCategory.next();
		}
		
		//Counts the number of lines from Words-hard and keeps it in "lineCounterForHard".
		while(scanLineForFileSupplier.hasNextLine()) {
			lineCounterForSupplier ++;
			scanLineForFileSupplier.next();
		}
		
		//Counts the number of lines from Words-hard and keeps it in "lineCounterForHard".
		while(scanLineForFileQuantity.hasNextLine()) {
			lineCounterForQuantity ++;
			scanLineForFileQuantity.next();
		}
		
		//Counts the number of lines from Words-hard and keeps it in "lineCounterForHard".
		while(scanLineForFilePrice.hasNextLine()) {
			lineCounterForPrice ++;
			scanLineForFilePrice.next();
		}
		
		//Keeps the IDs in a array to be used in the custom variable.
		for(i=0; i<lineCounterForID; i++) {
					
			String ID = Files.readAllLines(Paths.get("productID.txt")).get(i);
			id[i] = ID;
	
		}
		
		//An error occurred due to having spaces in between words. So I used this code at 81 to check.
		//System.out.println(lineCounterForName);
		
		//Keeps the words in a array to be used in the custom variable for the Words-EZ.txt.
		for(i=0; i<lineCounterForName; i++) {
			
			String Name = Files.readAllLines(Paths.get("productName.txt")).get(i);
			name[i] = Name;
			
		}
		
		//Keeps the words in a array to be used in the custom variable Words-Hard.txt.
		for(i=0; i<lineCounterForCategory; i++) {
			
			String Category = Files.readAllLines(Paths.get("productCategory.txt")).get(i);
			category[i] = Category;
			
		}
		
		//Keeps the words in a array to be used in the custom variable Words-Hard.txt.
		for(i=0; i<lineCounterForSupplier; i++) {
			
			String Supplier = Files.readAllLines(Paths.get("supplierName.txt")).get(i);
			supplier[i] = Supplier;
			
		}
		
		//Keeps the words in a array to be used in the custom variable Words-Hard.txt.
		for(i=0; i<lineCounterForQuantity; i++) {
			
			String Quantity = Files.readAllLines(Paths.get("productquantity.txt")).get(i);
			quantity[i] = Integer.parseInt(Quantity);
			
		}
		
		//Keeps the words in a array to be used in the custom variable Words-Hard.txt.
		for(i=0; i<lineCounterForPrice; i++) {
			
			String Price = Files.readAllLines(Paths.get("productPrice.txt")).get(i);
			price[i] = Double.parseDouble(Price);
			
		}
		
		//Puts the IDs and words in an object of a custom datatype so that every word can have an individual id. 
		for(i=0; i<lineCounterForID; i++) {
			
			productInfo[i] = new product(id[i], name[i], category[i], supplier[i], quantity[i], price[i]);
			System.out.println(printProducts());
			
		}
		
	}
	
	private String printProducts() {
		
		return id[i] + "   " + name[i] + "   " + category[i] + "   " + supplier[i] + "   " + quantity[i] + "   " + price[i];
		
	}

}

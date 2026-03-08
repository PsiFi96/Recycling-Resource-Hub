package menu;
import java.util.Scanner;



public class ResourceHub {

 

 public static void main(String[] args) {

 Scanner scnr = new Scanner(System.in);

 int choice;

 

 // Main Menu Loop (one down! 2 to go)

 do {

 displayMenu();

 choice = scnr.nextInt();

 

 handleChoice(choice, scnr);

 

 } while (choice != 6);

 

 scnr.close();

 }

 

 // Displays the main menu

 public static void displayMenu() {

 System.out.println("\nRECYCLING RESOURCES (java)");

 System.out.println("1. Learn What Can Be Recycled");

 System.out.println("2. Find Local Recycling Centers");

 System.out.println("3. Track Your Recycling Habits");

 System.out.println("4. Recycling Tips & Education");

 System.out.println("5. Recycling Impact Calculator");

 System.out.println("6. Exit");

 System.out.print("Enter your choice: ");

 }

 

 // Routes user selection

 public static void handleChoice(int choice, Scanner scnr) {

 

 switch (choice) {

 

 case 1:

 recyclableMaterials();

 break;

 

 case 2:

 recyclingCenters(scnr);

 break;

 

 case 3:

 trackRecyclingHabits(scnr);

 break;

 

 case 4:

 recyclingEducation();

 break;

 

 case 5:

 recyclingImpactCalculator(scnr);

 break;

 

 case 6:

 exitProgram();

 break;

 

 default:

 System.out.println("Invalid. Choose a listed number");

 }

 }

 

 // FEATURE PLACEHOLDERS, Feel free to alter to your liking/exact desired feature, I tried to be general with these but set up ones that obviously lead into our required 'complex' features

 // do as you wish when it comes to files and stuff, I didn't set anything up but you guys can if you'd like

 

 // Feature 1 (Probably just return text to the user)

 public static void recyclableMaterials() {

 System.out.println("\nLearn What Can Be Recycled selected.");

 String[] accept = {"Plastic bottles, Cups & Containers", "Emptied Alluminum cans", "Paper & Paper Cups", "Glass Bottles & Containers", "Flattened Cardboard & Paperboard"};

 String[] reject = {"Batteries", "Power Tools", "Flamable or Hazardous Waste", "Foam Cups, Containers or Straws", "Food or Liquids", "Clothing, Furniture or Carpet", "Loose Plastic Bags", "Green Waste"};

 

 //Concept used: Iteration using for-loops

 System.out.print("\nYES, Recycle These:\n");

 for (String item : accept) {

	 System.out.println("+ " + item); 

 }
 
 try {
     Thread.sleep(4000);
 } catch (InterruptedException e) {
	 System.out.println("Load Error Found");
 }

 System.out.print("\nNO, Don't Recycle These (Trash Them):\n");

 for (String item : reject) {

	 System.out.println("x " + item);

 }
 
 //Pause before returning
 try {
     Thread.sleep(4500);
 } catch (InterruptedException e) {
	 System.out.println("Load Error Found");
 }

 System.out.println("\n------ Returning To Main Menu -----\n"); // Just to let the user know they are going to be redirected to the Main Menu

 }

 

 

 // Feature 2 (Text return)

 public static void recyclingCenters(Scanner scnr) {

 System.out.println("\nFind Local Recycling Centers selected.");

 System.out.print("Enter your material type (Plastic, Metal, or Paper): ");

 String type = scnr.next().toLowerCase();

 

 // Concept used: Branching (Conditional Logic)

 if (type.equals("plastic")) {

	 System.out.println("\nCenter Found: 'Everett Recycling Hub' - 123 Eco St.");

 } else if (type.equals("metal")) {

 	System.out.println("\nCenter Found: 'Lynnwood Recycling Solutions' - 321 Iron Way.");

 } else if (type.equals("paper")) {

	 System.out.println("\nCenter Found: 'Factoria Recycling Warehouse' - 268 Treestop Ave.");

 } else {

	 System.out.println("\n Sorry! No specific center found for '" + type + "'. Try the General City Dump.");

 }

 //Pause before returning
 try {
     Thread.sleep(2000);
 } catch (InterruptedException e) {
	 System.out.println("Load Error Found");
 }

 System.out.println("\n------ Returning To Main Menu -----\n");

 }

 

 // Feature 3 (Array feature)

 public static void trackRecyclingHabits(Scanner scnr) {

 System.out.println("\nTrack Your Recycling Habits selected.");

//Concept used: Primitive Array (Data Structure)
int[] weeklyLog = new int[7]; //Here we are creating a array list of type int with 7 slots exactly for each day of the week
int totalItems = 0; //And here we're just initializing the variable totalItems to 0 to start accumulating the amount of recycled items

// Concept used: Traditional For-Loop (Iteration)
for (int i = 0; i < weeklyLog.length; i++) {
	System.out.print("Enter the number items recycled on day " + (i + 1) + ": ");
	weeklyLog[i] = scnr.nextInt();
	totalItems += weeklyLog[i]; // Accumulating the sum
}

	System.out.println("\n---------- Weekly Report ----------");
	System.out.println("\nTotal items recycled: " + totalItems);

// Concept used: Simple Arithmetic & Branching
if (totalItems > 20) {
	System.out.println("Status: Great job! Recycling Superstar!");
} else {
	System.out.println("Status: Good start! Keep it up!.");
}

//Pause before returning
try {
    Thread.sleep(2500);
} catch (InterruptedException e) {
	 System.out.println("Load Error Found");
}

System.out.println("\n------ Returning To Main Menu -----\n");

 }

 

 // Feature 4 (return text)

 public static void recyclingEducation() {

 System.out.println("\nRecycling Tips & Education selected.");

 System.out.println("\n------ Tips to Improve Recycling -----\\n");
 
 System.out.println("1. Make sure the item is clean and dry, food waste can contanimate entire loads!"
 		+ "\n2. Don't recycle materials that are mixed, as they cannot be sorted properly."
 		+ "\n3. Be certain what your recycling is actually recyclable, as sorting takes a lot of time and failure can contanimate loads!"
 		+ "\n4. Consider composting as well! Composting can help to turn food and paper waste into soil and is extremely beneficial!"
 		+ "\n5. Find recycling opportunities for specific items like electronics and batteries, the more that can be reused the better!");
 
 System.out.println("\nFor Further Tips, Check Out These Sites:"
		 + "\nhttps://www.recycleacrossamerica.org/tips-to-recycle-right"
		 + "\nhttps://www.earthday.org/7-tips-to-recycle-better/"
		 + "\nhttps://kingcounty.gov/en/dept/dnrp/waste-services/garbage-recycling-compost/services/recycling/how-to-recycle-right");
 
 //Pause before returning
 try {
     Thread.sleep(6000);
 } catch (InterruptedException e) {
	 System.out.println("Load Error Found");
 }
 
 System.out.println("\n------ Returning To Main Menu -----\n");
 
 }

 

 // Feature 5 (Calculation required, maybe prompt them for some recycling facts and then do a calculation to determine how much they're helping)

 public static void recyclingImpactCalculator(Scanner scnr) {

 System.out.println("\nRecycling Impact Calculator selected.");

 double energySaved = 0; //this is measured in kWh
 
 //Series of questions and variables stored based on response
 System.out.println("How many plastic bottles have you recycled this week?");
 int bottlesRecycled = scnr.nextInt();
 energySaved += bottlesRecycled*0.1;
 System.out.println("How many aluminum cans have you recycled this week?");
 int cansRecycled = scnr.nextInt();
 energySaved += cansRecycled*0.3;
 System.out.println("How many pieces of paper have you recycled this week?");
 int paperRecycled = scnr.nextInt();
 energySaved += paperRecycled*0.01;
 
 //Calculate the amount of lightbulbs saved, received as an int
 int lightbulbsPowered = 0;
 lightbulbsPowered = (int)(energySaved/0.1);
 
 //Variables stored from previous questions used in printf statements 
 System.out.printf("\nThis week you recycled %d plastic bottles, %d aluminum cans, and %d pieces of paper! Great work!", bottlesRecycled, cansRecycled, paperRecycled);
 
 System.out.printf("\nBy doing this, you've saved enough energy to power %d 100-watt lightbulbs for an hour, which is %5.0f watts!", lightbulbsPowered, energySaved*1000);
 
 //Branch that congratulates user based on calculated energy saved
 if(energySaved >= 57.6) {
	 System.out.println("You can even power a dishwasher for a day! Phenomenal work!");
 }
 if(energySaved >= 36) {
	 System.out.println("You can even power an air conditioner for a day! Very cool!");
 }
 else if(energySaved >= 9.6) {
	 System.out.println("You can even power a washing machine for a day! Nice!");
 }
 else {
	 System.out.println("Keep up the great work!");
 }
 
 //Pause before returning
 try {
     Thread.sleep(6000);
 } catch (InterruptedException e) {
	 System.out.println("Load Error Found");
 }
 
 System.out.println("\n------ Returning To Main Menu -----\n");
 
 
 }

 

 // Feature 6

 public static void exitProgram() {

 System.out.println("\nThank you for using our Recycling informatic!");

 }

}
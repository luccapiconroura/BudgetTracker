package application;

import java.util.*;

public class BudgetTracker {
	 public static void main(String[] args) {
	    final List<String> expenseDescriptionList = new ArrayList<String>();
	    final List<String> expenseAmountList = new ArrayList<String>();
     	final List<String> expenseDateList = new ArrayList<String>();
     	
     	final List<String> incomeDescriptionList = new ArrayList<String>();	
	    final List<String> incomeAmountList = new ArrayList<String>();
     	final List<String> incomeDateList = new ArrayList<String>();
     	
     	final List<String> investmentDescriptionList = new ArrayList<String>();
     	final List<String> investmentAmountList = new ArrayList <String>();
     	final List<String> investmentRateList = new ArrayList <String>();
     	
     	final List<String> recurringCostDescriptionList = new ArrayList<String>();
     	final List<String> recurringCostAmountList = new ArrayList<String>();

	     System.out.println("Welcome to our Budget Tracker!\n"
	        		+ "\nWant to be more conscious of your budget? You've come to the right place!\n"
	        		+ "\nThis is a program that will ask you to input your expenses, income, and recurring costs "
	        		+ "you have on a monthly basis.\n"
	        		+ "\nOnce you have done so, you can then ask it to calculate your net income.\n\n"
	        		+ "--------------------------------------------------------------------------------------------------"
	        		+ "--------------------------------------------------------------------------------------------------");
	        Scanner input = new Scanner(System.in);
	        BudgetTracker track = new BudgetTracker();
	       
	        
	        System.out.println("\nReady to begin? 1 for yes, 0 for no");
	        int begin = input.nextInt();
	        if (begin == 1) {
	        	boolean startGame = true;
	        	System.out.println("What's your goal profit by the end of the month?");
	        	double incomeGoal = input.nextDouble();
	        
	        while (startGame == true) {

	            System.out.println("Click one of the corresponding numbers to continue or 0 to exit: ");
	            System.out.println("1) Add an expense.");
	            System.out.println("2) Add an income.");
	            System.out.println("3) Add a recurring cost.");
	            System.out.println("4) Add investment");
	            System.out.println("5) What's my net total?");

	            int choice = input.nextInt();
	            input.nextLine();
	            if (choice == 1) {
	            	System.out.println("What's the expense for?");  
	            	String expenseDescription = input.nextLine();
	            	expenseDescriptionList.add(expenseDescription);
                    System.out.println("What's the date of the expense? Answer in MM/DD/YYYY format.");
                    String expenseDate = input.nextLine();
                    expenseDateList.add(expenseDate);
                    System.out.println("What's the amount of the expense?");
                    double expenseAmount = input.nextDouble();
                    String expenseAmountString = expenseAmount+"";
                    expenseAmountList.add(expenseAmountString);
                    	if(expenseAmount >= 100 && expenseAmount < 250) {
                    		System.out.println("\nWhoa, that a pretty significant expense.");
                    	} else if (expenseAmount >= 250 && expenseAmount < 500) {
                    		System.out.println("\nThat's a considerable amount!");
                    	} else if (expenseAmount >= 500 && expenseAmount < 1000) {
                    		System.out.println("/nThat's a lot!");
                    	} else if(expenseAmount >= 1000 && expenseAmount < 2500) {
                    		System.out.println("\nYeowch! That's a hefty expense!");
                    	} else if (expenseAmount >= 2500) {
                    		System.out.println("\nOh my goodness!");
                    	}
                    	
                    
                    track.addExpense(new Expense(expenseDescription, expenseAmount, expenseDate));
                    track.addExpenseName(new Expense(expenseDescription, expenseAmount, expenseDate));
                    track.addExpenseDate(new Expense(expenseDescription, expenseAmount, expenseDate));
	            } else if (choice == 2){
	            	System.out.println("What's the source of the income?");
	            	String incomeSource = input.nextLine();
	            	incomeDescriptionList.add(incomeSource);
                    System.out.println("What's the date of the income? Answer in MM/DD/YYYY format.");
                    String incomeDate = input.nextLine();
                    incomeDateList.add(incomeDate);
                    System.out.println("What's the amount of the income?");
                    double incomeAmount = input.nextDouble();
                    String incomeAmountString = incomeAmount+"";
                    incomeAmountList.add(incomeAmountString);
                    	if(incomeAmount >= 5 && incomeAmount < 1000) {
                    		System.out.println("\nHey that's pretty good!");
                            double awayFromGoal = incomeGoal - track.getTotalIncome();
                            System.out.println("You are $" + awayFromGoal + " away from your goal!");
                    	} else if (incomeAmount >= 1000&& incomeAmount < 2000) {
                    		System.out.println("\nThat's a considerable amount!");
                    		double awayFromGoal = incomeGoal - track.getTotalIncome();
                    		System.out.println("You are $" + awayFromGoal + " away from your goal!");
                    	} else if (incomeAmount >= 2000&& incomeAmount < 5000) {
                    		System.out.println("\nThat's a lot!");
                            double awayFromGoal = incomeGoal - track.getTotalIncome();
                            System.out.println("You are $" + awayFromGoal + " away from your goal!");
                    	} else if(incomeAmount >= 5000&& incomeAmount < 10000) {
                    		System.out.println("\nWowzers!");
                            double awayFromGoal = incomeGoal - track.getTotalIncome();
                            System.out.println("You are $" + awayFromGoal + " away from your goal!");
                    	} else if (incomeAmount >= 10000&& incomeAmount < 25000) {
                    		System.out.println("\nThat's amazing!!");
                    		System.out.println("Holy cow! That's a lot of money!");
                            double awayFromGoal = incomeGoal - track.getTotalIncome();
                            System.out.println("You are $" + awayFromGoal + " away from your goal!");
                    	}                   

                    track.addIncome(new Income(incomeSource, incomeAmount, incomeDate));

	            } else if (choice == 3) {
	            	System.out.println("What's the description of the recurring cost?");
	            	String recurringCostDescription = input.nextLine();
	            	recurringCostDescriptionList.add(recurringCostDescription);
                    System.out.println("What's the amount of the recurring cost?");
                    double recurringCostAmount = input.nextDouble();
                    String recurringCostAmountString = recurringCostAmount + "";
                    recurringCostAmountList.add(recurringCostAmountString);
                    System.out.println("How often does it recur? Enter in number of days.");
                    int frequencyInDays = input.nextInt();
                    System.out.println("What's the date of the expense? Answer in MM/DD/YYYY format.");
                    String expenseDate = input.nextLine();
                    expenseDateList.add(expenseDate);
                    track.addRecurringCost(new RecurringCost(recurringCostDescription, recurringCostAmount,expenseDate,
                    		frequencyInDays));
                    track.addExpenseName(new RecurringCost(recurringCostDescription, recurringCostAmount, expenseDate,
                    		frequencyInDays));
	            } else if (choice == 4) {
	            	System.out.println("What's the description of your investment?");
	            	String investmentDescription = input.nextLine();
	            	investmentDescriptionList.add(investmentDescription);
	            	System.out.println("What's the amount on the investment?");
	            	double investmentAmount = input.nextDouble();
	            	String investmentAmountString = investmentAmount + "";
	            	investmentAmountList.add(investmentAmountString);
	            	System.out.println("What's the expected return rate (rate of interest)?");
	            	double investmentRate = input.nextDouble();
	            	String investmentRateString = investmentRate + ""; 
	            	investmentRateList.add(investmentRateString);
	            	
	            } else if (choice == 5) {
	            	System.out.println("Here's the net amount: $" + track.getNetAmount());
	        
	            } else if (choice == 0){
	            	startGame = false;
	            }
	            	else {
		            System.out.println("Invalid choice :(");
	            }

	            }
	        
	        
	        
	        
	        System.out.println("Are you interested to see the totals of your expenses and/or income? Y for yes, N for no");
	        String response = input.nextLine();
	        if (response.equalsIgnoreCase("Y"))  {
	        	System.out.println("Would you like to see your expenses, income, or both?");
	        	String response1 = input.nextLine();
	        	if (response1.contains("p")) {
	        		System.out.println("Total of your expenses: $" + track.getTotalExpense());
	        	} else if (response1.contains("m")) {
	        		System.out.println("Total of your income: $" + track.getTotalIncome());
	        	} else {
	        		System.out.println("Total expenses: $" + track.getTotalExpense());
	        		System.out.println("Total income: $" + track.getTotalIncome());
	        	}
	        	
	        }
	        
	        System.out.println("Would you like to see the expected return for your investments by the end of the month? Y for yes, N for no");
	        String investmentResponse = input.nextLine();
	        if (investmentResponse.equalsIgnoreCase("Y")) {
	        	System.out.println("\n--------------------------------------------------------------------"
	        		+ "-------------------------------------------------------------------------------");
	        	System.out.println("\nDisplaying investment information!");
	        	System.out.println("\n--------------------------------------------------------------------"
	        		+ "-------------------------------------------------------------------------------");
	        	System.out.println("Description \tAmount \t\tROI \tExpected Return");
	        		for (int i = 0; i < investmentRateList.size(); i++) {
	        			String curDesc = investmentDescriptionList.get(i);
	        		
	        			String curAmount = investmentAmountList.get(i);
	        			double curAmountDouble = Double.parseDouble(curAmount);
	        		
	        			String curRate = investmentRateList.get(i);
	        			double curRateDouble = Double.parseDouble(curRate);
	        			double actualCurRateDouble = curRateDouble * .01;
	        		
	        			double expectedAmount = curAmountDouble * actualCurRateDouble;
	        		
	        			System.out.println(curDesc + "\t\t" + curAmount + "\t\t" + curRate + "\t\t" + expectedAmount);
	        			
	        			}
	        	}
	        
	        
	        System.out.println("Interested to see a list of your expenses with corresponding dates? Y for yes, N for no");
	        String expenseListResponse = input.nextLine();
	        if (expenseListResponse.equalsIgnoreCase("Y")) {
	        	System.out.println("\n--------------------------------------------------------------------"
		        		+ "-------------------------------------------------------------------------------");
	        	System.out.println("\nDisplaying expense and date information!");
	        	System.out.println("\n-------------------------------------------------------------------"
	        			+ "-------------------------------------------------------------------------------");
	        	System.out.println("Expense \t Date");
	        	for(int i = 0; i < expenseDescriptionList.size(); i++) {
	        		System.out.println(expenseDescriptionList.get(i) + "\t\t" + expenseDateList.get(i));
	        		System.out.println();
	        		System.out.println();
	        	}

	        }
	        
	        System.out.println("Interested to see a list of your income with corresponding dates? Y for yes, N for no");
	        String incomeListResponse = input.nextLine();
	        
	        if (incomeListResponse.equalsIgnoreCase("Y")) {
	        	System.out.println("\n--------------------------------------------------------------------"
		        		+ "-------------------------------------------------------------------------------");
	        	System.out.println("\nDisplaying income and date information!");
	        	System.out.println("\n-------------------------------------------------------------------"
	        			+ "-------------------------------------------------------------------------------");
	        	System.out.println("Income \t\t Date");
	        	for(int i = 0; i < incomeDescriptionList.size(); i++) {
	        		System.out.println((incomeDescriptionList.get(i) + "\t\t" + incomeDateList.get(i)));
	        		System.out.println();
	        	}
	        }


	        System.out.println("Type 'data' or 'spreadsheet' to see a formatted spreadsheet of your data! Press any key to skip!");
	        String spreadsheetResponse = input.nextLine();
	        if (spreadsheetResponse.equalsIgnoreCase("data")||spreadsheetResponse.equalsIgnoreCase("spreadsheet")) {
	        	final Object[][] expenseTable = new String[expenseAmountList.size()][];
	        		for (int i = 0; i < expenseAmountList.size(); i++) {
	        			expenseTable[i] = new String [] {expenseDescriptionList.get(i), expenseAmountList.get(i),
	        					expenseDateList.get(i)};
	        		} 
		        	System.out.println("---------------------------------------------------------------------------------"
		        			+ "------------------------------------------------------------------------------------------");
		        	System.out.println("Displaying list of expenses...");
		        	System.out.println("---------------------------------------------------------------------------------"
		        			+ "------------------------------------------------------------------------------------------");
		        	System.out.println("\tExpense \t Price \t Date");
		        	for(final Object[] row : expenseTable) {
		        		System.out.format("%15s%15s%15s%n", row);

	        	 }
		        
		        final Object[][] incomeTable = new String[incomeAmountList.size()][];
	        		for (int i = 0; i < incomeAmountList.size(); i++) {
	        			incomeTable[i] = new String [] {incomeDescriptionList.get(i), incomeAmountList.get(i),
	       					incomeDateList.get(i)};
	        		}
			       	System.out.println("---------------------------------------------------------------------------------"
		        			+ "------------------------------------------------------------------------------------------");
		        	System.out.println("Displaying list of income...");
		        	System.out.println("---------------------------------------------------------------------------------"
			       			+ "------------------------------------------------------------------------------------------");
			       	System.out.println("\tIncome \t\t Price \t\t Date");
		       	for(final Object[] row : incomeTable) {
		       		System.out.format("%15s%15s%15s%n", row);

	        	 }
		        
		        	
	        	} else {
	        		System.out.println();
	        	}
	        	
	        }
	     
	        
	        System.out.println("\nBefore you go, would you like to know some recommended ways to invest your money? "
	        		+ "\n\nClick Y for yes or any other key to leave!");
	        String lastQuestion = input.nextLine();
	        if (lastQuestion.equalsIgnoreCase("Y")) {
	        	System.out.println("\n Here are the most recommended ways to invest your money: ");
	        	System.out.println(" - High-yield savings accounts");
	        	System.out.println(" - Certificates of deposit");
	        	System.out.println(" - Bonds");
	        	System.out.println(" - Funds");
	        	System.out.println(" - Stocks");
	        	System.out.println(" - Real estate");
	        } else {
	        	System.out.println("We hope this was helpful! Have a great day :)");
	        }
	        
	        input.close();
	 
	 }

	  
	 

//--------------------------------------------end of main--------------------------------------------------------//
	 
	//calculations and other necessary methods
	 
    public BudgetTracker() {
        this.expenses = new ArrayList<>();
        this.incomes = new ArrayList<>();
        this.recurringCosts = new ArrayList<>();
        this.expenseNames = new ArrayList<>();
        this.incomeNames = new ArrayList<>();
        this.expenseDateList = new ArrayList<>();
        this.incomeDateList = new ArrayList<>();
        this.incomeAmountList = new ArrayList<>();
        this.expenseAmountList = new ArrayList<>();
    }

 // expenses modifications and methods
    
    private ArrayList<Expense> expenses;
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
    private ArrayList<Expense> expenseAmountList;
    public void addExpenseAmount (Expense expense) {
    	expenseAmountList.add(expense);
    }
    
    private ArrayList<RecurringCost> recurringCosts;
    public void addRecurringCost(RecurringCost cost) {
        recurringCosts.add(cost);
    }
    
    private ArrayList<Expense> expenseNames;
    public void addExpenseName(Expense expenseDescription) {
    	expenseNames.add(expenseDescription);
    }
    
    private ArrayList<Expense> expenseDateList;
    public void addExpenseDate (Expense expenseDate) {
    	expenseDateList.add(expenseDate);
    }
    
    private double getTotalExpense() {
   	 double expenseTotal = 0;
   	 int i = 0;
   	 while (i < expenses.size()) {
   		 expenseTotal += expenses.get(i).getExpenseAmount();
   		 i++;
   	 }
   	 return expenseTotal;
   }
    
    
    
    
 //income modifications and methods
    private ArrayList<Income> incomes;
    public void addIncome(Income income) {
        incomes.add(income);
    }
    
    private ArrayList<Income> incomeAmountList;
    public void addIncomeAmount (Income income) {
    	incomeAmountList.add(income);
    }
    
    private ArrayList<Income> incomeNames;
    public void addIncomeName(Income incomeDescription) {
    	incomeNames.add(incomeDescription);
    }
    
    private ArrayList<Income> incomeDateList;
    public void addIncomeDate (Income incomeDate) {
    	incomeDateList.add(incomeDate);
    }

    private double getTotalIncome() {
        double incomeTotal = 0;
        int i = 0;
        while(i < incomes.size()) {
        	incomeTotal += incomes.get(i).getAmountOfIncome();
        	i++;
        }
        return incomeTotal;
    }

    
//net amount method
    protected double getNetAmount() {
        double totalRecurringCost = 0;
        int i = 0;
        while (i < recurringCosts.size()) {
        	totalRecurringCost += recurringCosts.get(i).getExpenseAmount();
        	i++;
        }
        double netAmount = getTotalIncome() - getTotalExpense() - totalRecurringCost;
        if (netAmount > 0) {
        	System.out.println("Nice! you're in the green!");
        } else if (netAmount < 0) {
        	System.out.println("Oops! Did you input everything correctly? You're in the red!");
        } else if (netAmount == 0) {
        	System.out.println("Holy moly! You're right on the edge!");
        }
        return netAmount;
    }
    
    
}     
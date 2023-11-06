package application;

public class Expense {
    private String expenseDescription;
    private String expenseDate;
    private double amountOfExpense;

    public Expense(String expenseDescription, double amountOfExpense, String expenseDate) {
        this.expenseDescription = expenseDescription;
        this.amountOfExpense = amountOfExpense;
        this.expenseDate = expenseDate;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }
    
    public String getExpenseDate() {
    	return expenseDate;
    }

    public double getExpenseAmount() {
        return amountOfExpense;
    }

    @Override
    public String toString() {
        return "Expense: " + expenseDescription + ", Amount: $" + amountOfExpense;
    }
}

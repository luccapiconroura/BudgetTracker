package application;

public class RecurringCost extends Expense {
    private int frequencyInDays;

    public RecurringCost(String expenseDescription, double amountOfExpense, String expenseDate, int frequencyInDays) {
        super(expenseDescription, amountOfExpense, expenseDate);
        this.frequencyInDays = frequencyInDays;
    }

    public int getFrequencyInDays() {
        return frequencyInDays;
    }

    @Override
    public String toString() {
        return super.toString() + ", Frequency: Every " + frequencyInDays + " days";
    }
}

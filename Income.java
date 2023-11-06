package application;

public class Income {
    private String sourceOfIncome;
    private double incomeAmount;
    private String incomeDate;

    public Income(String sourceOfIncome, double incomeAmount, String incomeDate) {
        this.sourceOfIncome = sourceOfIncome;
        this.incomeAmount = incomeAmount;
        this.incomeDate = incomeDate;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public double getAmountOfIncome() {
        return incomeAmount;
    }
    
    public String getIncomeDate () {
    	return incomeDate;
    }

    @Override
    public String toString() {
        return "Income: " + sourceOfIncome + ", Amount: $" + incomeAmount;
    }
}


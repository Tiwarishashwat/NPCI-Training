public class EMICalculator extends Loan
{
    private String loanType;
    private float income;
    private float expenses;
    private float amountEMI;
    private boolean existingEMI;

    String getLoanType(){
      return loanType
    }
    void setLoanType(String loanType)
    {
      this.loanType = loanType;
    }

    float getIncome(){
      return income;
    }
    void setIncome(float income)
    {
      this.income = income;
    }

    float getExpenses(){
      return expenses;
    }
    void setExpenses(float expenses)
    {
      this.expenses = expenses;
    }

    float getAmountEMI(){
      return amountEMI;
    }
    void setAmountEMI(float amountEMI)
    {
      this.amountEMI = amountEMI;
    }

    boolean getExistingEMI(){
      return existingEMI;
    }
    void setExistingEMI(float existingEMI)
    {
      this.existingEMI = existingEMI;
    }
}

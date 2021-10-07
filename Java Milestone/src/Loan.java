public class Loan
{
  private String name;
  private int age;
  private String incomeGroup;
  private float loanAmount;
  String getName()
  {
    return name;
  }
  void setName(String name)
  {
    this.name = name;
  }

  int getAge()
  {
    return age;
  }
  void setAge(int age)
  {
    this.age = age;
  }

  String getIncomeGroup()
  {
    return incomeGroup;
  }
  void setIncomeGroup(String incomeGroup)
  {
    this.incomeGroup = incomeGroup;
  }

  float getLoanAmount()
  {
    return loanAmount;
  }
  void setLoanAmount(float loanAmount)
  {
    this.loanAmount = loanAmount;
  }
}

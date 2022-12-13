import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

  public static void main(String[] args) throws Exception {
    Account acc = new Account(1001, "Mariana", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Atilla", 0.0, 500.0);

    //  UPCASTING
    //Porque que nao da erro quando eu faço um objeto da sub class ser atribuido a uma vareavel da super class?
    //uma conta empresarial tambem e uma conta como ela e uma conta eu posso muito bem atribuir um objeto do tipo
    //conta empresarial para um objeto tipo conta afinal conta empresarial e uma conta!
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWNCASTING e converter um objeto da super class para a sub class
    // eu nao posso converter de account para BusinessAccount nesse caso a converçao nao e natural
    // se eu quiser força a converçao da super class para a sub class eu tenho que fazer um cast manual!

    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.Loan(100.00);

    // BusinessAccount acc5 = (BusinessAccount)acc2;
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.Loan(200.0);
      System.out.println("Loan! ");
    }
    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update!");
    }
  }
}

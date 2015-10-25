package Bank;

/**
 * Created by IT_School on 25.10.2015.
 */
public class Bank {

    private String BigBank;

    public Bank(String bigBank) {
        BigBank = bigBank;
    }

   public class Account{
       private  long number;
       private  double balance;

       public Account(long number) {
           this.number = number;
       }

       public void  deposit(double summa){
           this.balance+=summa;
       }

       /*public boolean withdraw{
           if ()

               else


       }*/

       // дописать if else, cм. презентацию и вложенные файлы
   }





}

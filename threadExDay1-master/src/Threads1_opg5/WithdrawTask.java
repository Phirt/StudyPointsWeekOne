/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads1_opg5;

/**
 *
 * @author jekm
 */
public class WithdrawTask implements Runnable
{
  BankAccountUnsynchronized acc;
  public WithdrawTask(BankAccountUnsynchronized a)
  {
    acc = a;
  }
  public void run()
  {
    try
    {
      for (int i = 1 ;i< 30 ;i++ ) 
      {
        acc.withdraw(100);
        Thread.sleep(1);
      }
    }
   catch (InterruptedException e) {}
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Model;

/**
 *
 * @author Aryudha Wily
 */
public class Saldo {
    private static Saldo instanceSaldo;
    private int amount;
    
    private Saldo(){
        amount = 500000;
    };

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public static Saldo getInstance() {
        if (instanceSaldo == null) {
            instanceSaldo = new Saldo();
        }
        
        return instanceSaldo;
    }
}

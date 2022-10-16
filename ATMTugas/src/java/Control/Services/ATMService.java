/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Services;

import Control.Model.Saldo;
/**
 *
 * @author Aryudha Wily
 */
public class ATMService implements IATMService {
    
    private Saldo _saldo;

    public ATMService() {
        _saldo = Saldo.getInstance();
    }
    
    @Override
    public int getSaldo() {
        return _saldo.getAmount();
    }

    @Override
    public void tarikTunai(int jumlah) {
        _saldo.setAmount(jumlah);
    }

    @Override
    public void setorTunai(int jumlah) {
         _saldo.setAmount(jumlah);
    }


    
}
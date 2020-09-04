/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author FAIZAL
 */
public class Kalkulator implements Operasi{

    @Override
    public void Penjumlahan(int X, int Y) {
        int res = X + Y;
        System.out.println(X+" + "+Y+" = "+res);
    }

    @Override
    public void Pengurangan(int X, int Y) {
        int res = X - Y;
        System.out.println(X+" - "+Y+" = "+res);
    }
    
}

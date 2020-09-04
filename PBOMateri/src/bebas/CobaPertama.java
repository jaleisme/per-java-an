/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebas;

/**
 *
 * @author FAIZAL
 */
public class CobaPertama implements interfaceA{

    public void methodSatuA() {
        System.out.println("method pertama dari interface A");
    }

    @Override
    public String methodDuaA() {
       return atributA;
    }
    
    public static void main(String[] args){
        CobaPertama Object= new CobaPertama();
        Object.methodSatuA();
        String pesan = Object.methodDuaA();
        System.out.println(pesan);
    }
    
}

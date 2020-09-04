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
public class CobaKedua implements interfaceA{
    
    public void methodSatuA() {
        System.out.println("Isi method pertama dari interface A");
    }

    public String methodDuaA() {
        return atributA;
    }
    
    public void methodSatuB(){
        System.out.println("Isi Method pertama dari Interface B");
    }

    public void methodDuaB(){
        System.out.println("Isi Method kedua dari Interface B");
    }
    
    public static void main(String[] args){
        CobaKedua Object = new CobaKedua();
        Object.methodSatuA();
        String pesan = Object.methodDuaA();
        System.out.println(pesan);
        Object.methodSatuB();
        Object.methodDuaB();
    }
    
}

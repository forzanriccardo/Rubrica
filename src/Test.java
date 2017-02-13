/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riccardo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rubrica b = new Rubrica();

        b.insert("anna", "1122345678");
        b.insert("luca", "9876543210");
        b.insert("roberto", "3452568478");
        b.insert("anna", "1122345678");

        System.out.println(b.toString());
        System.out.println(b.find("anna"));
        System.out.println(b.isEmpty());

        b.remove("roberto");
        System.out.println(b.toString());
        b.makeEmpty();
        System.out.println(b.toString());
        System.out.println(b.isEmpty());

        //b.remove("carlo");
    }
}

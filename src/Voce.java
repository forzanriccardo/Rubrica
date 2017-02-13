/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riccardo
 */
public class Voce {

    private String nome;
    private String numero;

    /**
     * Costruttore parametrico completo
     *
     * @param nome: stringa contente nome contatto
     * @param numero: stringa contenente numero telefonico
     */
    public Voce(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    /**
     * Restutuisce il nome
     *
     * @return restituisce la stringa rappresentante il nome
     */
    public String getName() {
        return this.nome;
    }

    /**
     * Restutuisce il numero
     *
     * @return restituisce la stringa rappresentante il numero
     */
    public String getNumber() {
        return this.numero;
    }

    /**
     * Imposta un nuovo numero
     *
     * @param numero nuovo numero per l'oggetto
     */
    public void setNumber(String numero) {
        this.numero = numero;
    }

    @Override
    /**
     * Restituisce informazioni sull'oggetto in questione
     *
     * @return informazioni sull'oggetto in questione
     */
    public String toString() {
        return this.nome + " telefono: " + this.numero + "\n";
    }
}

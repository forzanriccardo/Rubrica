
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author riccardo
 */
public class Rubrica implements Dictionary {

    private ArrayList<Voce> elenco;

    /**
     * Costruttore vuoto
     */
    public Rubrica() {
        this.elenco = new ArrayList<>();
    }

    @Override
    /**
     * Controlla se la rubrica contiene elementi
     *
     * @return true se ne contiene, false altrimenti
     */
    public boolean isEmpty() {
        return this.elenco.isEmpty();
    }

    @Override
    /**
     * Effettua lo svuotamento della rubrica
     */
    public void makeEmpty() {
        this.elenco.clear();
    }

    @Override
    /**
     * Inserisce un elemento nel dizionario
     *
     * @param key oggetto passato utilizzato per il confronto
     * @param value oggetto passato da sovrascrivere all'originale
     * @throws IllegalArgumentException
    *
     */
    public void insert(Comparable key, Object value) throws IllegalArgumentException {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        boolean find = false;
        Voce tmp;
        for (int i = 0; i < this.elenco.size() && !find; i++) {
            tmp = this.elenco.get(i);
            if (tmp.getName().equals(key)) {
                find = true;
                tmp.setNumber((String) value);
            }//if
        }//for
        if (!find) {
            this.elenco.add(new Voce((String) key, (String) value));
        }
    }//insert

    @Override
    /**
     * Rimuove dal dizionario l'elemento specificato dalla chiave key
     *
     * @param key oggetto passato che identifica l'elemento da rimuovere
     * @throws DictionaryItemNotFoundException
     */
    public void remove(Comparable key) throws DictionaryItemNotFoundException {
        if (key == null) {
            throw new DictionaryItemNotFoundException();
        }
        boolean find = false;
        for (int i = 0; i < this.elenco.size() && !find; i++) {
            if (this.elenco.get(i).getName().equals(key)) {
                find = true;
                this.elenco.remove(i);
            }
        }
        if (!find) {
            throw new DictionaryItemNotFoundException();
        }
    }//remove

    @Override
    /**
     * Cerca nel dizionario l'elemento specificato dalla chiave key
     *
     * @param key oggetto rappresentante l'elemento che bisogna trovare
     * @return oggetto associato all'oggetto passato key
     * @throws DictionaryItemNotFoundException
     */
    public Object find(Comparable key) throws DictionaryItemNotFoundException {
        if (key == null) {
            throw new DictionaryItemNotFoundException();
        }
        boolean find = false;
        Voce tmp;
        for (int i = 0; i < this.elenco.size() && !find; i++) {
            tmp = this.elenco.get(i);
            if (tmp.getName().equals(key)) {
                find = true;
                return tmp.getNumber();
            }//if
        }//for
        if (!find) {
            throw new DictionaryItemNotFoundException();
        }
        return null;
    }

    /**
     * Restituisce informazioni sull'oggetto in questione
     *
     * @return informazioni sull'oggetto in questione
     */
    public String toString() {
        String vr = "";
        for (Voce tmp : this.elenco) {
            vr += tmp.toString();
        }
        return vr;
    }

}

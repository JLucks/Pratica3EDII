/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author Jorge
 */
public class Grafo {
    private int tam;
    private Vertice V[];
    private Aresta E[];

    /**
     * @return the tam
     */
    public int getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * @return the V
     */
    public Vertice[] getV() {
        return V;
    }

    /**
     * @param V the V to set
     */
    public void setV(Vertice[] V) {
        this.V = V;
    }

    /**
     * @return the E
     */
    public Aresta[] getE() {
        return E;
    }

    /**
     * @param E the E to set
     */
    public void setE(Aresta[] E) {
        this.E = E;
    }
}

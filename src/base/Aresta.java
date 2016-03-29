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
public class Aresta {
    private Vertice u;
    private Vertice v;
    private int peso;

    /**
     * @return the u
     */
    public Vertice getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(Vertice u) {
        this.u = u;
    }

    /**
     * @return the v
     */
    public Vertice getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Vertice v) {
        this.v = v;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author Daniel
 */
public class Aresta {
    private int a1;
    private int a2;
    private double peso;
    
    public Aresta(int a1, int a2, double peso){
        if (a1 < 0) throw new IndexOutOfBoundsException("O vertice precisa ser um inteiro não negativo");
        if (a2 < 0) throw new IndexOutOfBoundsException("O vertice precisa ser um inteiro não negativo");
        if (Double.isNaN(peso)) throw new IllegalArgumentException("Peso não é um numero");
        this.a1 = a1;
        this.a2 = a2;
        this.peso = peso;
    }
    
    public int de(){
        return a1;
    }
    
    public int para(){
        return a2;
    }
    
    public double getPeso(){
        return peso;
    }
}

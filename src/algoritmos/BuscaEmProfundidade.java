/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import base.Aresta;
import base.Grafo;
/**
 *
 * @author Daniel
 */
public class BuscaEmProfundidade {
    private boolean[] marcado;
    private int vertices[];
    private int cont;
    
    public BuscaEmProfundidade(Grafo G){
        marcado = new boolean[G.tam()];
        vertices = new int[G.tam()];
        for(int i = 0; i < G.tam(); i++)
            marcado[i] = false;
        for(int i = 0; i < G.tam(); i++)
            if(!marcado[i])
                bEmProfundiade(G,i);
    }
    
    private void bEmProfundiade(Grafo G, int v){
        vertices[cont] = v;
        cont++;
        marcado[v] = true;
        for(Aresta w : G.adj(v)){
            if(!marcado[w.para()]){
                bEmProfundiade(G, w.para());
            }
        }
    }
    
    public boolean marcado(int v){
        return marcado[v];
    }
    
    public int[] vertices(){
        return vertices;
    }
}

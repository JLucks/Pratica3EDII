/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import algoritmos.Grafo;
/**
 *
 * @author Daniel
 */
public class BuscaEmProfundidade {
    private boolean[] marcado;
    private int cont;
    
    public BuscaEmProfundidade(Grafo G, int v){
        marcado = new boolean[G.tam()];
        bEmProfundiade(G,v);
    }
    
    private void bEmProfundiade(Grafo G, int v){
        cont++;
        marcado[v] = true;
        for(int w : G.adj(v)){
            if(!marcado[w]){
                bEmProfundiade(G, w);
            }
        }
    }
    
    public boolean marcado(int v){
        return marcado[v];
    }
    
    public int cont(){
        return cont;
    }
}

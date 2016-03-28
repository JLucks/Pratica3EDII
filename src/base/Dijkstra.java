/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import algoritmos.Grafo;
import algoritmos.Aresta;
import algoritmos.ListaPrioridade;
import java.util.Stack;
/**
 *
 * @author Daniel
 */
public class Dijkstra {
    private double[] distancia;
    private Aresta[] adjacente;
    private ListaPrioridade<Double> lp;
    
    public Dijkstra(Grafo G, int v){
        //for(Aresta e : G.getAresta()){
        //    if(e.getPeso() < 0)
        //        throw new IllegalArgumentException("Aresta "+e+" possui peso negativo.");
        //}
        
        distancia = new double[G.tam()];
        adjacente = new Aresta[G.tam()];
        for(int i = 0; i < G.tam(); i++){
            distancia[i] = Double.POSITIVE_INFINITY;
        }
        distancia[v] = 0.0;
        
        lp = new ListaPrioridade<Double>(G.tam());
        lp.inserir(v, distancia(v));
        while(!lp.vazio()){
            int temp = lp.delMin();
            //for(Aresta e : G.adj(v))
            //    relaxar(e);
        }
    }
    
    private void relaxar(Aresta e){
        int v = e.de(), w = e.para();
        if(distancia[w] > distancia[v] + e.getPeso()){
            distancia[w] = distancia[v] + e.getPeso();
            adjacente[w] = e;
            if(lp.contem(w))
                lp.diminuirChave(w, distancia[w]);
            else
                lp.inserir(w, distancia[w]);
        }
    }
    
    public double distancia(int v){
        return distancia[v];
    }
    
    public boolean possuiCaminho(int v){
        return distancia[v] < Double.POSITIVE_INFINITY;
    }
    
    public Iterable<Aresta> menorCaminho(int v){
        if(!possuiCaminho(v)) return null;
        Stack<Aresta> caminho  = new Stack<>();
        for(Aresta e = adjacente[v]; e != null; e = adjacente[e.de()]){
            caminho.add(e);
        }
        return caminho;
    }
}

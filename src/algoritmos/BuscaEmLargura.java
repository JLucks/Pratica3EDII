/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import base.Aresta;
import base.Grafo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author Daniel
 */
public class BuscaEmLargura {
    private static final int infinito = Integer.MAX_VALUE;
    private boolean[] marcado;
    private int[] adjacente;
    private int[] distancia;
    
    public BuscaEmLargura(Grafo G, int v){
        marcado = new boolean[G.tam()];
        adjacente = new int[G.tam()];
        distancia = new int[G.tam()];
        for(int i = 0; i < G.tam(); i++)
            distancia[i] = infinito;
        bEmLargura(G, v);
    }
    
    public BuscaEmLargura(Grafo G, List<Integer> vertices){
        marcado = new boolean[G.tam()];
        adjacente = new int[G.tam()];
        distancia = new int[G.tam()];
        for(int i = 0; i < G.tam(); i++)
            distancia[i] = infinito;
        bEmLargura(G, vertices);
    }
    
    private void bEmLargura(Grafo G, int v){
        Queue<Integer> q = new LinkedList<>();
        distancia[v] = 0;
        marcado[v] = true;
        q.add(v);
        
        while(!q.isEmpty()){
            int u = q.remove();
            for(Aresta w : G.adj(u)){
                if(!marcado[w.para()]){
                    adjacente[w.para()] = u;
                    distancia[w.para()] = distancia[u]+1;
                    marcado[w.para()] = true;
                    q.add(w.para());
                }
            }
        }
    }
    
    private void bEmLargura(Grafo G, List<Integer> vertices){
        Queue<Integer> q = new LinkedList<>();
        
       for (int v : vertices) {
            distancia[v] = 0;
            marcado[v] = true;
            q.add(v);
        }
        
        while(!q.isEmpty()){
            int u = q.remove();
            for(Aresta w : G.adj(u)){
                if(!marcado[w.para()]){
                    adjacente[w.para()] = u;
                    distancia[w.para()] = distancia[u]+1;
                    marcado[w.para()] = true;
                    q.add(w.para());
                }
            }
        }
    }
    
    public List<Integer> menorCaminho(int v) {
        if (!possuiCaminho(v)) return null;
        Stack<Integer> path = new Stack<>();
        int x;
        for (x = v; distancia[x] != 0; x = adjacente[x])
            path.push(x);
        path.push(x);
        return path;
    }
    
    public boolean possuiCaminho(int v) {
        return marcado[v];
    }
    
    public int distancia(int v){
        return distancia[v];
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Grafo {
    private int tam = 0;
    private Aresta[] arestas;
    private String[] valores;
    
    public Grafo(int tam, Aresta[] arestas, String[] valores){
        this.tam = tam;
        this.arestas = arestas;
        this.valores = valores;
    }
    
    public String[] vertices(){
        return valores;
    }
    
    public int tam(){
        return tam;
    }

    public Aresta[] getAresta(){
        return arestas;
    }
    
    public List<Aresta> adj(int u) {
        List<Aresta> adjs = new ArrayList<>();
        for(int i = 0;i < tam;i++)
            if(arestas[i].de() == u)
                adjs.add(arestas[i]);
        return adjs;
    }
}

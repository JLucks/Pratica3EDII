/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Daniel
 */

public class ListaPrioridade{
    private List<Camp> list;
    
    public ListaPrioridade(){
        list = new ArrayList<>();
    }

    public void inserir(int v, double distancia) {
        Camp novo = new Camp(v,distancia);
        list.add(novo);
    }

    public boolean vazio() {
        return list.isEmpty();
    }

    public int delMin() {
        Collections.sort(list);
        int min = list.get(0).getW();
        list.remove(0);
        return min;
    }

    public boolean contem(int w) {
        for(Camp c: list)
            if(c.getW() == w)
                return true;
        return false;
    }

    public void diminuirChave(int w, double d) {
        Camp novo = new Camp(w,d);
        int inde = 0;
        for(Camp c: list)
            if(c.getW() == w)
                inde = list.indexOf(c);
        list.remove(inde);
        list.add(novo);
    }
}

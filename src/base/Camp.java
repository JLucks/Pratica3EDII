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
public class Camp implements Comparable<Object>{
    private int w;
    private double dist;

    public Camp(int w, double dist){
        this.w = w;
        this.dist = dist;
    }
    /**
     * @return the w
     */
    public int getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * @return the dist
     */
    public double getDist() {
        return dist;
    }

    /**
     * @param dist the dist to set
     */
    public void setDist(double dist) {
        this.dist = dist;
    }

    @Override
    public int compareTo(Object o) {
        Camp no = (Camp) o;
        if(this.dist > no.getDist())
            return 1;
        else {
            if(this.dist < no.getDist())
                return -1;
        }
        return 0;
    }
}

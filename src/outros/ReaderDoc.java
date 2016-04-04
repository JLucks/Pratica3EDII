/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outros;

import base.Aresta;
import base.Grafo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @authors Jorge & Daniel
 */
public class ReaderDoc {
    //Função que retorna as palavras do documento
    public static Grafo getWords(String url) throws FileNotFoundException{
        int tam = 0;
        String[] vertices;
        Aresta[] arestas;
        List<String> temp = new ArrayList<>();
        List<Aresta> temp2 = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(url)); //Ler apartir do documento quebrando por espaços, tabulações e quebra de linhas
        if(scanner.hasNext())
            tam = scanner.nextInt();
        while (scanner.hasNext()) { //Enquanto não chegar ao final do arquivo
          String word = scanner.next(); //Carrega a palavra
          if(!word.equals("")){
              String[] v1 = new String[3];
              v1[0] = word.substring(0, word.indexOf("#"));
              v1[1] = word.substring(word.indexOf("#")+1,word.lastIndexOf("#"));
              v1[2] = word.substring(word.lastIndexOf("#")+1);
            if(!temp.contains(v1[0])){
                temp.add(v1[0]);
            }
            if(!temp.contains(v1[1])){
                temp.add(v1[1]);
            }
            double dis = Double.parseDouble(v1[2]);
            int a1 = temp.indexOf(v1[0]);
            int a2 = temp.indexOf(v1[1]);
            temp2.add(new Aresta(a1,a2,dis));
          }
        }
        vertices = temp.toArray(new String[temp.size()]);  //Transforma a lista em array
        arestas = temp2.toArray(new Aresta[temp2.size()]);
        Grafo gf = new Grafo(tam,arestas,vertices);
        return gf;
    }
}

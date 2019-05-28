/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.awt.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Kevin
 */
public class Fila {
    private int tamanho_fila;
    private PriorityQueue<Processo> fila;
    public Fila() {
       fila = new PriorityQueue<>(new FilaComparator());
    }          
    public void addFila(Processo processo){
        fila.offer(processo);
        att_tamanho_fila();
    }
    public Processo obterFila(){
        Processo processo = fila.peek();
        removeFila();
        return processo;
    }
    public int tamanho_fila(){
        return fila.size();
    }
    public void removeFila(){
        fila.poll();
        att_tamanho_fila();        
    }
    public void att_tamanho_fila(){
        tamanho_fila = fila.size();
    }
    public int getTamanho_fila(){
        return tamanho_fila;
    }
}

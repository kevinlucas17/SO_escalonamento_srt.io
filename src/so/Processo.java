/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

/**
 *
 * @author Kevin
 */
public class Processo {
    private int tempo_execucao;
    private String nome;
    private int tempo_chegada;

    public Processo(int tempo_execucao, String nome, int tempo_chegada) {
        this.tempo_execucao = tempo_execucao;
        this.nome = nome;
        this.tempo_chegada = tempo_chegada;
    }
       
    public int getTempo_execucao() {
        return tempo_execucao;
    }
    public void setTempo_execucao(int tempo_execucao) {
        this.tempo_execucao = tempo_execucao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTempo_chegada() {
        return tempo_chegada;
    }
    public void setTempo_chegada(int tempo_chegada) {
        this.tempo_chegada = tempo_chegada;
    }        
}

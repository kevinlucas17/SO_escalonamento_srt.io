/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.util.Comparator;

/**
 *
 * @author Kevin
 */
public class FilaComparator implements Comparator<Processo> {

    @Override
    public int compare(Processo o1, Processo o2) {
        if(o1.getTempo_execucao() < o2.getTempo_execucao()){
            return -1;
        }
        return 1;
        
    
    
    }
}
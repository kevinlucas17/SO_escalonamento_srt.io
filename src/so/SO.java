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
public class SO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fila x = new Fila();
        
        Processo p = new Processo(13,"p1",0);
        Processo p2 = new Processo(9,"p2",2);
        Processo p3 = new Processo(98,"p3",4);
        Processo p4 = new Processo(7,"p4",4);
        Processo p5 = new Processo(1,"p5",4);
        Processo p6 = new Processo(1,"p6",4);
        Processo p7 = new Processo(32,"p7",4);
        Processo p8 = new Processo(17,"p8",4);
        
        x.addFila(p);
        x.addFila(p2);
        x.addFila(p3);
        x.addFila(p4);
        x.addFila(p5);
        x.addFila(p6);
        x.addFila(p7);
        x.addFila(p8);
        
       for(int i = 0;i<8;++i){
        System.out.printf("%s", x.obterFila().getNome());
        System.out.println(" ");
       }
       System.out.printf("%d", x.getTamanho_fila());
                         
       }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116471_latihanuts4;

/**
 *
 * @author thosiba c55-b5101
 */
public class If11_10116471_latihanuts4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner md = new ModelDesigner();
        md.bonusDesigner();
        
        
        System.out.println("\n");
        
        ModelProgrammer mp = new ModelProgrammer();
        mp.bonusProgrammer();
        
        System.out.println("\n");
      
        ModelSystemAnalyst msa = new ModelSystemAnalyst();
        msa.bonusSystemAnalyst();
    }
    
}

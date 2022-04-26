package exercicio2;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        Integer aux = 0, valor1, valor2, i = 1;
        String operacao, entrada;
        
        while(aux == 0)
        {
            
            Object[] ops = {"SOMA", "SUBTRAÇÃO", "MULTIPLICAÇÃO", "DIVISÃO"};
        
            Object op = JOptionPane.showInputDialog(null, "Escolha uma operação", "CALCULADORA",
                            JOptionPane.INFORMATION_MESSAGE, null, ops, ops[0]);
            if(op == null)
                break;
            operacao = op.toString();
            
            entrada = JOptionPane.showInputDialog("Insira o valor 1:"); 
            if(entrada == null)
                break;  
            while (true && entrada != null) {
                try {
                    aux = Integer.parseInt(entrada);
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor inserido invalido\n" + e.getMessage());
                    entrada = JOptionPane.showInputDialog(null, "Insira novamente o valor 1: ");
                }
            }
            if(entrada == null)
                break;
            valor1 = aux;            
            
            entrada = JOptionPane.showInputDialog("Insira o valor 2:");
            if(entrada == null)
                break;        
            while (true && entrada != null) {
                try {
                    aux = Integer.parseInt(entrada);
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor inserido invalido\n" + e.getMessage());
                    entrada = JOptionPane.showInputDialog(null, "Insira novamente o valor 2: ");
                }
            }
            if(entrada == null)
                break;
            valor2 = aux;  
            
            Calculadora thread = new Calculadora("OPERAÇÃO " + i, operacao, valor1, valor2);
            thread.start();
            i++;
            
            aux = JOptionPane.showConfirmDialog(null, "Deseja fazer mais uma operação?",
                       "CALCULADORA", JOptionPane.YES_NO_OPTION);
            
        }
          
    }
    
}

package exercicio2;

public class Calculadora extends Thread {
    
    public String operacao;
    public Integer valor1;
    public Integer valor2;
    
    public Calculadora(String text, String operacao, Integer valor1, Integer valor2) {
        super(text);
        this.operacao = operacao;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    @Override
    public void run() {
        
        Double resultado;
        
        try {
            
            String escolha = this.operacao;
        
            switch(escolha)
            {
                case "SOMA":
                    System.out.println("RESULTADO " + this.getName() + ": " + (valor1 + valor2));
                    break;
                case "SUBTRAÇÃO":
                    System.out.println("RESULTADO " + this.getName() + ": " + (valor1 - valor2));
                    break;
                case "MULTIPLICAÇÃO":
                    System.out.println("RESULTADO " + this.getName() + ": " + (valor1 - valor2));
                    break;
                case "DIVISÃO":
                    if (valor2 == 0)
                        System.out.println("OPERAÇÃO NÃO PODE SER REALIZADA (DIVISOR = 0)");
                    else
                        System.out.println("RESULTADO " + this.getName() + ": " + (valor1 / valor2));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

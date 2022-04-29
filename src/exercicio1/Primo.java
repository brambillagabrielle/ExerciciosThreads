package exercicio1;

public class Primo extends Thread {
    
    public Integer min = 0, max = 1000;
    
    public Primo(String text, Integer min, Integer max) {
        super(text);
        this.min = min;
        this.max = max;
    }
    
    @Override
    public void run() {
        
        int cont;
        
        for (int i = min; i < max; i++) {
            
            if (i != 0 && i != 1)
            {
                cont = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        cont++;
                }

                if (cont == 0)
                    System.out.println(this.getName() + ": " + i);
            }
            
        }
        
    }
    
}

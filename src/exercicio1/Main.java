package exercicio1;

public class Main {
    
    public static void main(String[] args) {
        
        Integer min = 0, max = 1000;
        
        while (max < 100000)
        {
            Primo thread = new Primo("Processo " + min + " - " + max, min, max);
            thread.start();
            min = max;
            max += 1000;
        }
        
    }
    
}

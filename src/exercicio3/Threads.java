package exercicio3;

public class Threads extends Thread {
    
    public int tempo;
    public String info;
    
    public Threads(String text, int tempo, String info) {
        super(text);
        this.tempo = tempo;
        this.info = info;
    }
    
    @Override
    public void run() {
        
        try {
            System.out.println(this.getName() + ": " + this.info);
            Thread.sleep(tempo * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

package exercicio3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args) {
        
        String usuarios[] = {"@user1234", "@user4560", "@user6789"};
        int contHora = 0, cont = 0;
        
        while(contHora < 10)
        {
            
            cont++;
            Threads threadTweet = new Threads("Tweet", 8,
                    "#hashtag " + cont);
            threadTweet.start();

            Threads threadUsuario = new Threads("Usuario", 10, 
                    usuarios[(int)Math.floor(Math.random()*(2+1))]);
            threadUsuario.start();
            
            contHora++;
            Threads threadHora = new Threads("Hora", 8, 
                    LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            threadHora.start();
            
        }
        
    }
    
}

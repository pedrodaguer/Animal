import br.univali.cc.zoologico.dominio.Cachorro;
import br.univali.cc.zoologico.dominio.Cavalo;
import br.univali.cc.zoologico.dominio.Preguica;
import br.univali.cc.zoologico.dominio.Veterinario;


public class Principal {

    
    public static void main(String[] args) {
        
       Cachorro toto = new Cachorro("Toto", 8);
       toto.emitirSom();
       Cavalo jorge = new Cavalo("Jorge", 21);
        jorge.emitirSom();
       Preguica belinha = new Preguica("Belinha", 5);
        belinha.emitirSom();
        Veterinario v1 = new Veterinario();
        v1.examinar(belinha);
        v1.examinar(toto);
        v1.examinar(jorge);
        
        
    }
    
}

package projetoyoutube;

public class ProjetoYouTube {    
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video ("Curso em Video");
        v[1] = new Video ("Aula de POO");
        v[2] = new Video ("Exercicio");
        
        Espectador e[] = new Espectador[2];
        e[0] = new Espectador ("Mario", 19, "M", "Mario123");
        e[1] = new Espectador ("Julia", 23, "F", "juju1998");
        
        System.out.println(v[0].toString());
        
        System.out.println(e[0].toString());
    }
 }
    

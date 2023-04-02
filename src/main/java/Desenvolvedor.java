
/**
     *
     */
public class Desenvolvedor {

    String name;

    String stack;

    String country;

    public Desenvolvedor(String name, String Stack, String country) {
        this.name = name;
        this.stack = stack;
        this.country = country;
    }

    @Override

    public String toString() {
        return "Ola meu nome é /n" + name + "\n Trabalho com a stack " + stack + "\n moro no " + country;
    }

    public static void main (String [] args){
        Desenvolvedor Kamilacode = new Desenvolvedor(name: "Gerson" , Stack: "Java" , country: "Brasil");
        System.out.println(Kamilacode);
    }

}

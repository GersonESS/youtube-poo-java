public class Desenvolvedor {

    public String getStackOfDesenvolvedor(String stack) {
        return stack;
    }

    public String getNameOfDesenvolvedor(String name) {
        return name;
    }

    public String getCountryOfDesenvolvedor(String country) {
        return country;
    }

    public static void main(String[] args) {

        Desenvolvedor kamilacode = new Desenvolvedor();

        String minhaStack = kamilacode.getStackOfDesenvolvedor("java e spring");
        String meuPais = kamilacode.getCountryOfDesenvolvedor("brazil");
        String meuNome = kamilacode.getNameOfDesenvolvedor("name");

        System.out.println(minhaStack);
        System.out.println(meuPais);
        System.out.println(meuNome);

    }
}

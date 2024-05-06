public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //classe String que representa texto na aplicação
        String meuNome = "Luciano Lucas";
        System.out.println(meuNome);

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //final não permite a alteração do valor da variavel
        System.out.println(VALOR_DE_PI);
    }
}

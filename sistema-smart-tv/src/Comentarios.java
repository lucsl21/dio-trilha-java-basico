public class Comentarios {
    public static void main(String[] args) {
        //Olá, eu sou um comentário em uma única linha
        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhado
        * quando necessário
        */

    }
    public void metodo(){
        /** 
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */

        /*
        * Este método foi elaborado as pressas
        * por isso eu abrevei o nome das variáveis
        * mas olha, ele tem a finalidade de somar ou  multiplicar
        * dois números
        */

        // No terminal execute o comando abaixo

        //javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java

        /*public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
        }*/
    }
}

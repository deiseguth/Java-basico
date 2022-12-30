public class Operadores {
    public static void main(String[] args) throws Exception {
        
        /*String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);*/

        /*
        int numero = 5;
        
         numero = - numero;
         
         System.out.println( - numero);
         
         System.out.println(-- numero);
        
        //para tornar o número positivo só multiplico ele por -1.
        
        numero = numero * -1; 

        //aumento ao número
        numero = numero +1;
        System.out.println(numero);
        System.out.println(++ numero);*/

        /*boolean variavel = true;
        
        variavel = !variavel;
        System.out.println(variavel);
        System.out.println(!variavel);*/


        // verdadeiro ou falso com if e else
        //int a, b;

        /*a = 6;
        b = 6;*/

        /*String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
            else resultado = "falso";*/

            //Ou com operador ternário que responde tanto em string quanto em número

        /*String resultado = a==b ?"verdadeira" :"false";

        System.out.println(resultado);*/

        /*int numero1 = 1;
        int numero2 = 2;*/
        //boolean simNao = numero1 == numero2;
        //System.out.println("numeroUm é igual ao numeroDois? " + simNao);
        
        /*boolean simNao = numero1 != numero2;
        System.out.println("numeroUm é difernte do numeroDois? " + simNao);*/

        /*if(numero1<numero2){
            System.out.println("O número 1 é menor que o número 2");*/

        /*String nomeUm = "Giseulo";
        String nomeDois = "Giseulo";

        System.out.println(nomeUm == nomeDois);

        // Obs: para objetos é interessante usar .equals
        System.out.println(nomeUm.equals(nomeDois));*/

        boolean condicao1 = true;
        boolean condicao2 = true;
        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");

    }



}


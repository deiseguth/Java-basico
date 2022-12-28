public class Classes {
     //public static void main(String[] args) throws Exception {
        //System.out.println("Eu gosto de mousse de cupuaçu");

             //A classe deve ser escrita da mesma forma que o nome do arquivo está escrito.
             //Variáveis são escritas com letras minúsculas, exceção quando são compostas, pois a segunda deverá ser maiúscula
             // regraRegra.

            //Variáveis escritas com todas as letras maiúsculas são "final", ou seja não podem e não devm sofrer alterações
            //Jamais começamos variáveis com números

             //ver todas as regras no site https://glysns.gitbook.io/java-basico
            //Java aceita números e under
//}

     /* public static void main (String [] args) {
          String primeiroNome = "Catiroba";
          String segundoNome = "Detetizadora";

          String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

          System.out.println(nomeCompleto);
     }

     public static String nomeCompleto (String primeiroNome, String segundoNome){
          return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
     } */



    //Identação nada mais é que ordem hierarquica, ou seja seguir a ordem do sistema com tabulação.
    //segue o exemplo:

    public class BoletimEstudantil {
         public static void main(String[] args) {
              int mediaFinal = 8;
              if (mediaFinal < 6)
                   System.out.println("REPROVADO");
              else if (mediaFinal == 6)
                   System.out.println("PROVA MINERVA");
              else
                   System.out.println("APROVADO");
         }
    }

}


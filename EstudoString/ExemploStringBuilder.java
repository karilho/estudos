package EstudoString;


public class ExemploStringBuilder {
    public static void main(String[] args) {
        /*
        Neste primeiro exemplo, a str mesmo com o concat, não modifica, é criado um novo valor de memória,
         */
        String str = "Hello";
        String str2 = str.concat(" World");
        System.out.println(str);
        System.out.println(str2);

        /*
        Podemos perceber neste caso, que o sb FOI MODIFICADO seu valor na memória, criando apenas 1 string na memória.
         */
        System.out.println("-------------------------------------------------");
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = sb.append(" World");
        System.out.println(sb);
        System.out.println(sb2);

        // Após JAVA 7, antes era diferente, ele referenciava cada caracter na memória antiga, ou seja, era OK.
        /*
        Outro ponto, é quanto ao APPEND, com o strigbuilder é mais performático, pois não é criado uma nova string na memória, diferente do string.
         */
        //String a = "Hello"; // 5 caracteres
        //String b = " HeyWorld"; // 8 caracteres
        //new String c = H+e+l+l+o+H+e+y+W+o+r+l+d // | 13 caracteres, pois C(A+B)

        /*
        Já com o Stringbuilder, teremos apenas a adição do valor ao final da string, sem a necessidade de criar uma nova string na memória.
         */
        //StringBuilder d = new StringBuilder("Hello"); // 5 caracteres
        //StringBuilder e = new StringBuilder(" HeyWorld"); // 8 caracteres
        //new StringBuilder f = d+e // | 13 caracteres, F(D+E)

        /*
        Outro ponto a ser considerado, é a que o Strinbuilder já vem com certas funções nativas como o método reverse, que inverte a string.
        Pois ao realizar o forloop, seria mais trabalhoso, já que quando usamos o SB, temos uma alocação mutável e não fixa. Neste caso, o String
        seria superior se o SB não tivesse o método reverse. já implementado.
         */


        //public String reverse(String str) {
        //    return new StringBuilder(str).reverse().toString();
        //}


    }
}

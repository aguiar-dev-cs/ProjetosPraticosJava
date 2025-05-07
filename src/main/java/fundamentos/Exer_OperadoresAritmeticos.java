package fundamentos;

public class Exer_OperadoresAritmeticos {

    public static void main(String[] args){

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;

        System.out.println(terceiroNome);

        //utilizando a função "concat" para obter o mesmo resultado anterior
        String mensagem = primeiroNome.concat(segundoNome);
        System.out.println(mensagem);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++);
        System.out.println(++resultado);

        resultado--;
        System.out.println(resultado);
        System.out.println(resultado--);
        System.out.println(--resultado);
    }
}

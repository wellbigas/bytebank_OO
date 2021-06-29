//sintaxe basica de instanciação, atribuição de um atributo, acesso de uma atributo de um objeto.
//Como chamamos, em orientação a objetos, as características de uma classe?
//R: ATRIBUTO

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;


        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 146;
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero );

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta");

        } else {
            System.out.println("Contas diferentes");
        }
        //código de referencia ao objeto diferentes
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

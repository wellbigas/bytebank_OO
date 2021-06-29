//Nessa aula aprendemos sobre atributos e criação de objetos.
//
//Vimos:
//
//O que é uma classe
//Como criar uma classe
//Como criar um objeto ou instância de uma classe
//O que são atributos
//Como definir e visualizar valores de atributos
//Como funciona a atribuição de uma referência à uma variável
//Vamos ver mais sobre as classes na próxima aula! Agora não só suas características mas também seu comportamento. Vamos que só está no começo! Espero você lá!

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmissima conta");
        }
        //código de referencia igual para mesmo objeto
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}

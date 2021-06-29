//Nessa aula falamos sobre o comportamento que são os métodos.
//
//Vimos:
//
//como definir métodos com parâmetros e retorno
//como retornar algo usando a palavra chave return
//como usar a referência this para acessar um atributo
//que podemos passar uma referência como parâmetro do método
//métodos são chamadas a partir da referência usando o operador .
//Se você tiver com dúvidas ainda sobre referências, this e uso dos métodos, fique tranquilo, pois nas próximas aulas (e cursos) vamos revisar os conceitos e praticar muito mais!! Bora continuar?

public class Conta {
    //atributos
    double saldo;
    int agencia;
    int numero;
    String titular;

    //comportamento(metodo)

    void deposita(double valor){
        this.saldo += valor;
    }
    //não existe metodo dentro de metodo.
    public boolean saca (double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }  else {
            return false;
        }
    }

    public boolean tranfere (double valor, Conta destino) {
        if(this.saldo >= valor) { //logica para saber se tem dinheiro suficiente no saldo da conta para permitir transferencia, se tiver dinheiro ele segue com a logica para transferir
            this.saldo -= valor;
            destino.deposita(valor);
            return true; // e no final como a transferencia deu certo ele retorna true
        } else {
            return false; // caso a logica do if de false, o metodo irá retornar false
        }
    }
}
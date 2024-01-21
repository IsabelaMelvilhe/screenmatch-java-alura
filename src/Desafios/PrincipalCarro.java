package Desafios;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.fichatecnica();

        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}

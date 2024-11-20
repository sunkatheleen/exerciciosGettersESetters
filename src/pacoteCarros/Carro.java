package pacoteCarros;

public class Carro {

    private String  marca;  // atributo oculto (encapsulado/privado)
    private boolean ligado; // atributo oculto (encapsulado/privado)

    public Carro(String marca, boolean ligado) { // Método construtor
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() { // Retorna valor do atributo privado “marca”;
        return marca;
    }

    public void setMarca(String marca) {  // Altera valor de “marca”;
        this.marca = marca;
    }

    public boolean isLigado() {  // Retorna valor do atributo privado “ligado”;
        return ligado;
    }

    public void setLigado(boolean ligado) { //  Altera valor de “ligado”;
        this.ligado = ligado;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Ford",false); //instancia pacoteCarros.Carro
        System.out.println("Marca: " + meuCarro.getMarca()); //Retorna valor
        System.out.println("Ligado: " + (meuCarro.isLigado() == true ? "Ligado" : "Desligado"));

        meuCarro.setMarca("Renault"); //Altera valor de atributo privado
        meuCarro.setLigado(true);     //Altera valor de atributo privado

        System.out.println("Marca: " + meuCarro.getMarca()); // Retorna valor
        System.out.println("Ligado: " + (meuCarro.isLigado() == true ? "Ligado" : "Desligado"));
    }

}

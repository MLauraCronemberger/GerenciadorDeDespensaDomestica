package br.com.gerenciador;
import java.time.LocalDate;

public class Produtos {
    protected String nome;
    protected Double quantidade;
    protected LocalDate datacompra;
    protected LocalDate validade;
    protected String localArmazenamento;
    protected String marca;

    public void Produto(String nome, Double quantidade, String localAramazenamento, LocalDate datacompra, LocalDate validade, String marca){
        this.nome= nome;
        this.quantidade= quantidade;
        this.localArmazenamento= localAramazenamento;
        this.datacompra= datacompra;
        this.validade = validade;
        this.marca= marca;

        
    }

}

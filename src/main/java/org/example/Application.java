package org.example;

import org.example.model.*;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        //Produto produto = new Produto (10, "Impressora 3D HP", "Impressora 3D filamento",
        //1200.00, 1500.00, LocalDate.of(2023, 01, 15),
                //LocalDate.of(2023, 01, 15), Status.DISPONIVEL);

        Produto produto = new Produto();
        produto.setNome("Impressora 3D HP");
        produto.setDescricao("Impressora 3D filaento XYZ");
        produto.setDataPrazo(LocalDate.of(2023, 01, 15));
        produto.setPrecoCompra(1200.00);
        produto.setPrecoVenda(1500.00);
        produto.setStatus(Status.DISPONIVEL);

        Fornecedor dell = new Fornecedor();
        dell.setNome("DELL LTDA");
        dell.setCnpj("44654646654666");
        dell.setIes("44654648248");
        dell.setEmail("comercial@dell.com.br");
        dell.setTelefone("48 99767122");
        dell.setEndereco("Rua Jacinto Pinto Ineu Rego");

        Cliente rique = new Cliente();
        rique.setNome("Henrique Angar");
        rique.setCpf("03716711080");
        rique.setRg("4120403136");
        rique.setEmail("henriqueangar@Gmail.com");
        rique.setTelefone("051 99767122");
        rique.setEndereco("Cu do Judas");

        Venda venda01 = new Venda();
        venda01.setId(10l);
        venda01.setDataVenda(LocalDate.of(2023,1,1));
        venda01.setCliente(rique);
        venda01.setFormaPagamento(FormaPagamento.PIX);
        venda01.setObs("Tentou oferecer um rim como pagamento, suspeitamos de cirrose");

        ItemVenda itVenda = new ItemVenda(produto, 25000D,1D,10D);
        venda01.addItemVenda(itVenda);


        System.out.println(produto.getNome());

        System.out.println("Margem: " + produto.calcuclaMargemDeLucro() + "%");

        System.out.println(dell.getNome()+"  "+dell.Endereco);

        System.out.println(venda01.getItens());
    }

    ///QLQCOISA
}

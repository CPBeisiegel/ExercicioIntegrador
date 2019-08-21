package br.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Livraria  {

    public List<Livro> listaLivros = new ArrayList<>();


//    public Livraria(int codigo, String titulo, String autor, String anoDeLancamento, long codigoISBN, int quantidadeEmEstoque, float preco) {
//        super(codigo, titulo, autor, anoDeLancamento, codigoISBN, quantidadeEmEstoque, preco);
//    }



    public void CadastrarLivros(Livro novoLivro) {
        listaLivros.add(novoLivro);
        System.out.println("Livro Cadastrado");
    }

    public void TodosOsLivros(){
        for (Livro listaLivro : listaLivros) {
            System.out.println(listaLivro.getTitulo());
        }

    }

    public Livro ConsultarProdutoPorCodigo(int codigoLivro) {
        boolean encontrado = false;
        Livro livroEncontrado = null;

        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getCodigo() == codigoLivro) {
                encontrado = true;
                System.out.println(listaLivros.get(i).toString());
                livroEncontrado = listaLivros.get(i);
            }
            if (encontrado == false) {
                System.out.println("Livro não encontrado no sistema");
            }
        }
        return livroEncontrado;
    }
    public void EfetuarVenda(int codigoLivro){
        Livro listaLivros = ConsultarProdutoPorCodigo(codigoLivro);

        if(listaLivros != null){
            listaLivros.setQuantidadeEmEstoque(listaLivros.getQuantidadeEmEstoque()-1);
            System.out.println("Compra Realizada com Sucesso");
        } else{
            System.out.println("Estoque esgostado");
        }

    }
}







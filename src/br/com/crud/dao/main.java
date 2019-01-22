package br.com.crud.dao;

import br.com.crud.model.campus;
import br.com.crud.model.curso;
import br.com.crud.model.perg_x_resp;
import br.com.crud.model.pergunta;
import br.com.crud.model.pesquisa;
import br.com.crud.model.resposta;

public class main {

    public static void main(String[] args) {
        //instanciando as classes
        DaoTabelas BancoDeDados = new DaoTabelas();
        campus camp1 = new campus();
        curso cur1 = new curso();
        perg_x_resp pxr1 = new perg_x_resp();
        pergunta perg1 = new pergunta();
        pesquisa pesq1 = new pesquisa();
        resposta resp1 = new resposta();

        //atribuindo valores
        camp1.setFilialNome("uninove");
        camp1.setFilialCodigo(239);
        cur1.setCursoNome("ciencia da computacao");
        cur1.setCursoCodigo(10);
        //pxr1.setRespostaCodigo(20);
        //pxr1.setPerguntaCodigo(30);
        perg1.setPerguntaDescricao("voce programa em java?");
        perg1.setPerguntaCodigo(82);
        resp1.setRespostaDescricao("tambem");
        resp1.setRespostaCodigo(10);
        pesq1.setCursoCodigo(10);
        pesq1.setFilialCodigo(239);
        pesq1.setPerguntaCodigo(30);
        pesq1.setRespostaCodigo(20);
        pesq1.setTotalResposta(100);

        //cadastrando
        BancoDeDados.cadastrarCampus(camp1);
        BancoDeDados.cadastrarCurso(cur1);
        //BancoDeDados.cadastrarPergResp(pxr1);
        BancoDeDados.cadastrarPergunta(perg1);
        BancoDeDados.cadastrarPesquisa(pesq1);
        BancoDeDados.cadastrarResposta(resp1);

        //buscando
        BancoDeDados.buscarCampus(239);
        BancoDeDados.buscarCurso(10);
        //BancoDeDados.buscarPergResp(20, 30);
        BancoDeDados.buscarPergunta(82);
        //BancoDeDados.buscarPesquisa(30);
        BancoDeDados.buscarResposta(66);

        //excluir
        /*  
        BancoDeDados.excluirCampus(239);
        BancoDeDados.excluirCurso(10);
        BancoDeDados.excluirPergResp(20, 30);
        BancoDeDados.excluirPergunta(82);
        BancoDeDados.excluirPesquisa(30);
        BancoDeDados.excluirResposta(66);
         */
    }
}

package br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado;

import static br.com.maxicode.util.Funcoes.isNumber;
import static br.com.maxicode.util.Funcoes.mid;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ibm.db2.jcc.am.in;

import br.com.maxicode.core.BaseData;
import br.com.maxicode.core.Conexao;
import br.com.maxicode.core.SQLCreator;
import br.com.maxicode.db.IRecordSet;
import br.com.maxicode.jna.VBDate;
import br.com.maxicode.util.Funcoes;
import br.com.maxicode.util.UtilDate;
import br.com.visualmix.conferenciacaixa.Parametros;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefBins;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefConvenio;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefFin;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefFinalizDet;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefFinalizadora;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefRetFin;
import br.com.visualmix.conferenciacaixa.manutencao.def.DefTiposTef;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperAcertoData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperCedulasData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperDetalhesData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperDiaData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperDominioData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperFTrocaData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperFinalizData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperFinalizadoraDetalhesData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperLanctosData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperPagamentosData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperRejeicaoData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperResgateData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperSaqueData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperSuplenteData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.data.TotalOperValeData;
import br.com.visualmix.conferenciacaixa.manutencao.pdvnaoimportado.enums.TipoConteudo;
import br.com.visualmix.conferenciacaixa.utils.FuncoesFX;

public class Operador extends BaseData{

    private Conexao con;

    private DefBins defBinsObject = new DefBins();
    private DefTiposTef defTiposTef = new DefTiposTef();
    private DefConvenio convenio = new DefConvenio();
    private List<DefFinalizadora> regOperTes = new ArrayList<DefFinalizadora>();
    private List<Integer> defTipoTransacaoList = new ArrayList<Integer>();

    /*CRIAÇÃO DE ARRAYS*/
    private ArrayList<TotalOperData> totalOper;
    private ArrayList<TotalOperDetalhesData> totalOperDetalhes;
    private ArrayList<TotalOperDominioData> totalOperDominio;
    private ArrayList<TotalOperFinalizData>totalOperFinaliz;
    private ArrayList<TotalOperLanctosData>totalOperLanctos;
    private ArrayList<TotalOperAcertoData>totalOperAcerto;
    private ArrayList<TotalOperValeData>totalOperVale;
    private ArrayList<TotalOperDiaData>totalOperDia;
    private ArrayList<TotalOperResgateData>totalOperResgate;
    private ArrayList<TotalOperSaqueData>totalOperSaque;
    private ArrayList<TotalOperSuplenteData>totalOperSuplente;
    private ArrayList<TotalOperPagamentosData>totalOperPagamentos;
    private ArrayList<TotalOperCedulasData>totalOperCedulas;
    private ArrayList<TotalOperFTrocaData>totalOperFTroca;
    private ArrayList<TotalOperRejeicaoData>totalOperRejeicao;
    private ArrayList<TotalOperFinalizadoraDetalhesData> totalOperfinalizadoraDet;

    /*INICIALIZAÇÃO DE ARRAYS*/
    public Operador(Conexao con) {
        this.con = con;
        this.totalOper = new ArrayList<TotalOperData>();
        this.totalOperDetalhes = new ArrayList<TotalOperDetalhesData>();
        this.totalOperDominio =  new ArrayList<TotalOperDominioData>();
        this.totalOperFinaliz = new ArrayList<TotalOperFinalizData>();
        this.totalOperLanctos = new ArrayList<TotalOperLanctosData>();
        this.totalOperAcerto = new ArrayList<TotalOperAcertoData>();
        this.totalOperVale = new ArrayList<TotalOperValeData>();
        this.totalOperDia = new ArrayList<TotalOperDiaData>();
        this.totalOperResgate = new ArrayList<TotalOperResgateData>();
        this.totalOperSaque = new ArrayList<TotalOperSaqueData>();
        this.totalOperSuplente = new ArrayList<TotalOperSuplenteData>();
        this.totalOperPagamentos = new ArrayList<TotalOperPagamentosData>();
        this.totalOperCedulas= new ArrayList<TotalOperCedulasData>();
        this.totalOperFTroca= new ArrayList<TotalOperFTrocaData>();
        this.totalOperRejeicao= new ArrayList<TotalOperRejeicaoData>();
        this.totalOperfinalizadoraDet = new ArrayList<TotalOperFinalizadoraDetalhesData>();
    }

    /*ADIÇÃO DE OBJS*/
    public void adicionarTotalOper(TotalOperData oper) {
        this.totalOper.add(oper);
    }

    public void adicionarTotalOperDetalhes(TotalOperDetalhesData operDetalhes) {
        this.totalOperDetalhes.add(operDetalhes);
    }

    public void adicionarTotalOperDominio(TotalOperDominioData operDominio) {
        this.totalOperDominio.add(operDominio);
    }

    public void adicionarOperFinaliz(TotalOperFinalizData operFinaliz) {
        this.totalOperFinaliz.add(operFinaliz);
    }

    public void adicionarTotalOperLanctos(TotalOperLanctosData operLanctos) {
        this.totalOperLanctos.add(operLanctos);
    }

    public void adicionarTotalOperAcerto(TotalOperAcertoData operAcerto) {
        this.totalOperAcerto.add(operAcerto);
    }

    public void adicionarTotalOperVale(TotalOperValeData operVale) {
        this.totalOperVale.add(operVale);
    }

    public void adicionarTotalOperDia(TotalOperDiaData operDia) {
        this.totalOperDia.add(operDia);
    }

    public void adicionarTotalOperResgate(TotalOperResgateData operResgate) {
        this.totalOperResgate.add(operResgate);
    }

    public void adicionarTotalOperSaque(TotalOperSaqueData operSaque) {
        this.totalOperSaque.add(operSaque);
    }

    public void adicionarTotalOperSuplente(TotalOperSuplenteData operSuplente) {
        this.totalOperSuplente.add(operSuplente);
    }

    public void adicionarTotalOperPagamentos(TotalOperPagamentosData operPagamentos) {
        this.totalOperPagamentos.add(operPagamentos);
    }

    public void adicionarTotalOperCedulas(TotalOperCedulasData operCedulas) {
        this.totalOperCedulas.add(operCedulas);
    }

    public void adicionarTotalOperFTroca(TotalOperFTrocaData operFTroca) {
        this.totalOperFTroca.add(operFTroca);
    }

    public void adicionarTotalOperRejeicao(TotalOperRejeicaoData operRejeicao) {
        this.totalOperRejeicao.add(operRejeicao);
    }

    public void adicionarFinalizadoraDet(TotalOperFinalizadoraDetalhesData finalizadoraDet) {
        this.totalOperfinalizadoraDet.add(finalizadoraDet);
    }

    /*GET DE ARRAYS*/
    public ArrayList<TotalOperData> getTotalOper() {
        return totalOper;
    }

    public ArrayList<TotalOperDetalhesData> getTotalOperDetalhes() {
        return totalOperDetalhes;
    }

    public ArrayList<TotalOperDominioData> getTotalOperDominio() {
        return totalOperDominio;
    }

    public ArrayList<TotalOperFinalizData> getTotalOperFinaliz(){
        return totalOperFinaliz;
    }

    public ArrayList<TotalOperLanctosData> getTotalOperLanctos(){
        return totalOperLanctos;
    }

    public ArrayList<TotalOperAcertoData> getTotalOperAcerto(){
        return totalOperAcerto;
    }

    public ArrayList<TotalOperValeData> getTotalOperVale(){
        return totalOperVale;
    }

    public ArrayList<TotalOperDiaData> getTotalOperDia(){
        return totalOperDia;
    }

    public ArrayList<TotalOperResgateData> getTotalOperResgate(){
        return totalOperResgate;
    }

    public ArrayList<TotalOperSaqueData> getTotalOperSaque(){
        return totalOperSaque;
    }

    public ArrayList<TotalOperSuplenteData> getTotalOperSuplente(){
        return totalOperSuplente;
    }

    public ArrayList<TotalOperPagamentosData> getTotalOperPagamentos(){
        return totalOperPagamentos;
    }

    public ArrayList<TotalOperCedulasData> getTotalOperCedulas(){
        return totalOperCedulas;
    }

    public ArrayList<TotalOperFTrocaData> getTotalOperFTroca(){
        return totalOperFTroca;
    }

    public ArrayList<TotalOperRejeicaoData> getTotalOperRejeicao(){
        return totalOperRejeicao;
    }

    public ArrayList<TotalOperFinalizadoraDetalhesData> getTotalOperFinalizadoraDet(){
        return totalOperfinalizadoraDet;
    }

    /*METODOS PEGA QUANTIDADE*/
    public int getQtdeTotalOper() {
        return totalOper.size();
    }

    public int getQtdeTotalOperDetalhes() {
        return totalOperDetalhes.size();
    }

    public int getQtdeTotalOperDominio() {
        return totalOperDominio.size();
    }

    public int getQtdeOperFinaliz() {
        return totalOperFinaliz.size();
    }

    public int getQtdeOperLanctos() {
        return totalOperLanctos.size();
    }

    public int getQtdeOperAcerto() {
        return totalOperAcerto.size();
    }

    public int getQtdeOperVale() {
        return totalOperVale.size();
    }

    public int getQtdeOperDia() {
        return totalOperDia.size();
    }

    public int getQtdeOperResgate() {
        return totalOperResgate.size();
    }

    public int getQtdeOperSaque() {
        return totalOperSaque.size();
    }

    public int getQtdeOperSuplente() {
        return totalOperSuplente.size();
    }

    public int getQtdeOperPagamentos() {
        return totalOperPagamentos.size();
    }

    public int getQtdeOperCedulas() {
        return totalOperCedulas.size();
    }

    public int getQtdeOperFTroca() {
        return totalOperFTroca.size();
    }

    public int getQtdeOperRejeicao() {
        return totalOperRejeicao.size();
    }

    public int getQtdeOperFinalizadoraDet() {
        return totalOperfinalizadoraDet.size();
    }

    /*METODOS ENCONTRAR*/
    public TotalOperData encontrarTotalOper(int loja, Date data, int pdv, int cupom, int transacao, int nsu) {

        TotalOperData o = new TotalOperData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);

        for (TotalOperData oper : totalOper) {
            if (oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao &&  oper.getNsu() == nsu) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOper(o);
        }
        return o;
    }

    public TotalOperDetalhesData encontrarTotalOperDetalhes(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio, int contador) {

        TotalOperDetalhesData o = new TotalOperDetalhesData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setFinalizadora(finalizadora);
        o.setDominio(dominio);
        o.setContador(contador);

        for (TotalOperDetalhesData oper : totalOperDetalhes) {
            if (oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getFinalizadora() == finalizadora && oper.getDominio() == dominio && oper.getContador() == contador ){
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            adicionarTotalOperDetalhes(o);
        }
        return o;
    }

    public TotalOperDominioData encontrarTotalOperDominio(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio) {

        TotalOperDominioData o = new TotalOperDominioData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setFinalizadora(finalizadora);
        o.setDominio(dominio);

        for (TotalOperDominioData oper : totalOperDominio) {
            if (oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getFinalizadora() == finalizadora && oper.getDominio() == dominio) {
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            adicionarTotalOperDominio(o);
        }
        return o;
    }

    public TotalOperFinalizData encontrarOperFinaliz(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora) {

        TotalOperFinalizData o = new TotalOperFinalizData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setFinalizadora(finalizadora);

        for(TotalOperFinalizData oper : totalOperFinaliz) {
            if (oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getFinalizadora() == finalizadora) {
                o = oper;
                existe = true;
                break;
            }
        }

        if(!existe) {
            adicionarOperFinaliz(o);
        }

        return o;
    }

    public TotalOperLanctosData encontrarTotalOperLanctos(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio) {

        TotalOperLanctosData o = new TotalOperLanctosData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setFinalizadora(finalizadora);
        o.setDominio(dominio);

        for (TotalOperLanctosData oper : totalOperLanctos) {
            if (oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getFinalizadora() == finalizadora && oper.getDominio() == dominio) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperLanctos(o);
        }
        return o;
    }

    public TotalOperAcertoData encontrarTotalOperAcerto(int loja, Date data, int pdv, int cupom, int transacao, int nsu,int nsuRet, int numCupomRet) {

        TotalOperAcertoData o = new TotalOperAcertoData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setNsuRetirada(nsuRet);
        o.setNumCupomRetirada(numCupomRet);

        for(TotalOperAcertoData oper : totalOperAcerto) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getNsuRetirada() == nsuRet && oper.getNumCupomRetirada() == numCupomRet) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperAcerto(o);
        }
        return o;
    }

    public TotalOperValeData encontrarTotalOperVale(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int contador) {

        TotalOperValeData o = new TotalOperValeData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setContador(contador);

        for(TotalOperValeData oper : totalOperVale) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getContador() == contador) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperVale(o);
        }

        return o;
    }

    public TotalOperDiaData encontrarTotalOperDia(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int codFinaliz) {

        TotalOperDiaData o = new TotalOperDiaData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setCodFinaliz(codFinaliz);
        o.setNsu(nsu);

        for(TotalOperDiaData oper : totalOperDia) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getCodFinaliz() == codFinaliz) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperDia(o);
        }

        return o;
    }

    public TotalOperResgateData encontrarTotalOperResgate(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        TotalOperResgateData o = new TotalOperResgateData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setSequencia(sequencia);

        for(TotalOperResgateData oper : totalOperResgate) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getSequencia() == sequencia) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperResgate(o);
        }

        return o;
    }

    public TotalOperSaqueData encontrarTotalOperSaque(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia){

        TotalOperSaqueData o = new TotalOperSaqueData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setSequencia(sequencia);

        for(TotalOperSaqueData oper : totalOperSaque) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getSequencia() == sequencia) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperSaque(o);
        }

        return o;
    }

    public TotalOperSuplenteData econtrarTotalOperSuplente(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int numCupomTransacao, int nsuTransacao) {

        TotalOperSuplenteData o = new TotalOperSuplenteData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setNumCupomTransacao(numCupomTransacao);
        o.setNsuTransacao(nsuTransacao);

        for(TotalOperSuplenteData oper : totalOperSuplente) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getNumCupomTransacao() == numCupomTransacao && oper.getNsuTransacao() == nsuTransacao) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperSuplente(o);
        }

        return o;
    }


    public TotalOperPagamentosData econtrarTotalOperPagamentos(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        TotalOperPagamentosData o = new TotalOperPagamentosData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setSequencia(sequencia);

        for(TotalOperPagamentosData oper : totalOperPagamentos) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getSequencia() == sequencia) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperPagamentos(o);
        }

        return o;
    }

    public TotalOperCedulasData econtrarTotalOperCedulas(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int numCupomRet, int nsuRet, int sequencial) {

        TotalOperCedulasData o = new TotalOperCedulasData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setNumCupomRetirada(numCupomRet);
        o.setNsuRetirada(nsuRet);
        o.setSequencial(sequencial);

        for(TotalOperCedulasData oper : totalOperCedulas) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getNumCupomRetirada() == numCupomRet &&	oper.getNsuRetirada() == nsuRet && oper.getSequencial() == sequencial) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperCedulas(o);
        }

        return o;
    }

    public TotalOperFTrocaData encontrarTotalOperFTroca(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        TotalOperFTrocaData o = new TotalOperFTrocaData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setSequencia(sequencia);

        for(TotalOperFTrocaData oper : totalOperFTroca) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getSequencia() == sequencia) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperFTroca(o);
        }

        return o;
    }

    public TotalOperRejeicaoData encontrarTotalOperRejeicao(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int contador) {

        TotalOperRejeicaoData o = new TotalOperRejeicaoData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setNsu(nsu);
        o.setContador(contador);

        for(TotalOperRejeicaoData oper : totalOperRejeicao) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getNsu() == nsu &&
                    oper.getContador() == contador) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("Adicionou!");
            adicionarTotalOperRejeicao(o);
        }

        return o;
    }

    public TotalOperFinalizadoraDetalhesData encontrarFinalizDet(int loja, Date data, int pdv, int cupom, int nsu, int transacao, int codFinaliz, int sequencial ) {

        TotalOperFinalizadoraDetalhesData o = new TotalOperFinalizadoraDetalhesData();
        boolean existe = false;

        o.setLoja(loja);
        o.setData(data);
        o.setNumPdv(pdv);
        o.setNumCupom(cupom);
        o.setTransacao(transacao);
        o.setCodFinaliz(codFinaliz);
        o.setSequencial(sequencial);
        o.setNsu(nsu);

        for(TotalOperFinalizadoraDetalhesData oper : totalOperfinalizadoraDet) {
            if(oper.getLoja() == loja && oper.getData() == data && oper.getNumPdv() == pdv && oper.getNumCupom() == cupom && oper.getTransacao() == transacao && oper.getCodFinaliz() == codFinaliz &&
                    oper.getSequencial()	== sequencial && oper.getNsu() == nsu) {
                System.out.println("Não Adicionou!");
                o = oper;
                existe = true;
                break;
            }
        }

        if(!existe) {
            System.out.println("Adicionou");
            adicionarFinalizadoraDet(o);
        }

        return o;
    }

    /*METODOS INCLUI*/
    public void incluiTotalOper(Conexao con, int loja, Date data, int pdv, int cupom, int transacao, int nsu) {

        TotalOperData o = new TotalOperData();

        String sql = "SELECT * FROM VW_TOTAL_OPER_LOG" +
                " WHERE LOJA = " + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom+
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu;
        IRecordSet rst = con.getRecordSet(sql);

        if(rst.next()) {
            o = encontrarTotalOper(loja, data, pdv, cupom, transacao, nsu);
            o.setHora(rst.getDate("HORA"));
            o.setOperador(rst.getString("OPERADOR"));
            o.setVendaBruta(rst.getDouble("VENDA_BRUTA"));
            o.setDescontos(rst.getDouble("DESCONTOS"));
            o.setCancelamentos(rst.getDouble("CANCELAMENTOS"));
            o.setQtItensCanc(rst.getInt("QT_ITENS_CANC"));
            o.setQtCuponsCanc(rst.getInt("QT_CUPONS_CANC"));
            o.setResponsavel(rst.getString("RESPONSAVEL"));
            o.setHoraEntrada(rst.getDate("HORA_ENTRADA"));
            o.setHoraSaida(rst.getDate("HORA_SAIDA"));
            o.setQtItens(rst.getInt("QT_ITENS"));
            o.setQtdItensVenda(rst.getInt("QTD_ITENSVENDA"));
            o.setQtdCuponsVenda(rst.getInt("QTD_CUPONSVENDA"));
            o.setTempoVenda(rst.getInt("TEMPO_VENDA"));
            o.setTempoPausa(rst.getInt("TEMPO_PAUSA"));
            o.setTempoDisp(rst.getInt("TEMPO_DISP"));
            o.setTempoReceb(rst.getInt("TEMPO_RECEB"));
            o.setGtInicial(rst.getDouble("GTINICIAL"));
            o.setGtFinal(rst.getDouble("GTFINAL"));
            o.setRecebimentos(rst.getDouble("RECEBIMENTOS"));
            o.setPagamentos(rst.getDouble("PAGAMENTOS"));
            o.setNsuInicial(rst.getInt("NSUINICIAL"));
            o.setNsuFinal(rst.getInt("NSUFINAL"));
            o.setNsuRetirada(rst.getInt("NSURETIRADA"));
        }
        rst.close();

    }

    public void incluiTotalOperFializ(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, TotalOperFinalizadoraDetalhesData finDet) {
//    	for(TotalOperFinalizData o : totalOperFinaliz) {
        TotalOperFinalizData o = new TotalOperFinalizData();
        o = encontrarOperFinaliz(loja, data, pdv, cupom, transacao, nsu, finalizadora);
        o.setValor(finDet.getValor());
        o.setValorCorrigido(finDet.getValor());
        o.setStatus(0);
//    	}

        gravaTotalOperFinaliz(loja, data, pdv, cupom, transacao, nsu);
    }

    public void incluiTotalOperDominio(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio, TotalOperFinalizadoraDetalhesData finDet) {
        for(TotalOperDominioData o : totalOperDominio) {
            o = encontrarTotalOperDominio(loja, data, pdv, cupom, transacao, nsu, finalizadora, dominio);
            o.setValor(o.getValor() + finDet.getValor());
            o.setValorCorrigido(o.getValorCorrigido() + finDet.getValor());
        }

        gravaTotalOperDominio(loja, data, pdv, cupom, transacao, nsu, finalizadora, dominio);
    }

    public void incluiTotalOperLanctos(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio, TotalOperFinalizadoraDetalhesData finDet) {
        for(TotalOperLanctosData o : totalOperLanctos) {
            o =  encontrarTotalOperLanctos(loja, data, pdv, cupom, transacao, nsu, finalizadora, dominio);
            o.setValor(finDet.getValor());
            o.setValorCorrigido(finDet.getValor());
        }

        gravaTotalOperLanctos(loja, data, pdv, cupom, transacao, nsu, finalizadora, dominio);
    }


    public void incluiDetalhes(int loja, int pdv, int cupom, Date data, int cod_Finaliz, int nsu, TotalOperDominioData dom, TotalOperFinalizadoraDetalhesData det) {
        int tipoDominio = FuncoesFX.getFinalizadora(det.getCodFinaliz()).tipoDominio;
        int tipoEdicao = FuncoesFX.getFinalizadora(det.getCodFinaliz()).edicao;

        double valorUnitario = 0;


        for(TotalOperDetalhesData oper : totalOperDetalhes) {

            inicializaDetalhes();
            oper = encontrarTotalOperDetalhes(loja, data, pdv, cupom, det.getTransacao(), nsu, cod_Finaliz, dom.getDominio(), contadorDetalhesDominio(con,loja, data, pdv, cupom, nsu, cod_Finaliz, dom.getDominio()));

            switch (tipoEdicao) {
                case 1: //Cartao

                    oper.setDominio(dom.getDominio());
                    oper.setTipo(tipoEdicao);
//					oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());

                    if(tipoDominio == 88) {
                        if(UtilDate.isDate(UtilDate.format(det.getDataPreDatado(), "dd/MM/yyyy"), "dd/MM/yyyy")){
                            oper.setCgcCpf(String.valueOf(VBDate.datetodouble(det.getDataPreDatado())));
                        }

                        if(Parametros.par0010TrataParcelaTef) {
                            if(det.getTipoTef() == 1) {//DEBITO
                                oper.setQtde(1);
                            }else {					   //CREDITO
                                if(det.getParcelas() == 0) {
                                    oper.setQtde(1);
                                }else {
                                    switch (det.getParcelas()) {
                                        case 0:
                                            oper.setQtde(1);
                                            break;
                                        default:
                                            oper.setQtde(det.getParcelas());
                                            break;
                                    }
                                }
                            }

                        }else {

                            if(det.getTipoTef() == 1) {//DEBITO
                                oper.setQtde(0);
                            }else {					   //CREDITO
                                switch (det.getParcelas()) {
                                    case 0:
                                        oper.setQtde(1);
                                        break;
                                    default:
                                        oper.setQtde(det.getParcelas());
                                        break;
                                }
                            }
                        }

                        oper.setDataVencimento(det.getDataPreDatado());
                        oper.setNsuSitef(det.getAutorizacao());
                        oper.setNsuHost(det.getNroDocto());
                        oper.setCmc7(det.getNroAutorizstr());
                        if(Parametros.par290UsaPreencheZero) {
                            if(Integer.parseInt(oper.getCmc7() ) == 0) {
                                oper.setCmc7("0");
                            }
                        }
                        oper.setBin(Integer.parseInt(limitaString(det.getNroCartao(), 6)));

                    }else {
                        oper.setCgcCpf(String.valueOf(VBDate.datetodouble(data)));
                        oper.setResponsavel(det.getCodigoRespons());
                        oper.setDataVencimento(det.getDataVencimento());

                        if(tipoDominio !=  88 && tipoDominio != 188) {
                            for (int x = 0; x < 6; x++) {

                                if (Integer.toString(getCritica(det.getCodFinaliz(), x)).indexOf("789") != -1) {
                                    if (!det.getConteudo()[x].trim().equals("")) {

                                        int year = Integer.parseInt(det.getConteudo()[x].substring(4, 8));
                                        int month = Integer.parseInt(det.getConteudo()[x].substring(2, 4));
                                        int day = Integer.parseInt(det.getConteudo()[x].substring(0, 2));

                                        Calendar cmc7Aux = Calendar.getInstance();
                                        cmc7Aux.set(year, month, day);

                                        if (isDateValid(year, month, day)) {
                                            Calendar calendar1 = Calendar.getInstance();
                                            calendar1.setTime(data); // Supondo que Data seja um objeto java.util.Date
                                            Calendar calendar2 = Calendar.getInstance();
                                            calendar2.setTime(cmc7Aux.getTime()); // Supondo que cmc7Aux seja um objeto

                                            int diffInDays = dateDiffInDays(calendar1.getTime(), calendar2.getTime());

                                            if (diffInDays < 60 && diffInDays < 0) {
                                                cmc7Aux.set(year, day, month);
                                            }
                                            oper.setDataVencimento(cmc7Aux.getTime());
                                        }
                                    }
                                    break;
                                }
                            }

                            for (int x = 1; x <= 5; x++) {
                                if (getCritica(det.getCodFinaliz(), x) == 1) {
                                    if (Double.parseDouble(det.getConteudo()[x]) < 25) {
                                        oper.setQtde(Integer.parseInt(det.getConteudo()[x]));
                                    }
                                    break;
                                }
                            }
                        }

                        oper.setNsuSitef(Double.parseDouble(retConteudo(det.getCodFinaliz(), det.getConteudo(),TipoConteudo.TIPO_AUTORIZACAO.getValor(), String.valueOf(det.getNsuSitef()))));

                        if (oper.getNsuSitef() == 0) {
                            oper.setNsuSitef(Double.parseDouble(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_NUM_AUTORIZ.getValor(), String.valueOf(oper.getNsuSitef()))));
                        }
                        oper.setNsuHost(Double.parseDouble(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_NUM_DOCTO.getValor(), String.valueOf(oper.getNsuHost()))));

                        oper.setBin(Integer.parseInt(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_NUM_CARTAO.getValor(), String.valueOf(oper.getBin()))));

                        oper.setEmboco(Integer.parseInt(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_EMBOCO.getValor(), String.valueOf(oper.getEmboco()))));

                        oper.setRo(Integer.parseInt(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_RO.getValor(), String.valueOf(oper.getRo()))));

                        oper.setQtde(Integer.parseInt(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_NUM_PARCELAS.getValor(), String.valueOf(oper.getQtde()))));

                        oper.setCmc7(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_NUM_AUTORIZ.getValor(), oper.getCmc7()));

                        if (oper.getCmc7() == null) {
                            oper.setCmc7(retConteudo(det.getCodFinaliz(), det.getConteudo(), TipoConteudo.TIPO_AUTORIZACAO.getValor(), oper.getCmc7()));
                        }

//							oper.setNumCupomCompra(det.getNumCupom());
//							oper.setNsuCompra(det.getNsuInicial());
//							oper.setNsuFinaliz(det.getNsu());
//							oper.setEventoCupom(det.getEventoCupom());
//							oper.setEventoNsu(det.getEventoNsu());
                        oper.setTxId(det.getCmc7());
                    }
                    break;

                case 2: //CHEQUE

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setCgcCpf(det.getConteudo()[0]);
                    oper.setBanco(det.getBanco());
                    oper.setAgencia(Integer.parseInt(soNumeros(det.getConteudo()[1])));
                    oper.setConta(Double.parseDouble(det.getConteudo()[2]));
                    oper.setCheque(Double.parseDouble(det.getConteudo()[3]));
//				oper.setResponsavel(det.getCodigoRespons());

                    if (soNumeros(det.getCmc7()).length() > 20) {
                        String cmc7Aux = soNumeros(det.getCmc7());

                        if (det.getTipoDadosCheque() == 3) { // linha 1
                            oper.setComp(isNumber(mid(cmc7Aux, 1, 3)) ? Integer.parseInt(mid(cmc7Aux, 1, 3)) : 0);
                            oper.setC1(isNumber(mid(cmc7Aux, 11, 3)) ? Integer.parseInt(mid(cmc7Aux, 11, 3)) : 0);
                            oper.setC2(isNumber(mid(cmc7Aux, 22, 1)) ? Integer.parseInt(mid(cmc7Aux, 22, 1)) : 0);
                            oper.setC3(isNumber(mid(cmc7Aux, 35, 1)) ? Integer.parseInt(mid(cmc7Aux, 35, 1)) : 0);
                        } else { // lido ou digitado
                            oper.setComp(isNumber(mid(cmc7Aux, 9, 3)) ? Integer.parseInt(mid(cmc7Aux, 9, 3)) : 0);
                            oper.setC1(isNumber(mid(cmc7Aux, 19, 1)) ? Integer.parseInt(mid(cmc7Aux, 19, 1)) : 0);
                            oper.setC2(isNumber(mid(cmc7Aux, 8, 1)) ? Integer.parseInt(mid(cmc7Aux, 8, 1)) : 0);
                            oper.setC3(isNumber(mid(cmc7Aux, 30, 1)) ? Integer.parseInt(mid(cmc7Aux, 30, 1)) : 0);
                        }
                        oper.setTipoMovto(det.getTipoDadosCheque() > 5 ? 1 : det.getTipoDadosCheque());
                        oper.setCmc7(cmc7Aux);
                    }

//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    oper.setTipoEvento(0);

                    if(Parametros.par0210UsaPedidoAV == 1) {
                        if(det.getTipo() == 250) {
                            oper.setNroPedido((int) det.getCampos()[4]);

                            int valor = Integer.parseInt(valorString(det.getConteudo()[4], 1, ";"));
                            oper.setNroNegociacao(valor < 255 ? valor : 0);
                        }
                    }
                    break;

                case 3: //TICKET
                    valorUnitario = det.getValor();

                    oper.setValorUnitario(valorUnitario);
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setNsu(det.getEventoNsu());
                    break;

                case 5: //CONVENIO CENTRAL

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());

                    if (Integer.parseInt(soNumeros(det.getConteudo()[5])) > 0 && Integer.parseInt(soNumeros(det.getConteudo()[5])) < 4) {
                        oper.setBanco(Integer.parseInt(soNumeros(det.getConteudo()[5])));
                    }
                    if (Integer.parseInt(det.getConteudo()[6]) > 0) {
                        oper.setCgcCpf(det.getConteudo()[6]);
                        oper.setCmc7(det.getConteudo()[6]);
                    } else {
                        oper.setCgcCpf(String.valueOf(det.getCodigoUsuario()));
                    }

//				oper.setConta(Double.parseDouble(det.getCodigoRespons()));
//				oper.setHora(det.getData());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 6:
                case 13:
                case 28: //OUTROS DOCUMENTOS / DESPESA / CRÉDITO ANTECIPADO

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());

//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
//
                    break;

                case 8://PROMISSORIA

                    valorUnitario = det.getValor();
                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
                    oper.setValorUnitario(valorUnitario);
                    oper.setCgcCpf(det.getConteudo()[0]);
                    oper.setContador(contadorDetalhesDominio(con,loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(oper.getValor() + det.getValor());
                    oper.setValorOrigem(oper.getValorOrigem() + det.getValor());
                    oper.setQtde(oper.getQtde() + (det.getQtde()));

                    if (oper.getQtde() == 0) {
                        oper.setQtde(1);
                    }

                    oper.setCgcCpf(det.getConteudo()[0]);
                    oper.setValorOrigem(valorUnitario);
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 7:
                case 9: //ESTORNO / DEVOLUÇÃO

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setObservacao("Devolução");
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setValorCompra(det.getValor());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 10:
                case 11:
                case 12: //Convenio 10-ASU / 11-CSC - (Central Botucatu)

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio()); //CODIGO DA EMPRESA
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    if (Integer.parseInt(det.getConteudo()[6]) > 0) {
                        oper.setCgcCpf(det.getConteudo()[6]);
                        oper.setCmc7(det.getConteudo()[6]);
                    } else {
                        oper.setCgcCpf(String.valueOf(det.getCodigoUsuario()));
                    }
                    oper.setConta(Double.parseDouble(det.getCodigoRespons()));
                    oper.setHora(det.getData());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    if (tipoEdicao != 12) {
                        Conv convTesouraria = new Conv();
                        if (tipoEdicao == 11) {
                            convTesouraria.setCodigo(Double.parseDouble(det.getConteudo()[3]));
                            convTesouraria.setDescricao(det.getConteudo()[4].trim());
                            // TODO : atualiza empresa
                            // cTotal.AtualizarEmprCSC
                            convTesouraria.setCodigo(det.getCodigoUsuario());
                            convTesouraria.setDescricao(det.getConteudo()[6].trim());
                            // TODO : atualiza conv
                            // cTotal.AtualizarConvCSC
                        } else {
                            convTesouraria.setCodigo(det.getCodigoUsuario());
                            convTesouraria.setDescricao(det.getConteudo()[6]);
                        }
                    }

                    break;

                case 15://BOLETO

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    if(oper.getQtde() == 0) {
                        oper.setQtde(1);
                    }
                    for(int i = 0; i < 6; i++){
                        switch (getCritica(det.getCodFinaliz(), i)) {
                            case 2:
                            case 3:
                            case 4:
                                if (Parametros.par0118TipoBoleto == 1) {
                                    oper.setCgcCpf(det.getConteudo()[i]);
                                    oper.setCmc7(det.getConteudo()[5]);
                                } else {
                                    oper.setCgcCpf(soNumeros(det.getConteudo()[i]));
                                    oper.setCmc7(det.getConteudo()[6]);
                                }
                                break;
                        }
                    }

                    oper.setBanco(det.getBanco());
                    oper.setDataVencimento(det.getDataVencimento());
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 16://CARTA DE CRÉDITO

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setResponsavel(String.valueOf(det.getCodigo()));
                    if(Integer.parseInt(det.getConteudo()[5]) == 0) {
                        oper.setNsuSitef(Double.parseDouble(soNumeros(retCartaCredito(det.getConteudo()[0]).substring(1, 9))));//Número da Carta de Crédito
                    }else {
                        oper.setNsuSitef(Double.parseDouble(soNumeros(det.getConteudo()[6].trim().substring(1, 9))));//Número da Carta de Crédito
                    }

                    if(Integer.parseInt(det.getConteudo()[6]) != 0) {
                        oper.setNsuHost(Double.parseDouble(soNumeros(det.getConteudo()[6].trim().substring(1, 9))));//Número da Autorizacao
                    }

//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 17://Vale Troca

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setResponsavel(det.getCodigoRespons());
                    oper.setCmc7(String.valueOf(det.getCodigoUsuario()));
                    oper.setNsuSitef(det.getCodigoUsuario());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
                    oper.setDataVencimento(det.getDataVencimento());
                    break;

                case 19://Dolar

                    valorUnitario = det.getValor();
                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(oper.getValor() + det.getValor());
                    oper.setValorOrigem(oper.getValorOrigem() + det.getValor());
                    oper.setValorUnitario(oper.getValorUnitario() + valorUnitario);
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 21: //Deposito em conta (nagem)

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
//				oper.setResponsavel(String.valueOf(det.getCodigo()));
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 22://Cartao Presente (nagem)
                case 23://Cartao Compra (nagem)

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setCmc7(det.getConteudo()[5].trim());
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 24://Troca (nagem)

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setResponsavel(det.getCodigoRespons());
                    oper.setCmc7(String.valueOf(det.getCodigoUsuario()));
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    oper.setDataVencimento(det.getDataVencimento());
                    break;

                case 25:

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setObservacao("DEVOLUÇÃO");
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 26://Troca / Credito (Potiguar)

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setBanco(Integer.parseInt(det.getConteudo()[3]));
                    oper.setCheque(Double.parseDouble(det.getConteudo()[4]));
                    oper.setConta(Double.parseDouble(det.getConteudo()[6]));
                    oper.setCmc7(det.getConteudo()[5]);
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());

                    break;

                case 27: //Outros Documentos (Cpf Cupom)

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                case 29://Planos

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
                    oper.setConta(det.getPlano());

                    for (int x = 0; x < 6; x++) {
                        switch (getCritica(det.getCodFinaliz(), x)) {
                            case 2:
                            case 3:
                            case 4:
                                oper.setCgcCpf(det.getConteudo()[x]);
                                break;
                        }
                    }
//				oper.setResponsavel(det.getCodigoRespons());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());

                    break;

                case 47://finalizadora trocada

                    oper.setTipo(tipoEdicao);
                    oper.setDominio(dom.getDominio());
//				oper.setContador(contadorDetalhesDominio(loja, data, pdv, cupom, nsu, det.getCodFinaliz(), dom.getDominio()));
                    oper.setValor(det.getValor());
                    oper.setValorOrigem(det.getValor());
//				oper.setNumCupomCompra(det.getNumCupom());
//				oper.setNsuCompra(det.getNsuInicial());
//				oper.setNsuFinaliz(det.getNsu());
                    oper.setRo(det.getNumCupom());
//				oper.setResponsavel(String.valueOf(det.getCodigoRespons()));
//				oper.setEventoCupom(det.getEventoCupom());
//				oper.setEventoNsu(det.getEventoNsu());
                    break;

                default:
                    oper.setFinalizadora(cod_Finaliz);
                    break;
            }

            oper.setResponsavel(String.valueOf(det.getCodigoRespons()));
            oper.setNumCupomCompra(det.getNumCupom());
            oper.setNsuCompra(det.getNsuInicial());
            oper.setNsuFinaliz(det.getNsu());
            oper.setEventoCupom(det.getEventoCupom());
            oper.setEventoNsu(det.getEventoNsu());

        }
    }

    //retFin = carrega total retirada
    public void incluiFinalizaDet(Conexao con ,int loja, Date data, int pdv, int cupom, int nsu, List<DefRetFin> regRetFin) {

        int tipoTef = 0;

        TotalOperFinalizadoraDetalhesData o = new TotalOperFinalizadoraDetalhesData();

        if (regRetFin.size() > 0) {
            String sql = "SELECT D.LOJA, D.DATA, D.NUM_PDV, D.NUM_CUPOM, D.TRANSACAO, D.COD_FINALIZ, D.NSU, D.NSU_INICIAL, D.HORA, D.VALOR, D.CONTEUDO01, D.CONTEUDO02, D.CONTEUDO03," +
                    " D.CONTEUDO04, D.CONTEUDO05, D.CONTEUDO06, D.CONTEUDO07, D.CONTEUDO08, D.DATAVENCIMENTO, D.CANCELADO, D.TIPOUSO as TIPO_COMPRA, P.TIPOUSO as TIPO_PAGTO," +
                    " S.TIPO, S.CODIGOREDE, S.CODIGO, S.VALOR01, S.VALOR02, S.VALOR03, S.VALOR04, S.VALOR05, S.VALOR06, S.VALOR07, S.VALOR08, D.EVENTO_CUPOM, D.EVENTO_NSU," +
                    " T.TIPOTEF, T.SUBTIPO, T.CODIGOREDE AS CODIGOREDETEF, T.PARCELAS, T.DATAPREDATADO, T.TIPOVENDA, T.TIPOMES, T.TIPOAUTORIZACAO, T.AUTORIZACAO, T.NRODOCTO," +
                    " T.NROCARTAO, T.NSU_FINALIZADORA, T.NSUINICIAL, T.NROAUTORIZ, T.NROAUTORIZSTR, T.CODIGOBANDEIRA, T.NOMEBANDEIRA, D.TIPOUSO, D.CMC7, D.BANCO" +
                    " FROM VW_FINALIZADORA_DET_LOG D" +
                    " LEFT JOIN VW_TOTAL_CUPOM_LOG C" +
                    " ON (D.LOJA = C.LOJA) AND (D.DATA = C.DATA) AND (D.NUM_PDV = C.NUM_PDV) AND (D.NUM_CUPOM = C.NUM_CUPOM) AND (D.NSU_INICIAL = C.NSU_INICIAL)" +
                    " LEFT JOIN VW_TOTAL_PAGAMENTOS_LOG P " +
                    " ON (D.LOJA = P.LOJA) AND (D.DATA = P.DATA) AND (D.NUM_PDV = P.NUM_PDV) AND (D.NUM_CUPOM = P.NUM_CUPOM) AND (D.NSU_INICIAL = P.NSUINICIAL)" +
                    " LEFT JOIN VW_TEF_LOG T" +
                    " ON (D.LOJA = T.LOJA) AND (D.DATA = T.DATA) AND (D.NUM_PDV = T.NUM_PDV) AND (D.NUM_CUPOM = T.NUM_CUPOM) AND (D.NSU = T.NSU_FINALIZADORA)" +
                    " LEFT JOIN VW_PAGAMENTOS_LOG S " +
                    " ON (D.LOJA = S.LOJA) AND (D.DATA = S.DATA) AND (D.NUM_PDV = S.NUM_PDV) AND (D.NUM_CUPOM = S.NUM_CUPOM) AND (D.NSU_INICIAL = S.NSUINICIAL) AND (S.NSU = S.NSUINICIAL)" +
                    " WHERE D.LOJA = " + con.toString(loja) +
                    " AND D.DATA = " + con.toString(data) +
                    " AND D.NUM_PDV = " + con.toString(pdv) +
                    " AND D.CANCELADO = 0" +
                    " AND ( ";
            for (int x = 0; x < regRetFin.size(); x++) {
                if (x > 0) {
                    sql = sql + " or ";
                }
                sql = sql + " (D.COD_FINALIZ = " + con.toString(regRetFin.get(x).getFinalizadora()) +
                        " AND D.NSU >= " + con.toString(regRetFin.get(x).getNsuIni()) +
                        " AND D.NSU <= " + con.toString(regRetFin.get(x).getNsuFin()) + ")";
            }
            sql = sql + ") ORDER BY D.NSU";
            IRecordSet rst = con.getRecordSet(sql);

            while (rst.next()) {
                inicializaFinDet();

                /*  encontrar finalizDet */
//				o = encontrarFinalizDet(loja, data, pdv, cupom, nsu, nsu, nsu, nsu);

                /* alimenta objeto */
                o.setLoja(rst.getInt("LOJA"));
                o.setData(rst.getDate("DATA"));
                o.setNumPdv(rst.getInt("NUM_PDV"));
                o.setNumCupom(rst.getInt("NUM_CUPOM"));
//				o.setSequencial(rst.getInt("SEQUENCIAL"));
                o.setNsu(rst.getInt("NSU"));

                //TODO verificar ajuste para a transação
                o.setTransacao(rst.getInt("TRANSACAO"));

                o.setCodFinaliz(rst.getInt("COD_FINALIZ"));
                o.setNsuInicial(rst.getInt("NSU_INICIAL"));
                o.setHora(rst.getDate("HORA"));
                o.setValor(rst.getDouble("VALOR"));

                o.setConteudo(new String[]{rst.getString("CONTEUDO01"),
                        rst.getString("CONTEUDO02"),
                        rst.getString("CONTEUDO03"),
                        rst.getString("CONTEUDO04"),
                        rst.getString("CONTEUDO05"),
                        rst.getString("CONTEUDO06"),
                        rst.getString("CONTEUDO07"),
                        rst.getString("CONTEUDO08")
                });

                o.setDataVencimento(rst.getDate("DATAVENCIMENTO"));
                o.setCancelado(rst.getInt("CANCELADO"));
                o.setTipoCompra(rst.getInt("TIPO_COMPRA"));
                o.setTipoPagto(rst.getInt("TIPO_PAGTO"));
                o.setTipo(rst.getInt("TIPO"));
                o.setCodigoRede(rst.getInt("CODIGOREDE"));
                o.setCodigo(rst.getInt("CODIGO"));

                o.setValores(new double[] {rst.getDouble("VALOR01"),
                        rst.getDouble("VALOR02"),
                        rst.getDouble("VALOR03"),
                        rst.getDouble("VALOR04"),
                        rst.getDouble("VALOR05"),
                        rst.getDouble("VALOR06"),
                        rst.getDouble("VALOR07"),
                        rst.getDouble("VALOR08")
                });

                o.setEventoCupom(rst.getInt("EVENTO_CUPOM"));
                o.setEventoNsu(rst.getInt("EVENTO_NSU"));
                o.setTipoTef(rst.getInt("TIPOTEF"));
                o.setSubTipo(rst.getInt("SUBTIPO"));
                o.setCodigoRedeTef(rst.getInt("CODIGOREDETEF"));
                o.setParcelas(rst.getInt("PARCELAS"));
                o.setDataPreDatado(rst.getDate("DATAPREDATADO"));
                o.setTipoVenda(rst.getInt("TIPOVENDA"));
                o.setTipoMes(rst.getInt("TIPOMES"));
                o.setTipoAutorizacao(rst.getInt("TIPOAUTORIZACAO"));
                o.setAutorizacao(rst.getInt("AUTORIZACAO"));
                o.setNroDocto(rst.getInt("NRODOCTO"));
                o.setNroCartao(rst.getString("NROCARTAO"));
                o.setNsuFinalizadora(rst.getInt("NSU_FINALIZADORA"));
                o.setNsuInicial(rst.getInt("NSUINICIAL"));
                o.setNroAutoriz(rst.getString("NROAUTORIZ"));
                o.setNroAutorizstr(rst.getString("NROAUTORIZSTR"));
                o.setCodigoBandeira(rst.getInt("CODIGOBANDEIRA"));
                o.setNomeBandeira(rst.getString("NOMEBANDEIRA"));
                o.setTipoUso(rst.getInt("TIPOUSO"));
                o.setCmc7(rst.getString("CMC7"));
                o.setBanco(rst.getInt("BANCO"));
//		    	o.setTipoTroca(rst.getInt("TIPOTROCA"));
//		    	o.setCodigoRespons(rst.getString("CODIGORESPONS"));

                importaFinalizadora(con, loja, data, pdv, cupom, nsu, o);

                switch (tipoTef) {
                    case 122:
                        o.setCodFinaliz(1);
                        o.setValor(valorPixTroco(loja, data, pdv, o.getNumCupom()));
                        o.setTransacao(30);
                        importaFinalizadora(con, loja, data, pdv, cupom, nsu, o);
                        o.setCodFinaliz(1);
                        o.setValor(o.getValor() * -1);

                        if (Parametros.par0314UsaExibePixSaqueNegativo) {
                            // TODO - retRedePagto
                            o.setTransacao(retRedePagtoTeste(122, 0, defTipoTransacaoList.toString(), Parametros.par0086UsaFatura2, "", 0, 0, tipoTef));
                        }
                        importaFinalizadora(con,loja, data, pdv, cupom, nsu, o);
                        break;

                    case 124:
                        o.setTransacao(retRedePagtoTeste(rst.getInt("TIPO"), rst.getInt("CODIGOREDE"), defTipoTransacaoList.toString(), Parametros.par0086UsaFatura2, "", 0, 0, tipoTef));
                        o.setCodFinaliz(redirecionaFinalizadora(Parametros.par0312parFinalizadoraPixSaque));
                        o.setValor(o.getValor() * -1);
                        importaFinalizadora(con,loja, data, pdv, cupom, nsu, o);
                        break;
                    default:
                        break;
                }
            }
            o = new TotalOperFinalizadoraDetalhesData();

            rst.close();

        }
    }

    public void importaFinalizadora(Conexao con, int loja, Date data, int pdv, int cupom, int nsu, TotalOperFinalizadoraDetalhesData o) {

        TotalOperDominioData dtDom = new TotalOperDominioData();
        TotalOperFinalizData dtFinaliz = new TotalOperFinalizData();

        int cod_Finaliz = 0;
        int tipoDominio = 0;
        int tipoEdicao = 0;
        double dominio = 0.0d;

        if(o.getCodFinaliz() == 1 && Parametros.par0050UsaImportaRetirada) {
            if(Parametros.par0237UsaTrocaFinalizPdv && o.getTipoTroca() == 2){
                o.setValor(o.getValorTroca());
            }
        }

        cod_Finaliz = o.getCodFinaliz();

        if(o.getTipoTroca() == 2){
            o.setCodFinaliz(47);
        }

        tipoDominio = FuncoesFX.getFinalizadora(o.getCodFinaliz()).tipoDominio;
        tipoEdicao = FuncoesFX.getFinalizadora(o.getCodFinaliz()).edicao;

        switch (tipoDominio) {
            case 0:
                dominio = 0;
                break;

            case 10: //planos
                if(Integer.parseInt(o.getConteudo()[2]) > 0) {
                    dominio = Double.parseDouble(o.getConteudo()[2]);
                }
                break;

            case 47: //finalizadora trocada
                dominio = cod_Finaliz;
                break;

            case 66: //Convênio Central
                if (Double.parseDouble(o.getConteudo()[6]) > 0) {
                    convenio.setCodigoConv(Double.parseDouble(o.getConteudo()[6]));
                }else {
                    convenio.setCodigoConv(o.getCodigo());
                }

                if (consultaConv(convenio.getCodigoConv())) {
                    dominio = convenio.getvCodigoConvEpre();
                } else {
                    dominio = 0;
                }
                break;

            case 77: //CONVENIO
                dominio = o.getCodigo();
                break;

            case 78: //Convenio 10-ASU / 11-CSC / CELTA - (Central Botucatu)
                switch (tipoEdicao) {
                    case 10:
                        dominio = 78;
                        break;

                    case 11:
                        if (Double.parseDouble(o.getConteudo()[3]) > 0) {
                            dominio = Double.parseDouble(o.getConteudo()[3]);
                        } else {
                            dominio = 78;
                        }
                        break;

                    case 12: //CELTA
                        dominio = (Double.parseDouble(o.getCodigoRespons()));
                        break;

                    default:
                        dominio = 0;
                        break;
                }
                break;

            case 88:
            case 188://Tef 'Gravar a Finalizadora
                dominio = retDominioTef(con,loja, data, pdv, o.getNumCupom(), o.getNsu());

                if (tipoDominio == 188) {
                    if (Integer.parseInt("0" + o.getConteudo()[5]) != 0) {
                        dominio = Integer.parseInt("0" + o.getConteudo()[5]);
                    }
                }
                break;

            case 99:
                dominio = VBDate.datetodouble(o.getDataVencimento());
                break;

            default:
                dominio = finalizadoraComposicao(o);
                break;
        }

        //CARREGA OUTRAS DEF'S
        /* insere em total_oper_finaliz */
        incluiTotalOperFializ(loja, data, pdv, cupom, o.getTransacao(), nsu, cod_Finaliz, o);

        /* insere em total_oper_dominio */
        incluiTotalOperDominio(loja, data, pdv, cupom, o.getTransacao(), nsu, cod_Finaliz, dominio, o);

        /* insere em total_oper_lanctos */
        incluiTotalOperLanctos(loja, data, pdv, cupom, o.getTransacao(), nsu, cod_Finaliz, dominio, o);

        if(o.getTransacao() == 9) {
            dtFinaliz.setLoja(loja);
            dtFinaliz.setData(data);
            dtFinaliz.setNumPdv(pdv);
            dtFinaliz.setNumCupom(cupom);
            dtFinaliz.setNsu(nsu);
            dtFinaliz.setTransacao(30);
            dtFinaliz.setFinalizadora(1);
            dtFinaliz.setStatus(0);

            dtDom.setLoja(loja);
            dtDom.setData(data);
            dtDom.setNumPdv(pdv);
            dtDom.setNumCupom(cupom);
            dtDom.setNsu(nsu);
            dtDom.setTransacao(30);
            dtDom.setFinalizadora(o.getCodFinaliz());
            dtDom.setDominio(dominio);
        }

        if (FuncoesFX.getFinalizadora(cod_Finaliz).tipoDominio != 0 && FuncoesFX.getFinalizadora(cod_Finaliz).edicao != 0) {
            incluiDetalhes(loja, pdv, cupom, data, cod_Finaliz, nsu, dtDom, o);
        }
    }

    /*METODOS DE GRAVAR NA TABELA*/
    public void gravaTotalOper(Conexao con,int loja, Date data, int pdv, int cupom, int transacao, int nsu) {

        String sqlDel = "DELETE FROM TOTAL_OPER" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom ;
        con.executeSQL(sqlDel);


        for (TotalOperData oper : totalOper) {
            int operador = Integer.parseInt(oper.getOperador());

            SQLCreator sql = new SQLCreator("TOTAL_OPER");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("HORA", con.toString(oper.getHora()));
            sql.addCampo("OPERADOR" , con.toString(operador));
            sql.addCampo("VENDA_BRUTA", con.toString(oper.getVendaBruta()));
            sql.addCampo("DESCONTOS", con.toString(oper.getDescontos()));
            sql.addCampo("CANCELAMENTOS",con.toString(oper.getCancelamentos()));
            sql.addCampo("QT_ITENS_CANC",con.toString(oper.getQtItensCanc()));
            sql.addCampo("QT_CUPONS_CANC",con.toString(oper.getQtCuponsCanc()));
            sql.addCampo("RESPONSAVEL",con.toString(oper.getResponsavel()));
            sql.addCampo("HORA_ENTRADA",con.toString(oper.getHoraEntrada()));
            sql.addCampo("HORA_SAIDA",con.toString(oper.getHoraSaida()));
            sql.addCampo("QT_ITENS",con.toString(oper.getQtItens()));
            sql.addCampo("QTD_ITENSVENDA",con.toString(oper.getQtdItensVenda()));
            sql.addCampo("QTD_CUPONSVENDA",con.toString(oper.getQtdCuponsVenda()));
            sql.addCampo("TEMPO_VENDA",con.toString(oper.getTempoVenda()));
            sql.addCampo("TEMPO_PAUSA",con.toString(oper.getTempoPausa()));
            sql.addCampo("TEMPO_DISP",con.toString(oper.getTempoDisp()));
            sql.addCampo("TEMPO_RECEB",con.toString(oper.getTempoReceb()));
            sql.addCampo("GTINICIAL",con.toString(oper.getGtInicial()));
            sql.addCampo("GTFINAL",con.toString(oper.getGtFinal()));
            sql.addCampo("RECEBIMENTOS",con.toString(oper.getRecebimentos()));
            sql.addCampo("PAGAMENTOS",con.toString(oper.getPagamentos()));
            sql.addCampo("NSUINICIAL",con.toString(oper.getNsuInicial()));
            sql.addCampo("NSUFINAL",con.toString(oper.getNsuFinal()));
            sql.addCampo("NSURETIRADA",con.toString(oper.getNsuRetirada()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperDetalhes(Conexao con, int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio, int contador) {

        String sqlDel = "DELETE FROM TOTAL_OPER_DETALHES" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom ;
        con.executeSQL(sqlDel);

        for(TotalOperDetalhesData oper : totalOperDetalhes) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_DETALHES");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA",con.toString(oper.getData()));
            sql.addCampo("NUM_PDV",con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM",con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO",con.toString(oper.getTransacao()));
            sql.addCampo("NSU",con.toString(oper.getNsu()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("DOMINIO",con.toString(oper.getDominio()));
            sql.addCampo("CONTADOR",con.toString(oper.getContador()));
            sql.addCampo("TIPO",con.toString(oper.getTipo()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("VALORORIGEM",con.toString(oper.getValorOrigem()));
            sql.addCampo("CGCCPF",con.toString(oper.getCgcCpf()));
            sql.addCampo("COMP",con.toString(oper.getComp()));
            sql.addCampo("BANCO",con.toString(oper.getBanco()));
            sql.addCampo("AGENCIA",con.toString(oper.getAgencia()));
            sql.addCampo("C1",con.toString(oper.getC1()));
            sql.addCampo("CONTA",con.toString(oper.getConta()));
            sql.addCampo("C2",con.toString(oper.getC2()));
            sql.addCampo("CHEQUE",con.toString(oper.getCheque()));
            sql.addCampo("C3",con.toString(oper.getC3()));
            sql.addCampo("OBSERVACAO",con.toString(oper.getObservacao()));
            sql.addCampo("QTDE",con.toString(oper.getQtde()));
            sql.addCampo("VALOR_UNITARIO",con.toString(oper.getValorUnitario()));
            sql.addCampo("DATAVENCIMENTO",con.toString(oper.getDataVencimento()));
            sql.addCampo("EXPORTAR",con.toString(oper.getExportar()));
            sql.addCampo("CMC7",con.toString(oper.getCmc7()));
            sql.addCampo("NUM_CUPOM_COMPRA",con.toString(oper.getNumCupomCompra()));
            sql.addCampo("HORA",con.toString(oper.getHora()));
            sql.addCampo("NSU_COMPRA",con.toString(oper.getNsuCompra()));
            sql.addCampo("VALORCOMPRA",con.toString(oper.getValorCompra()));
            sql.addCampo("DESCONTO",con.toString(oper.getDesconto()));
            sql.addCampo("TIPOMOVTO",con.toString(oper.getTipoMovto()));
            sql.addCampo("RESPONSAVEL",con.toString(oper.getResponsavel()));
            sql.addCampo("MOTIVO",con.toString(oper.getMotivo()));
            sql.addCampo("NSU_SITEF",con.toString(oper.getNsuSitef()));
            sql.addCampo("NSU_HOST",con.toString(oper.getNsuHost()));
            sql.addCampo("BIN",con.toString(oper.getBin()));
            sql.addCampo("EMBOCO",con.toString(oper.getEmboco()));
            sql.addCampo("RO",con.toString(oper.getRo()));
            sql.addCampo("DEPOSITO",con.toString(oper.getDeposito()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEventoCupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEventoNsu()));
            sql.addCampo("TIPO_EVENTO",con.toString(oper.getTipoEvento()));
            sql.addCampo("NROPEDIDO",con.toString(oper.getNroPedido()));
            sql.addCampo("NRONEGOCIACAO",con.toString(oper.getNroNegociacao()));
            sql.addCampo("NSU_FINALIZ",con.toString(oper.getNsuFinaliz()));
            sql.addCampo("TXTID",con.toString(oper.getTxId()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperDominio(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio) {

        String sqlDel = "DELETE FROM TOTAL_OPER_DETALHES" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom ; ;
        con.executeSQL(sqlDel);

        for(TotalOperDominioData oper : totalOperDominio ) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_DOMINIO");
            sql.addCampo("LOJA",con.toString(oper.getLoja()));
            sql.addCampo("DATA",con.toString(oper.getData()));
            sql.addCampo("NUM_PDV",con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM",con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO",con.toString(oper.getTransacao()));
            sql.addCampo("NSU",con.toString(oper.getNsu()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("DOMINIO",con.toString(oper.getDominio()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO",con.toString(oper.getValorCorrigido()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperFinaliz(int loja, Date data, int pdv, int cupom, int transacao, int nsu){

        String sqlDel = "DELETE FROM TOTAL_OPER_DETALHES" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperFinalizData oper : totalOperFinaliz) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_FINALIZ");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("FINALIZADORA", con.toString(oper.getFinalizadora()));
            sql.addCampo("VALOR", con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO", con.toString(oper.getValorCorrigido()));
            sql.addCampo("STATUS", con.toString(oper.getStatus()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperLanctos(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int finalizadora, double dominio) {

        String sqlDel = "DELETE FROM TOTAL_OPER_LANCTOS" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperLanctosData oper : totalOperLanctos) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_FINALIZ");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("FINALIZADORA", con.toString(oper.getFinalizadora()));
            sql.addCampo("DOMINIO", con.toString(oper.getDominio()));
            sql.addCampo("VALOR", con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO", con.toString(oper.getValorCorrigido()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperAcerto(int loja, Date data, int pdv, int cupom, int transacao, int nsu,int nsuRet, int numCupomRet) {

        String sqlDel = "DELETE FROM FINALIZADORA_OPER_ACERTO" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperAcertoData oper : totalOperAcerto) {
            SQLCreator sql = new SQLCreator("FINALIZADORA_OPER_ACERTO");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("COD_FINALIZ",con.toString(oper.getCodigoFinaliz()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("NSU_RETIRADA",con.toString(oper.getNsuRetirada()));
            sql.addCampo("NUM_CUPOM_RETIRADA",con.toString(oper.getNumCupomRetirada()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("TOTALINFORMADO",con.toString(oper.getTotalInformado()));
            sql.addCampo("HORA_RETIRADA",con.toString(oper.getHoraRetirada()));
            sql.addCampo("OPERADOR",con.toString(oper.getOperador()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperVale(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int contador) {

        String sqlDel = "DELETE FROM TOTAL_OPER_VALES" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperValeData oper : totalOperVale) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_VALES");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("CONTADOR",con.toString(oper.getContador()));
            sql.addCampo("OPERADOR",con.toString(oper.getOperador()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("STATUS",con.toString(oper.getStatus()));
            sql.addCampo("DATA_PAGTO",con.toString(oper.getDataPagto()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEvento_cupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEvento_nsu()));
            sql.addCampo("NUM_PDV_PGTO",con.toString(oper.getNumPdvPgto()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperDia(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int codFinaliz) {

        String sqlDel = "DELETE FROM FINALIZADORA_OPER_DIA" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperDiaData oper : totalOperDia) {
            SQLCreator sql = new SQLCreator("FINALIZADORA_OPER_DIA");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("COD_FINALIZZ",con.toString(oper.getCodFinaliz()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("HORA",con.toString(oper.getHora()));
            sql.addCampo("OPERADOR",con.toString(oper.getOperador()));
            sql.addCampo("VAL_RECEBIDO",con.toString(oper.getValRecebido()));
            sql.addCampo("VAL_RETIRADO",con.toString(oper.getValRetirado()));
            sql.addCampo("VAL_REABASTECIDO",con.toString(oper.getValReabastecido()));
            sql.addCampo("QT_RECEBIDO",con.toString(oper.getQtRecebido()));
            sql.addCampo("QT_RETIRADO",con.toString(oper.getQtRetirado()));
            sql.addCampo("QT_REABASTECIDO",con.toString(oper.getQtReabastecido()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperResgate(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        String sqlDel = "DELETE FROM TOTAL_OPER_RESGATE" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperResgateData oper : totalOperResgate) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_RESGATE");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("SEQUENCIA", con.toString(oper.getSequencia()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO",con.toString(oper.getValorCorrigido()));
            sql.addCampo("CODIGORESGATE",con.toString(oper.getCodigoResgate()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("NUM_CUPOM_COMPRA",con.toString(oper.getNumCupomCompra()));
            sql.addCampo("HORA",con.toString(oper.getHora()));
            sql.addCampo("NSU_COMPRA",con.toString(oper.getNsuCompra()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEventoCupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEventoNsu()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperSaque (int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        String sqlDel = "DELETE FROM TOTAL_OPER_SAQUE" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperSaqueData oper : totalOperSaque) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_SAQUE");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("SEQUENCIA", con.toString(oper.getSequencia()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO",con.toString(oper.getValorCorrigido()));
            sql.addCampo("CODIGOSAQUE",con.toString(oper.getCodigoSaque()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("NUM_CUPOM_COMPRA",con.toString(oper.getNumCupomCompra()));
            sql.addCampo("HORA",con.toString(oper.getHora()));
            sql.addCampo("NSU_COMPRA",con.toString(oper.getNsuCompra()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEventoCupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEventoNsu()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperSuplente (int loja, Date data, int pdv, int cupom, int transacao, int nsu, int numCupomTransacao, int nsuTransacao) {

        String sqlDel = "DELETE FROM TOTAL_OPER_SUPLENTE" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperSuplenteData oper : totalOperSuplente) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_SUPLENTE");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("NUM_CUPOM_TRANSACAO",con.toString(oper.getNumCupomTransacao()));
            sql.addCampo("NSU_TRANSACAO",con.toString(oper.getNsuTransacao()));
            sql.addCampo("HORA",con.toString(oper.getHora()));
            sql.addCampo("OPERADOR",con.toString(oper.getOperador()));
            sql.addCampo("VAL_RECEBIDO",con.toString(oper.getValRecebido()));
            sql.addCampo("VAL_RETIRADO",con.toString(oper.getValRetirado()));
            sql.addCampo("VAL_REABASTECIDO",con.toString(oper.getValReabastecido()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperPagamentos (int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        String sqlDel = "DELETE FROM TOTAL_OPER_PAGAMENTO" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperPagamentosData oper : totalOperPagamentos) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_PAGAMENTO");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("SEQUENCIA",con.toString(oper.getSequencia()));
            sql.addCampo("CODIGO",con.toString(oper.getCodigo()));
            sql.addCampo("TIPO",con.toString(oper.getTipo()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO",con.toString(oper.getValorCorrigido()));
            sql.addCampo("NUM_CUPOM_PAGTO",con.toString(oper.getNumCupomPagto()));
            sql.addCampo("NSU_PAGTO",con.toString(oper.getNsuPagto()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEventoCupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEventoNsu()));
            sql.addCampo("CANCELADO",con.toString(oper.getCancelado()));
            sql.addCampo("CAMPOS1",con.toString(oper.getCampos()[0]));
            sql.addCampo("CAMPOS2",con.toString(oper.getCampos()[1]));
            sql.addCampo("CAMPOS3",con.toString(oper.getCampos()[2]));
            sql.addCampo("CAMPOS4",con.toString(oper.getCampos()[3]));
            sql.addCampo("CAMPOS5",con.toString(oper.getCampos()[4]));
            sql.addCampo("CAMPOS6",con.toString(oper.getCampos()[5]));
            sql.addCampo("CAMPOS7",con.toString(oper.getCampos()[6]));
            sql.addCampo("CAMPOS8",con.toString(oper.getCampos()[7]));
            sql.addCampo("FISCAL",con.toString(oper.getFiscal()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("BARRAS",con.toString(oper.getBarras()));
            sql.addCampo("NSU_HOST",con.toString(oper.getNsuHost()));
            sql.addCampo("NSU_SITEF",con.toString(oper.getNsuSitef()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperCedulas (int loja, Date data, int pdv, int cupom, int transacao, int nsu, int numCupomRet, int nsuRet, int sequencial) {

        String sqlDel = "DELETE FROM TOTAL_OPER_CEDULAS" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperCedulasData oper : totalOperCedulas) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_CEDULAS");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("NUM_CUPOM_RETIRADA",con.toString(oper.getNumCupomRetirada()));
            sql.addCampo("NSU_RETIRADA",con.toString(oper.getNsuRetirada()));
            sql.addCampo("SEQUENCIAL",con.toString(oper.getSequencial()));
            sql.addCampo("CODIGO",con.toString(oper.getCodigo()));
            sql.addCampo("QTDE",con.toString(oper.getQtde()));
            sql.addCampo("QTDECORRIGIDO",con.toString(oper.getQtdeCorrigido()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("VALORCORRIGIDO",con.toString(oper.getValorCorrigido()));
            sql.addCampo("TIPO",con.toString(oper.getTipo()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEventoCupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEventoNsu()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperFTroca(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int sequencia) {

        String sqlDel = "DELETE FROM TOTAL_OPER_FTROCA" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperFTrocaData oper : totalOperFTroca) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_FTROCA");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("SEQUENCIA",con.toString(oper.getSequencia()));
            sql.addCampo("FINALIZADORA",con.toString(oper.getFinalizadora()));
            sql.addCampo("DOMINIO",con.toString(oper.getDominio()));
            sql.addCampo("NUM_CUPOM_COMPRA",con.toString(oper.getNumCupomCompra()));
            sql.addCampo("NSU_COMPRA",con.toString(oper.getNsuCompra()));
            sql.addCampo("VALOR",con.toString(oper.getValor()));
            sql.addCampo("STATUS",con.toString(oper.getStatus()));
            sql.addCampo("NSU_FINALIZ",con.toString(oper.getNsuFinaliz()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    public void gravaTotalOperRejeicao(int loja, Date data, int pdv, int cupom, int transacao, int nsu, int contador) {

        String sqlDel = "DELETE FROM TOTAL_OPER_REJEICAO" +
                " WHERE LOJA = "  + loja +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + pdv +
                " AND NUM_CUPOM = " + cupom +
                " AND TRANSACAO = " + transacao +
                " AND NSU = " + nsu ;
        con.executeSQL(sqlDel);

        for(TotalOperRejeicaoData oper : totalOperRejeicao) {
            SQLCreator sql = new SQLCreator("TOTAL_OPER_REJEICAO");
            sql.addCampo("LOJA", con.toString(oper.getLoja()));
            sql.addCampo("DATA", con.toString(oper.getData()));
            sql.addCampo("NUM_PDV", con.toString(oper.getNumPdv()));
            sql.addCampo("NUM_CUPOM", con.toString(oper.getNumCupom()));
            sql.addCampo("TRANSACAO", con.toString(oper.getTransacao()));
            sql.addCampo("NSU", con.toString(oper.getNsu()));
            sql.addCampo("CONTADOR",con.toString(oper.getContador()));
            sql.addCampo("NUM_PDV_RETIRADA",con.toString(oper.getNumPdvRetirada()));
            sql.addCampo("NUM_CUPOM_RETIRADA",con.toString(oper.getNumCupomRetirada()));
            sql.addCampo("NSU_RETIRADA",con.toString(oper.getNsuRetirada()));
            sql.addCampo("OPERADOR_RETIRADA",con.toString(oper.getOperadorRetirada()));
            sql.addCampo("VALOR_RETIRADA",con.toString(oper.getValorRetirada()));
            sql.addCampo("VALOR_REJEICAO",con.toString(oper.getValorRejeicao()));
            sql.addCampo("VALOR_CORRIGIDO",con.toString(oper.getValorCorrigido()));
            sql.addCampo("DATA_RETIRADA",con.toString(oper.getDataRetirada()));
            sql.addCampo("EVENTO_CUPOM",con.toString(oper.getEventoCupom()));
            sql.addCampo("EVENTO_NSU",con.toString(oper.getEventoNsu()));
            con.executeSQL(sql.getInsert());
            System.out.println(sql.getInsert());
        }
    }

    /* METODOS AUXILIARES */
    public void inicializaFinDet() {
        TotalOperFinalizadoraDetalhesData o = new TotalOperFinalizadoraDetalhesData();
        o.setLoja(0);
        o.setData(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setNumPdv(0);
        o.setNumCupom(0);
        o.setTransacao(0);
        o.setCodFinaliz(0);
        o.setNsu(0);
        o.setNsuInicial(0);
        o.setHora(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setValor(0);
        o.setConteudo(new String[]{"", "", "","","","","",""});
        o.setDataVencimento(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setCancelado(0);
        o.setTipoCompra(0);
        o.setTipoPagto(0);
        o.setTipo(0);
        o.setCodigoRede(0);
        o.setCodigo(0);
        o.setValores(new double[]{0,0,0,0,0,0,0,0});
        o.setEventoCupom(0);
        o.setEventoNsu(0);
        o.setTipoTef(0);
        o.setSubTipo(0);
        o.setCodigoRedeTef(0);
        o.setParcelas(0);
        o.setDataPreDatado(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setTipoVenda(0);
        o.setTipoMes(0);
        o.setTipoAutorizacao(0);
        o.setAutorizacao(0);
        o.setNroDocto(0);
        o.setNroCartao("");
        o.setNsuFinalizadora(0);
        o.setNsuInicial(0);
        o.setNroAutoriz("");
        o.setNroAutorizstr("");
        o.setCodigoBandeira(0);
        o.setNomeBandeira("");
        o.setTipoUso(0);
        o.setCmc7("");
        o.setBanco(0);
        o.setTipoTroca(0);
        o.setCodigoRespons("");
    }

    public void inicializaDetalhes(){
        TotalOperDetalhesData o = new TotalOperDetalhesData();
        o.setLoja(0);
        o.setData(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setNumPdv(0);
        o.setNumCupom(0);
        o.setTransacao(0);
        o.setNsu(0);
        o.setFinalizadora(0);
        o.setDominio(0);
        o.setContador(0);
        o.setTipo(0);
        o.setValor(0);
        o.setValorOrigem(0);
        o.setCgcCpf("");
        o.setComp(0);
        o.setBanco(0);
        o.setAgencia(0);
        o.setC1(0);
        o.setConta(0);
        o.setC2(0);
        o.setCheque(0);
        o.setC3(0);
        o.setObservacao("");
        o.setQtde(0);
        o.setValorUnitario(0);
        o.setDataVencimento(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setExportar(0);
        o.setCmc7("");
        o.setNumCupomCompra(0);
        o.setHora(Funcoes.strtodate("01/01/1980", "dd/MM/yyyy"));
        o.setNsuCompra(0);
        o.setValorCompra(0);
        o.setDesconto(0);
        o.setTipoMovto(0);
        o.setResponsavel("");
        o.setMotivo("");
        o.setNsuSitef(0);
        o.setNsuHost(0);
        o.setBin(0);
        o.setEmboco(0);
        o.setRo(0);
        o.setDeposito(0);
        o.setEventoCupom(0);
        o.setEventoNsu(0);
        o.setTipoEvento(0);
        o.setNroPedido(0);
        o.setNroNegociacao(0);
        o.setNsuFinaliz(0);
        o.setTxId("");
    }

    private boolean consultaConv(double codConv) {
        String sql ="SELECT CODEMPRESA, NOME" +
                " FROM CONVCONVENIADOS" +
                " WHERE CODIGO = " + con.toString(codConv);
        IRecordSet rst = con.getRecordSet(sql);

        if (rst.next()) {
            convenio.setvCodigoConvEpre(rst.getDouble("codempresa"));
            convenio.setNomeEmpresa(rst.getString("nome"));
            return true;
        }
        rst.close();
        return false;
    }

    //TODO: CRIAR METODO QUE REALIZA CONSISTENCIA DOS ARRAYS
    public boolean consisteObj() {return true;}

    public int contadorDetalhesDominio(Conexao con, int loja, Date data, int numPdv, int numCupom, int nsu, int finalizadora, double dominio) {
        int contador = 0;

        SQLCreator creator = new SQLCreator("TOTAL_OPER_DETALHES");
        creator.addCampo("max(contador) as contador");
        creator.addCampo("LOJA", con.toString(loja), true);
        creator.addCampo("DATA", con.toString(data), true);
        creator.addCampo("NUM_PDV", con.toString(numPdv), true);
        creator.addCampo("NUM_CUPOM", con.toString(numCupom), true);
        creator.addCampo("NSU", con.toString(nsu), true);
        creator.addCampo("FINALIZADORA", con.toString(finalizadora), true);
        creator.addCampo("DOMINIO", con.toString(dominio), true);
        IRecordSet rst = con.getRecordSet(creator.getSelect());

        if (rst.next()) {
            contador = rst.getInt("contador");
        }
        rst.close();

        return contador + 1;
    }

    public String valorString(String texto, int num, String sep) {
        int x;
        int y = 0;
        int z = 0;

        for (x = 1; x <= num; x++) {
            z = y;
            y = texto.indexOf(sep, y + 1);
            if (y == -1 && x < num) {
                return "";
            }
        }

        if (y == -1) {
            return texto.substring(z + 1);
        } else {
            return texto.substring(z + 1, y);
        }
    }

    public String soNumeros(String txt) {
        String txtNovo = "";
        if (txt.length() > 0) {
            for (int x = 0; x < txt.length(); x++) {
                if (Character.isDigit(txt.charAt(x))) {
                    txtNovo = txtNovo + txt.charAt(x);
                }
            }
        }
        return txtNovo;
    }

    private String retConteudo(int finalizadora, String[] conteudo, int tipo, String defaultConteudo) {

        for (int x = 0; x < 7; x++) {
            if (getTipoConteudo(finalizadora, x) == tipo) {
                return conteudo[x].trim().isEmpty() ? "0" : conteudo[x].trim();
            }
        }
        return defaultConteudo;
    }

    private int getTipoConteudo(int finalizadora, int tipo) {
        int retorno = 0;

        for (int x = 0; x < regOperTes.size(); x++) {
            if (regOperTes.get(x).getFinaliz() == finalizadora) {
                retorno = regOperTes.get(x).getTipoCont()[tipo];
                break;
            }
        }

        return retorno;
    }

    public int dateDiffInDays(Date date1, Date date2) {
        long diffInMillis = date2.getTime() - date1.getTime();
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        return (int) diffInDays;
    }

    public boolean isDateValid(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false); // Configura o calendário para ser estrito na validação de datas
        calendar.set(year, month - 1, day);

        try {
            calendar.getTime(); // Tenta obter a data correspondente
            return true; // Se não lançar exceção, a data é válida
        } catch (IllegalArgumentException e) {
            return false; // Se lançar exceção, a data é inválida
        }
    }

    private int getCritica(int finalizadora, int critica) {
        int retornoCritica = 0;

        for (int x = 0; x < regOperTes.size(); x++) {
            if (regOperTes.get(x).getFinaliz() == finalizadora) {
                switch (critica) {
                    case 1:
                        retornoCritica = regOperTes.get(x).getCritica()[1];
                        break;
                    case 2:
                        retornoCritica = regOperTes.get(x).getCritica()[2];
                        break;

                    case 3:
                        retornoCritica = regOperTes.get(x).getCritica()[3];
                        break;

                    case 4:
                        retornoCritica = regOperTes.get(x).getCritica()[4];
                        break;

                    default:
                        retornoCritica = regOperTes.get(x).getCritica()[0];
                        break;
                }
            }
        }

        return retornoCritica;
    }

    public static String limitaString(String texto, int maximo) {
        return texto.length() <= maximo ? texto : texto.substring(0, maximo);
    }

    public double finalizadoraComposicao(TotalOperFinalizadoraDetalhesData det) {

        String[] sequencia = new String[5];
        String retornoDominio = "";
        int x;

        for (x = 0; x < 5; x++) {
            sequencia[x] = "";
        }

        for (x = 0; x < 5; x++) {
            if (getConteudo(det.getCodFinaliz(), x) > 0) {
                sequencia[getConteudo(det.getCodFinaliz(), x)] = String.format("%0" + getTamanho(det.getCodFinaliz(), x) + "d", Integer.parseInt(soNumeros(det.getConteudo()[x].trim())));
            }
        }

        for (x = 0; x < 5; x++) {
            retornoDominio = retornoDominio + sequencia[x];
        }
        return Double.parseDouble(retornoDominio);
    }

    private int getConteudo(int finalizadora, int conteudo) {
        int retornoConteudo = 0;

        for (int x = 0; x < regOperTes.size(); x++) {
            if (regOperTes.get(x).getFinaliz() == finalizadora) {
                switch (conteudo) {
                    case 1:
                        retornoConteudo = regOperTes.get(x).getConteudo()[1];
                        break;
                    case 2:
                        retornoConteudo = regOperTes.get(x).getConteudo()[2];
                        break;

                    case 3:
                        retornoConteudo = regOperTes.get(x).getConteudo()[3];
                        break;

                    case 4:
                        retornoConteudo = regOperTes.get(x).getConteudo()[4];
                        break;

                    default:
                        retornoConteudo = regOperTes.get(x).getConteudo()[0];
                        break;
                }
            }
        }

        return retornoConteudo;
    }

    private int getTamanho(int finalizadora, int tamanho) {

        int retornoTamanho = 0;

        for (int x = 0; x < regOperTes.size(); x++) {
            if (regOperTes.get(x).getFinaliz() == finalizadora) {
                switch (tamanho) {
                    case 1:
                        retornoTamanho = regOperTes.get(x).getTamanho()[1];
                        break;
                    case 2:
                        retornoTamanho = regOperTes.get(x).getTamanho()[2];
                        break;

                    case 3:
                        retornoTamanho = regOperTes.get(x).getTamanho()[3];

                    case 4:
                        retornoTamanho = regOperTes.get(x).getTamanho()[4];
                        break;
                    default:
                        retornoTamanho = regOperTes.get(x).getTamanho()[0];
                }
            }
        }

        return retornoTamanho;
    }

    private double retDominioTef(Conexao con, int loja, Date data, int pdv, int numCupom, int nsu) {

        int tipoDominioTef = 1000;
        int codigoBandeira = 0;
        double dominio = 0.0d;
        String bin = "";
        boolean credito = false;
        int codRedeBin = 0;
        double resultado = 0.0d;
        Double valor = 0.0d;

        String sql = "SELECT NSU, TIPO, SUBTIPO, CODIGOREDE, PARCELAS, DATAPREDATADO, TIPOVENDA, TIPOMES, TIPOAUTORIZACAO, AUTORIZACAO, NRODOCTO, VALOR,"+
                " NROCARTAO, NSU_FINALIZADORA, NSUINICIAL, NROAUTORIZ, NROAUTORIZSTR, CODIGOBANDEIRA, NOMEBANDEIRA, EVENTO_NSU, EVENTO_CUPOM" +
                " FROM VW_TEF_LOG" +
                " WHERE LOJA = " + con.toString(loja) +
                " AND DATA = " + con.toString(data) +
                " AND NUM_PDV = " + con.toString(pdv) +
                " AND NSU_FINALIZADORA = " + con.toString(nsu);
        IRecordSet rst = con.getRecordSet(sql);

        while (rst.next()) {

            dominio = tipoDominioTef;
            codigoBandeira = rst.getInt("CODIGOBANDEIRA");
            bin = rst.getString("NROCARTAO");
            valor = rst.getDouble("VALOR");

            if (rst.getInt("TIPOVENDA") == 2) {
                credito = true;
                dominio = tipoDominioTef * 2;
            }

            if (existeBinsITeste(con,limitaString(bin, 6))) {
                if (credito && defBinsObject.getRedeCred() != 0) {
                    dominio = defBinsObject.getRedeCred();

                    if (Parametros.par0101UsaMultiBandeira == 1) {
                        if (Parametros.par0150UsaBinAux == 1) {
                            codRedeBin = defBinsObject.getRedeCred();
                        } else {
                            codigoBandeira = defBinsObject.getRedeCred();
                        }
                    } else {
                        codigoBandeira = rst.getInt("TIPOAUTORIZACAO");
                    }

                } else {
                    if (defBinsObject.getRedeDeb() != 0) {
                        dominio = defBinsObject.getRedeDeb();

                        if (Parametros.par0101UsaMultiBandeira == 1) {
                            if (Parametros.par0150UsaBinAux == 1) {
                                codRedeBin = defBinsObject.getRedeDeb();
                            } else {
                                codigoBandeira = defBinsObject.getRedeDeb();
                            }
                        } else {
                            codigoBandeira = rst.getInt("TIPOAUTORIZACAO");
                        }
                    }
                }
            }

            if (existeTipoTef(con,	rst.getInt("SUBTIPO"),
                    rst.getInt("TIPOVENDA"),
                    rst.getInt("TIPOMES"),
                    rst.getInt("CODIGOREDE"),
                    rst.getInt("CODIGOBANDEIRA"),
                    codRedeBin) == 1) {

                if (defTiposTef.getDominio() != tipoDominioTef && defTiposTef.getDominio() != (2 * tipoDominioTef)) {
                    dominio = defTiposTef.getDominio();
                }

            }
        }
        defTiposTef = new DefTiposTef();

        rst.close();
        return dominio;
    }

    // TODO : atualiza empresa

//Public Sub AtualizarEmprCSC()
//
//    vOperacao = cIncluir
//    vExiste = vbCancel
//    If clsEmprCSC Is Nothing Then
//        Set clsEmprCSC = New clsConvTesouraria
//    End If
//    If cEmpresasCSC Is Nothing Then
//        Set cEmpresasCSC = New Collection
//    End If
//    If cEmpresasCSC.Count <> 0 Then
//        For Each clsEmprCSC In cEmpresasCSC
//            If clsEmprCSC.Codigo = cTtEmprCSC.Codigo Then
//                'existe a classe com o dominio para a finalizadora
//                If vOperacao = cIncluir Then
//                    Exit Sub
//                End If
//                vExiste = vbOK
//                Set clsEmprCSC = cTtEmprCSC
//            End If
//        Next clsEmprCSC
//        If vExiste = vbCancel Then
//            If Not vOperacao = cIncluir Then
//                Exit Sub
//            End If
//            Set TtEmprCSC = cTtEmprCSC
//            cEmpresasCSC.Add Item:=TtEmprCSC ', Key:=CStr(cEmpresasCSC.Count)
//        End If
//    Else
//        If Not vOperacao = cIncluir Then
//            Exit Sub
//        End If
//        Set TtEmprCSC = cTtEmprCSC
//        cEmpresasCSC.Add Item:=TtEmprCSC ', Key:=CStr(cEmpresasCSC.Count)
//    End If
//
//    Set cTtEmprCSC = Nothing
//
//End Sub
//


    // TODO : atualiza conv
//Public Sub AtualizarConvCSC()
//
//    vOperacao = cIncluir
//    vExiste = vbCancel
//    If clsConvCSC Is Nothing Then
//        Set clsConvCSC = New clsConvTesouraria
//    End If
//    If cConveniadosCSC Is Nothing Then
//        Set cConveniadosCSC = New Collection
//    End If
//    If cConveniadosCSC.Count <> 0 Then
//        For Each clsConvCSC In cConveniadosCSC
//            If clsConvCSC.Codigo = cTtConvCSC.Codigo Then
//                'existe a classe com o dominio para a finalizadora
//                If vOperacao = cIncluir Then
//                    Exit Sub
//                End If
//                vExiste = vbOK
//                Set clsConvCSC = cTtConvCSC
//            End If
//        Next clsConvCSC
//        If vExiste = vbCancel Then
//            If Not vOperacao = cIncluir Then
//                Exit Sub
//            End If
//            Set TtConvCSC = cTtConvCSC
//            cConveniadosCSC.Add Item:=TtConvCSC ', Key:=CStr(cConveniadosCSC.Count)
//        End If
//    Else
//        If Not vOperacao = cIncluir Then
//            Exit Sub
//        End If
//        Set TtConvCSC = cTtConvCSC
//        cConveniadosCSC.Add Item:=TtConvCSC ', Key:=CStr(cConveniadosCSC.Count)
//    End If
//
//    Set cTtConvCSC = Nothing
//
//End Sub


    private int existeTipoTef(Conexao con,	int tipoPgto, int codModalidade, int codModalidadeTipo, int codRedes, int codBandeira, int codRedeBin) {

        String sql = "SELECT TIPOPGTO, CODMODALIDADE, CODMODALIDADE_TIPO, CODREDES, CODBANDEIRA, CODREDEBIN, DOMINIO" +
                " FROM TESOURARIA_TIPOS_TEF" +
                " WHERE TIPOPGTO = " + con.toString(tipoPgto) +
                " AND CODMODALIDADE = " + con.toString(codModalidade) +
                " AND CODMODALIDADE_TIPO = " + con.toString(codModalidadeTipo) +
                " AND CODREDES = " + con.toString(codRedes) + " and codbandeira = " + con.toString(codBandeira) +
                " AND CODREDEBIN = " + con.toString(codRedeBin) +
                " ORDER BY TIPOPGTO, CODMODALIDADE, CODMODALIDADE_TIPO, CODREDES, CODBANDEIRA, CODREDEBIN";
        IRecordSet rst = con.getRecordSet(sql);

        if (rst.next()) {
            defTiposTef.setCodModalidade(rst.getInt("CODMODALIDADE"));
            defTiposTef.setCodModalidadeTipo(rst.getInt("CODMODALIDADE_TIPO"));
            defTiposTef.setCodRedes(rst.getInt("CODREDES"));
            defTiposTef.setCodBandeira(rst.getInt("CODBANDEIRA"));
            defTiposTef.setCodRedeBin(rst.getInt("CODREDEBIN"));
            defTiposTef.setDominio(rst.getDouble("DOMINIO"));

            return 1;
        }
        rst.close();

        return 0;
    }

    private boolean existeBinsITeste(Conexao con, String bins) {

        boolean retorno = false;

        String sql = "SELECT BINS, REDE_DEB, REDE_CRED " +
                " FROM TESOURARIA_TEFBINS" +
                " WHERE BINS = " + con.toString(bins) +
                " ORDER BY BINS";
        IRecordSet rst = con.getRecordSet(sql);

        if (rst.next()) {
            defBinsObject.setBins(rst.getString("BINS"));
            defBinsObject.setRedeDeb(rst.getInt("REDE_CRED"));
            defBinsObject.setRedeCred(rst.getInt("REDE_CRED"));
            retorno = true;
        }

        defBinsObject = new DefBins();
        rst.close();

        return retorno;
    }

    public String retCartaCredito(String n) {
        String texto = "";
        int y = 0;

        for (int x = 0; x < n.length(); x++) {
            char c = n.charAt(x);
            switch (c) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    texto += c;
                    y++;
                    break;
                case '0':
                    if (y > 0) {
                        texto += '0';
                    }
                    break;
                default:
                    if (y > 0) {
                        return texto;
                    }
                    break;
            }
        }

        if (texto.length() == 0) {
            texto = "0";
        }

        return texto;
    }

    private double valorPixTroco(int loja, Date data, int pdv, int numCupom) {
        double retorno = 0.0d;

        String sql = "SELECT TEXTO" +
                " FROM VW_GENERICO_LOG" +
                " WHERE LOJA = " + con.toString(loja) +
                " AND DATA = " + con.toString(data) +
                " AND NUMEROPDV = " + con.toString(pdv) +
                " AND NUMEROCUPOM = " + con.toString(numCupom) +
                " AND TIPOTRANSACAO = 134" +
                " AND SUBTIPO = 125" +
                " AND ORDEM = 1";
        IRecordSet rst = con.getRecordSet(sql);

        while (rst.next()) {
            if (isNumber(rst.getString("TEXTO"))) {
                retorno = Double.parseDouble(rst.getString("TEXTO").trim()) / 100;
            }
        }

        rst.close();

        return retorno;
    }

    public int retRedePagtoTeste(int tipo, int rede, String texto, boolean usaFatura2, String tipoFatura,
                                 int codigoTipo, double valor01, int tipoTef) {
        int T = tipo;

        if (tipoTef == 124) {
            T = 124;
        }

        if (tipo == 25) {
            T = 124;
        }

        if (T == 14) {
            T = codigoTipo;
            if (codigoTipo == 200) {
                T = 17; // Vale Gas Tef
            }
        }

        if (tipo == 1) {
            switch (codigoTipo) {
                case 49: // resgate
                    T = 49;
                    break;
                default:
                    if (usaFatura2 && (rede == 0 || rede == 802)) { // russi
                        T = 2;
                    } else if (tipoFatura.trim().equalsIgnoreCase("AI")) { // oboe
                        T = 1;
                    } else if (tipoFatura.trim().equalsIgnoreCase("AF")) { // ibi
                        T = 4;
                    } else {
                        // t = 4;
                        if (!(texto.contains("," + T + ","))) {
                            T = 1;
                        }
                    }
                    break;
            }
        }

        if (T == 7) {
            int valor = (int) valor01;
            switch (valor) {
                case 1: // TIM
                    T = 21;
                    break;
                case 2: // CLARO
                    T = 22;
                    break;
                case 3: // VIVO
                    T = 23;
                    break;
                case 4: // OI
                    T = 24;
                    break;
                default:
                    T = 7;
                    break;
            }
            if (!texto.contains(String.valueOf(T))) {
                T = 7;
            }

        }
        if (T == 1) {
            if (texto.indexOf("," + T + ",") < 0) {
                T = 3;
            }
        }

        if (texto.indexOf("," + T + ",") < 0) {
            T = 30;
        }

        return T;
    }

    private int redirecionaFinalizadora(int finaliz) {
        if (Parametros.par0021UsaFinalizTef) {
            if (FuncoesFX.getFinalizadora(finaliz).tipoDominio == 88) {
                return FuncoesFX.getFinalizadora(finaliz).codigo;
            }
        }
        return finaliz;
    }


}

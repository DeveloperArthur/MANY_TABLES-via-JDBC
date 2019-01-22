package br.com.crud.model;

public class pesquisa {

    private int PerguntaCodigo;
    private int FilialCodigo;
    private int CursoCodigo;
    private int RespostaCodigo;
    private int TotalResposta;

    public int getPerguntaCodigo() {
        return PerguntaCodigo;
    }

    public void setPerguntaCodigo(int PerguntaCodigo) {
        this.PerguntaCodigo = PerguntaCodigo;
    }

    public int getFilialCodigo() {
        return FilialCodigo;
    }

    public void setFilialCodigo(int FilialCodigo) {
        this.FilialCodigo = FilialCodigo;
    }

    public int getCursoCodigo() {
        return CursoCodigo;
    }

    public void setCursoCodigo(int CursoCodigo) {
        this.CursoCodigo = CursoCodigo;
    }

    public int getRespostaCodigo() {
        return RespostaCodigo;
    }

    public void setRespostaCodigo(int RespostaCodigo) {
        this.RespostaCodigo = RespostaCodigo;
    }

    public int getTotalResposta() {
        return TotalResposta;
    }

    public void setTotalResposta(int TotalResposta) {
        this.TotalResposta = TotalResposta;
    }

}

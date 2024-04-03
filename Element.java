public class Element{
    private String CodEle;
    private int NRep;
    private int NLab;

    Element(){

    }

    Element(String CodEle, int NRep, int NLab){
        this.CodEle = CodEle;
        this.NRep = NRep;
        this.NLab = NLab;
    }

    void setCodEle(String CodEle){
        this.CodEle = CodEle;
    }

    void setNRep(String NRep){
        this.NRep = NRep;
    }

    void setNLab(String NLab){
        this.NLab = NLab;
    }

    String getCodEle(){
        return CodEle;
    }

    int getNRep(){
        return NRep;
    }

    int getNLab(){
        return NLab;
    }

    int toString(){
        reuturn "Identificatore Ospedale:"+ CodEle + "\nNumero Reparti:" + NRep + "\nNumero Laboratori:" + NLab;
    }





}
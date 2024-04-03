public class Rep extends Element{
    private String CodRep; //nome reparto
    private int NPostiLetto; //posti letto
    private int NDegenti;
    private double GiacenzaMedia;

    Rep(){

    }

    Rep(String CodEle, int NRep, int NLab){
        super(CodEle,NRep,NLab);
        this.CodRep = CodRep;
        this.NPostiLetto = NPostiLetto;
        this.NDegenti= NDegenti;
        this.GiacenzaMedia = GiacenzaMedia;
    }

    abstract void setCodRep(String CodRep){
        this.CodRep = CodRep;
    }
    void setNPostiLetto(int NPostiLetto){
        this.NPostiLetto = NPostiLetto;
    }
    void setNDegenti(int NDegenti){
        this.NDegenti = NDegenti;
    }
    void setCodEle(double CodEle){
        this.CodEle = CodEle;
    }

    String getCodRep(){
        return CodRep;
    }
    int setNPostiLetto(){
        return NPostiLetto;
    }
    int setNDegenti(){
        return NDegenti;
    }
    int setCodEle(){
        return CodEle;
    }

    int toString(){
        String element = super.toString()
        return element + "\nNome Reparto:"+ CodRep + "\nNumero Posti letto:" + NPostiLetto + "\nNumero Degenti:" + NDegenti + "\nGiacenza Media:" + GiacenzaMedia;
    }


}
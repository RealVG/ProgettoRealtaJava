public class Lab extends Element{
    // CodLab, Nr Esami, Spese, Introiti; da costruttori, metodi di accesso e stampa.
    private String CodLab;
    private int NEsami;
    private double spese;
    private String introiti;

    Lab(){

    } 

    Lab(String CodLab, int NEsami, duble spese, String introiti){
        super(CodEle,NRep,NLab);
        this.CodLab = CodLab;
        this.NEsami = NEsami;
        this.spese = spese;
        this.introiti = introiti;
    }

    

}
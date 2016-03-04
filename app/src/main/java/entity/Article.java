package entity;

/**
 * Created by Romain  28/02/2016.
 */
public class Article {

    private int id_article;
    private String desart;
    private int stockart;
    private int seuilmin;
    private int encommande;
    private int enrepa;
    private double prixart;
    private int delaireappro;
    private int consomoy;
    private String fabriquant;

    public Article(){}

    public Article(int idarticle, String desart, int stockart, int seuilmin, int encommande, int enrepa, double prixart, int delaireappro, int consomoy, String fabriquant) {
        this.id_article = idarticle;
        this.desart = desart;
        this.stockart = stockart;
        this.seuilmin = seuilmin;
        this.encommande = encommande;
        this.enrepa = enrepa;
        this.prixart = prixart;
        this.delaireappro = delaireappro;
        this.consomoy = consomoy;
        this.fabriquant = fabriquant;
    }

    public int getId_article() {
        return id_article;
    }

    public String getDesart() {
        return desart;
    }

    public int getStockart() {
        return stockart;
    }

    public int getSeuilmin() {
        return seuilmin;
    }

    public int getEncommande() {
        return encommande;
    }

    public int getEnrepa() {
        return enrepa;
    }

    public double getPrixart() {
        return prixart;
    }

    public int getDelaireappro() {
        return delaireappro;
    }

    public int getConsomoy() {
        return consomoy;
    }

    public String getFabriquant() {
        return fabriquant;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public void setDesart(String desart) {
        this.desart = desart;
    }

    public void setStockart(int stockart) {
        this.stockart = stockart;
    }

    public void setSeuilmin(int seuilmin) {
        this.seuilmin = seuilmin;
    }

    public void setEncommande(int encommande) {
        this.encommande = encommande;
    }

    public void setEnrepa(int enrepa) {
        this.enrepa = enrepa;
    }

    public void setPrixart(double prixart) {
        this.prixart = prixart;
    }

    public void setDelaireappro(int delaireappro) {
        this.delaireappro = delaireappro;
    }

    public void setConsomoy(int consomoy) {
        this.consomoy = consomoy;
    }

    public void setFabriquant(String fabriquant) {
        this.fabriquant = fabriquant;
    }
}

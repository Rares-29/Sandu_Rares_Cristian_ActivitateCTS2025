package anunt;

import java.awt.*;

public class Anunt {
    private final String titlu;
    private final String descriere;
    private final Integer nrCamere;
    private final Double suprafata;
    private final Integer nrBai;
    private final Integer anConstructie;
    private final Image image;
    private final Double price;
    private final String numarTelefon;
    private final String email;



    public Anunt(String titlu, String descriere, Integer nrCamere, Double suprafata, Integer nrBai, Integer anConstructie, Image image, Double price, String numarTelefon, String email) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.nrCamere = nrCamere;
        this.suprafata = suprafata;
        this.nrBai = nrBai;
        this.anConstructie = anConstructie;
        this.image = image;
        this.price = price;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public Integer getNrCamere() {
        return nrCamere;
    }

    public Double getSuprafata() {
        return suprafata;
    }

    public Integer getNrBai() {
        return nrBai;
    }

    public Integer getAnConstructie() {
        return anConstructie;
    }

    public Image getImage() {
        return image;
    }

    public Double getPrice() {
        return price;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Anunt{" +
                "titlu='" + titlu + '\'' +
                ", descriere='" + descriere + '\'' +
                ", nrCamere=" + nrCamere +
                ", suprafata=" + suprafata +
                ", nrBai=" + nrBai +
                ", anConstructie=" + anConstructie +
                ", image=" + image +
                ", price=" + price +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

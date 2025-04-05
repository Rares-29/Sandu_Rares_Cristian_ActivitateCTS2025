package anunt;

import java.awt.*;

public class AnuntBuilder {
    private final String titlu;
    private final String descriere;
    private Integer nrCamere;
    private Double suprafata;
    private Integer nrBai;
    private Integer anConstructie;
    private Image image;
    private final Double price;
    private String numarTelefon;
    private String email;

    public AnuntBuilder(String titlu, String descriere, Double price) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.price = price;
    }

    public Anunt build() {
        return new Anunt(titlu, descriere, nrCamere, suprafata, nrBai, anConstructie, image, price, numarTelefon, email);
    }


    public AnuntBuilder nrCamere(Integer nrCamere) {
        this.nrCamere = nrCamere;
        return this;
    }

    public AnuntBuilder suprafata(Double suprafata) {
        this.suprafata = suprafata;
        return this;
    }

    public AnuntBuilder nrBai(Integer nrBai) {
        this.nrBai = nrBai;
        return this;
    }


    public AnuntBuilder anConstructie(Integer anConstructie) {
        this.anConstructie = anConstructie;
        return this;
    }

    public AnuntBuilder image(Image image) {
        // Complex construction step here
        // 10 lines of code
        this.image = image;
        return this;
    }

    public AnuntBuilder numarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
        return this;
    }

    public AnuntBuilder email(String email) {
        this.email = email;
        return this;
    }
}

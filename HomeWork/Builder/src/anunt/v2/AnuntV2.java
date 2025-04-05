package anunt.v2;

import anunt.Anunt;

import java.awt.*;

public class AnuntV2 {

    private  String titlu;
    private  String descriere;
    private  Integer nrCamere;
    private  Double suprafata;
    private  Integer nrBai;
    private  Integer anConstructie;
    private  Image image;
    private  Double price;
    private  String numarTelefon;
    private  String email;

    public AnuntV2() {
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Integer getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(Integer nrCamere) {
        this.nrCamere = nrCamere;
    }

    public Double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(Double suprafata) {
        this.suprafata = suprafata;
    }

    public Integer getNrBai() {
        return nrBai;
    }

    public void setNrBai(Integer nrBai) {
        this.nrBai = nrBai;
    }

    public Integer getAnConstructie() {
        return anConstructie;
    }

    public void setAnConstructie(Integer anConstructie) {
        this.anConstructie = anConstructie;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AnuntV2{" +
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
    
    public static class AnuntBuilderV3 {
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

        public AnuntBuilderV3(String titlu, String descriere, Double price) {
            this.titlu = titlu;
            this.descriere = descriere;
            this.price = price;
        }

        public Anunt build() {
            return new Anunt(titlu, descriere, nrCamere, suprafata, nrBai, anConstructie, image, price, numarTelefon, email);
        }


        public AnuntBuilderV3 nrCamere(Integer nrCamere) {
            this.nrCamere = nrCamere;
            return this;
        }

        public AnuntBuilderV3 suprafata(Double suprafata) {
            this.suprafata = suprafata;
            return this;
        }

        public AnuntBuilderV3 nrBai(Integer nrBai) {
            this.nrBai = nrBai;
            return this;
        }


        public AnuntBuilderV3 anConstructie(Integer anConstructie) {
            this.anConstructie = anConstructie;
            return this;
        }

        public AnuntBuilderV3 image(Image image) {
            // Complex construction step here
            // 10 lines of code
            this.image = image;
            return this;
        }

        public AnuntBuilderV3 numarTelefon(String numarTelefon) {
            this.numarTelefon = numarTelefon;
            return this;
        }

        public AnuntBuilderV3 email(String email) {
            this.email = email;
            return this;
        }
    }
}

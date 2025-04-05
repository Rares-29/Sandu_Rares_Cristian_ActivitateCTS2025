package anunt.v2;


import java.awt.*;

public class AnuntBuilderV2 {
    
    private final AnuntV2 anuntV2;

    public AnuntBuilderV2() {
        this.anuntV2 = new AnuntV2();
        // default values
        anuntV2.setNrBai(1);
        anuntV2.setNrCamere(2);
    }

    public AnuntV2 build() {
        return anuntV2;
    }

    public AnuntBuilderV2 nrCamere(Integer nrCamere) {
        this.anuntV2.setNrCamere(nrCamere);
        return this;
    }

    public AnuntBuilderV2 suprafata(Double suprafata) {
        this.anuntV2.setSuprafata(suprafata);
        return this;
    }

    public AnuntBuilderV2 nrBai(Integer nrBai) {
        this.anuntV2.setNrBai(nrBai);
        return this;
    }


    public AnuntBuilderV2 anConstructie(Integer anConstructie) {
        this.anuntV2.setAnConstructie(anConstructie);
        return this;
    }

    public AnuntBuilderV2 image(Image image) {
        // Complex construction step here
        // 10 lines of code
        this.anuntV2.setImage(image);
        return this;
    }

    public AnuntBuilderV2 numarTelefon(String numarTelefon) {
        this.anuntV2.setNumarTelefon(numarTelefon);
        return this;
    }

    public AnuntBuilderV2 email(String email) {
        this.anuntV2.setEmail(email);
        return this;
    }
}

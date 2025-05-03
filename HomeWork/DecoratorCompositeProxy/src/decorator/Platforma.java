package decorator;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Platforma extends Decorator{

    public Platforma(ResultViewer r) {
        super(r);
    }

    @Override
    public void printeazaRezultate() {
        r.printeazaRezultate();
        try {
        afiseazaOnline();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void afiseazaOnline() throws IOException {
        StringBuilder sb = new StringBuilder();
        analize.forEach(analiza -> {
            sb.append("Rezultat analiza ").append(analiza.getTipAnaliza().getDenumire()).append(" este ").append(String.valueOf(analiza.getRezultat()));});
        System.out.println("Additional print");
    }
}

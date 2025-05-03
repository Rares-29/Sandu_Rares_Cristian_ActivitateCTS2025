package decorator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Imprimanta extends ResultViewer {

    private final String template = "Rezultatul analizei pentru %s este: %d";
    @Override
    public void printeazaRezultate() {
        StringBuilder sb = new StringBuilder();
        for (Analiza a: analize) {
            sb.append(template.replace("%s", a.getTipAnaliza().getDenumire())
                    .replace("%d", String.valueOf(a.getRezultat())));
            if (a.isResultGood()) sb.append(". Rezultatul este unul bun.");
            else sb.append(". Ai risc, rezultatul nu este bun.");
            sb.append("\n");
        }
        if (sb.length() > 0) sb.setLength(sb.length() - 2);
        System.out.println(sb);
    }
}

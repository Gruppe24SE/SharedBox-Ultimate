//Liest alle Firmen getrennt durch neue Zeile aus txt Dokument
//und Erstellet neue Ordner für jede Firma wenn nicht vorhanden
import java.io.File;
import java.io.IOException;
import java.util.*;

public class FirmenOrdnerAusTxtErstellen {
    public static void main(String[] args) throws IOException {
        String path = "C://Users//Jo//Desktop//JAVA//Server";
        Scanner s = new Scanner(new File(path+"//Firmen.txt"));
        ArrayList<String> Firmen = new ArrayList<String>();
        while (s.hasNextLine()){
            Firmen.add(s.nextLine());
        }
        s.close();
        for(int i = 0; i <Firmen.size(); i++){
            File directory = new File(path+"//"+Firmen.get(i));
            if(! directory.exists()){
                directory.mkdir();
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Slovar {
    private Map<String, Map<String, List<String>>> dictionary;

    {
        dictionary = new TreeMap<>();
    }
    public boolean addLang(String lang) {
         lang = lang .toLowerCase() ;
        if (dictionary.containsKey(lang)) {
            return false;
        }
        dictionary.put(lang, new TreeMap<>());
        return true ;
    }
    public void printLang() {
        int count = 1;
        for (String lang : dictionary.keySet()) {
            System.out.println(count++ + ") "+ lang );
        }
    }
    public boolean  removeLang(String lang){
        lang = lang .toLowerCase() ;
        if (dictionary .containsKey(lang )){
            dictionary .remove(lang ) ;
            return true ;
        }
        return false ;
}


    public boolean addWord(String keyLang, String originalWord, List <String > addWord){
        originalWord .toLowerCase() ;
        if (dictionary.containsKey(originalWord)) {
            return false;
        }
        dictionary.get(keyLang ).put(originalWord, new ArrayList<>() );
        return true ;

    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Dictionary");
        Slovar slovar = new Slovar();
        System.out.println(slovar.addLang("ru"));
        System.out.println(slovar.addLang("Ru"));
        System.out.println(slovar.addLang("en"));
        System.out.println(slovar.addLang("fr"));
        System.out.println(slovar.removeLang("fr"));
        System.out.println(slovar .addWord("en","cat", new ArrayList<>() ) );

        slovar .printLang() ;
    }
}
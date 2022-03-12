package SuanFa.l1410;

public class l1410 {

    public String entityParser(String text) {
        return text.replace("&quot;", "\"").replace("&apos;", "'").replace("&gt;", ">").replace("&lt;", "<").replace("&frasl;", "/").replace("&amp;", "&");
    }
}

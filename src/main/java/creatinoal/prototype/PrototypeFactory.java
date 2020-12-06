package creatinoal.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static final String MOVIE = "Movie";
    public static final String ALBUM = "Album";
    public static final String SHOW = "Show";

    private static Map<String, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(MOVIE, new Movie());
        prototypes.put(ALBUM, new Album());
        prototypes.put(SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable)prototypes.get(s)).clone();
    }
}

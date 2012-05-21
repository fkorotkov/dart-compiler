package org.dartlang.compile;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fedor.korotkov
 */
public class StringPool {
    private static final Map<String, String> string2hash = new HashMap<String, String>();

    public static String getLiteralName(String value) {
        if (string2hash.containsKey(value)) {
            return string2hash.get(value);
        }
        final String name = "str" + Math.abs(value.hashCode());
        string2hash.put(value, name);
        return name;
    }

    public static void writeToDataBlock(PrintWriter out) {
        for (Map.Entry<String, String> entry : string2hash.entrySet()) {
            out.println("\t" + entry.getValue() + " db \"" + entry.getKey() + "\", 0");
        }
    }
}

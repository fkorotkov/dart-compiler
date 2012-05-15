package org.dartlang.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
    public static String getFileContent(File file) throws FileNotFoundException {
        final Scanner in = new Scanner(new BufferedInputStream(new FileInputStream(file)));
        final StringBuilder result = new StringBuilder();
        while (in.hasNext()) {
            result.append(in.nextLine()).append("\n");
        }
        return result.toString();
    }
}

package org.example;

import org.apache.commons.cli.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        Options options = new Options();
        options.addOption("h", "help", false, "Mostrar ayuda");
        options.addOption("c", "count-bytes", false, "Contador de bytes");
        options.addOption("l", "count-lines", false, "Contador de líneas");
        options.addOption("w", "count-words", false, "Contador de palabras");
        options.addOption("m", "count-characters", false, "Contador de caracteres");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        System.out.println(calculateResuelt(cmd));
    }

    public static List<Integer> calculateResuelt(CommandLine cmd) {
        List<Integer> result = new ArrayList<>();

        if (cmd.hasOption("c")) {
            result.add(1);
        }

        if (cmd.hasOption("l")) {
            result.add(2);
        }

        if (cmd.hasOption("w")) {
            result.add(3);
        }

        if (cmd.hasOption("m")) {
            result.add(4);
        }

        return result;
    }
}

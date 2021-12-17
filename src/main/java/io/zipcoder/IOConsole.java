package io.zipcoder;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


    public class IOConsole {
        private final Scanner input;
        private final PrintStream output;
        private final AnsiColor ansiColor;

        public IOConsole() {
            this(AnsiColor.AUTO);
        }

        public IOConsole(AnsiColor ansiColor) {
            this(ansiColor, System.in, System.out);
        }

        public IOConsole(AnsiColor ansiColor, InputStream in, PrintStream out) {
            this.ansiColor = ansiColor;
            this.input = new Scanner(in);
            this.output = out;
        }

        public void print(String val, Object... args) {
            output.format(ansiColor.getColor() + val, args);
        }

        public void println(String val, Object... vals) {
            print(val + "\n", vals);
        }

        public String getStringInput(String prompt, Object... args) {
            println(prompt, args);
            return input.nextLine();
        }



    }

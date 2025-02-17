package src;

import Entities.LogEntry;

import java.io.*;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter file full path:");
            String f = sc.next();

            try (BufferedReader bf = new BufferedReader(new FileReader(f))) {

                Set<LogEntry> set = new HashSet<>();

                String line = bf.readLine();

                while (line != null) {
                    String[] lines = line.split(" ");
                    String username = lines[0];
                    Date moment =  Date.from(Instant.parse(lines[1]));

                    set.add(new LogEntry(username, moment));

                    line = bf.readLine();
                }
                System.out.println("Total users: " + set.size());
            }
        }
    }
}

package dimitri_durmishian_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        Set<String> wordSet = new HashSet<>(fantasyFormatData);

        // Create a map to store word lengths and their counts
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        // Print set of different words
        System.out.println("Set of different words:");
        System.out.println(wordSet);

        // Print map of word lengths and counts
        System.out.println("\nMap of word lengths and counts:");
        System.out.println(wordLengthMap);

        // Write results to task4.txt
        try (FileWriter writer = new FileWriter("task4.txt", true)) {
            writer.write("\n\nSet of different words:\n");
            writer.write(wordSet.toString());

            writer.write("\n\nMap of word lengths and counts:\n");
            writer.write(wordLengthMap.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

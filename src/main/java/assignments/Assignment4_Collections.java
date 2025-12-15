package assignments;

import java.util.*;

public class Assignment4_Collections {
    public static void main(String[] args) {
        
        // 1. Create Lists with area of top 5 largest cities. Print total area of 3rd and 4th cities combined.
        List<Double> cityAreas = new ArrayList<>();
        cityAreas.add(8230.0);   // New York (example)
        cityAreas.add(12140.0);  // Tokyo
        cityAreas.add(7890.5);   // Los Angeles
        cityAreas.add(9050.7);   // Chicago
        cityAreas.add(6070.3);   // Houston
        
        double totalArea = cityAreas.get(2) + cityAreas.get(3);
        System.out.println("Total area of 3rd and 4th cities combined: " + totalArea + " sq km");

        // 2. Create a set of the top 10 most visited tourist attractions and print them + size
        Set<String> attractions = new LinkedHashSet<>();
        attractions.add("Eiffel Tower");
        attractions.add("Great Wall of China");
        attractions.add("Statue of Liberty");
        attractions.add("Machu Picchu");
        attractions.add("Colosseum");
        attractions.add("Taj Mahal");
        attractions.add("Disneyland");
        attractions.add("Grand Canyon");
        attractions.add("Niagara Falls");
        attractions.add("Burj Khalifa");

        System.out.println("Top 10 Tourist Attractions in the World:");
        System.out.println(attractions);
        System.out.println("Total Number of Attractions: " + attractions.size());

        // 3. Create an array of 10 numbers and print out the Average of 5th and 6th Value
        int[] numbers = {12, 45, 67, 89, 34, 56, 78, 90, 23, 11};
        double average = (numbers[4] + numbers[5]) / 2.0;
        System.out.println("Average of 5th and 6th Values: " + average);

        // 4. Create a list of the top 5 highest-grossing movies and print the third movie
        List<String> topMovies = Arrays.asList(
            "Avatar",
            "Avengers: Endgame",
            "Titanic",
            "Star Wars: The Force Awakens",
            "Avengers: Infinity War"
        );
        System.out.println("3rd Highest-Grossing Movie: " + topMovies.get(2));
    }
}

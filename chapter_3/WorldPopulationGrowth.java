public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double currentPopulation = 8.23e9;  // 8.23 billion
        double growthRate = 0.0085;         // 0.85% growth rate

        System.out.printf("%-5s %-20s %-20s%n", "Year", "Population at End", "Increase This Year");

        double population = currentPopulation;

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;

            System.out.printf("%-5d %-20.0f %-20.0f%n", year, population, increase);
        }

        // Optional: estimate doubling time
        double doublingTime = Math.log(2) / Math.log(1 + growthRate);
        System.out.printf("%nApproximate years to double the current population: %.1f%n", doublingTime);
    }
}

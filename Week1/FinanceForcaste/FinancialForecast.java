package DeepSkilling.FinanceForcaste;

public class FinancialForecast {

     public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
 public static double forecastWithMemo(double currentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return currentValue;

        if (memo[years] != null) return memo[years];

        memo[years] = forecastWithMemo(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;   
        double growthRate = 0.08;     
        int years = 5;

        System.out.println("Recursive Forecast:");
        double forecast = forecastValue(initialValue, growthRate, years);
        System.out.printf("Value after %d years: ₹%.2f%n", years, forecast);

        System.out.println("\nMemoized Forecast:");
        Double[] memo = new Double[years + 1];
        double optimizedForecast = forecastWithMemo(initialValue, growthRate, years, memo);
        System.out.printf("Value after %d years: ₹%.2f%n", years, optimizedForecast);

        System.out.println("\nTime Complexity:");
        System.out.println("Naive Recursion: O(n) — calls stack up linearly.");
        System.out.println("Memoized Version: O(n) — avoids repeated calculations.");
    }
}


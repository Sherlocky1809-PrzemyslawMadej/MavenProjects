package task16;

public enum Runner {

    BEGINNER (211, Integer.MAX_VALUE),
    INTERMEDIATE(151,210),
    ADVANCED (0, 150);

    private final int minResultOfMarathonInMinutes;
    private final int maxResultOfMarathonInMinutes;


    Runner(int minResultOfMarathonInMinutes, int maxResultOfMarathonInMinutes) {
        this.minResultOfMarathonInMinutes = minResultOfMarathonInMinutes;
        this.maxResultOfMarathonInMinutes = maxResultOfMarathonInMinutes;
    }

    public static Runner getFitnessLevel(int timeOfMarathonCompleted) {
        if (timeOfMarathonCompleted <= Runner.BEGINNER.maxResultOfMarathonInMinutes
                && timeOfMarathonCompleted >= Runner.BEGINNER.minResultOfMarathonInMinutes) {
            return Runner.BEGINNER;
        } else if (timeOfMarathonCompleted <= Runner.INTERMEDIATE.maxResultOfMarathonInMinutes
                && timeOfMarathonCompleted >= Runner.INTERMEDIATE.minResultOfMarathonInMinutes) {
            return Runner.INTERMEDIATE;
        } else {
            return Runner.ADVANCED;
        }
    }
}

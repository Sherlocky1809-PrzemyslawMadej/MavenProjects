package task16;

public class RunnerMain {

    public static void main(String[] args) {

        Runner fitnessLevel = Runner.getFitnessLevel(200);
        System.out.println(fitnessLevel);

        Runner fitnessLevel1 = Runner.getFitnessLevel(1200);
        System.out.println(fitnessLevel1);

        Runner fitnessLevel2 = Runner.getFitnessLevel(150);
        System.out.println(fitnessLevel2);
    }
}

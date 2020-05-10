package app;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;


    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Run hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it : " + fortuneService.getFortune();
    }

    // init method
    public void doMyStartUpStuff(){
        System.out.println("TrackCoach : inside method doMyStartUpStuff");
    }

    // destroy method
    public void doMyCleanUpStuff(){
        System.out.println("TrackCoach : inside method doMyCleanUpStuff");
    }

}

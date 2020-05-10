package app;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Okay";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

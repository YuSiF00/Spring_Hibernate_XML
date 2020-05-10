package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring Configuration file
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call our new method for fortune
        System.out.println(theCoach.getDailyFortune());

        //call our new methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());



        //close the context
        context.close();
    }
}

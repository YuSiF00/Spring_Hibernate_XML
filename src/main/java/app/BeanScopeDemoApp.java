package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load the spring Configuration file
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        //check if they are the same
        boolean result = (theCoach == alphaCoach);

        //print the results
        System.out.println("\nPointing to the same object : " + result);
        System.out.println("\nMemory location for theCoach : " + theCoach);
        System.out.println("\nMemory location for alphaCoach : " + alphaCoach + "\n");

        //when in the bean scope = singleton(for default) result is true
        //when in the bean scope = prototype result is true

        //close the context
        context.close();

    }
}

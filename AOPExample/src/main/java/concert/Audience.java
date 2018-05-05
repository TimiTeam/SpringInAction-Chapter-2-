package concert;

import org.aspectj.lang.annotation.*;

@Aspect // This annotation indicates that Audience —it’s an aspect
public class Audience {

    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()") // The advice method is called before the advised method is called.
    public void silenceCellPhone(){
        System.out.println("Silencing your cell phone");
    }

    @Before("performance()")
    public void takingSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()") //The advice method is called after the advised method returns.
    public void applause(){
        System.out.println("CLAP-CLAP-CLAP!!!");
    }

    @AfterThrowing("performance()") // The advice method is called after the advised method throws an exception.
    public void demandingRefund(){
        System.out.println("Demanding a refund");
    }

}

package com.gmail.timurworkspace;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration // annotation identifies this as a configuration class,
// and it’s expected to contain details on beans that
// are to be created in theSpring application context.
//@ComponentScan(basePackageClasses = SgtPeppers.class) // Will be scan that package
// and any subpackages underneath it,looking for classes that are annotated with @Component.
// It should find the Compact-Disc class and automatically create a bean for it in Spring.
public class CDPlayerConfig {

    @Bean() //this method will return an object that should be registered as a bean in the
    // Spring application context
    public CompactDisc sgtPeppers(){
        List<CompactDisc> discs = new ArrayList<CompactDisc>(3);
        discs.add(new SgtPeppers());
        discs.add(new ISawHer());
        discs.add(new IveJustSeen());
        int choice = (int)(Math.random()*3);
        return discs.get(choice);
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

}

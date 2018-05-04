package com.gmail.timurworkspace;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration // annotation identifies this as a configuration class,
// and it’s expected to contain details on beans that
// are to be created in theSpring application context.
@ComponentScan(basePackageClasses = SgtPeppers.class) // Will be scan that package
// and any subpackages underneath it,looking for classes that are annotated with @Component.
// It should find the Compact-Disc class and automatically create a bean for it in Spring.
public class CDPlayerConfig {


}

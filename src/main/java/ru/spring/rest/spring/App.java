package ru.spring.rest.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.spring.rest.spring.communication.Communication;
import ru.spring.rest.spring.configuration.MyConfig;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",Communication.class);

//        System.out.println(communication.getAllPersons());
//        System.out.println(communication.getPersonById(3));
//        Person person3 = new Person("Mihail", "Petrov" , 25, "HR 6");
//        person3.setId(14);
//        communication.savePerson(person3);
        communication.deletePersonByID(20);

    }
}

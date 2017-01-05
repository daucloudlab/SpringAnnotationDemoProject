package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.bean.Animal;
import kz.kaznitu.lessons.bean.AnimalService;
import kz.kaznitu.lessons.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProgram {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;

//        AnimalService animal = (AnimalService)context.getBean("animalService") ;

        AnimalService animal = (AnimalService)context.getBean(AnimalService.class) ;

        animal.getAnimal().printName();

        System.out.println(animal.getZoo().getZooName());

    }
}

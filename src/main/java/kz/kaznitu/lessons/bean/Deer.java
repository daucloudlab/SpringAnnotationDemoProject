package kz.kaznitu.lessons.bean;

import org.springframework.stereotype.Component;

@Component(value = "deer")
public class Deer implements Animal{

    public void printName() {
        System.out.println("-----Deer----");
    }
}

package kz.kaznitu.lessons.bean;

import org.springframework.stereotype.Component;

@Component(value = "fox")
public class Fox implements Animal {
    public void printName() {
        System.out.println("----Fox----");
    }
}

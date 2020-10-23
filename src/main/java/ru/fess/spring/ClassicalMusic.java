package ru.fess.spring;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("Происходит инициализация бина ClassicalMusic");
    }

    public void doMuDestroy() {
        System.out.println("Происходит уничтожение бина ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}

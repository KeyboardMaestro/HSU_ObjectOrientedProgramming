package week7;

public class SingleTonPattern {
    SingleTonPattern singleton = new SingleTonPattern(1);

    private int a;

    private SingleTonPattern(int a){
        this.a = a;
    }
}

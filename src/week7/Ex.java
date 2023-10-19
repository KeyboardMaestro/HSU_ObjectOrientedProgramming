package week7;

public class Ex {
    public static void main(String[] args) {
        StaticSample.m = 10;

        StaticSample s1 = new StaticSample();
        System.out.println(s1.m);

        s1.f();
        System.out.println(StaticSample.m);
        StaticSample.f();

        System.out.println(StaticSample.m);
    }
}

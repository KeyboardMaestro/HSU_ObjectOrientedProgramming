package week6;

public class TV {
    private String manufacturer;
    private int year;
    private int size;

    TV(String manufacturer, int year, int size){
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.println(manufacturer+"에서 만든 "+ year + "년형 " +size+"인치 TV");
    }
}

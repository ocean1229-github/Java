package javaStudy;

public class BusExam {
    public static void main(String[] args){
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();
        
        Car car = new Car();
        car.run();
        
        // car.ppangppang();
        // 자식 클래스는 부모가 가지고 있는 메소드를 사용할 순 없다.
    }
}
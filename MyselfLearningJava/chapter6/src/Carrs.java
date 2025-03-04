public class Carrs {
    String model;
    int speed;

    Carrs(String model) {
        this.model = model;

    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void runn() {
        for (int i = 0; i < 50; i+=10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다. 가즈아!!!!!!!(시속: " +this.speed + "km/h)");
        }
    }
 }

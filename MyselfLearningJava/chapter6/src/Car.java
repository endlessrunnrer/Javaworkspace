public class Car {

    String company = "samsung car";
    String model = "Porshae";
    String color = "black";
    int maxSpeed = 400;
    int speed;

    //생성자

    Car() {

    }

    Car(String model) {
        // this.model = model;
        this(model, "은색", 250);
    }
    Car(String model, String color) {
     //   this.model = model;
      //  this.color = color;
        this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}

/* public class newCarExample {                             //왜 안되는지 이해가 안감..   클래스도 제대로 선언하고 호출했는데 왜 안됨?
    public static void main(String[] args) {
        Car myCar = new newCar();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다.");
            myCar.run();

        }
        if(myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다. ");

        } else {
            System.out.println("gas를 주입하세요. ");
        }
    }
}
*/
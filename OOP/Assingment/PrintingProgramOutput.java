
class Automobile {
    private String drive() {  // PRIVATE!
        return "Driving vehicle";
    }
}
class Car extends Automobile {
    protected String drive() {  // NEW method (not override!)
        return "Driving car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() {  // Overrides Car's drive()
        return "Driving electric car";
    }
}
    public class PrintingProgramOutput {

        public static void main(String[] wheels) {

        final Car car = new ElectricCar();  // Reference type: Car, Object type: ElectricCar
        System.out.println(car.drive());
    }
}
        
    


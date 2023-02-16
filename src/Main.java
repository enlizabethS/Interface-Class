public class Main {
    public static void main(String[] args) {
        Drivable bmw = new Car();
        Drivable linux = new Bicycle();
        Drivable []drivables = new Drivable[]{bmw,linux};

        for(int i=0; i<drivables.length;i++){
            drivables[i].drive();
        }

    }
}
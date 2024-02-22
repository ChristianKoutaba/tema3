public class eloncar {
    public class eloncar {
        private int distanceDriven;
        private int batteryPercentage;
        private eloncar() {
            this.distanceDriven = 0;
            this.batteryPercentage = 100;
        }
        public static eloncar buy() {
            return new eloncar();
        }
        public String distanceDisplay() {
            return "Driven " + distanceDriven + " meters";
        }
        public String batteryDisplay() {
            if (batteryPercentage <= 0) {
                return "Battery empty";
            }
            return "Battery at " + batteryPercentage + "%";
        }
        public void drive() {
            if (batteryPercentage > 0) {
                distanceDriven += 20;
                batteryPercentage--;
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            eloncar car = eloncar.buy();
            System.out.println(car.distanceDisplay()); 

            System.out.println(car.batteryDisplay()); 
            car.drive();
            car.drive();
            System.out.println(car.distanceDisplay()); 
            System.out.println(car.batteryDisplay()); 
            while (!car.batteryDisplay().equals("Battery empty")) {
                car.drive();
            }
            System.out.println(car.distanceDisplay()); 
            System.out.println(car.batteryDisplay()); 
        }
    }
}

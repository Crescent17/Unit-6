public class Audi extends Car {
    private int roadServiceMonths;

    public Audi(int size, int roadServiceMonths) {
        super("Audi", size, 4, 4, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        if (rate < getCurrentVelocity()) {
            System.out.println("Rate is lower than current velocity");
        } else {
            int newVelocity = getCurrentVelocity() + rate;
            if (newVelocity == 0) {
                stop();
                changeGear(1);
            } else if (newVelocity > 0 && newVelocity <= 10) {
                changeGear(1);
            } else if (newVelocity > 10 && newVelocity <= 20) {
                changeGear(2);
            } else if (newVelocity > 20 && newVelocity <= 30) {
                changeGear(3);
            } else if (newVelocity > 30 && newVelocity <= 40) {
                changeGear(4);
            } else {
                changeGear(5);
            }
            if (newVelocity > 0) {
                changeVelocity(newVelocity, getCurrentDirection());
            }
        }
    }
}

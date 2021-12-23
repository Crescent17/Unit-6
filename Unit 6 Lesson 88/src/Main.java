public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi(300, 24);
        audi.steer(80);
        audi.accelerate(30);
        audi.accelerate(60);
        audi.accelerate(-91);
    }
}

public class Crossing {
    private static int numberOfLights = 3;
    private static int numberOfTrafficLights = 6;

    public static void main(String[] args) {

        System.out.println("Initializing " +
                        "Traffic " +
                        "Crossing"
        );

        TrafficController controller = new TrafficController();
    }

    public static int getNumberOfTrafficLights() {
        return numberOfTrafficLights;
    }

    public static int getNumberOfLights() {
        return numberOfLights;
    }
}

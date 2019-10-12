public class Crossing {
    public static void main(String[] args) {

        System.out.println("Initializing Traffic Crossing");
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.getColor(3);
        for (int i = 0; i < 10; i++) {
            trafficLight.changeColor(trafficLight.getCurrentColor());
        }

        trafficLight.getColor(trafficLight.getCurrentColor());
    }
}

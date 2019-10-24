public class TrafficController {
    // Array of TrafficLight objects
    private TrafficLight[] trafficLights;

    public TrafficController() {
        System.out.println(
                "Total number of Traffic Lights: " +
                        Crossing.getNumberOfTrafficLights()
        );

        // Set the array size
        this.trafficLights = new TrafficLight[Crossing.getNumberOfTrafficLights()];

        // Fill the array and initialize each trafficlight with a unique id
        for (int count = 0; count < Crossing.getNumberOfTrafficLights(); count++) {
            trafficLights[count] = new TrafficLight(count, Crossing.getNumberOfLights());
            System.out.println("Current color " + count + ": " +
                    trafficLights[count].getCurrentColor()
            );
        }
    }
}
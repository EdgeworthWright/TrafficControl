public class TrafficLight {

    private int id;
    private int numberOfLights;
    private int defaultColor;

    public TrafficLight() {
        id = 0;
        numberOfLights = 3;
        defaultColor = 1;
    }

    /**
     * @param id
     * @param numberOfLights
     */
    public TrafficLight(int id, int numberOfLights) {
        this.id = id;
        this.numberOfLights = numberOfLights;
    }

    /**
     * @param light
     * @return
     */
    public String getColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Red");
                result = "red";
                break;
        }
        return result;
    }

    /**
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * @return
     */
    public int getNumberOfLights() {
        return numberOfLights;
    }

    /**
     * @return
     */
    public int getDefaultColor() {
        return defaultColor;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param numberOfLights
     */
    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    /**
     * @param defaultColor
     */
    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    /**
     * @param light
     */
    public void showColorAndId(int light) {
        String result;
        result = getColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + getId()
        );
    }

    /**
     * @param number
     * @return
     */
    public boolean isPositiveNumber(int number) {
        return number >= 0;
    }

}

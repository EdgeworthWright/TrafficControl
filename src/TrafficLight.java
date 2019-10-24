import java.util.Random;

public class TrafficLight {

    private int id;
    private int numberOfLights;
    private int defaultColor;
    private int currentColor;

    public TrafficLight() {
        id = 0;
        numberOfLights = 3;
        defaultColor = 1;
        currentColor = defaultColor;
    }

    /**
     *
     * @param id
     * @param numberOfLights
     */
    public TrafficLight(int id, int numberOfLights) {
        this.id = id;
        this.numberOfLights = numberOfLights;

        // Random light color
        setCurrentColor(createRandomNumber(3) + 1);
    }

    public static int createRandomNumber(int seed){

        Random random = new Random();

        return random.nextInt(seed);
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
                System.out.println("Invalid Light Number");
                result = "Invalid Light Number";
                break;
        }
        return result;
    }

    public int changeColor(int light) {
        int result;
        switch (light) {
            case 1:
                System.out.println("Green");
                result = 3;
                break;
            case 2:
                System.out.println("Red");
                result = 1;
                break;
            case 3:
                System.out.println("Orange");
                result = 2;
                break;
            default:
                System.out.println("Invalid Light Number");
                result = 0;
                break;
        }
        currentColor = result;
        return result;
    }

    /**
     *
     * @return
     */
    public int getCurrentColor() {
        return currentColor;
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
     *
     * @param defaultColor
     */
    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    /**
     *
     * @param currentColor
     */
    public void setCurrentColor(int currentColor) {
        this.currentColor = currentColor;
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

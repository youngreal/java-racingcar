package step4;

public class Car {
    private static final int CAR_NAME_MAXSIZE = 5;
    private final String carName;
    private Location location;

    public Car(String carName) {
        this(carName, new Location(1));
    }

    public Car(String carName, Location location) {
        if (isOverCarNameMaxSize(carName)) {
            throw new IllegalArgumentException("자동차이름이 너무 깁니다.");
        }
        this.carName = carName;
        this.location = location;
    }

    public int findMaxLocation(int location) {
        return Math.max(location, getLocation());
    }

    public void moveLocation(RandomNumber randomNumber, int randomNum) {
        if (randomNumber.movable(randomNum)) {
            this.location = location.increaseLocation();
        }
    }

    boolean isMaxLocation(int maxPosition) {
        return location.isMaxLocation(maxPosition);
    }

    private boolean isOverCarNameMaxSize(String carName) {
        return carName.length() > CAR_NAME_MAXSIZE;
    }

    public String getCarName() {
        return carName;
    }

    public int getLocation() {
        return location.getPosition();
    }
}

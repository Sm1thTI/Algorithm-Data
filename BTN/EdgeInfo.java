package BTN;

public class EdgeInfo {
    private final int minutes;
    private final String type; // e.g., "path_1", "path_2", "crossing_link"

    public EdgeInfo(int Minute, String type) {
        this.minutes = Minute;
        this.type = type;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "dist=" + minutes + ", type=" + type;
    }
}
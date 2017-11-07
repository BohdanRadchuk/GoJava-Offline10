import java.util.Arrays;

public class Lines {

    public String[] lines = new String[5];

    @Override
    public String toString() {
        return
                "{ lines=" + Arrays.toString(lines) +
                '}';
    }
}

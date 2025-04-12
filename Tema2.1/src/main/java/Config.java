import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Config {
    private static Config instance;
    private String color;
    private int weight;


    public Config() {
    }
    
    private Config(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public static Config getInstance(String filename) throws IOException {
        if (instance == null) {
            instance = readConfig(filename);
        }
        return instance;
    }

    private static Config readConfig(String filename) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filename), Config.class);
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        try {
            Config config = Config.getInstance("C:\\Users\\bleja\\Documents\\GitHub\\Teme_PAOO\\Tema2.1\\src\\main\\config.json");
            System.out.println("Color: " + config.getColor());
            System.out.println("Weight: " + config.getWeight());
        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierului JSON: " + e.getMessage());
        }
    }
}

package seedu.duke.data;

//import java.io.File;

public class Mod {
    private final String name;
    private final String description;
    private final int numMC;
    private final String code;

    public Mod(String name, String description, int numMC, String code) {
        this.name = name;
        this.description = description;
        this.numMC = numMC;
        this.code = code;
    }

    public Mod(String code) {
        String filePath = "./data/mod_data.txt";
        Data datafile = new Data(filePath);
        String[] parts = datafile.searchMod(code);
        this.name = parts[1];
        this.description = parts[3];
        this.numMC = Integer.parseInt(parts[2]);
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumMC() {
        return numMC;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return code + " | " + name + ": " + " (" + numMC + " MCs)" ;
    }
}

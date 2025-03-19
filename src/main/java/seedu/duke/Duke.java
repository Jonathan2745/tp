package seedu.duke;

import java.util.ArrayList;
import java.util.Scanner;

import seedu.duke.data.Mod;
import seedu.duke.command.*;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static ArrayList<Mod> moduleList = new ArrayList<>();
    public static int totalMCs = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Grand Rhombus");
        Scanner in = new Scanner(System.in);

        String userInput = in.nextLine();
        while (!userInput.equals("die")) {
            String usercmd = userInput.split(" ")[0];
            String modCode = userInput.split(" ")[1];

            if (usercmd.equals("d")) {
                Command cmd = new DeleteModule(modCode);
                cmd.execute();
            } else if (usercmd.equals("a")) {
                Command cmd = new AddModule(modCode);
                cmd.execute();
            }
            
            Command cmd = new ListModules();
            cmd.execute();
            userInput = in.nextLine();
        }

    }
}

import java.io.IOException;

import javax.swing.*;

public class MAIN {

    private static boolean failed = false;

    public static void main(String[] args) {
        try {
            new Installer().downloadUsingNIO("https://repo.opencollab.dev/api/maven/latest/file/maven-snapshots/cn/nukkit/nukkit/1.0-SNAPSHOT?extension=jar","nukkit.jar");
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "Download failed. Please try again.");
            String x = "Failed.";
            System.out.println(x);
            failed = true;
        }

        if (!failed) {
            //JOptionPane.showMessageDialog(null, "Download completed! Run nukkit.jar to continue the nukkit installation!");
            String x = "Complete";
            System.out.println(x);
        }
    }
}

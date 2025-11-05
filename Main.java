import src.view.HabitatQualityUI;
import src.view.LoginDialog;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            // Use null as parent for dialog to ensure JOptionPane works
            LoginDialog loginDlg = new LoginDialog(null);
            loginDlg.setVisible(true);

            if (loginDlg.isSucceeded()) {
                new HabitatQualityUI(); // Launch main JSwing UI
            } else {
                System.exit(0); // Exit if login fails or canceled
            }
        });
    }
}

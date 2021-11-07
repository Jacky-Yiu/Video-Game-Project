import java.awt.Image;
import javax.swing.ImageIcon;

public class TrapPunishment extends Environment{
    private static Image image = null;

    TrapPunishment() {
        super();
        if (TrapPunishment.image == null) {
            TrapPunishment.image = new ImageIcon("images/tree.png").getImage();
        }
    }


    public Image getImage() { return TrapPunishment.image; }
}

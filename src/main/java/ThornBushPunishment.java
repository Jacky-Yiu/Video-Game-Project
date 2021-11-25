import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * sets the image of the ThornBush
 */
public class ThornBushPunishment extends Punishment{


    private static Image image = null;

    ThornBushPunishment() {
        super();
        if (ThornBushPunishment.image == null) {
            ThornBushPunishment.image = loadImage("images/48_thorn_bush.png");
        }
    }


    public Image getImage() { return ThornBushPunishment.image; }
}

import java.awt.Image;
/**
 * sets door images to open and closed, image depends on if door isOpen
 */
public class Door extends Environment {
	private static Image imageClose = null;
	private static Image imageOpen = null;	
	private static boolean isOpen = false;

	Door() {
		super();
		if (Door.imageClose == null) {
			Door.imageClose = loadImage("images/48_portal_close.gif");
			Door.imageOpen = loadImage("images/48_portal_open.gif");
        }
	}

	@Override
	public Image getImage() {
        return Door.isOpen ? Door.imageOpen : Door.imageClose;
	}

	public static void open() { Door.isOpen = true; }
    public static void close() { Door.isOpen = false; }
	public static boolean checkOpen() { return Door.isOpen; }
}

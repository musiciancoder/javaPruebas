package patronesdiseno.estructurales.flyweight.geeks4geeks;

import java.util.HashMap;
import java.util.Map;

//Notar que en este ejemplo no hay un componente (clase) Unshared Concrete Flyweight, que se menciona en la UML del curso udemy, por lo que a mi juicio es optativo. Se entiende muy bien este ejemplo igual.

// Flyweight interface
interface Icon {
    void draw(int x, int y);  // Method to draw the icon at given coordinates --> Las coordenadas x e y son el extrinsic stage. Esto se menciona
    //en geeks4geeks "Each icon instance then stores only its unique properties (extrinsic state), such as its position on the screen" y esta corroborado por el ejemplo del curso de Udemy. En el ejemplo del gringo pelado de youtube no lo trabaja así, por lo que yo creo que vale callampa !!
}

// Concrete Flyweight class representing a File Icon
class FileIcon implements Icon {
    private String type;  // Intrinsic state: type of file icon
    private String imageName;  // Intrinsic state: image name specific to the file icon

    public FileIcon(String type, String imageName) {
        this.type = type;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        // Simulated logic to load and draw image
        System.out.println("Drawing " + type + " icon with image " + imageName + " at position (" + x + ", " + y + ")");
    }
}

// Concrete Flyweight class representing a Folder Icon
class FolderIcon implements Icon {
    private String color;  // Intrinsic state: color of the folder icon
    private String imageName;  // Intrinsic state: image name specific to the folder icon

    public FolderIcon(String color, String imageName) {
        this.color = color;
        this.imageName = imageName;
    }

    @Override
    public void draw(int x, int y) {
        // Simulated logic to load and draw image
        System.out.println("Drawing folder icon with color " + color + " and image " + imageName + " at position (" + x + ", " + y + ")");
    }
}

// Flyweight factory to manage creation and retrieval of flyweight objects
class IconFactory {
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) {
        // Check if the icon already exists in the cache
        if (iconCache.containsKey(key)) {
            return iconCache.get(key);
        } else {
            // Create a new icon based on the key (type of icon)
            Icon icon;
            if (key.equals("file")) {
                icon = new FileIcon("document", "document.png");
            } else if (key.equals("folder")) {
                icon = new FolderIcon("blue", "folder.png");
            } else {
                throw new IllegalArgumentException("Unsupported icon type: " + key);
            }
            // Store the created icon in the cache
            iconCache.put(key, icon);
            return icon;
        }
    }
}

// Client code to use the flyweight objects (icons)
public class Client {  //Curso Udemy --> "Extrinsic state is stored by client and is provided to the Flyweight instance (o sea fileIcon1, fileIcon2, etc) when calling it's method (o sea el método draw())"
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();

        // Draw file icons at different positions
        Icon fileIcon1 = iconFactory.getIcon("file"); //La unica diferencia con respecto al curso de Udemy es que aca se usa Flyweight nombreInstancia = FlyweightFactory, en cambio en Udemy es ConcreteFlyweight nombreInstancia = FlyweightFactory
        fileIcon1.draw(100, 100); //el extrinsic state se le pasa en el cliente, igual que en Udemy

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(150, 150);

        // Draw folder icons at different positions
        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(200, 200);

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(250, 250);
    }
}

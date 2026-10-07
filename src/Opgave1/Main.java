import Opgave1.Building;
import Opgave1.Lamp;
import Opgave1.Room;
import Opgave1.Window;

public static void main(){
    Building building = new Building("EK");
    Room room = new Room("3.14");
    Room room1 = new Room("3.03");
    Room room2 = new Room("3.05");
    Window window = new Window(10,20);
    Lamp lamp = new Lamp(30);
    Lamp lamp1 = new Lamp(40);
    room.addLamp(lamp);
    room.addLamp(lamp1);
    room.addWindow(window);

    room1.addLamp(lamp);
    room1.addLamp(lamp1);
    room1.addWindow(window);

    room2.addLamp(lamp);
    room2.addLamp(lamp1);
    room2.addWindow(window);

    building.addRoom(room);
    building.addRoom(room1);
    building.addRoom(room2);

    System.out.println(building.getTotalLampCount());
    System.out.println(building.getTotalWatt());


}
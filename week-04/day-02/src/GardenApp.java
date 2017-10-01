import java.util.ArrayList;

public class GardenApp {
    public static void main(String[] args) {
        Garden myGarden = new Garden();

        Plant yellow = new Flower( "yellow flower", 4 );
        myGarden.plants.add( yellow );
        Plant blue = new Flower( "blue flower", 4 );
        myGarden.plants.add( blue );
        Plant orange = new Tree( "orange tree", 5 );
        myGarden.plants.add( orange );
        Plant purple = new Tree( "purple tree", 5 );
        myGarden.plants.add( purple );

        myGarden.printStatus();
        myGarden.waterThirsty( 40 );
        myGarden.printStatus();
        myGarden.waterThirsty( 70 );
        myGarden.printStatus();


    }
}


//Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.
//
public class Bottle {
    private double volume = 100;
    public double drink(int i){
        double result = volume -i ;
        return result;
    }
    public double empty(){
        volume = 0;
        return volume;
    }
    public double fill(){
        volume = 100;
        return volume;
    }

    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        double volume1 = bottle.volume;
        System.out.println(volume1);
        double drinked =bottle.drink(10);
        System.out.println(drinked);
        double emptied = bottle.empty();
        System.out.println(emptied);
        double filled = bottle.fill();
        System.out.println(filled);
    }
}

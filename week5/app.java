package week5;

public class app {
    public static void main(String[] args) 
    {
        logger logAsterisk = new AsteriskLogger();
        logger logSpaced = new SpacedLogger();

        logAsterisk.log("HotDog");
        logAsterisk.error("HotDog");
        
        logSpaced.log("HotDog");
        logSpaced.error("HotDog");

    }
}

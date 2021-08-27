package week5;

public class AsteriskLogger implements logger{

    @Override
    public void log(String log) 
    {
        System.out.println("***" + log + "***");
    }

    @Override
    public void error(String error) 
    {
        System.err.println("ERROR" + "***" + error + "***");
    }

}
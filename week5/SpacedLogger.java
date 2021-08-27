package week5;

public class SpacedLogger implements logger{

    @Override
    public void log(String log) 
    {
        StringBuilder sep = new StringBuilder();
        for (char space : log.toCharArray())
        {
            sep.append(space).append(" ");
        } 
        System.out.println(sep.toString());   
    }

    @Override
    public void error(String error) 
    {
        StringBuilder sep2 = new StringBuilder();
        for (char space : error.toCharArray())
        {
            sep2.append(space).append(" ");
        } 
        System.out.println("ERROR " + sep2.toString());
    }
}

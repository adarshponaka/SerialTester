import arduino.*;

public class tester {
    public static void main (String[] args){
        Arduino obj = new Arduino();
        obj.openConnection();
        obj.getPortDescription();

    }

}

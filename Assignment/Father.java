public class father extends Heirloom{
    int b;
    void houses()
    {
        h=3;
        System.out.println("houses: "+h);
    }
    void cars()
    {
        c=2;
        System.out.println("cars : "+c);
    }
    void bikes()
    {
        b=1;
        System.out.println("bikes : "+b);
    }
    void assets()
    {
        System.out.println("Assets of father");
        houses();
        cars();
        bikes();
    }
}
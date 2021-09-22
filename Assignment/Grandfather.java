public class Grandfather extends Heirloom{

    void houses()
    {
        h=2;
        System.out.println("houses: "+h);
    }
    void cars()
    {
        c=1;
        System.out.println("cars : "+c);
    }
   void assets()
   {
       System.out.println("Assets of grandfather");

       houses();
       cars();
   }
}
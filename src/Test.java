public class Test
{
    public static void main(String args[])
    {
        
        Box mybox = new Box(10, 20, 15);
  
       
        Box myclone = new Box(mybox);
  
        double vol;
  
     
        vol = mybox.volume();
        System.out.println("Volume of mybox is " + vol);
  
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}
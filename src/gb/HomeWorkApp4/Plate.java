package gb.HomeWorkApp4;


import java.util.Scanner;

public class Plate  {
        public int foot;

    public Plate(int foot) {
        this.foot=foot;
    }

    public void info(){
        System.out.println("Положите котикам еды");
            Scanner ct =new Scanner(System.in);
            this.foot=ct.nextInt();
        }
        public boolean info1(int a){
            int i=foot-a;
            if(i<a) return false;
            else return true;


        }
}









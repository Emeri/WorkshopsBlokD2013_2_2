package workshop8;

/**
 * Created with IntelliJ IDEA.
 * User: remcoruijsenaars
 * Date: 12/13/13
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class SomRecursief {


    public static void main(String[] args){
        //recursieveMethode();
        System.out.println(somPoging2(9));

    }


    public static int som(int n){
          return n + som(n-1);
    }


    public static int somPoging2(int n){
        if(n == 1){
            return  1;
        }else{
            return n + somPoging2(n - 1);
        }
    }



    public static void recursieveMethode(){
        recursieveMethode();
    }







}

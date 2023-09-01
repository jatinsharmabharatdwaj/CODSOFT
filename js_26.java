
import java.util.*;
class game1 {
    public int number;
    public int user_Input_number;
    public int no_of_guesses;


    public int getNo_of_guesses() {
        return no_of_guesses;
    }
    public void setNo_of_guesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }
    game1() {
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
    void take_user_input() {
        System.out.println("guess the number ");
        Scanner sc = new Scanner(System.in);
        user_Input_number = sc.nextInt();
    }
    boolean is_correct_number() {
        if (user_Input_number == number) {
            System.out.println("number is match you are winner");
            return true;

        } else if (user_Input_number < number) {
            System.out.println(" too low......");
        }
        else if (user_Input_number>number){
            System.out.println(" too high.....");
        }
        return false;
    }
}
public class js_26 {

    public static void main(String []args){
        game1 g=new game1();
        boolean b=false;
        while(!b){
        g.take_user_input();

       b= g.is_correct_number();
            System.out.println(b);



    }
}}


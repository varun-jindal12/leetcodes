public class ReverseInteger {
    public int reverse(int x) {
        if(x>=0){
            StringBuilder str = new StringBuilder(Integer.toString(x));
            str = str.reverse();
            return Integer.parseInt(str.toString());
        }
        else {
            StringBuilder str = new StringBuilder(Integer.toString(-1*x));
            str = str.reverse();
            return Integer.parseInt("-"+str);
        }

    }
}

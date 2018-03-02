public class TestByReference {
    public void swap(Integer x, Integer y){
        Integer temp = Integer.valueOf(x);
        x = y;
        y = temp;
    }
    public void printSwapped(Integer x ,Integer y ){
        swap(x,y);
        System.out.println("x = "+x +" y = "+ y);
    }
}

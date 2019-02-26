import java.util.ArrayList;
import java.util.List;

public class NaryNode {
    int value;
    List<NaryNode> children = new ArrayList<>();
    NaryNode(int value){
        this.value = value;
    }
}

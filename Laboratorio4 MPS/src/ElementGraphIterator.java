
import java.util.ArrayList;
import java.util.Iterator;
public class ElementGraphIterator implements ElementGraphIteratorIF {

    @Override
    public void algo(){
        //alguma operacao a se implementar
    }
    @Override
    public int iterate( ArrayList<GraphElementIF> elements){
        int x = 0;
        Iterator<GraphElementIF> it = elements.iterator();
        while(it.hasNext()) {
            GraphElementIF i = it.next();
            x = x+ i.return_x();
        }
        return x;
    }

    public ElementGraphIterator(){

    }
}

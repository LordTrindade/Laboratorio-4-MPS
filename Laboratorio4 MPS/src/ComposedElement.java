
import java.util.ArrayList;

public class ComposedElement implements GraphElementIF {
    ComposedElement(int x){
        this.elements = new ArrayList<GraphElementIF>();
        this.x = x;
    }

    public void addElement(GraphElement element){
        elements.add(element);
    }

    public void removeElement(int x){
        elements.remove(x);
    }

    public int get_n_Elements(){
        return elements.size();
    }

    @Override
    public void algo(){
        //algo
    }

    @Override
    public int return_x(){
        int total = 0;
        if ((get_n_Elements())>0) {
            iterador = new ElementGraphIterator();
            total = total + iterador.iterate(elements);
        }
        return total;
    }
}

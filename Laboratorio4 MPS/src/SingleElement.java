public class SingleElement implements GraphElementIF{
    @Override
    public void algo(){
        //uma operacao qualquer
    }

    public SingleElement(int x){
        this.x = x;
    }

    @Override
    public int return_x(){
        return x;
    }
}

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private List<NationalPark> queList;
    private int nItems;
    private int priority;

    //-------------------------------------------------------------
    public PriorityQueue(int maxSize) // constructor
    {
        queList = new ArrayList<>(maxSize);
        nItems = 0; // item number, eleman sayısı
    }
    //-------------------------------------------------------------
    public void insert(NationalPark np){
        queList.add(np);
        nItems++;
    } // end insert()

    //-------------------------------------------------------------
    public NationalPark remove(){
        NationalPark temp = queList.get(0);
        for(NationalPark np:queList){
            if(np.getArea() < temp.getArea()){
                temp = np;
            }
        }queList.remove(temp);
        nItems--;
        return temp;
    }
    //    //-------------------------------------------------------------
//    public long peekMin() // peek at minimum item
//    { return queList[nItems-1]; }
//    //-------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    { return (nItems==0); }
    //-------------------------------------------------------------
    public boolean isFull() // true if queue is full
    { return (nItems == maxSize); }

    // debug için yazdığımız method, sonra silicez
    public void print(){
        for(NationalPark np: queList){
            System.out.println(np);
        }
    }

}

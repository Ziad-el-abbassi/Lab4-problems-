package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int size=0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size=size;
    }
    private void increaseSize(int size){
        int[] lst= new int[list.length*2];
        for(int i=0;i<size;i++){
            lst[i]=list[i];
        }
        list=lst;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
        }
    }
    public void addElement(int newVal){
        if(size==list.length){
            increaseSize(size);
        }
        list[size]=newVal;
        size++;
    }

    public void removeFirst(int newVal){
        for(int i=0;i<size;i++){
            if(list[i]==newVal){
                list[i]=0;
                for(int j=i;j<size-1;j++){
                    list[j]=list[j+1];
                }
                size--;
                break;
            }
        }
    }

    public void removeAll(int newVal){
        for(int i=0;i<size;i++){
            if(list[i]==newVal){
                for(int j=i;j<size-1;j++){
                    list[j]=list[j+1];
                }
                size--;
                i--;
            }
        }
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<size; i++)
            System.out.println(i + ":\t" + list[i]);
    }
}
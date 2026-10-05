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
    }
    private void increaseSize(int size){
        int[] lst= new int[list.length*2];
        for(int i=0;i<size;i++){
            lst[i]=list[i];
        }
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
            size=size+1;
    }
    private void addElement(int newVal){
        if(size==list.length){
            increaseSize(size);
        }
        list[size]=newVal;
    }

    private void removeFirst(int newVal){
        for(int i=0;i<list.length;i++){
            if(list[i]==newVal){
                list[i]=0;
                for(int j=i;j<list.length;j++){
                    list[j]=list[j+1];
                }
                size--;
                break;
            }
        }
    }

    private void removAll(int newVal){
        for(int i=0;i<list.length;i++){
            if(list[i]==newVal){
                list[i]=0;
                for(int j=i;j<list.length;j++){
                    list[j]=list[j+1];
                }
                size--;
            }
        }
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
}
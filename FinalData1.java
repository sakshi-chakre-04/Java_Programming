class Demo
{
    public int i;
    final public int j;

    public Demo()
    {
        this.i = 11;
        this.j = 21;
    }
}


class FinalData1 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo();
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++;       // ERROR
    }
}

// in interview -> tell System is final for final concept
//injellij shows errors in code
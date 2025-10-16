class Demo
{
    public int i = 11;
    final public int j = 21;

    public Demo()
    {
        this.i = 11;
        //this.j = 22;      // ERROR
    }
}


class FinalData3
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

//initialize either in characteristics or constructor
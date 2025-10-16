class Demo
{
    public int i ;
    final public int j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }
}


class FinalData4
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo(11, 21);

        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++;       // ERROR
    }
}

// the above 3 codes are not to be used , this is to be used
// we cant initialize default value as arg in java

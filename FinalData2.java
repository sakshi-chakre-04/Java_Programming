class Demo
{
    public int i = 11;
    final public int j = 12;
}


class FinalData2
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

// c++ 17 allows initializing variables' we are doing c++ 11
// in java also it is allowed
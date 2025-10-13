class Demo {
    public int iNo1;// require to specify for each member
    public int iNo2;

    public Demo() {
        System.out.println("Inside Default constructor");
    }

    public Demo(int i, int j) {
        System.out.println("Inside Parameterized constructor");
    }

}

class Constructor {
    public static void main(String A[]) {
        Demo dobj1 = new Demo();// in java everything->dynamic
        Demo dobj2 = new Demo(11, 21);
    }
}

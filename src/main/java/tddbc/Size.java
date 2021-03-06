package tddbc;

public enum Size {
    S(0),M(1),L(2),LL(3);

    private int weight;

    private Size(int weight){
        this.weight = weight;
    }


    public static Size toSize(int weight) {
        if(25 <= weight) return LL;
        if(20 <= weight) return L;
        if(10 <= weight) return M;
        return S;
    }

    public int getDiffelence(Size size) {
        int i = size.weight - this.weight;
        if(0 <= i) return i;
        return i * -1;
    }
}

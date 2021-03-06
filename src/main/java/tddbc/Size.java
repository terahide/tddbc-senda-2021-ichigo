package tddbc;

public enum Size {
    S,M,L,LL;

    public static Size toSize(int weight) {
        if(25 <= weight){
            return LL;
        }
        if(20 <= weight) return L;
        return M;
    }
}

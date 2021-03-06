package tddbc;

public class Strawberry {
    String kind;
    public Strawberry(){
        super();
    }
    public Strawberry(String kind){
        super();
        this.kind = kind;
    }
    public String getKind(){
        if(kind == null)return "あまおう";
        return "とちおとめ";
    }
}

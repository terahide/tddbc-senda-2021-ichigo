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
    public Strawberry(Kind kind){
        super();
        this.kind = kind.toString();
    }
    public String getKind(){
        if(kind == null)return "あまおう";
        return "とちおとめ";
    }
}

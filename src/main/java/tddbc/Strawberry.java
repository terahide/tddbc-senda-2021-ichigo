package tddbc;

public class Strawberry {
    String kind;
    public Strawberry(){
        super();
        this.kind = "あまおう";
    }
    public Strawberry(String kind){
        super();
        this.kind = kind;
    }
    public Strawberry(Kind kind){
        super();
        this.kind = kind.name();
    }
    public String getKind(){
        return kind;
    }
}

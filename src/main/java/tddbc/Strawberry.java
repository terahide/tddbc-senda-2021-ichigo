package tddbc;

public class Strawberry {
    String kind;
    public Strawberry(Kind kind){
        super();
        this.kind = kind.name();
    }
    public String getKind(){
        return kind;
    }
}

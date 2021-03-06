package tddbc;

public class Strawberry {
    Kind kind;
    public Strawberry(Kind kind){
        super();
        this.kind = kind;
    }
    public Strawberry(Kind kind,Size size){
        super();
        this.kind = kind;
    }
    public Kind getKind(){
        return kind;
    }
    public Size getSize(){
        return Size.S;
    }
}

package tddbc;

public class Strawberry {
    Kind kind;
    Size size;
    public Strawberry(Kind kind){
        super();
        this.kind = kind;
    }
    public Strawberry(Kind kind,Size size){
        super();
        this.kind = kind;
        this.size = size;
    }
    public Kind getKind(){
        return kind;
    }
    public Size getSize(){
        return size;
    }
}

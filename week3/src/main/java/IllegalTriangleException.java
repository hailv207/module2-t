public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("IllegalTriangle!");
    }
    public IllegalTriangleException(String string){
        super(string);
    }
}

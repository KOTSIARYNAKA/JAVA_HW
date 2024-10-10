package HW_12generics;

public class Task1 <T>{
private String s = "";

    public String getS() {
        return s;
    }
    public void addThing(T t){
        if (this.s.equals("")){
            this.s = this.s + t.toString();
        } else {
            this.s = this.s + " " + t.toString();
        }

    }

    @Override
    public String toString() {
        return  s + " " ;
    }
}

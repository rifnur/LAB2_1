public class BegovayaDorogka {
     String name;
     int dlinaBD;

    public BegovayaDorogka(String name, int dlinaBd) {
        this.name = name;
        this.dlinaBD = dlinaBd;
    }

    public BegovayaDorogka(int dlinaBD) {
        this.dlinaBD = dlinaBD;
    }

    public String getName() {
        return name;
    }

    public int getDlinaBD() {
        return dlinaBD;
    }
/*
 public void begi(int put, int moget){
if (put<=moget){
    System.out.println(name+ " пробежал "+this.name);
}
    }*/
}

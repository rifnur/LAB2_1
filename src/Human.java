public class Human implements Run,Jump{
    String name;
    int dlina;
    int visota;
    boolean finish;

    public Human(String name, int dlina, int visota,boolean finish) {
        this.name = name;
        this.dlina = dlina;
        this.visota = visota;
        this.finish= finish;
    }

    @Override
    public void jump() {
        System.out.println(name+" прыгнул "+visota);
       // setFinish(false);
    }
            @Override
        public void run() {
            //if (BegovayaDorogka.)
            System.out.println(name + " пробежал "+dlina);
            // setFinish(false);
        }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
/*@Override
    public String toString() {
        return name ;
    }*/
    /* public void run(){
         System.out.println("Бегает "+toString());
     }
    public void jump(String name){
        System.out.println("Прыгает "+toString());
    }*/
}

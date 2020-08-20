public class Cat implements Run,Jump{
    String name;
    int dlina;
    int visota;
    boolean finish;

    public Cat(String name,int dlina,int visota,boolean finish) {
        this.name = name;
        this.dlina = dlina;
        this.visota = visota;
        this.finish = finish;
    }

    @Override
    public void jump() {
        System.out.println(name+" прыгнула "+visota);
    }
    @Override
    public void run() {
        System.out.println(name + " пробежала "+dlina);
    }
    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}

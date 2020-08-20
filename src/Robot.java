public class Robot implements Run,Jump{
    String name;
    int dlina;
    int visota;
    boolean finish;

    public Robot(String name, int dlina, int visota,boolean finish) {
        this.name = name;
        this.dlina = dlina;
        this.visota = visota;
        this.finish = finish;
    }

    @Override
    public void jump() {
        System.out.println(name+" прыгнул "+visota);
    }
    @Override
    public void run() {
        System.out.println(name + " пробежал "+dlina);
    }
    public void setFinish(boolean finish) {
        this.finish = finish;
    }

}

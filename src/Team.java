public class Team {
    String name;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }

    public void showResult (String name){
        System.out.println("Создаем команду "+toString());
    };
}

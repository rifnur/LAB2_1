

public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[]{
                new Human("Человек 1", 10, 20,true),
                new Human("Человек 2", 15, 30,true),
        };
        for (int i = 0; i < humans.length; i++){
            BegovayaDorogka[]  BegovayaDorogkas = new BegovayaDorogka[]{
                    new BegovayaDorogka("Дорожка 1",12),
                    new BegovayaDorogka("Дорожка 2",40),
            };
            Stena[]  Stenas = new Stena[]{
                    new Stena("Стена 1",20),
                    new Stena("Стена 2",10),
            };
            for (int j=0;j< BegovayaDorogkas.length && humans[i].finish;j++){
                if ( BegovayaDorogkas[j].dlinaBD<=humans[i].dlina && humans[i].finish==true) {
                    System.out.print(BegovayaDorogkas[j].name+" длинной "+BegovayaDorogkas[j].dlinaBD+": ");
                    humans[i].run();
                    if ( humans[i].finish==true) {
                        for (int k = 0; k < Stenas.length; k++) {
                            if (Stenas[k].visotaS<=humans[i].visota   && humans[i].finish == true) {
                                System.out.print(Stenas[k].name+" высотой "+Stenas[k].visotaS+": ");
                                humans[i].jump();
                            }else {
                                System.out.print(Stenas[k].name+" высотой "+Stenas[k].visotaS+": ");
                                System.out.print(Stenas[k].name+" "+humans[i].name+" не удалось запрыгнуть "+Stenas[k].visotaS);
                                humans[i].setFinish(false);
                                                }
                        }
                    }
                } else {
                    System.out.print(BegovayaDorogkas[j].name+" длинной "+BegovayaDorogkas[j].dlinaBD+": ");
                    System.out.println(BegovayaDorogkas[j].name+" "+humans[i].name+" не удалось пробежать "+BegovayaDorogkas[j].dlinaBD);
                    humans[i].setFinish(false);
                                    }
            }
        }

        System.out.println("Запускаем кота");

        Cat[] cats = new Cat[]{
                new Cat("Кошка 1", 15, 20,true),
                new Cat("Кошка 2", 35, 18,true),
        };
        for (int i = 0; i < cats.length; i++){
            BegovayaDorogka[]  BegovayaDorogkas = new BegovayaDorogka[]{
                    new BegovayaDorogka("Дорожка 1",12),
                    new BegovayaDorogka("Дорожка 2",40),
            };
            Stena[]  Stenas = new Stena[]{
                    new Stena("Стена 1",20),
                    new Stena("Стена 2",10),
            };
            for (int j=0;j< BegovayaDorogkas.length && cats[i].finish;j++){
                if ( BegovayaDorogkas[j].dlinaBD<=cats[i].dlina && cats[i].finish==true) {
                    System.out.print(BegovayaDorogkas[j].name+" длинной "+BegovayaDorogkas[j].dlinaBD+": ");
                    cats[i].run();
                    if ( cats[i].finish==true) {
                        for (int k = 0; k < Stenas.length; k++) {
                            if (Stenas[k].visotaS<=cats[i].visota   && cats[i].finish == true) {
                                System.out.print(Stenas[k].name+" высотой "+Stenas[k].visotaS+": ");
                                cats[i].jump();
                            }else {
                                System.out.print(Stenas[k].name+" высотой "+Stenas[k].visotaS+": ");
                                System.out.print(Stenas[k].name+" "+cats[i].name+" не удалось запрыгнуть "+Stenas[k].visotaS);
                                cats[i].setFinish(false);
                                                }
                        }
                    }
                } else {
                    System.out.print(BegovayaDorogkas[j].name+" длинной "+BegovayaDorogkas[j].dlinaBD+": ");
                    System.out.println(BegovayaDorogkas[j].name+" "+cats[i].name+" не удалось пробежать "+BegovayaDorogkas[j].dlinaBD);
                    cats[j].setFinish(false);
                                   }
            }
        }
        System.out.println("Запускаем робота");

        Robot[] robots = new Robot[]{
                new Robot("Робот 1", 12, 28,true),
                new Robot("Робот 2", 5, 10,true),
        };
        for (int i = 0; i < robots.length; i++){
            BegovayaDorogka[]  BegovayaDorogkas = new BegovayaDorogka[]{
                    new BegovayaDorogka("Дорожка 1",12),
                    new BegovayaDorogka("Дорожка 2",40),
            };
            Stena[]  Stenas = new Stena[]{
                    new Stena("Стена 1",20),
                    new Stena("Стена 2",10),
            };
            for (int j=0;j< BegovayaDorogkas.length && robots[i].finish;j++){
                if ( BegovayaDorogkas[j].dlinaBD<=robots[i].dlina && robots[i].finish==true) {
                    System.out.print(BegovayaDorogkas[j].name+" длинной "+BegovayaDorogkas[j].dlinaBD+": ");
                    robots[i].run();
                    if ( robots[i].finish==true) {
                        for (int k = 0; k < Stenas.length; k++) {
                            if (Stenas[k].visotaS<=robots[i].visota   && robots[i].finish == true) {
                                System.out.print(Stenas[k].name+" высотой "+Stenas[k].visotaS+": ");
                                robots[i].jump();
                            }else {
                                System.out.print(Stenas[k].name+" высотой "+Stenas[k].visotaS+": ");
                                System.out.print(Stenas[k].name+" "+robots[i].name+" не удалось запрыгнуть "+Stenas[k].visotaS);
                                robots[i].setFinish(false);
                            }
                        }
                    }
                } else {
                    System.out.print(BegovayaDorogkas[j].name+" длинной "+BegovayaDorogkas[j].dlinaBD+": ");
                    System.out.println(BegovayaDorogkas[j].name+" "+robots[i].name+" не удалось пробежать "+BegovayaDorogkas[j].dlinaBD);
                    robots[j].setFinish(false);
                }
            }
        }


       /* for (int k=0;k< Stenas.length;k++)*/
          /* {
            Human[] humans = new Human[]{
                    new Human("Человек 1", 10, 20),
                    new Human("Человек 2", 15, 30),
            };
            for (int i = 0; i < humans.length; i++) {

            }*/
           /*Cat[] cats = new Cat[]{
                    new Cat("Кошка 1", 15, 20),
                    new Cat("Кошка 2", 35, 18),
            };
            for (int i = 0; i < cats.length; i++) {
                cats[i].run();
                cats[i].jump();
            }
            Robot[] robots = new Robot[]{
                    new Robot("Робот 1", 12, 28),
                    new Robot("Робот 2", 5, 10),
            };
            for (int i = 0; i < robots.length; i++) {
                robots[i].run();
                robots[i].jump();
            }
        }*/


    }
}

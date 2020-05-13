import java.io.Console;

class Arena {

    public static void main(String[] args) {
        
        // TODO : create two monsters
        AirMonster M1 = new AirMonster(RndName(6), (int)(Math.random() * 10));
        AirMonster M2 = new AirMonster(RndName(6), (int)(Math.random() * 10));        
        
        // TODO : monsters attack each other
        System.out.flush();
        System.out.println(M1.getName() + " (life:" + M1.getLife() +", damage:" +M1.getAttack()+")");
        System.out.println("   CONTRE");
        System.out.println(M2.getName() + " (life:" + M2.getLife() +", damage:" +M2.getAttack()+")");
        System.out.println("");

        //pause 3 secondes le temps de prendre les paris
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){}
        
        //Décompte de 5 demi secondes...
        for(int i = 5; i>0 ; i--) {
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}

        }
        System.out.println("");
        System.out.println("F I G H T ! !");
        System.out.println("");


        //pause de 1/2 seconde
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){}


        //le combat commence
        //while (M1.getLife() > 0 && M2.getLife() > 0 ) {
        //    M1.attack(M2);
        //    M2.attack(M1);

        while ( !M1.attack(M2) && !M2.attack(M1)) {
    
                //pause de 1/4 de seconde
            try{
                Thread.sleep(250);
            }catch(InterruptedException e){}

        }

        System.out.println("");
        if ( M1.getLife() > M2.getLife()) {
            System.out.println(M1.getName().toUpperCase() + " a gagné !! ");
        }else if (M1.getLife() < M2.getLife() ) {
            System.out.println(M2.getName().toUpperCase() + " a gagné !! ");
        }else {
            System.out.println(M1.getName() + " I T ' S   A   D R A W ! !" );
        }

        System.out.println("");

    }

    public static String RndName(int lng) {
        String retName = "";
        String voyelles = "aeiouy"; // 6
        String consonnes = "bcdfgklmnprstvxz"; // 16 sans h j q et w
        for (int i = 0 ; i < Math.max(4, lng) ; i++) {
            retName += ( (i % 2 == 1) ? voyelles.charAt((int) (Math.random() * 5 )) : consonnes.charAt( (int) (Math.random() * 15) ));
        }
        return retName;
    }
}
            
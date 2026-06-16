package live;

import music.Playable;

class Veena implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}

public class Test {

    public static void main(String[] args) {

        // a. Create Veena object
        Veena veena = new Veena();
        veena.play();

        // b. Create Saxophone object
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Interface reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}

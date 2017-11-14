package com.example.sharing;

class Toy {
    String name;
    Toddler owner;
    int damage = 0;

    Toy(String name) { this.name = name; }

    void transferTo(Toddler toddler) {
        if (owner.mood != Mood.Insane || toddler.mood == Mood.Insane) {
            owner.lose(this);
            toddler.receive(this);
        }
    }

    void play() { damage++; }

    void destroy() { damage = damage + 10; }
}

class Parent {
    Toy toy;
    Turn turn;

    Parent(Toy toy, Turn turn){ this.toy = toy; this.turn = turn;}

    void beFair(){ toy.transferTo(turn.current); }
}

class Turn {
    Toddler current;

    void take(Toddler toddler){ current = toddler; }
}

enum Mood {Happy, Sad, Insane}

class Toddler {
    String name;
    Mood mood = Mood.Insane;
    Toddler(String name) { this.name = name; }

    void iHateSharing(Turn turn){ turn.take(this); }

    void moodSwing(Mood mood) { this.mood = mood; }

    void lose(Toy toy){
        toy.owner = null;
        if (mood == Mood.Happy) {
            mood = Mood.Sad;
        } else {
            mood = Mood.Insane;
        }
    }

    void receive(Toy toy){
        toy.owner = this;
        if(Mood.Happy.equals(mood)){
            System.out.println("playing");
            toy.play();
        } else if (Mood.Insane.equals(mood)){
            toy.destroy();
            mood = Mood.Sad;
        } else {
            toy.play();
            mood = Mood.Happy;
        }
    }
}

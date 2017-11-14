package com.example.sharing;

class ZoneDefense {
    private final Parent parent;
    private final Toddler toddler;

    public ZoneDefense(Parent parent, Toddler toddler) {
        this.parent = parent;
        this.toddler = toddler;
    }

    public void play() {
        parent.beFair();
        toddler.iHateSharing(parent.turn);
    }

    public void meltdown() {
        toddler.moodSwing(Mood.Insane);
        toddler.iHateSharing(parent.turn);
    }

    public void recover() {
        toddler.moodSwing(Mood.Happy);
        parent.beFair();
    }
}

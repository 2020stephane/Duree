import java.util.Formatter;

public class duree {
    private int heure;
    private int minute;
    private int seconde;

    duree() {
        this.heure = 0;
        this.minute = 0;
        this.seconde = 0;
    }

    duree(int heure, int minute, int seconde) {
        if (heure < 24 & minute < 60 & seconde < 60) {
            this.heure = heure;
            this.minute = minute;
            this.seconde = seconde;
        } else {
            System.out.println("le temps indique n'est pas valide");
        }

    }

    public void afficheDuree() {
        Formatter nf = new Formatter();
        nf.format("%02dh%02dm%02ds", this.heure, this.minute, this.seconde);
        System.out.println(nf);
    }

    public void setDuree(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }

    public boolean equals(duree h2) {
        return this.convertseconde() == h2.convertseconde();
    }

    public int convertseconde() {
        return this.heure * 3600 + this.minute * 60 + this.seconde;
    }

    public void ajoutSecALaDuree(int seconde) {
        int[] HMS = this.convertHMS(seconde + this.convertseconde());
        this.setDuree(HMS[0], HMS[1], HMS[2]);
    }

    public void ajoutMinALaDuree(int m, int s) {
        s += m * 60;
        int[] HMS = this.convertHMS(s + this.convertseconde());
        this.setDuree(HMS[0], HMS[1], HMS[2]);
    }

    public void somme2Duree(int h, int m, int s) {
        int temp = h * 3600 + m * 60 + s;
        int[] HMS = this.convertHMS(this.convertseconde() + temp);
        this.setDuree(HMS[0], HMS[1], HMS[2]);
    }

    public boolean compare2Duree(duree h2) {
        return this.convertseconde() < h2.convertseconde();
    }

    private int[] convertHMS(int s) {
        int[] HMS = new int[3];
        if (s > 3600 && s < 62400) {
            HMS[0] = s / 3600;
            s %= 3600;
            HMS[1] = s / 60;
            HMS[2] = s % 60;
        } else if (s > 60) {
            HMS[1] = s / 60;
            HMS[2] = s % 60;
        }

        if (s < 60) {
            HMS[2] = s;
        }

        return HMS;
    }
}

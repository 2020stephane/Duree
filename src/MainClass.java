public class MainClass {

    public static void main(String[] args) {

        Duree marc = new Duree();
        Duree valentino = new Duree();
        System.out.println(" temps pour marc");
        marc.afficheDuree();
        System.out.println(" temps pour valentino");
        valentino.afficheDuree();
        System.out.println(" ajout grand prix du japon");
        marc.setDuree(2,23,10);
        valentino.setDuree(2,32,15);
        System.out.println(" temps pour marc");
        marc.afficheDuree();
        System.out.println(" temps pour valentino");
        valentino.afficheDuree();
        System.out.println(" ajout grand prix d'italie");
        marc.somme2Duree(1, 45,0);
        valentino.somme2Duree(1,21,3);
        System.out.println(" temps pour marc");
        marc.afficheDuree();
        System.out.println(" temps pour valentino");
        valentino.afficheDuree();
        System.out.println(" prise en compte des penalites");
        marc.ajoutSecALaDuree(50);
        valentino.ajoutMinALaDuree(15,20);
        System.out.println(" temps pour marc");
        marc.afficheDuree();
        System.out.println(" temps pour valentino");
        valentino.afficheDuree();
        if (marc.equals(valentino)) {
            System.out.println(" ex-aequo");
        } else if (marc.compare2Duree(valentino)) {
                  System.out.println(" marc vainqueur");
               } System.out.println(" valentino vainqueur");
    }
}

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba stron: " + this.liczbaStron);
        System.out.println("Dostępna: " + this.dostepna);
        System.out.println("Czy chcesz wypożyczyć? Napisz 'TAK' lub 'NIE'");

    }

    public void wypozycz() {
        if(this.dostepna) {
            this.dostepna = false;
            System.out.println("Ksiazka wypozyczona");
        }
        else {
            System.out.println("Ksiazka niedostepna");
        }
    }

    public void zwroc() {
        if(!this.dostepna) {
            this.dostepna = true;
            System.out.println("Ksiazka zwrocona");
        }
        else {
            System.out.println("Ksiazka nie byla wypozyczona");
        }
    }
}





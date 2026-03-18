public class Main {
    public static void main (String [] args) {
        Ksiazka HarryPotter = new Ksiazka("Harry Potter", "J.K Rowling", 300, true);

        HarryPotter.wypiszInfo();
        HarryPotter.wypozycz();
        HarryPotter.zwroc();

        Ksiazka DiabelUbieraSieUPrady = new Ksiazka("Diabeł ubiera się u Prady", "Lauren Weisberger", 280, true);
        DiabelUbieraSieUPrady.wypiszInfo();
        DiabelUbieraSieUPrady.wypozycz();
        DiabelUbieraSieUPrady.zwroc();

        Ksiazka ROK84 = new Ksiazka("1984", "George Orwell", 305, false);
        ROK84.wypiszInfo();
        ROK84.wypozycz();
        ROK84.zwroc();
    }
}


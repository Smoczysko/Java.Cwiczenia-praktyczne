/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.20: Petla do...while z falszywym warunkiem
*  Zmodyfikuj kod z cwiczenia 2.30 w taki sposob, aby wyrazenie warunkowe na pewno bylo falszywe.
*  Zaobserwuj wyniki dzialania programu.
*/

public class Main {
  public static void main (String[] args) {
    int i = 10;
    do {
      System.out.println("Java");
    } while (i++ <= 9);
  }
}

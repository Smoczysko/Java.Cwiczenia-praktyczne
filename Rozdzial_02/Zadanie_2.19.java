/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.19: Efekt pominiecia instrukcji break
*  Zmodyfikuj kod z cwiczenia 2.18, usuwajac instrukcje break. Zaobserwuj, jak zmienilo sie dzialanie programu.
*/

public class Main {
  public static void main (String[] args) {
    int a = 10;
    switch (a) {
      case 1:
        System.out.println("a = 1");
      case 10:
        System.out.println("a = 10");
      default:
        System.out.println("a nie jest równe ani 1, ani 10");
    }
  }
}

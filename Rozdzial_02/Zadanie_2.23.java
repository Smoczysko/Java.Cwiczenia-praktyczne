/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.23: Wyrazenie poczatkowe przed petla
*  Zmodyfikuj petle typu for w taki sposob, aby wyrazenie poczatkowe znalazlo sie przed petla, a wyrazenie modyfikujace wewnatrz niej.
*/

public class Main {
  public static void main (String[] args) {
    int i = 1;
    for (; i <= 10; ) {
      System.out.println("Java");
      i++;
    }
  }
}

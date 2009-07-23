/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.26: Liczby niepodzielne przez dwa
*  Zmodyfikuj kod z cwiczenia 2.25 tak, aby nie bylo koniecznosci uzycia instrukcji continue.
*/

public class Main {
  public static void main (String[] args) {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}

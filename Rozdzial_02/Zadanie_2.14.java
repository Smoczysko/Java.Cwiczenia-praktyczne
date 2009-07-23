/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.14: Wykorzystanie operatora warunkowego
*  Wykorzystaj operator warunkowy do zmodyfikowania wartosci dowolnej zmiennej typu calkowitego (int).
*/

public class Main {
  public static void main (String[] args) {
    int x = 1, y;
    y = (x == 1 ? 10 : 20);
    System.out.println("y = " + y);
  }
}

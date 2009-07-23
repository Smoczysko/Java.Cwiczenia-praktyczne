/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.29: Liczby nieparzyste i petla while
*  Korzystajac z petli while, napisz program wyswietlajacy na ekranie liczby od 1 do 20 niepodzielne przez 2.
*/

public class Main {
  public static void main (String[] args) {
    int i = 1;
    while (i <= 20) {
      if (i % 2 != 0){
        System.out.println(i);
      }
      i++;
    }
  }
}

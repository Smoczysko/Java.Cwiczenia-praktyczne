/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.32: Wykorzystanie rozszerzonej petli for
*  Zadeklaruj tablice liczb typu int i wypelnij ja przykladowymi danymi.
*  Nastepnie uzyj rozszerzonej petli for do wyswietlenia zawartosci tablicy na ekranie.
*/

public class Main {
  public static void main (String[] args) {
    int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int val : tab) {
      System.out.println(val);
    }
  }
}

/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.05: Deklaracja i utworzenie tablicy
*  Zadeklaruj i uwtorz tablice elementow typu calkowitego. Przypisz zerowemu elementowi tablicy dowolna wartosc.
*  Sprobuj wyswietlic zawartosc tego elementu na ekranie.
*/

public class Main {
  public static void main (String[] args) {
    int tablica[] = new int[10];
    tablica[0] = 11;
    System.out.println("Zerowy element tablicy to: " + tablica[0]);
  }
}

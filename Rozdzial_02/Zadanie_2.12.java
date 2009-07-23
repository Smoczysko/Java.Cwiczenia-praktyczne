/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.12: Przekroczenie zakresu w trakcie kompilacji
*  Zadeklaruj zmienna typu byte. Przypisz jej wartosc 128. Sprobuj dokonac kompilacji otrzymanego kodu.
*/

public class Main {
  public static void main (String[] args) {
    byte zmienna;
    zmienna = 128;
    System.out.println(zmienna);
  }
}

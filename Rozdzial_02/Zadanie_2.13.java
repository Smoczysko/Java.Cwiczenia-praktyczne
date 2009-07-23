/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.13: Przekroczenie zakresu w trakcie dzialania kodu
*  Zadeklaruj zmienne typu long. Wykonaj operacje arytmetyczne przekraczajace dopuszczalna wartosc takiej zmiennej.
*  Wynik wyswietl na ekranie.
*/

public class Main {
  public static void main (String[] args) {
    long a, b = (long) Math.pow(2, 63) + 1;
    a = b + b;
    System.out.println("a = " + a);
  }
}

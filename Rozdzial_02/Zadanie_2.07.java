/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.07: Operacje arytmetyczne na zmiennych
*  Zadeklaruj dwie zmienne typu calkowitego. Wykonaj na nich kilka operacji arytmetycznych. Wynik wyswietl na ekranie.
*/

public class Main {
  public static void main (String[] args) {
    int a, b, c;
    a = 10;
    b = 25;
    c = b - a;
    System.out.println("b = " + b);
    System.out.println("b - a = " + c);
    c = a * b;
    System.out.println("a * b = " + c);
  }
}

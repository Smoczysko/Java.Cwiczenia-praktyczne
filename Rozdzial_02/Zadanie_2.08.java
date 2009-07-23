/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.08: Dzielenie modulo
*  Zadeklaruj kilka zmiennych. Wykonaj na nich operacje dzielenia modulo. Wynik wyswietl na ekranie.
*/

public class Main {
  public static void main (String[] args) {
    int a, b, c;
    a = 10;
    b = 25;
    c = b % a;
    System.out.println("b % a = " + c);
    System.out.println("a % 3 = " + a % 3);
    c = a * b;
    System.out.println("(a * b) % 120 = " + c % 120);
  }
}

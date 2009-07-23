/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.10: Operator dekrementacji
*  Zamien kod z cwiczenia 2.09 tak, aby operator ++ zostal zastapiony operatorem --.
*  Nastepnie przeanalizuj jego dzialanie i sprawdz, czy otrzymany wynik jest taki sam, jak otrzymany na ekranie po uruchomieniu kodu.
*/

public class Main {
  public static void main (String[] args) {
    int x = 1, y;
    System.out.println(--x);
    System.out.println(x--);
    System.out.println(x);
    y = x--;
    System.out.println(y);
    y = --x;
    System.out.println(--y);
  }
}

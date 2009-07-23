/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.09: Operator inkrementacji
*  Przeanalizuj ponizszy kod. Nie uruchamiaj programu, ale zastanow sie, jaki bedzie wyswietlony ciag liczb.
*  Nastepnie, po uruchomieniu kodu, sprawdz swoje przypuszczenia.
*/

public class Main {
  public static void main (String[] args) {
    int x = 1, y;
    System.out.println(++x);
    System.out.println(x++);
    System.out.println(x);
    y = x++;
    System.out.println(y);
    y = ++x;
    System.out.println(++y);
  }
}

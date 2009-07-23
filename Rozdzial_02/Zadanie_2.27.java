/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.27: Budowa petli while
*  Uzywajac petli typu while, napisz program wyswietlajacy na ekranie 10 razy napis Java.
*/

public class Main {
  public static void main (String[] args) {
    int i = 1;
    while (i <= 10) {
      System.out.println("Java");
      i++;
    }
  }
}

/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga Lukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.20: Budowa petli for
*  Wykorzystujac petle typu for, napisz program wyswietlajacy na ekranie 10 razy napis Java.
*/

public class Main {
  public static void main (String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Java");
    }
  }
}

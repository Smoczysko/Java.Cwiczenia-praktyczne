/* Niniejszy kod pochodzi z ksiazki "Java. Cwiczenia praktyczne" Wydanie II autora Marcina Lisa
*  Jest on dolaczony do ww. ksiazki w postaci elektronicznej pod adresem ftp://ftp.helion.pl/przyklady/cwjav2.zip
*  Komentarze jak i kod programu sa przedmiotem artykulow na lamach bloga £ukasza Rybki - Akademia Javy
*  Blog jest dostepny pod adresem: http://akademiajavy.blogspot.com
*/

/* Zadanie 2.06: Odwolanie do nieistniejacego indeksu
*  Zadeklaruj i zainicjalizuj tablice dziesiecioelementowa. Sprobuj przypisac elementowi o indeksie 10 dowolna liczbe calkowita.
*/

public class Main {
  public static void main (String[] args) {
    int tablica[] = new int[10];
    tablica[0] = 11;
    System.out.println("Dziesi¹ty element tablicy to: " + tablica[10]);
  }
}

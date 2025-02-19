Kreirajte apstraktnu klasu "Vozilo" sa sljedećim svojstvima:
Varijable:
marka (String)
brzina (double)
Konstruktor za inicijalizaciju ovih varijabli.
Getter metode za marka i brzinu.
Apstraktna metoda kretanje(), koja će biti implementirana u podklasama.

Kreirajte dvije podklase:

Automobil:
Dodatna varijabla: brojVrata (int).
Konstruktor za inicijalizaciju svih polja.
Implementacija metode kretanje(), koja ispisuje:
"Automobil [marka], sa [brojVrata] vrata se kreće brzinom [brzina] km/h."

Bicikl:
Dodatna varijabla: vrsta (String, npr. "Planinski", "Cestovni").
Konstruktor za inicijalizaciju svih polja.
Implementacija metode kretanje(), koja ispisuje:
"Bicikl [marka] [vrsta] se kreće brzinom [brzina] km/h."

U glavnoj metodi (main) napravite ArrayList objekata klase Vozilo i:

Dodajte barem jedan Auto i jedan Bicikl.
Iterirajte kroz listu i pozovite kretanje() za svako vozilo.

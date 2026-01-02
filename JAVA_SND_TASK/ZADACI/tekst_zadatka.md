# DRUGI ZADATAK
---

<div style="text-align:justify">

Kako možete vidjeti ovdje se radi "samo" o jenom zadatku u kojem trebate napraviti traženi GUI i implementirati `Command Pattern`. 


## ZADATAK 2-1 ![simple](https://img.shields.io/badge/complexity-**-green):

Potrebno je da napravite GUI prema slici 1 koji predstavlja aplikaciju za pregled `csv` datoteka. Zbog jednostavnosti ćemo smatrati kako svaka `csv` datoteka ima zaglavlje (eng. header) s nazivima stupaca. Potrebno je da zadovoljite sljedeće specifikacije:
  
  - `Menu bar` treba imati dva menija &rarr; `File` i `Edit` 
    - `File` ima `Open`, `Save` i `Exit`
    - `Edit` ima `Undo`, `Redo`, `Delete row`, `Delete column` i `Clear table`
    - Implementirajte i pripadne tipkovničke kratice &rarr; sami izabirete kratice (npr. Undo može biti `CTRL + Z`, a brisanje retka `CTRL + R`)
  - `Tool Bar` treba imati naredbe za `Open`, `Save`, `Delete row`, `Delete column`, `Clear table`, `Undo` i `Redo`
  - Početne dimenzije osnovne (prazne) tablice proizvoljno definirajte
  - Osigurajte prikaz podataka u tablici iz bilo koje `csv` datoteke koja ima zaglavlje (header)
  - Omogućite spremanje podataka iz tablice u proizvoljnu `csv` datoteku
  - Dijalog za otvaranje i spremanje datoteka treba izvorno pokazivati na mapu `data` koju imate kao dio polaznog repozitorija
  - Sve naredbe realizirajte korištenjem predloška `Command`
  - Osigurajte ispis stanja stogova `UndoStack` i `RedoStack` u konzolu
  
 Vodite računa kako undo i redo imaju svoju logiku kod svake naredbe &rarr; primjerice ukoliko izaberete brisanje selektiranog retka pripadni undo podrazumijeva njegov "povratak"u tablicu na istu poziciju. Isto tako, kada napravite undo nakon `Clear table` cijeli prethodni sadržaj kojeg ste "očistili" treba biti vraćen u tablicu. 
  
> **VAŽNO**: slike za `Tool bar` ikone obavezno preuzimajte pod licencom `Creative Commons` ili pod bilo kojom licencom koja **omogućuje besplatno korištenje ikona**


![gui_izgled](./IMGS/GUI.jpg)

**Slika 1** Izgled GUI-a 
  
![FileMenu](./IMGS/FileMenu.jpg)

**Slika 2** Izgled File menija
  
![DelRow](./IMGS/DeleteRow.jpg)

**Slika 3** Delete Row iz Edit menija 
  
![popUpMenu](./IMGS/PopUpMenu.jpg)
  
**Slika 4** Kontekstualni, skočni izbornik (eng. Pop-Up Menu)
  
  
![ClearALL](./IMGS/ClearALL_ToolBar.jpg)
  
**Slika 5** Pridružen tzv. Tool-Tip text uz svaku ikonu na alatnoj traci &rarr; Clear za primjer
  

> **NAPOMENA** Radni tok **commita** treba slijediti uputu iz polazne **Readme** datoteke ovog repozitorija
 

# AziendeUniversita
Effettuare il parsing del seguente file CSV dove sono salvate alcune Aziende/Università, la tipologia, la relativa città e numero di impiegati.
```
%%%%%%% FILE CSV %%%%%%
Crunchify,Web Development,NYC,5 Employees
Google,Search Company,Mountain View,53600 Employees
Yahoo,News Company,Sunnyvale,12500 Employees
Microsoft,Windows Company,Washington,128000 Employees
Polytechnic University of Marche, University, via brecce Bianche, 1321 Employees
%%%%%%%%%%%%%%%%%%%%%%
```
## Obiettivi:
- Implementare un metodo per suddividere ogni riga nei vari token racchiusi dalle virgole.
- Salvare i token in una struttura dati adeguata, ad esempio Vector<String>
- Stampare a video questa struttura dati.
Indizio: potete utilizzare due metodi diversi per trovare i token in una stringa.
1. La funzione useDelimiter() della classe Scanner;
2. La funzione split() degli oggetti String

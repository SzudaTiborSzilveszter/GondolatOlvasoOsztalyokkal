# Java gondolatolvasó program OOP szemlélettel

## Feladatmegosztás
- Lap, Program: Tibi
- Pakli: Fru

## Osztálytervek
```
classDiagram
    Pakli "1" o-- "21" Lap : tartalmaz (agregáció)
    Program ..> Pakli : használ
    Program ..> Lap : használ

    class Lap {
        - String szin
        - String ertek
        + Lap(String szin, String ertek)
        + getSzin() String
        + getErtek() String
        + megj() String
    }

    class Pakli {
        - Lap[] lapok
        + Pakli()
        + Pakli(int db)
        + getLapok() Lap[]
        + kever() void
        + feltolt() void
        + ezVolt() Lap
    }

    class Program {
        - kirak() void
        - melyik() int
        - trukk() void
        + main(String[] args)$ void
    }

```
`# kirak(): void` – Kiosztja/megjeleníti a kártyákat 3 oszlopban
`# melyik(): int` – Bekéri a felhasználótól, melyik oszlopban van a kártyája
`# trukk(): void` – A trükk menete (3 ciklus / bepakolás)
`+ main(args: String[]): void` – Program belépési pontja

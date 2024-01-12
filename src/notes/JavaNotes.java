/*

Public/Private visibility:
ugyanazon osztályon belül a private method látható az osztály többi metódusa számára is,ergo, osztályon kívülröl
egy private metódust, az osztályban mellette leő public metódusra való hivatkozással tudokelérni, ha a public metódussal
meghívjuk a mellette levő private metódust is.
Ugyanazon package-en belül nem működik, csak a ugyanazon osztályban levő private metódus látható a többi mellette levő
metódus számára.

Protected visibility:
protected metódusok ugyanazon packagebe tartozó osztályok számára láthatóak, osztályon kívülről nem lehet meghívni,
kivéve ha az "extends" funkciót használjuk

Package protected:
package-en kívülről nem érhető el még az extends funkcióval sem

.super:
Metódus hívás előtt a super. -ot használva és az extends funkciót, az adott class számára elérhetővé válik más
package-hez tartozó class tartalma

field:
A fentebb kifejtett visibility ugyanúgy érvényes a class-on belüli fieldekre, változókra is - de nagyon nem jó ötlet
ezeket a mezőke, változókat publikussá tenni a többi class számára

Constructor:
ez mondja meg a Java-nak, hogyan építsen objektumot a Class-ban levő tervrajz alapján.
Defaultan a java a háttérben létrehoz egy alap, üres konctruktort. Azonban ha a mi létrehzunk egy argumentumokkal
ellátott konstruktort, akkor a default noarg konstruktor elvész, ezért érdemes egy ilyen "üres" konstruktort is írni -
azonban érdemes ezt private-ra állítani, hogy ne lehessen a class-on kívülről piszkálni

Getters, Setters:
Adott osztályo belül levő metódusok amelyek az adott osztály fieldjeinek védelmére szolgálnak, biztosítva
azok get és set funkcióinak külső elérését

 */
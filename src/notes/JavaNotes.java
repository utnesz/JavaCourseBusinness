/*

Public/Private visibility:
ugyanazon osztályon belül a private method látható az osztály többi metódusa számára is,ergo, osztályon kívülröl
egy private metódust, az osztályban mellette leő public metódusra való hivatkozással tudokelérni, ha a public metódussal
meghívjuk a mellette levő private metódust is.
Ugyanazon package-en belül nem működik, csak a ugyanazon osztályban levő private metódus látható a többi mellette levő
metódus számára.

Protected visibility:
protected metódusok ugyanazon packagebe tartozó osztályok számára láthatóak, osztályon kívülről nem lehet meghívni, kivéve ha az "extends" funkciót használjuk

Package protected:
package-en kívülről nem érhető el még az extends funkcióval sem

.super:
Metódus hívás előtt a super. -ot használva és az extends funkciót, az adott class számára elérhetővé válik más package-hez tartozó class
tartalma

 */
# TemplatePattern_Championship
Template behavioral design pattern
Template Pattern este o technică, un model de proiectare comportamentală care se prezintă sub forma unui schelet de funcții unui algoritm în superclasa, dar permite subclaselor să suprascrie pașii specifici ai algoritmului fără a-i modifica structura, ei sunt responsabile de implementarea particularităților specifice acestei metode, iar clasa părinte menține cadrul de bază al algoritmului. Este similar cu Factory Method, care este unul tipul lui.

Template Pattern este utilizată în frameworks. Fiecare frameworks execută componentele imuabile ale arhitecturii unui domeniu, precum și creează spații pentru orice alegere esențială sau relevantă de modificare a utilizatorului.

Unul dintre avantajele sale este că poate permite ca doar o parte a algoritmului să fie suprascrisă, nu complet, ceea ce are un impact mai mic asupra modificărilor efectuate în alte părți ale algoritmului și, astfel, permite subclaselor să se comporte diferit. De asemenea, se evită duplicarea, deoarece o structură generală este definită în clasa abstractă și specificată în subclase.

Evitând duplicarea și utilizarea aceluiași cod de mai multe ori, codul va deveni, de asemenea, mai ușor de înțeles, mai ușor de citit și mai ușor de implementat.

Dintre desavantajele menținem că orice fel de modificări la nivel inferior sau superior ar putea intra în conflict cu implementarea. Un alt problem poate fii că unii clienți pot fi limitați de scheletul furnizat al unui algoritm. Dar și metodele template tind să fie mai greu de întreținut cu cât au mai multe etape, dar aceste dezavantaje sunt neglijabile în comparație cu avantajele.

Resursele folosite:
https://www.geeksforgeeks.org/template-method-design-pattern/

https://sourcemaking.com/design_patterns/template_method

https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java

https://www.scaler.com/topics/design-patterns/template-method-design-pattern/

https://www.javatpoint.com/template-pattern

https://refactoring.guru/design-patterns/template-method

https://www.tutorialspoint.com/design_pattern/template_pattern.htm

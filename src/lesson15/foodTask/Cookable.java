package lesson15.foodTask;
/*
*Создать интерфейс Cookable, содержащий метод void cook().
* Создать класс Food, содержащий метод public void prepare(Cookable c) { c.cook(); }
* Создать экземпляр класса Food и вызвать его метод prepare().
* На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable.
*/

public interface Cookable {
    void cook ();

}

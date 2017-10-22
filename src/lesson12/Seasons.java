package lesson12;

/**
 * Создать перечисление, содержащее названия времен  года.
 */
public enum Seasons {
    WINTER(-15.3), SPRING(+14.3), SUMMER(+26.2) {//Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.

        public String getDescription() {
            return "Теплое время года";
        }
    },

    AUTUMN(+12.3);

    private double tempAverage;

    public double getTempAverage() {
        return tempAverage;
    }

    Seasons(double tempAverage) {
        this.tempAverage = tempAverage;
    }

    public String getDescription() { //Создать метод getDescription, возвращающий значение  “Холодное время года”.
        return "Холодное время года";
    }
}



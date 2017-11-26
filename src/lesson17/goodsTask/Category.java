package lesson17.goodsTask;

import java.util.Set;

public class Category {
    private String name;
    private Set<Tovar> tovari;
    public Category(String name, Set<Tovar> tovari) {
        this.name = name;
        this.tovari = tovari;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tovar> getTovari() {
        return tovari;
    }

    public void setTovari(Set<Tovar> tovari) {
        this.tovari = tovari;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return tovari != null ? tovari.equals(category.tovari) : category.tovari == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tovari != null ? tovari.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", tovari=" + tovari +
                '}';
    }
}

package finalControlWork.utils;

import java.util.List;

public class Pizza {
    private String name;
    private List<String> preparationStages;

    public Pizza(String name, List<String> preparationStages) {
        this.name = name;
        this.preparationStages = preparationStages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPreparationStages() {
        return preparationStages;
    }

    public void setPreparationStages(List<String> preparationStages) {
        this.preparationStages = preparationStages;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", preparationStages=" + preparationStages +
                '}';
    }
}

package T06ObjectsAndClasses.Exercise.P07.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.capacity > this.data.size()) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        return this.data.removeIf((pet) -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return this.data.stream()
                .filter((p) -> p.getName().equals(name) && p.getOwner().equals(owner))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        result.append(" The grooming salon has the following clients:\n");
        for (int i = 0; i < this.data.size(); i++) {
            String currentName = this.data.get(i).getName();
            String currentOwner = this.data.get(i).getOwner();
            if (i == this.data.size() - 1) {
                result.append(currentName).append(" ")
                        .append(currentOwner);
            } else {
                result.append(currentName).append(" ")
                        .append(currentOwner).append("\n");
            }
        }
        return result.toString();
    }


}

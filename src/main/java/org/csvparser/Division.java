package org.csvparser;

/**
 * Represents a division entity with an ID and a name.
 */

public class Division {
    private int id;
    private String name;

    /**
     * Constructs a new Division with the specified ID and name.
     * @param id The ID of the division.
     * @param name The name of the division.
     */
    Division(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the ID of the division.
     * @return The ID of the division.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the division.
     * @return The name of the division.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the Division object.
     * @return A string representation of the Division object.
     */
    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

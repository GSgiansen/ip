package duke.task;
public class Todo extends Task{

    /**
     *
     * @param name name of the Todo list
     * @throws DukeException when there is no description after the todo String
     */
    public Todo(String name) throws DukeException {
        super(" " + name);
        this.ogname = name;
        this.type = "Todo";
        if (name.isEmpty()) throw new DukeException(" No Description given!");
    }

    /**
     *
     * @return String format of the Todo class
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}

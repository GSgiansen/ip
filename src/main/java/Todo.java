public class Todo extends Task{
    String[] inputs;
    public Todo(String name) throws DukeException {
        super(name);
        if (name.isEmpty()) throw new DukeException("dont leave the description empty!");
    }
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}

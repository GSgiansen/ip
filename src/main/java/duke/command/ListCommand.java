public class ListCommand extends Command{

    @Override
    void execute(TaskList tasks, Ui ui, Storage store) {
        tasks.display();
    }
}

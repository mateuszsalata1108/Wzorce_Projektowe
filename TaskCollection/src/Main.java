import javax.management.Notification;
import java.util.Iterator;

class Task
{
    String task;

    public Task(String task)
    {
        this.task = task;
    }
    public String getTask()
    {
        return task;
    }
}

interface Collection
{
    public Iterator createIterator();
}

class TaskCollection implements Collection
{
    static final int MaxItems = 6;
    int numberOfItems = 0;
    Task[] taskList;

    public TaskCollection()
    {
        taskList = new Task[MaxItems];

        addItem("Zadanie 1");
        addItem("Zadanie 2");
    }

    public void addItem(String str)
    {
        Task task = new Task(str);
        if (numberOfItems >= MaxItems)
            System.err.println("Lista zadań jest pełna");
        else
        {
            taskList[numberOfItems] = task;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator()
    {
        return new TaskIterator(taskList);
    }
}



class TaskIterator implements Iterator
{
    Task[] taskList;

    int pos = 0;

    public TaskIterator(Task[] taskList)
    {
        this.taskList = taskList;
    }

    public Object next()
    {
        Task task = taskList[pos];
        pos += 1;
        return task;
    }

    public boolean hasNext()
    {
        if (pos >= taskList.length || taskList[pos] == null)
            return false;
        else
            return true;
    }
}

class TaskBar
{
    TaskCollection tasks;

    public TaskBar (TaskCollection tasks)
    {
        this.tasks = tasks;
    }

    public void printTasks()
    {
        Iterator iterator = tasks.createIterator();
        System.out.println("Lista zadań:\n");
        while (iterator.hasNext())
        {
            Task t = (Task) iterator.next();
            System.out.println(t.getTask());
        }
    }
}
public class Main {
    public static void main(String[] args) {

        TaskCollection tc = new TaskCollection();
        TaskBar tb = new TaskBar(tc);
        tb.printTasks();
    }
}
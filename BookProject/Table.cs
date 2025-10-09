public class Table
{
    public string Content;

    public Table(string content)
    {
        Content = content;
    }

    public void Print()
    {
        System.Console.WriteLine("      Table: " + Content);
    }
}
public class SubChapter
{
    public string Title;
    public Element element;

    public SubChapter(string title, Element element)
    {
        Title = title;
        this.element = element;
    }

    public void Print()
    {
        System.Console.WriteLine("    SubChapter: " + Title);
        element.Print();
    }
}
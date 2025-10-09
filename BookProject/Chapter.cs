public class Chapter
{
    public string Title;
    public List<SubChapter> SubChapters = new List<SubChapter>();

    public Chapter(string title, List<SubChapter> subChapters)
    {
        Title = title;
        SubChapters = subChapters;
    }

    public void Print()
    {
        System.Console.WriteLine("  Chapter: " + Title);
        foreach (var subChapter in SubChapters)
        {
            subChapter.Print();
        }
    }
}
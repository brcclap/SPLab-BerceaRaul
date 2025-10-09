public class Element
{
    private readonly Paragraph paragraph;
    private readonly Image image;
    private readonly Table table;

    public Element(Paragraph paragraph)
    {
        this.paragraph = paragraph;
    }

    public Element(Image image)
    {
        this.image = image;
    }

    public Element(Table table)
    {
        this.table = table;
    }

    public void Print()
    {
        if (paragraph != null)
        {
            paragraph.Print();
            return;
        }
        if (image != null)
        {
            image.Print();
            return;
        }
        if (table != null)
        {
            table.Print();
            return;
        }
    }
}


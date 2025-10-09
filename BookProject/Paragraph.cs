public class Paragraph
{
    public string Text;

    public Paragraph(string text)
    {
        Text = text;
    }

    public void Print()
    {
        System.Console.WriteLine("      Paragraph: " + Text);
    }
}
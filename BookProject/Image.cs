public class Image
{
    public string url;

    public Image(string url)
    {
        this.url = url;
    }

    public void Print()
    {
        System.Console.WriteLine("      Image: " + url);
    }
}
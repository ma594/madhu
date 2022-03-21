abstract class shape
{
    abstract void draw();
}
class circle extends shape
{
    void draw()
    {
        System.out.println("circle");
    }
}
class square extends  shape{
    {
        void draw()
        {
            System.out.println("square");
        }
    }
    class rectangle extends shape
    {
        void draw()
        {
            System.out.println("rectangle");
        }
    }
    class main
    {
        Public Static Void Main(string args[])
        {
            shape s=new circle();
            s..draw();
        }
        
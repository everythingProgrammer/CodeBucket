package unknown;

class equality 
{
    int x;
    int y;
    boolean isequal()
    {
        return(x == y);  
    } 
}    
class Output 
{
    public static void main(String args[]) 
    {
        equality obj = new equality();
        obj.x = 5;
        obj.y = 5;
        System.out.println(obj.isequal());
    } 
}
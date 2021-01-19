
public class NumberHelper 
{
    private int number;

    public NumberHelper(int n) 
    {
        number = n;
    }

    public boolean isEven() 
    {
        boolean controllo = false;
        
        
        // ritorna true se number numero pari, altrimenti ritorna false
        if(number % 2 == 0)
            controllo = true;
        
        return controllo;
    }

    public boolean isOdd() 
    {        
        boolean controllo = true;
        // ritorna true se number numero pari, altrimenti ritorna false
        if(number % 2 == 0)
            controllo = false;
        
        return controllo;
    }
    
    public int sum(int n)
    {
        // ritorna la somma tra number e n
        
        int somma = 0;
        
        return somma = n + number;
        
    }

    public boolean isPrime() 
    {
        // ritorna true se number è un numero primo, altrimenti ritorna false
      boolean controllo = true;
      int i = 0;
      
    for(i = 2; i < number/2; i++)
        if(number % i == 0)
            controllo = false;
    return controllo;
}
        
        

    public boolean isDisisibleBy(int n) 
    {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
        
        boolean controllo = false;
        
        if(number % n == 0)
            controllo = true;
        
        return controllo;
    }
}

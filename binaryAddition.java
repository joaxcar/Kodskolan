import java.io.InputStreamReader;
import java.io.IOException;

class BinaryAddition
{

    public static void main(String[] args)
    {
        int[] bin1 = new int[8];
        int[] bin2 = new int[8];
        int[] res = new int[8];
        int carry = 0;

        try (InputStreamReader kb = new InputStreamReader(System.in))
        {
            System.out.println("Enter an eight bit binary number:");
            for (int i = 0; i < bin1.length; i++)
            {
                bin1[i] = Character.getNumericValue(kb.read());
            }

            while ( kb.ready() )
            {
                kb.read();
            }
            System.out.println("Enter an other eight bit binary number:");
            for (int i = 0; i < bin2.length; i++)
            {
                bin2[i] = Character.getNumericValue(kb.read());
            }

        }
        catch (IOException e)
        {
            System.out.println("Fel fel fel");
        }
        
        
        System.out.println("You entered:");
        for (int i = 0; i < bin1.length; i++)
        {
            System.out.print(bin1[i]);
        }
        System.out.println();
        for (int i = 0; i < bin2.length; i++)
        {
            System.out.print(bin2[i]);
        }
        System.out.println();

        for (int i = res.length-1; i >= 0; i--)
        {
            switch (bin1[i] + bin2[i] + carry)
            {
                case 0:
                    res[i] = 0;
                    carry = 0;
                    break;
                case 1:
                    res[i] = 1;
                    carry = 0;
                    break;
                case 2:
                    res[i] = 0;
                    carry = 1;
                    break;
                case 3:
                    res[i] = 1;
                    carry = 1;
                    break;
            }
        }
        System.out.println("Numbers added:");
        for (int i = 0; i<res.length; i++)
        {
            System.out.print(res[i]);
        }
    }
}



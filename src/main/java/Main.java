
import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.StreamSupport;
import static java.lang.Math.log;
import static java.lang.Math.pow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String args[])
    {

        Integer num;

        while(true){
            try{
                System.out.println("Enter your choice for calculation \n 1. Factorial Function \n 2. Square Root \n 3.Power Function \n 4. Natural Log (Base e) \n5. Exit \n");
                Scanner sc = new Scanner(System.in);


                try{
                    num = sc.nextInt();
                }catch (InputMismatchException error){
                    return;
                }


                switch (num)
                {
                    case 1:
                        Integer a;
                        System.out.println("Enter a number whose Factorial is to be calculated");
                        a=sc.nextInt();
                        Integer op = calcFactorial(a);
                        System.out.println("Output is :" + op);

                        break;
                    case 2:
                        Double y, b;
                        System.out.println("Enter a number whose Square Root is to be calculated");
                        y=sc.nextDouble();
                        Double op1 = calcSqroot(y);
                        System.out.println("Output is :" + op1);



                        break;
                    case 3:
                        Integer z, b1;
                        System.out.println("Enter a number whose power is to be calculated");
                        z=sc.nextInt();
                        System.out.println("Enter power to be calculated");
                        b1=sc.nextInt();
                        Double op2 = calcPower(z, b1);
                        System.out.println("Output is :" + op2);


                        break;
                    case 4:
                        Double c;
                        System.out.println("Enter a number whose Natural Log is to be calculated");
                        c=sc.nextDouble();
                        Double op3 = calcNaturallog(c);
                        System.out.println("Output is :" + op3);


                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default: System.out.println("Wrong Input");
                }
            }catch(InputMismatchException e){
                logger.error("Invalid input, Entered input is not a number/Double");
                System.out.println("Wrong Input");
            }
            catch (IllegalArgumentException e)
            {
                logger.error("Input can't be negative");
                System.out.println("Input cant be negative");
            }
        }



    }

    static Double calcNaturallog(Double x) {

        if(x<0){
            logger.info("[EXCEPTION - Natural Log] - Natural Log of negative number is not possible!");
            throw new IllegalArgumentException();
        }

        Double op = 0.0;
        logger.info("[Natural Log] - " + x);
        op = log(x);
        logger.info("[RESULT - Natural Log] - " + op);

        return op;
    }
    static Integer calcFactorial(Integer x) {

        if(x<0){
            logger.info("[EXCEPTION - Factorial] - Factorial of negative number is not possible!");
            throw new IllegalArgumentException();
        }
        Integer op = 0;

        logger.info("[Factorial] - " + x);
        op = 1;
        for(Integer i = x; i>=1; i--)
        {
            op*= i;
        }
        logger.info("[RESULT - Factorial] - " + op);
        return op;
    }

    static Double calcPower(Integer x, Integer b) {
        logger.info("[Power] - " + x + ", " + b);
        Double op = pow(x,b);
        logger.info("[RESULT - Power] - " + op);
        return op;
    }

    static Double calcSqroot(Double x) {

        if(x<0){
            logger.info("[EXCEPTION - Square Root] - SQRT of negative number is not possible!");
            throw new IllegalArgumentException();
        }
        Double op = 0.0;
        logger.info("[Square Root] - " + x);
        op = pow(x,1/2.0);
        logger.info("[RESULT - Square Root] - " + op);
        return op;
    }
}
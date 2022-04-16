
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
                        Integer x;
                        System.out.println("Enter a number whose Factorial is to be calculated");
                        x=sc.nextInt();
                        Integer op = calcfact(x);
                        System.out.println("Output is :" + op);

                        break;
                    case 2:
                        Double x1, b;
                        System.out.println("Enter a number whose Square Root is to be calculated");
                        x1=sc.nextDouble();
                        Double op1 = calcsqroot(x1);
                        System.out.println("Output is :" + op1);



                        break;
                    case 3:
                        Integer x2, b1;
                        System.out.println("Enter a number whose power is to be calculated");
                        x2=sc.nextInt();
                        System.out.println("Enter power to be calculated");
                        b1=sc.nextInt();
                        Double op2 = calcpower(x2, b1);
                        System.out.println("Output is :" + op2);


                        break;
                    case 4:
                        Double x3;
                        System.out.println("Enter a number whose Natural Log is to be calculated");
                        x3=sc.nextDouble();
                        Double op3 = calcnatlog(x3);
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

    static Double calcnatlog(Double x) {

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
    static Integer calcfact(Integer x) {

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

    static Double calcpower(Integer x, Integer b) {
        logger.info("[Power] - " + x + ", " + b);
        Double op = pow(x,b);
        logger.info("[RESULT - Power] - " + op);
        return op;
    }

    static Double calcsqroot(Double x) {

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
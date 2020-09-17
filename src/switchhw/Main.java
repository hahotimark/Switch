package switchhw;

public class Main {

    public static void main(String[] args) {

    // 1. Akkor kell adnom egy kezdőértéket a rolled number változónak

	// 2. A Default break-nél nem tapasztaltam semmit!


        Mounth mounth = new Mounth(10);

        Names name1 = new Names("DEAN");

        Names name2 = new Names("BEATRIX");

        ValueCar MYCAR = new ValueCar();

        double val = 0;

        switch (MYCAR.Value(Cars.MERCEDES)){

            case BMW:
                val = 50000;
                break;

            case KIA:
                val = 12000;
                break;

            case SKODA:
                val = 18000;
                break;

            case MERCEDES:
                val = 60000;
                break;

            case TOYOTA:
                val = 35000;
                break;

            default:
                val = 0;


        }

        System.out.println(val);

        try {

            new Game().roll(PlayerGuesses.EVEN);
        }
        catch (Exception e)
        {

            System.out.println( e.getMessage() );
        }
        finally {

            System.out.println("Game finished!");
        }

    }

}

/*
4:
A numberA fog lefutni. Gondolom ha a C is véletlen 5-öt kapna akkor is mert az előbb van.

7:
Ki fogja írni: B
Defaulton látják egymást amig egy packegeben vannak.
 */
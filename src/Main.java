import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

     Country country=new Country("Gremany",1200.0,640,"german");
     Country country2=new Country("England",1100.0,740,"enlish");
     Country country3=new Country("France",1300.0,840,"french");
     Country country4=new Country("Poland",8000.0,540,"polish");
     Country country5=new Country("Latvia",5000.0,340,"latvian");
     Country country6=new Country("Czech",500.0,240,"czech");
     Country [] countries={country,country2,country3,country4,country5,country6};
     Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);

        System.out.println("1 getMax,2 finByCountry name,3 findAll ");
        int number=scanner1.nextInt();
        switch (number){
            case 1:
                getMax(countries);
                break;
            case 2:
                finByCountryName(scanner1.nextLine(), countries);
                break;
            case 3:
                findAll(countries);
                break;
            default:
                System.out.println("Myndai method jok");

        }

        //  finByCountryName(scanner.nextLine(), countries);
      // getMax(countries);

            }
            public static void getMax(Country[] countries){
        double max=countries[0].getArea();
        double min=countries[0].getArea();
                for (int i = 0; i < countries.length; i++) {
                    max=Math.max(max,countries[i].getArea());
                     min = Math.min(min,countries[i].getArea());
                }
              //  System.out.println(max);
             //   System.out.println(min);
                for (Country country:countries){
                    if(country.getArea()==max){
                        System.out.println(country.toString());
                    } else if (country.getArea()==min) {
                        System.out.println(country.toString());

                    }
                }


            }
            public static void finByCountryName(String countryName,Country[] countries){
        for (Country country:countries){
            if(country.getName().equals(countryName)){
                System.out.println(country.toString());
            }
        }

            }

            public static void findAll(Country[] countries){
            for (Country country:countries){
                System.out.println(country.toString());
            }

            }
        }


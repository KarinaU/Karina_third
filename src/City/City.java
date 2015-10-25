package City;

/**
 * Created by IT_School on 25.10.2015.
 */

enum CityOffice {Kharkov(30000,10,3), Lvov(25000,10,1), Kiev(50000,10,2);

        private int population, location, ammountOffice;

        CityOffice(int population, int location, int ammountOffice) {
                this.population = population;
                this.location = location;
                this.ammountOffice = ammountOffice;

        }
}
        public class City {
                String CityOffice;
                String nameDirector;

                public City(String CityOffice, String nameDirector) {
                        this.CityOffice = CityOffice;
                        this.nameDirector = nameDirector;
                }


}

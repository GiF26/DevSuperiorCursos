package Bar.Objects;

public class Bill {
    private static int beer = 5;
    private static int  barbecue = 7;
    private static int  softDrink = 3;
    private static String gender = "";

    public static int getBeer() {
        return beer;
    }

    public static void setBeer(int beer) {
        Bill.beer = beer;
    }

    public static int getSoftDrink() {
        return softDrink;
    }

    public static void setSoftDrink(int softDrink) {
        Bill.softDrink = softDrink;
    }

    public static int getBarbecue() {
        return barbecue;
    }

    public static void setBarbecue(int barbecue) {
        Bill.barbecue = barbecue;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Bill.gender = gender;
    }

    public static double cover(){
        double valorCover;

        if(feeding() > 30){
            valorCover = 0;
        }else {
            valorCover = 4 ;
        }

        return  valorCover;
    }

    public static double feeding(){
        double valorBeer = getBeer() * 5;
        double valorBarbecue = getBarbecue() * 7;
        double valorSoftDrink = getSoftDrink() * 3;
        return valorBeer + valorBarbecue + valorSoftDrink;
    }

    public static double ticket(){
        double valorTicket = 0;

        switch (getGender().toUpperCase()){
            case "F":
                valorTicket = 8;
                break;
            case "M":
                valorTicket = 10;
                break;
            default:
                System.out.println("Genero invalido");
                break;
        }
        return valorTicket;
    }

    public static double total(){
        return  feeding() + cover() + ticket();
    }
}

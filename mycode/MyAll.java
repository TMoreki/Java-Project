 import java.util.Arrays; 

public class MyAll {
    public static void main(String[] args) { 
        MyAll myAll = new MyAll();
        myAll.printElements();
    }

    public String[] MyKids = {"LEANO", "PHAHAMO"};
    public String[] BirthDates = {"29.03.2013",  "05.12.2016"};
    public String[] BirthLeano = {"25°45'45.7\"S 28°05'25.5\"E"};
    public String[] BirthPhahamo = {"25°31'30.7\"S 28°02'16.3\"E"};

    public Object[] getElements() {
        return new Object[]{MyKids, BirthDates, BirthLeano, BirthPhahamo};
    }

    public void printElements() {
        System.out.println("Kids: " + Arrays.toString(MyKids));
        System.out.println("Dates: " + Arrays.toString(BirthDates));
        System.out.println("Birth Location Leano: " + Arrays.toString(BirthLeano));
        System.out.println("Birth Location Phahamo: " + Arrays.toString(BirthPhahamo));
    }
}


//-25.762706292987797, 28.09040161690406 kalafong
//-25.525205262213642, 28.03785415421661 legae

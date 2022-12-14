import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<List<NationalPark>> firstList;
    static List<NationalPark> littleNP;
    static List<NationalPark> bigNP;
    private static int sumAreaOfLittle, sumAreaOfBig;

    public static void main(String[] args){
//*******************************************************************
        // ILK KISIM
//*******************************************************************
        System.out.println("**************FIRST PART*****************");
        firstList = new ArrayList<>();
        littleNP = new ArrayList<>();
        bigNP = new ArrayList<>();
        firstList.add(littleNP);
        firstList.add(bigNP);

        // we took National Park objects into an array
        NationalPark[] npList = createNPlist();

        for(int i = 0; i < 48; i++){
            if(npList[i].getArea() < 15000) firstList.get(0).add(npList[i]);
            else firstList.get(1).add(npList[i]);
        }

        displayInfo();
        System.out.println("*******************************************");
/* ******************************************************************
        SECOND PART
/*******************************************************************/
        System.out.println("********SECOND PART*********");
        Stack stack = new Stack(npList.length);

        // national parks have been added into the stack
        for(int i = 0; i < npList.length; i++)
            stack.push(npList[i]);

        // each national list have been removed, and displayed
        for(int i = 0; i < npList.length; i++)
            System.out.println(stack.pop());

        System.out.println();
        //-----------------SECOND PART OF THE PROJECT--------------------
        Queue queue = new Queue(npList.length);
        for(NationalPark np : npList){
            if(!queue.isFull())  // if queue is not full, then it inserts the national park
                queue.insert(np);
        }
        int i = 0;
        // all the national parks have been removed from the queue
        while (!queue.isEmpty()){  // if queue is not empty, it removes the national park
            i++;
            System.out.print(String.valueOf(i)+"  ");
            System.out.println(queue.remove());
        }

        System.out.println("****************************************");
/* ******************************************************************
        THIRD PART
*******************************************************************/
        System.out.println("********************THIRD PART*********************");
        PriorityQueue pq = new PriorityQueue(npList.length); // we could directly write 48 tho

        for(NationalPark np:npList){
            pq.insert(np);
        }
        int j = 0;
        while (!pq.isEmpty()){
            j++;
            System.out.print(String.valueOf(j)+"  ");
            System.out.println(pq.remove());
        }
        System.out.println("*****************************************");
//********************************************************************
    }

    public static void displayInfo(){
        System.out.println("Little National Parks");
        for(NationalPark np:littleNP){
            sumAreaOfLittle += np.getArea();
            System.out.println(np);
        }
        System.out.println();
        System.out.println("Big National Parks");
        for(NationalPark np:bigNP){
            sumAreaOfBig += np.getArea();
            System.out.println(np);
        }
        System.out.println();
        System.out.print("Area sum of little National Parks: ");
        System.out.println(sumAreaOfLittle);
        System.out.print("Area sum of big National Parks: ");
        System.out.println(sumAreaOfBig);
    }

    // the method that sets National parks into an array and returns it
    public static NationalPark[] createNPlist(){
        NationalPark nationalPark1 = new NationalPark("Abant G??l?? Mill?? Park??","Bolu","10 Haziran 2022",1262);
        NationalPark nationalPark2 = new NationalPark("A??r?? Da???? Mill?? Park??", "A??r??, I??d??r","17 Kas??m 2004",88015);
        NationalPark nationalPark3 = new NationalPark("Alada??lar Mill?? Park??","Adana, Kayseri, Ni??de","21 Nisan 1995",55064);
        NationalPark nationalPark4 = new NationalPark("Alt??nbe??ik Ma??aras?? Mill?? Park??","Antalya","31 A??ustos 1994",1147);
        NationalPark nationalPark6 = new NationalPark("Alt??ndere Vadisi Mill?? Park??","Trabzon","9 Eyl??l 1987",4468 );
        NationalPark nationalPark7 = new NationalPark("Ba??komutan Tarih?? Mill?? Park??","Afyon, K??tahya, U??ak","8 Kas??m 1981",34834 );
        NationalPark nationalPark8 = new NationalPark("Beyda??lar?? Sahil Mill?? Park??","Antalya","16 Mart 1972"	,31166);
        NationalPark nationalPark9 = new NationalPark("Bey??ehir G??l?? Mill?? Park??","Konya","11 Ocak 1993",86855);
        NationalPark nationalPark10 = new NationalPark("Bo??azk??y-Alacah??y??k Mill?? Park??","??orum","21 Eyl??l 1988",	2600);
        NationalPark nationalPark11 = new NationalPark("Botan Vadisi Mill?? Park??","Siirt","15 A??ustos 2019",11384);
        NationalPark nationalPark12 = new NationalPark("Derebucak ??aml??k Ma??aralar?? Mill?? Park??","Konya","7 Haziran 2022",1147);
        NationalPark nationalPark13 = new NationalPark("Dilek Yar??madas??-B??y??k Menderes Deltas?? Mill?? Park??","Ayd??n","19 May??s 1966",27598);
        NationalPark nationalPark14 = new NationalPark("Gala G??l?? Mill?? Park??",	"Edirne","5 Mart 2005",	6087);
        NationalPark nationalPark15 = new NationalPark("G??ll??k Da???? Mill?? Park??","Antalya","3 Kas??m 1970",6700);
        NationalPark nationalPark16 = new NationalPark("Hakk??ri Cilo ve Sat Da??lar?? Mill?? Park??","Hakk??ri","26 Eyl??l 2020",27500);
        NationalPark nationalPark17 = new NationalPark("Hatila Vadisi Mill?? Park??","Artvin","31 A??ustos 1994",16944);
        NationalPark nationalPark18 = new NationalPark("Honaz Da???? Mill?? Park??","Denizli","21 Nisan 1995",9429);
        NationalPark nationalPark19 = new NationalPark("Ilgaz Da???? Mill?? Park??","??ank??r??, Kastamonu","2 Haziran 1976",1118);
        NationalPark nationalPark20 = new NationalPark("????neada Longoz Ormanlar?? Mill?? Park??","K??rklareli","13 Kas??m 2007",3155);
        NationalPark nationalPark21 = new NationalPark("??stikl??l Yolu Tarih?? Mill?? Park??","Ankara, ??ank??r??, Kastamonu","2 Kas??m 2018",235);
        NationalPark nationalPark22 = new NationalPark("Ka??kar Da??lar?? Mill?? Park??","Artvin, Erzurum, Rize","31 A??ustos 1994",52970);
        NationalPark nationalPark23= new NationalPark("Karag??l-Sahara Mill?? Park??","Artvin","31 A??ustos 1994",3251);
        NationalPark nationalPark24 = new NationalPark("Karatepe-Aslanta?? Mill?? Park??","Osmaniye","29 May??s 1958",4143);
        NationalPark nationalPark25 = new NationalPark("Kazda???? Mill?? Park??","Bal??kesir","17 Nisan 1994",20935);
        NationalPark nationalPark26 = new NationalPark("K??z??lda?? Mill?? Park??","Isparta","9 May??s 1969",55106);
        NationalPark nationalPark27 = new NationalPark("Kop Da???? M??dafaas?? Tarih?? Mill?? Park??","Bayburt, Erzurum","15 Kas??m 2016",6335);
        NationalPark nationalPark28 = new NationalPark("Kovada G??l?? Mill?? Park??","Isparta","3 Kas??m 1970",6551);
        NationalPark nationalPark29 = new NationalPark("K??pr??l?? Kanyon Mill?? Park??","Antalya","12 Aral??k 1973",35719);
        NationalPark nationalPark30 = new NationalPark("Ku??cenneti Mill?? Park??","Bal??kesir","27 Temmuz 1959",17058);
        NationalPark nationalPark31 = new NationalPark("K??re Da??lar?? Mill?? Park??","Bart??n, Kastamonu","7 Temmuz 2000",37753);
        NationalPark nationalPark32= new NationalPark("Malazgirt Meydan Muharebesi Tarih?? Mill?? Park??","Mu??","5 ??ubat 2018",238);
        NationalPark nationalPark33= new NationalPark("Marmaris Mill?? Park??","Mu??la","8 Mart 1996",29206);
        NationalPark nationalPark34 = new NationalPark("Munzur Vadisi Mill?? Park??","Tunceli","21 Aral??k 1971",42674);
        NationalPark nationalPark35 = new NationalPark("Nemrut Da???? Mill?? Park??","Ad??yaman, Malatya","7 Aral??k 1988",13827);
        NationalPark nationalPark36 = new NationalPark("Nene Hatun Tarih?? Mill?? Park??","Erzurum","6 Haziran 2009",387);
        NationalPark nationalPark37 = new NationalPark("Sakarya Meydan Muharebesi Tarih?? Mill?? Park??","Ankara","8 ??ubat 2015",13850);
        NationalPark nationalPark38 = new NationalPark("Sakl??kent Mill?? Park??","Antalya, Mu??la","6 Haziran 1996",1643);
        NationalPark nationalPark39 = new NationalPark("Sar????al?? Da???? Mill?? Park??","Ankara","28 Ekim 2021",1024);
        NationalPark nationalPark40 = new NationalPark("Sar??kam????-Allahuekber Da??lar?? Mill?? Park??","Erzurum, Kars","19 Ekim 2004",22520);
        NationalPark nationalPark41 = new NationalPark("So??uksu Mill?? Park??","Ankara","19 ??ubat 1959",1186);
        NationalPark nationalPark42 = new NationalPark("Spil Da???? Mill?? Park??","??zmir, Manisa","22 Nisan 1968",6801);
        NationalPark nationalPark43 = new NationalPark("Sultansazl?????? Mill?? Park??","Kayseri","17 Mart 2006",24358);
        NationalPark nationalPark44 = new NationalPark("Tek Tek Da??lar?? Mill?? Park??","??anl??urfa","29 May??s 2007",19335);
        NationalPark nationalPark45 = new NationalPark("Troya Tarih?? Mill?? Park??","??anakkale","7 Kas??m 1996",13517 );
        NationalPark nationalPark46 = new NationalPark("Uluda?? Mill?? Park??","Bursa","20 Eyl??l 1961",13024);
        NationalPark nationalPark47 = new NationalPark("Yedig??ller Mill?? Park??","Bolu","29 Nisan 1965",1623);
        NationalPark nationalPark48 = new NationalPark("Yozgat ??aml?????? Mill?? Park??","Yozgat","5 ??ubat 1958",517);
        NationalPark nationalPark5 = new NationalPark("Yumurtal??k Lag??n?? Mill?? Park??","Adana","6 Aral??k 2008",16980);

        NationalPark[] npList = {nationalPark1,nationalPark2,nationalPark3,nationalPark4,nationalPark6,nationalPark7,
                nationalPark8,nationalPark9,nationalPark10,nationalPark11,nationalPark12,nationalPark13,nationalPark14,
                nationalPark15,nationalPark16,nationalPark17,nationalPark18,nationalPark19,nationalPark20,nationalPark21,
                nationalPark22,nationalPark23,nationalPark24,nationalPark25,nationalPark26,nationalPark27,nationalPark28,
                nationalPark29,nationalPark30,nationalPark31,nationalPark32,nationalPark33,nationalPark34,nationalPark35,
                nationalPark36,nationalPark37,nationalPark38,nationalPark39,nationalPark40,nationalPark41,nationalPark42,
                nationalPark43,nationalPark44,nationalPark45,nationalPark46,nationalPark47,nationalPark48,nationalPark5
        };

        return npList;
    }
}



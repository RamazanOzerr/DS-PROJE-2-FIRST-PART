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
        NationalPark nationalPark1 = new NationalPark("Abant Gölü Millî Parkı","Bolu","10 Haziran 2022",1262);
        NationalPark nationalPark2 = new NationalPark("Ağrı Dağı Millî Parkı", "Ağrı, Iğdır","17 Kasım 2004",88015);
        NationalPark nationalPark3 = new NationalPark("Aladağlar Millî Parkı","Adana, Kayseri, Niğde","21 Nisan 1995",55064);
        NationalPark nationalPark4 = new NationalPark("Altınbeşik Mağarası Millî Parkı","Antalya","31 Ağustos 1994",1147);
        NationalPark nationalPark6 = new NationalPark("Altındere Vadisi Millî Parkı","Trabzon","9 Eylül 1987",4468 );
        NationalPark nationalPark7 = new NationalPark("Başkomutan Tarihî Millî Parkı","Afyon, Kütahya, Uşak","8 Kasım 1981",34834 );
        NationalPark nationalPark8 = new NationalPark("Beydağları Sahil Millî Parkı","Antalya","16 Mart 1972"	,31166);
        NationalPark nationalPark9 = new NationalPark("Beyşehir Gölü Millî Parkı","Konya","11 Ocak 1993",86855);
        NationalPark nationalPark10 = new NationalPark("Boğazköy-Alacahöyük Millî Parkı","Çorum","21 Eylül 1988",	2600);
        NationalPark nationalPark11 = new NationalPark("Botan Vadisi Millî Parkı","Siirt","15 Ağustos 2019",11384);
        NationalPark nationalPark12 = new NationalPark("Derebucak Çamlık Mağaraları Millî Parkı","Konya","7 Haziran 2022",1147);
        NationalPark nationalPark13 = new NationalPark("Dilek Yarımadası-Büyük Menderes Deltası Millî Parkı","Aydın","19 Mayıs 1966",27598);
        NationalPark nationalPark14 = new NationalPark("Gala Gölü Millî Parkı",	"Edirne","5 Mart 2005",	6087);
        NationalPark nationalPark15 = new NationalPark("Güllük Dağı Millî Parkı","Antalya","3 Kasım 1970",6700);
        NationalPark nationalPark16 = new NationalPark("Hakkâri Cilo ve Sat Dağları Millî Parkı","Hakkâri","26 Eylül 2020",27500);
        NationalPark nationalPark17 = new NationalPark("Hatila Vadisi Millî Parkı","Artvin","31 Ağustos 1994",16944);
        NationalPark nationalPark18 = new NationalPark("Honaz Dağı Millî Parkı","Denizli","21 Nisan 1995",9429);
        NationalPark nationalPark19 = new NationalPark("Ilgaz Dağı Millî Parkı","Çankırı, Kastamonu","2 Haziran 1976",1118);
        NationalPark nationalPark20 = new NationalPark("İğneada Longoz Ormanları Millî Parkı","Kırklareli","13 Kasım 2007",3155);
        NationalPark nationalPark21 = new NationalPark("İstiklâl Yolu Tarihî Millî Parkı","Ankara, Çankırı, Kastamonu","2 Kasım 2018",235);
        NationalPark nationalPark22 = new NationalPark("Kaçkar Dağları Millî Parkı","Artvin, Erzurum, Rize","31 Ağustos 1994",52970);
        NationalPark nationalPark23= new NationalPark("Karagöl-Sahara Millî Parkı","Artvin","31 Ağustos 1994",3251);
        NationalPark nationalPark24 = new NationalPark("Karatepe-Aslantaş Millî Parkı","Osmaniye","29 Mayıs 1958",4143);
        NationalPark nationalPark25 = new NationalPark("Kazdağı Millî Parkı","Balıkesir","17 Nisan 1994",20935);
        NationalPark nationalPark26 = new NationalPark("Kızıldağ Millî Parkı","Isparta","9 Mayıs 1969",55106);
        NationalPark nationalPark27 = new NationalPark("Kop Dağı Müdafaası Tarihî Millî Parkı","Bayburt, Erzurum","15 Kasım 2016",6335);
        NationalPark nationalPark28 = new NationalPark("Kovada Gölü Millî Parkı","Isparta","3 Kasım 1970",6551);
        NationalPark nationalPark29 = new NationalPark("Köprülü Kanyon Millî Parkı","Antalya","12 Aralık 1973",35719);
        NationalPark nationalPark30 = new NationalPark("Kuşcenneti Millî Parkı","Balıkesir","27 Temmuz 1959",17058);
        NationalPark nationalPark31 = new NationalPark("Küre Dağları Millî Parkı","Bartın, Kastamonu","7 Temmuz 2000",37753);
        NationalPark nationalPark32= new NationalPark("Malazgirt Meydan Muharebesi Tarihî Millî Parkı","Muş","5 Şubat 2018",238);
        NationalPark nationalPark33= new NationalPark("Marmaris Millî Parkı","Muğla","8 Mart 1996",29206);
        NationalPark nationalPark34 = new NationalPark("Munzur Vadisi Millî Parkı","Tunceli","21 Aralık 1971",42674);
        NationalPark nationalPark35 = new NationalPark("Nemrut Dağı Millî Parkı","Adıyaman, Malatya","7 Aralık 1988",13827);
        NationalPark nationalPark36 = new NationalPark("Nene Hatun Tarihî Millî Parkı","Erzurum","6 Haziran 2009",387);
        NationalPark nationalPark37 = new NationalPark("Sakarya Meydan Muharebesi Tarihî Millî Parkı","Ankara","8 Şubat 2015",13850);
        NationalPark nationalPark38 = new NationalPark("Saklıkent Millî Parkı","Antalya, Muğla","6 Haziran 1996",1643);
        NationalPark nationalPark39 = new NationalPark("Sarıçalı Dağı Millî Parkı","Ankara","28 Ekim 2021",1024);
        NationalPark nationalPark40 = new NationalPark("Sarıkamış-Allahuekber Dağları Millî Parkı","Erzurum, Kars","19 Ekim 2004",22520);
        NationalPark nationalPark41 = new NationalPark("Soğuksu Millî Parkı","Ankara","19 Şubat 1959",1186);
        NationalPark nationalPark42 = new NationalPark("Spil Dağı Millî Parkı","İzmir, Manisa","22 Nisan 1968",6801);
        NationalPark nationalPark43 = new NationalPark("Sultansazlığı Millî Parkı","Kayseri","17 Mart 2006",24358);
        NationalPark nationalPark44 = new NationalPark("Tek Tek Dağları Millî Parkı","Şanlıurfa","29 Mayıs 2007",19335);
        NationalPark nationalPark45 = new NationalPark("Troya Tarihî Millî Parkı","Çanakkale","7 Kasım 1996",13517 );
        NationalPark nationalPark46 = new NationalPark("Uludağ Millî Parkı","Bursa","20 Eylül 1961",13024);
        NationalPark nationalPark47 = new NationalPark("Yedigöller Millî Parkı","Bolu","29 Nisan 1965",1623);
        NationalPark nationalPark48 = new NationalPark("Yozgat Çamlığı Millî Parkı","Yozgat","5 Şubat 1958",517);
        NationalPark nationalPark5 = new NationalPark("Yumurtalık Lagünü Millî Parkı","Adana","6 Aralık 2008",16980);

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



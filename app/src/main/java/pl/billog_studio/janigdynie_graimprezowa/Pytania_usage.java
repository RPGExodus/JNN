package pl.billog_studio.janigdynie_graimprezowa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Pytania_usage {

    String[] baza={"Ja nigdy nie byłem w sex-shopie",
            "Ja nigdy nie pływałem w morzu",
            "Ja nigdy nie byłem w klubie ze striptizem",
            "Ja nigdy nie piłem teqilli",
            "Ja nigdy nie słuchałem Paderewskiego",
            "Ja nigdy nie chciałem zostać gwiazdą disco polo.",
            "Ja nigdy nie zdradziłem partnera.",
            "Ja nigdy nie byłem zazdrosny o czyjeś 'lajki' na facebook bądź instagram.",
            "Ja nigdy nie oszukiwałem moich znajomych że nie mogę wyjść z domu.",
            "Ja nigdy nie wolałem grać na komputerze zamiast wyjść na dwór.",
            "Ja nigdy nie śmiałem się z grubych ludzi.",
            "Ja nigdy nie uprawiałem seksu w miejscu publicznym.",
            "Ja nigdy nikogo nie uderzyłem.",
            "Ja nigdy nikogo nie oplułem.",
            "Ja nigdy niczego nie ukradłem.",
            "Ja nigdy nie tańczyłem będąc sam w domu.",
            "Ja nigdy nie doszedłem za wcześnie.",
            "Ja nigdy nie wymiotowałem po alkoholu.",
            "Ja nigdy nie wypiłem tak dużo że urwał mi się film.",
            "Ja nigdy nie czułem że zmarnowałem wakacje.",
            "Ja nigdy nie szukałem partnera w internecie.",
            "Ja nigdy nie miałem wypadku samochodowego.",
            "Ja nigdy nie jeździłem pod wpływem alkoholu.",
            "Ja nigdy nie uciekłem z lekcji.",
            "Ja nigdy nie ściągałem.",
            "Ja nigdy nie zrzuciłem winy za moje zachowanie na kogoś innego.",
            "Ja nigdy nie załatwiłem żadnej sprawy przekupując kogoś.",
            "Ja nigdy nie skłamałem mówiąc że kogoś kocham.",
            "Ja nigdy nie chowałem urazy do kogoś wśród grających.",
            "Ja nigdy nie miałem uprawiałem seksu ze szkolnym kolegą/koleżanką.",
            "Ja nigdy nie brałem narkotyków.",
            "Ja nigdy się nie masturbowałem.",
            "Ja nigdy nie narkotyzowałem się lekami.",
            "Ja nigdy nie miałem wątpliwości co do mojej orientacji.",
            "Ja nigdy nie miałem żalu do swoich rodziców.",
            "Ja nigdy nie uważałem któregoś z moich domowników za chorego psychicznie.",
            "Ja nigdy nie miałem pękniętej prezerwatywy.",
            "Ja nigdy nie piłem czyjegoś alkoholu bez jego wiedzy.",
            "Ja nigdy nie spaliłem jedzenia.",
            "Ja nigdy nie spadłem ze schodów.",
            "Ja nigdy nie straciłem dużej ilości pieniędzy.",
            "Ja nigdy nie zostałem okradziony.",
            "Ja nigdy nie podrywałem nauczyciela.",
            "Ja nigdy nie miałem diety.",
            "Ja nigdy nie postanowiłem że od następnego dnia zmienię swoje życie.",
            "Ja nigdy nie czułem się bardzo samotny.",
            "Ja nigdy nie spóźniłem się na ważne wydarzenie.",
            "Ja nigdy nie miałem lęku z którym nie potrafię wygrać.",
            "Ja nigdy nie byłem w toksycznym związku.",
            "Ja nigdy nie zasnąłem w kinie/teatrze.",
            "Ja nigdy nie chwaliłem się tym ile mam pieniędzy.",
            "Ja nigdy nie poprosiłem szefa o pożyczkę.",
            "Ja nigdy nie upomniałem się od szefa o pieniądze.",
            "Ja nigdy nie odkładałem niczego na ostatnią chwilę.",
            "Ja nigdy się nie zgubiłem.",
            "Ja nigdy nie chodziłem głodny bo nie miałem pieniędzy na jedzenie.",
            "Ja nigdy nie zrobiłem czegoś czego do tej pory żałuję.",
            "Ja nigdy nie udawałem że piszę w telefonie żeby uniknąć czyjegoś wzroku.",
            "Ja nigdy nie miałem takiej osoby której nie potrafię wybaczyć.",
            "Ja nigdy nie uprawiałem seksu grupowego.",
            "Ja nigdy nie oszukiwałem w grach.",
            "Ja nigdy nie żałowałem mojego kierunku na studiach.",
            "Ja nigdy nie się nie zatrzasnąłem.",
            "Ja nigdy nie miałem wrażenia że tracę czas oglądając serial.",
            "Ja nigdy nie miałem niespełnionego marzenia z dzieciństwa.",
            "Ja nigdy nie miałem myśli samobójczych.",
            "Ja nigdy nie miałem wrażenia że jestem chory psychicznie.",
            "Ja nigdy nie uprawiałem seksu oralnego.",
            "Ja nigdy nie miałem partnera seksualnego tylko na jedną noc.",
            "Ja nigdy nie miałem wrażenia że jestem alkoholikiem.",
            "Ja nigdy nie czułem że zawiodłem przyjaciela.",
            "Ja nigdy nie uprawiałem seksu analnego.",
            "Ja nigdy nie podkochiwałem się w kimś spośród grających.",
            "Ja nigdy nie miałem problemu z akceptacją swojego wyglądu.",
            "Ja nigdy nie złamałem prawa.",
            "Ja nigdy nie pracowałem na czarno.",
            "Ja nigdy nie wypowiadałem się na temat o którym nie mam pojęcia.",
            "Ja nigdy nie piłem alkoholu przed 18-stym rokiem życia.",
            "Ja nigdy nie zjadłem robaka.",
            "Ja nigdy nie byłem przerażony na śmierć.",
            "Ja nigdy nie udawałem że kogoś lubię.",
            "Ja nigdy nie byłem o kogoś zazdrosny.",
            "Ja nigdy bardzo za kimś nie tęskniłem.",
            "Ja nigdy nie chciałem wrócić do dzieciństwa.",
            "Ja nigdy nie straciłem kogoś kogo uważałem za przyjaciela.",
            "Ja nigdy nie tańczyłem całą noc.",
            "Ja nigdy nie leżałem ze śmiechu na ziemi.",
            "Ja nigdy nie chwaliłem się czymś czego nie mam lub czego nie osiągnąłem.",
            "Ja nigdy nie chciałem być aktorem.",
            "Ja nigdy nie kochałem się w celebrytce/celebrycie.",
            "Ja nigdy nie pokłóciłem się w klasie z nauczycielem.",
            "Ja nigdy nie musiałem się przebrać bo nie zdążyłem do łazienki.",
            "Ja nigdy nie chodziłem parę dni w tej samej bieliźnie.",
            "Ja nigdy nie zjadłem czegoś po dacie ważności.",
            "Ja nigdy nie miałem wymyślonych przyjaciół.",
            "Ja nigdy nie umawiałem się na randki z wieloma różnymi osobami w tym samym tygodniu.",
            "Ja nigdy nie byłem we friendzone.",
            "Ja nigdy nie obgadywałem mojego przyjaciela.",
            "Ja nigdy nie przewróciłem się w miejscu publicznym.",
            "Ja nigdy nie uratowałem komuś życia.",
            "Ja nigdy nie przegapiłem swojego przystanku przez co pojechałem za daleko.",
            "Ja nigdy nie zachowałem źle wydanej reszty.",
            "Ja nigdy nie chciałem być tak bogaty żeby już nic nie robić.",
            "Ja nigdy nie przespałem lekcji.",
            "Ja nigdy nie symulowałem choroby żeby nie iść do szkoły.",
            "Ja nigdy nie uciekałem przed policją."};
    ArrayList<String> pytania=new ArrayList();

    public String WybierzLosowePytanie()
    {
        if(pytania.size()==0)
        {
            return "Skończyły się pytania!";
        }
        Random los = new Random();
        return pytania.remove(los.nextInt(pytania.size()));
    }
    public Pytania_usage()
    {
        pytania.addAll(Arrays.asList(baza));
    }
}


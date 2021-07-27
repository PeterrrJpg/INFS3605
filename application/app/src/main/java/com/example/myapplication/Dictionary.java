package com.example.myapplication;

import java.util.ArrayList;

public class Dictionary {
    private String engWord;
    private String firstNationsWord;
    private String category;
    private String pronunciation; //

    public Dictionary(String engWord, String firstNationsWord, String category, String pronunciation) {
        this.engWord = engWord;
        this.firstNationsWord = firstNationsWord;
        this.category = category;
        this.pronunciation = pronunciation; //
    }

    public String getEngWord() {
        return engWord;
    }

    public void setEngWord(String engWord) {
        this.engWord = engWord;
    }

    public String getFirstNationsWord() {
        return firstNationsWord;
    }

    public void setFirstNationsWord(String firstNationsWord) {
        this.firstNationsWord = firstNationsWord;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }


    public static ArrayList<Dictionary> getNgunnawal() {
        ArrayList<Dictionary> ngunnawal = new ArrayList<>();
        ngunnawal.add(new Dictionary("man", "murrin", "PEOPLE", "moor-reen"));
        ngunnawal.add(new Dictionary("husband", "ma-uŋ", "PEOPLE", "muh-oong"));
        ngunnawal.add(new Dictionary("clever man / doctor", "muyuluŋ", "PEOPLE", "moo-yoo-loong"));
        ngunnawal.add(new Dictionary("youth", "warrumbul", "PEOPLE", "wur-room-bool"));
        ngunnawal.add(new Dictionary("boy", "bubal", "PEOPLE", "boo-buhl"));
        ngunnawal.add(new Dictionary("elder brother", "dyiddyaŋ", "PEOPLE", "dyeed-dyuhng"));
        ngunnawal.add(new Dictionary("younger brother", "gugan", "PEOPLE", "goo-guhn"));
        ngunnawal.add(new Dictionary("elder sister", "dhadduŋ", "PEOPLE", "dhud-doong"));
        ngunnawal.add(new Dictionary("younger sister", "gulwan", "PEOPLE", "gool-wuhn"));
        ngunnawal.add(new Dictionary("woman", "bullan", "PEOPLE", "bool-luhn"));
        ngunnawal.add(new Dictionary("wife", "man", "PEOPLE", "muhn"));
        ngunnawal.add(new Dictionary("girl", "mullaŋan", "PEOPLE", "mool-lung-uhn"));
        ngunnawal.add(new Dictionary("child", "gudha", "PEOPLE", "goo-dha"));
        ngunnawal.add(new Dictionary("children", "gudhaiar", "PEOPLE", "goo-dhuy-uhr"));
        ngunnawal.add(new Dictionary("head", "guddagaŋ", "HUMAN BODY", "good-dug-gung"));
        ngunnawal.add(new Dictionary("hair", "dherruŋ", "HUMAN BODY", "dher-roong"));
        ngunnawal.add(new Dictionary("eye", "migalaity", "HUMAN BODY", "mee-gul-uy-tee"));
        ngunnawal.add(new Dictionary("nose", "nyigity", "HUMAN BODY", "nyee-gee-tee"));
        ngunnawal.add(new Dictionary("back of neck", "nhun", "HUMAN BODY", "nhoon"));
        ngunnawal.add(new Dictionary("throat", "guddity", "HUMAN BODY", "good-dee-tee"));
        ngunnawal.add(new Dictionary("ear", "guri", "HUMAN BODY", "goo-ree"));
        ngunnawal.add(new Dictionary("mouth", "dhambir", "HUMAN BODY", "dhum-beer"));
        ngunnawal.add(new Dictionary("teeth", "yerra", "HUMAN BODY", "yehr-ruh"));
        ngunnawal.add(new Dictionary("breast", "ŋumminyaŋ", "HUMAN BODY", "ngoom-meen-yuhn"));
        ngunnawal.add(new Dictionary("navel", "nyurra", "HUMAN BODY", "nyoor-ruh"));
        ngunnawal.add(new Dictionary("belly", "bindhi", "HUMAN BODY", "been-dhee"));
        ngunnawal.add(new Dictionary("back", "beŋal", "HUMAN BODY", "beng-uhl"));
        ngunnawal.add(new Dictionary("arm", "nhuruŋ", "HUMAN BODY", "nhoor-oong"));
        ngunnawal.add(new Dictionary("hand", "murraŋga", "HUMAN BODY", "moor-rung-guh"));
        ngunnawal.add(new Dictionary("finger", "yulu", "HUMAN BODY", "yoo-loo"));
        ngunnawal.add(new Dictionary("nail", "birril", "HUMAN BODY", "beer-reel"));
        ngunnawal.add(new Dictionary("thigh", "dhurra", "HUMAN BODY", "dhoor-ruh"));
        ngunnawal.add(new Dictionary("knee", "ŋumuŋ", "HUMAN BODY", "ngoom-oon"));
        ngunnawal.add(new Dictionary("foot", "dyunna", "HUMAN BODY", "dyoon-nuh"));
        ngunnawal.add(new Dictionary("heart", "gauar", "HUMAN BODY", "gow-uhr"));
        ngunnawal.add(new Dictionary("blood", "dyiŋgi", "HUMAN BODY", "dyeeng-gee"));
        ngunnawal.add(new Dictionary("fat", "bewan", "HUMAN BODY", "beh-wun"));
        ngunnawal.add(new Dictionary("bone", "wiak", "HUMAN BODY", "wee-uck"));
        ngunnawal.add(new Dictionary("penis", "dhun", "HUMAN BODY", "dhoon"));
        ngunnawal.add(new Dictionary("testicle", "gurra", "HUMAN BODY", "goor-ruh"));
        ngunnawal.add(new Dictionary("pubic hair", "buruwarri", "HUMAN BODY", "boo-roo-wur-ree"));
        ngunnawal.add(new Dictionary("semen", "buruŋ", "HUMAN BODY", "boo-roong"));
        ngunnawal.add(new Dictionary("vulva", "binnan", "HUMAN BODY", "been-nun"));
        ngunnawal.add(new Dictionary("anus", "dhula", "HUMAN BODY", "dhool-uh"));
        ngunnawal.add(new Dictionary("excrement", "gunuŋ", "HUMAN BODY", "goo-noong"));
        ngunnawal.add(new Dictionary("urine", "dyuŋur", "HUMAN BODY", "dyoong-oor"));
        ngunnawal.add(new Dictionary("venereal", "middyuŋ", "HUMAN BODY", "meed-dyoong"));
        ngunnawal.add(new Dictionary("sun", "winyu", "INANIMATE NATURE", "wee-nyoo"));
        ngunnawal.add(new Dictionary("moon", "kubbadaŋ", "INANIMATE NATURE", "koo-bud-dung"));
        ngunnawal.add(new Dictionary("star", "dyurra", "INANIMATE NATURE", "dyoor-ruh"));
        ngunnawal.add(new Dictionary("pleiades", "dyin-diŋ-gaŋ", "INANIMATE NATURE", "dyeen-deeng-gung"));
        ngunnawal.add(new Dictionary("cloud", "gurraŋ", "INANIMATE NATURE", "goor-run"));
        ngunnawal.add(new Dictionary("sky", "mindyigari", "INANIMATE NATURE", "meen-dyee-gu-ree"));
        ngunnawal.add(new Dictionary("thunder", "muruŋul", "INANIMATE NATURE", "moor-oong-ool"));
        ngunnawal.add(new Dictionary("lightning", "meup-meup", "INANIMATE NATURE", "meh-oop-meh-oop"));
        ngunnawal.add(new Dictionary("rain", "garrit", "INANIMATE NATURE", "gur-rit"));
        ngunnawal.add(new Dictionary("dew", "dyiŋidyirraŋ", "INANIMATE NATURE", "dyeeng-gyir-run"));
        ngunnawal.add(new Dictionary("frost", "dhugguru", "INANIMATE NATURE", "dhoog-goo-roo"));
        ngunnawal.add(new Dictionary("water", "ŋadyuŋ", "INANIMATE NATURE", "ngu-dyoong"));
        ngunnawal.add(new Dictionary("ground", "dhaura", "INANIMATE NATURE", "dhow-ruh"));
        ngunnawal.add(new Dictionary("dust", "dhuŋul", "INANIMATE NATURE", "dhoong-ool"));
        ngunnawal.add(new Dictionary("mud", "muruŋ", "INANIMATE NATURE", "moo-roong"));
        ngunnawal.add(new Dictionary("stone", "gurbuŋ", "INANIMATE NATURE", "goor-boong"));
        ngunnawal.add(new Dictionary("sand", "dyardyar", "INANIMATE NATURE", "dyuhr-dyuhr"));
        ngunnawal.add(new Dictionary("charcoal", "murruŋga", "INANIMATE NATURE", "moor-roong-guh"));
        ngunnawal.add(new Dictionary("light", "dhurrawaŋ", "INANIMATE NATURE", "dhoor-ruw-wun"));
        ngunnawal.add(new Dictionary("darkness", "buranya", "INANIMATE NATURE", "boo-run-yuh"));
        ngunnawal.add(new Dictionary("heat", "gunnama", "INANIMATE NATURE", "goon-num-muh"));
        ngunnawal.add(new Dictionary("cold", "gurrita", "INANIMATE NATURE", "goor-ree-tuh"));
        ngunnawal.add(new Dictionary("dawn", "birrimbigaŋ", "INANIMATE NATURE", "beer-rim-bee-gun"));
        ngunnawal.add(new Dictionary("fire", "kanbi", "INANIMATE NATURE", "kun-bee"));
        ngunnawal.add(new Dictionary("smoke", "muril", "INANIMATE NATURE", "moo-reel"));
        ngunnawal.add(new Dictionary("food(flesh)", "ŋulli", "INANIMATE NATURE", "ngool-lee"));
        ngunnawal.add(new Dictionary("food(vegetable)", "dyaraban", "INANIMATE NATURE", "gyur-ru-bun"));
        ngunnawal.add(new Dictionary("flower", "gamburra", "INANIMATE NATURE", "gum-boor-ruh"));
        ngunnawal.add(new Dictionary("day", "bural", "INANIMATE NATURE", "boo-rul"));
        ngunnawal.add(new Dictionary("night", "kagu", "INANIMATE NATURE", "kuh-goo"));
        ngunnawal.add(new Dictionary("dusk", "dyirraŋgan", "INANIMATE NATURE", "dyeer-rung-gun"));
        ngunnawal.add(new Dictionary("grass", "gurwai", "INANIMATE NATURE", "goor-wye"));
        ngunnawal.add(new Dictionary("leaf", "dyirraŋ", "INANIMATE NATURE", "dyeer-rung"));
        ngunnawal.add(new Dictionary("egg", "kubbugaŋ", "INANIMATE NATURE", "koob-boo-gun"));
        ngunnawal.add(new Dictionary("honey", "kauaŋgal", "INANIMATE NATURE", "kow-ung-gul"));
        ngunnawal.add(new Dictionary("camp", "ŋuru", "INANIMATE NATURE", "ngoo-roo"));
        ngunnawal.add(new Dictionary("shadow of tree", "kumburu", "INANIMATE NATURE", "koom-boo-roo"));
        ngunnawal.add(new Dictionary("shadow of man", "buak", "INANIMATE NATURE", "boo-uck"));
        ngunnawal.add(new Dictionary("summer", "winyuwaŋga", "INANIMATE NATURE", "win-yoo-wung-guh"));
        ngunnawal.add(new Dictionary("winter", "magarawaŋga", "INANIMATE NATURE", "muh-guh-ruh-wung-guh"));
        ngunnawal.add(new Dictionary("koala", "gurabun, gula", "MAMMAL", "goo-ru-boon, goo-luh"));
        ngunnawal.add(new Dictionary("dog", "mirri", "MAMMAL", "mir-ree"));
        ngunnawal.add(new Dictionary("possum", "wille", "MAMMAL", "weel-leh"));
        ngunnawal.add(new Dictionary("kangaroo rat", "balbu", "MAMMAL", "bul-boo"));
        ngunnawal.add(new Dictionary("native cat", "murugun", "MAMMAL", "moo-roo-goon"));
        ngunnawal.add(new Dictionary("bandicoot", "mundawari", "MAMMAL", "moon-duh-wuh-ree"));
        ngunnawal.add(new Dictionary("small rat", "gunnimaŋ", "MAMMAL", "goon-nee-mung"));
        ngunnawal.add(new Dictionary("wallaby", "burrai", "MAMMAL", "boor-rye"));
        ngunnawal.add(new Dictionary("edchina", "burugun", "MAMMAL", "boo-roo-goon"));
        ngunnawal.add(new Dictionary("kangaroo", "buru", "MAMMAL", "boo-roo"));
        ngunnawal.add(new Dictionary("platypus", "maluŋgaŋ", "MAMMAL", "muh-loong-gun"));
        ngunnawal.add(new Dictionary("flying squirrel", "baŋgu", "MAMMAL", "bung-goo"));
        ngunnawal.add(new Dictionary("bat", "ŋuddya-ŋuddyan", "MAMMAL", "ngood-dyuh-ngood-dyun"));
        ngunnawal.add(new Dictionary("bird", "budyan", "BIRD", "boo-dyun"));
        ngunnawal.add(new Dictionary("crow", "wagulan", "BIRD", "wuh-goo-lun"));
        ngunnawal.add(new Dictionary("swan", "dyinyuk", "BIRD", "dyeen-yook"));
        ngunnawal.add(new Dictionary("kookaburra", "guginyal", "BIRD", "goo-gee-nyul"));
        ngunnawal.add(new Dictionary("eaglehawk", "mulleun", "BIRD", "mool-leh-oon"));
        ngunnawal.add(new Dictionary("magpie", "karrugaŋ", "BIRD", "kur-roo-gung"));
        ngunnawal.add(new Dictionary("owl", "binit-binit", "BIRD", "bee-neet-bee-neet"));
        ngunnawal.add(new Dictionary("parrot", "bunduluk", "BIRD", "boon-doo-look"));
        ngunnawal.add(new Dictionary("crane", "galu", "BIRD", "guh-loo"));
        ngunnawal.add(new Dictionary("pheasant", "dyagula", "BIRD", "dyuh-goo-luh"));
        ngunnawal.add(new Dictionary("perch", "dhinŋur", "FISH", "dheen-ngoor"));
        ngunnawal.add(new Dictionary("herring", "berrumbunnuŋ", "FISH", "bear-room-boon-noong"));
        ngunnawal.add(new Dictionary("eel", "yumba", "FISH", "yoom-buh"));
        ngunnawal.add(new Dictionary("gudgeon", "budaŋ", "FISH", "boo-dung"));
        ngunnawal.add(new Dictionary("water iguana", "dhurrawarri", "REPTILE", "dhoor-ruh-wur-ree"));
        ngunnawal.add(new Dictionary("frog", "dyirrigurat", "REPTILE", "dyeer-ree-goo-rut"));
        ngunnawal.add(new Dictionary("river lizard", "biddyiwaŋ", "REPTILE", "bid-dyee-wung"));
        ngunnawal.add(new Dictionary("tree goanna", "wirria", "REPTILE", "weer-ree-uh"));
        ngunnawal.add(new Dictionary("sleepy lizard", "muggadhaŋ", "REPTILE", "moog-gu-dhung"));
        ngunnawal.add(new Dictionary("small lizard", "bunburuŋ", "REPTILE", "boon-boo-roong"));
        ngunnawal.add(new Dictionary("death adder", "muddyawit", "REPTILE", "mood-dyuh-weet"));
        ngunnawal.add(new Dictionary("turtle", "gudamaŋ", "REPTILE", "goo-duh-mung"));
        ngunnawal.add(new Dictionary("carpet snake", "wagur", "REPTILE", "wuh-goor"));
        ngunnawal.add(new Dictionary("tree snake", "mulundyuluŋ", "REPTILE", "moo-loon-dyoo-loong"));
        ngunnawal.add(new Dictionary("tree", "ŋulla", "PLANT", "ngoo-luh"));
        ngunnawal.add(new Dictionary("pine", "buggumbul", "PLANT", "boog-goom-bool"));
        ngunnawal.add(new Dictionary("oak", "dulwa", "PLANT", "dool-wuh"));
        ngunnawal.add(new Dictionary("cherry tree", "mummadya", "PLANT", "moom-mud-dyuh"));
        ngunnawal.add(new Dictionary("honeysuckle", "dhulwa", "PLANT", "dhool-wuh"));
        ngunnawal.add(new Dictionary("ironbark", "thirriwirri", "PLANT", "theer-ree-weer-ree"));
        ngunnawal.add(new Dictionary("stingybark", "burin", "PLANT", "boo-reeng"));
        ngunnawal.add(new Dictionary("belrushes", "gummiuk", "PLANT", "goom-mee-ook"));
        ngunnawal.add(new Dictionary("gum tree", "yerradhaŋ", "PLANT", "yer-ruh-dhung"));
        ngunnawal.add(new Dictionary("wattle", "nummerak", "PLANT", "noom-mer-ruck"));
        ngunnawal.add(new Dictionary("tomahawk", "mundubaŋ", "WEAPON & UTENSIL", "moon-doo-bung"));
        ngunnawal.add(new Dictionary("spear", "dyuin", "WEAPON & UTENSIL", "dyoo-een"));
        ngunnawal.add(new Dictionary("spear shield", "bimbiaŋ", "WEAPON & UTENSIL", "beem-bee-ung"));
        ngunnawal.add(new Dictionary("boomerang", "berrà", "WEAPON & UTENSIL", "ber-ruh"));
        ngunnawal.add(new Dictionary("net bag", "goan", "WEAPON & UTENSIL", "goh-un"));
        ngunnawal.add(new Dictionary("canoe", "mundaŋ", "WEAPON & UTENSIL", "moon-dung"));
        ngunnawal.add(new Dictionary("headband", "gamban", "WEAPON & UTENSIL", "gum-bun"));
        ngunnawal.add(new Dictionary("kilt", "burran", "WEAPON & UTENSIL", "boor-run"));
        ngunnawal.add(new Dictionary("yamstick", "gaualaŋ", "WEAPON & UTENSIL", "gow-oo-ul-lung"));
        ngunnawal.add(new Dictionary("alive", "mulaŋgari", "ADJECTIVE", "moo-lung-guh-ree"));
        ngunnawal.add(new Dictionary("dead", "burrakbaŋ", "ADJECTIVE", "boor-ruck-bung"));
        ngunnawal.add(new Dictionary("large", "buggarabaug", "ADJECTIVE", "boog-guh-ruh-buh-oog"));
        ngunnawal.add(new Dictionary("small", "nyerriguraŋ", "ADJECTIVE", "nyer-ree-goo-rung"));
        ngunnawal.add(new Dictionary("tall", "bamir", "ADJECTIVE", "buh-meer"));
        ngunnawal.add(new Dictionary("low", "guŋur", "ADJECTIVE", "goo-ngoor"));
        ngunnawal.add(new Dictionary("good", "yedduŋ", "ADJECTIVE", "yed-doong"));
        ngunnawal.add(new Dictionary("bad", "gudba", "ADJECTIVE", "good-buh"));
        ngunnawal.add(new Dictionary("red", "dhirrum", "ADJECTIVE", "dheer-room"));
        ngunnawal.add(new Dictionary("white", "duggurugurak", "ADJECTIVE", "doog-goo-roo-goo-ruck"));
        ngunnawal.add(new Dictionary("black", "buru", "ADJECTIVE", "boo-roo"));
        ngunnawal.add(new Dictionary("mad", "gauaŋ", "ADJECTIVE", "guh-oo-ung"));
        ngunnawal.add(new Dictionary("crazy", "yugi-yugaŋ", "ADJECTIVE", "yoo-gee-yoo-gung"));
        ngunnawal.add(new Dictionary("stubborn", "wambaruŋ", "ADJECTIVE", "wum-buh-roong"));
        ngunnawal.add(new Dictionary("quick", "burrai", "ADJECTIVE", "boor-rye"));
        ngunnawal.add(new Dictionary("slow", "gunyan", "ADJECTIVE", "goon-yun"));
        ngunnawal.add(new Dictionary("strong", "yurwaŋ", "ADJECTIVE", "yoor-wung"));
        ngunnawal.add(new Dictionary("tired", "yurrity", "ADJECTIVE", "yoor-ree-tee"));
        ngunnawal.add(new Dictionary("sharp", "midyir-midyir", "ADJECTIVE", "mee-dyeer-mee-dyeer"));
        ngunnawal.add(new Dictionary("mad", "gauaŋ", "ADJECTIVE", "guh-oo-ung"));
        ngunnawal.add(new Dictionary("fat", "bewanbaŋ", "ADJECTIVE", "beh-wun-bung"));
        ngunnawal.add(new Dictionary("skinny", "ŋauatyba", "ADJECTIVE", "nguh-oo-ah-tee-buh"));
        ngunnawal.add(new Dictionary("hot", "winyudha", "ADJECTIVE", "wee-nyoo-dhuh"));
        ngunnawal.add(new Dictionary("cold", "gurrit", "ADJECTIVE", "goor-reet"));
        /*ngunnawal.add(new Dictionary("skinny", "ŋauatyba", "ADJECTIVE"));*/ //repeated word
        ngunnawal.add(new Dictionary("angry", "yugo", "ADJECTIVE", "yoo-goh"));
        ngunnawal.add(new Dictionary("sleepy", "guŋ-guŋ", "ADJECTIVE", "goong-goong"));
        ngunnawal.add(new Dictionary("sorry", "ŋaralda", "ADJECTIVE", "nguh-ruhl-duh"));
        ngunnawal.add(new Dictionary("greedy", "merradhin", "ADJECTIVE", "mer-ruh-dheen"));
        ngunnawal.add(new Dictionary("sick", "ger", "ADJECTIVE", "ger"));
        ngunnawal.add(new Dictionary("true", "gundyaina", "ADJECTIVE", "goon-dyuh-ee-nuh"));
        ngunnawal.add(new Dictionary("pregnant", "maliŋilimaŋ", "ADJECTIVE", "muh-lee-ngee-lee-mung"));
        ngunnawal.add(new Dictionary("little", "muiŋgaŋ", "ADJECTIVE", "moo-eeng-gung"));
        ngunnawal.add(new Dictionary("much", "guruŋ", "ADJECTIVE", "goo-roong"));
        ngunnawal.add(new Dictionary("stinking", "buguŋ", "ADJECTIVE", "boo-goong"));
        ngunnawal.add(new Dictionary("glad", "waddhir", "ADJECTIVE", "wud-dheer"));
        ngunnawal.add(new Dictionary("die", "berak", "VERB", "ber-ruck"));
        ngunnawal.add(new Dictionary("eat", "dhaimbaliri", "VERB", "dhuh-eem-buh-lee-ree"));
        ngunnawal.add(new Dictionary("drink", "wimbaliri", "VERB", "weem-buh-lee-ree"));
        ngunnawal.add(new Dictionary("sleep", "ŋambori", "VERB", "ngum-boh-ree"));
        ngunnawal.add(new Dictionary("stand", "dharri-iri", "VERB", "dhur-ree-ee-ree"));
        ngunnawal.add(new Dictionary("sit", "ŋulla-iri", "VERB", "ngool-luh-ee-ree"));
        ngunnawal.add(new Dictionary("talk", "dhuniai", "VERB", "dhoo-nee-uh-ee"));
        ngunnawal.add(new Dictionary("tell", "dhuniuŋ", "VERB", "dhoo-nee-oong"));
        ngunnawal.add(new Dictionary("walk", "yerrabi", "VERB", "yer-ruh-bee"));
        ngunnawal.add(new Dictionary("run", "munni", "VERB", "moon-nee"));
        ngunnawal.add(new Dictionary("bring", "munnagali", "VERB", "moon-nuh-guh-lee"));
        ngunnawal.add(new Dictionary("take", "mali", "VERB", "muh-lee"));
        ngunnawal.add(new Dictionary("make", "buŋi", "VERB", "boo-ngee"));
        ngunnawal.add(new Dictionary("break", "mudyat", "VERB", "moo-dyut"));
        ngunnawal.add(new Dictionary("beat", "ŋubi", "VERB", "ngoo-bee"));
        ngunnawal.add(new Dictionary("see", "naŋi", "VERB", "nuh-ngee"));
        ngunnawal.add(new Dictionary("cook", "dyandai", "VERB", "dyun-duh-ee"));
        ngunnawal.add(new Dictionary("hear", "ŋurrambai", "VERB", "ngoor-rum-buh-ee"));
        ngunnawal.add(new Dictionary("steal", "gurraŋi", "VERB", "goor-ruh-ngee"));
        ngunnawal.add(new Dictionary("sing", "yuŋgaballi", "VERB", "yoong-guh-bul-lee"));
        ngunnawal.add(new Dictionary("cry", "nyimali", "VERB", "nyee-muh-lee"));
        ngunnawal.add(new Dictionary("climb", "bui-i", "VERB", "boo-ee-ee"));
        ngunnawal.add(new Dictionary("forget", "walagi", "VERB", "wuh-luh-gee"));
        ngunnawal.add(new Dictionary("send", "iddyi", "VERB", "eed-dyee"));
        ngunnawal.add(new Dictionary("swim", "yerra", "VERB", "yer-ruh"));
        ngunnawal.add(new Dictionary("smell", "billai", "VERB", "beel-luh-ee"));
        ngunnawal.add(new Dictionary("bite", "burri", "VERB", "boor-ree"));
        ngunnawal.add(new Dictionary("touch", "muŋga-ir", "VERB", "moong-guh-eer"));
        ngunnawal.add(new Dictionary("whistle", "windi", "VERB", "ween-dee"));
        ngunnawal.add(new Dictionary("vomit", "windi", "VERB", "ween-dee"));
        ngunnawal.add(new Dictionary("dance", "wagi", "VERB", "wuh-gee"));
        ngunnawal.add(new Dictionary("hunt", "gadali", "VERB", "guh-duh-lee"));
        ngunnawal.add(new Dictionary("burn", "gunnami", "VERB", "goon-nuh-mee"));
        ngunnawal.add(new Dictionary("chop", "gudbaiiri", "VERB", "good-buh-ee-ee-ree"));
        ngunnawal.add(new Dictionary("laugh", "birrigai", "VERB", "beer-ree-guh-ee"));
        ngunnawal.add(new Dictionary("conceal", "buddai", "VERB", "bood-duh-ee"));
        return ngunnawal;
    }

    public static ArrayList<Dictionary> getNgarigo() {
        ArrayList<Dictionary> ngarigo = new ArrayList<>();
        ngarigo.add(new Dictionary("man", "marinj", "PEOPLE", "muh-reenj"));
        ngarigo.add(new Dictionary("doctor", "budira", "PEOPLE", "boo-dee-ruh"));
        ngarigo.add(new Dictionary("boy", "burubal", "PEOPLE", "boo-roo-bul"));
        ngarigo.add(new Dictionary("elder brother", "djidjaŋ", "PEOPLE", "djee-djung"));
        ngarigo.add(new Dictionary("younger brother", "duŋan", "PEOPLE", "doo-ngun"));
        ngarigo.add(new Dictionary("elder sister", "ŋaman", "PEOPLE", "nguh-mun"));
        ngarigo.add(new Dictionary("younger sister", "galan", "PEOPLE", "guh-lun"));
        ngarigo.add(new Dictionary("woman", "balan", "PEOPLE", "buh-lun"));
        ngarigo.add(new Dictionary("girl", "malaŋan", "PEOPLE", "muh-luh-ngun"));
        ngarigo.add(new Dictionary("killer", "dulugal", "PEOPLE", "doo-loo-gul"));
        ngarigo.add(new Dictionary("aunt", "gudaŋ", "PEOPLE", "goo-dung"));
        ngarigo.add(new Dictionary("cousin", "landjagan", "PEOPLE", "lun-djuh-gun"));
        ngarigo.add(new Dictionary("bearded man", "djira-wadj", "PEOPLE", "djee-ruh-wudj"));
        ngarigo.add(new Dictionary("cousin", "landjagan", "PEOPLE", "lun-djuh-gun"));
        ngarigo.add(new Dictionary("uncle", "ganj", "PEOPLE", "gunj"));
        ngarigo.add(new Dictionary("grandfather", "ŋabuŋ", "PEOPLE", "nguh-boong"));
        ngarigo.add(new Dictionary("white man", "wadjbala", "PEOPLE", "wudj-buh-luh"));
        ngarigo.add(new Dictionary("white boy", "wadjbaga", "PEOPLE", "wudj-buh-guh"));
        ngarigo.add(new Dictionary("white woman", "wadjimin", "PEOPLE", "wuh-djee-meen"));
        ngarigo.add(new Dictionary("teenager", "yaŋai", "PEOPLE", "yuh-nguy"));
        ngarigo.add(new Dictionary("grandfather", "ŋabuŋ", "PEOPLE", "nguh-boong"));
        ngarigo.add(new Dictionary("policeman", "gandjawan", "PEOPLE", "gun-djuh-wun"));
        ngarigo.add(new Dictionary("head", "gadagan", "HUMAN BODY", "guh-duh-gun"));
        ngarigo.add(new Dictionary("hair", "yaruŋ", "HUMAN BODY", "yuh-roong"));
        ngarigo.add(new Dictionary("face", "mragin", "HUMAN BODY", "mruh-geen"));
        ngarigo.add(new Dictionary("eye", "gundul", "HUMAN BODY", "goon-dool"));
        ngarigo.add(new Dictionary("nose", "guŋ", "HUMAN BODY", "goong"));
        ngarigo.add(new Dictionary("neck", "biŋil", "HUMAN BODY", "bee-ngeel"));
        ngarigo.add(new Dictionary("throat", "dulidj", "HUMAN BODY", "doo-leedj"));
        ngarigo.add(new Dictionary("ear", "dulidj", "HUMAN BODY", "doo-leedj"));
        ngarigo.add(new Dictionary("mouth", "munda", "HUMAN BODY", "moon-duh"));
        ngarigo.add(new Dictionary("breast", "miŋgun", "HUMAN BODY", "meeng-goon"));
        ngarigo.add(new Dictionary("teeth", "njandug", "HUMAN BODY", "njun-doog"));
        ngarigo.add(new Dictionary("foot", "djinaŋ", "HUMAN BODY", "djee-nung"));
        ngarigo.add(new Dictionary("fat", "bri", "HUMAN BODY", "bree"));
        ngarigo.add(new Dictionary("urine", "djuŋur", "HUMAN BODY", "djoo-ngoor"));
        ngarigo.add(new Dictionary("saliva", "djuŋur", "HUMAN BODY", "djoo-ngoor"));
        ngarigo.add(new Dictionary("sun", "djaua", "INANIMATE NATURE", "djuh-oo-uh"));
        ngarigo.add(new Dictionary("moon", "buriga", "INANIMATE NATURE", "boo-ree-guh"));
        ngarigo.add(new Dictionary("thunder", "miribi", "INANIMATE NATURE", "mee-ree-bee"));
        ngarigo.add(new Dictionary("lightning", "malub", "INANIMATE NATURE", "muh-loob"));
        ngarigo.add(new Dictionary("rain", "bana", "INANIMATE NATURE", "buh-nuh"));
        ngarigo.add(new Dictionary("thunderstorm", "bulburai", "INANIMATE NATURE", "bool-boo-rye"));
        ngarigo.add(new Dictionary("water", "bubul", "INANIMATE NATURE", "boo-bool"));
        ngarigo.add(new Dictionary("creek", "manaŋ", "INANIMATE NATURE", "muh-nung"));
        ngarigo.add(new Dictionary("stream", "djuraŋ", "INANIMATE NATURE", "djoo-rung"));
        ngarigo.add(new Dictionary("ground", "biman", "INANIMATE NATURE", "bee-mun"));
        ngarigo.add(new Dictionary("stone", "gurubuŋ", "INANIMATE NATURE", "goo-roo-boong"));
        ngarigo.add(new Dictionary("charcoal", "dala", "INANIMATE NATURE", "duh-luh"));
        ngarigo.add(new Dictionary("ash", "brinj", "INANIMATE NATURE", "breenj"));
        ngarigo.add(new Dictionary("fire", "djigun", "INANIMATE NATURE", "djee-goon"));
        ngarigo.add(new Dictionary("smoke", "dumbug", "INANIMATE NATURE", "doom-boog"));
        ngarigo.add(new Dictionary("grasss", "nalug", "INANIMATE NATURE", "nuh-loog"));
        ngarigo.add(new Dictionary("leaves", "gundigan", "INANIMATE NATURE", "goon-dee-gun"));
        ngarigo.add(new Dictionary("honey", "gwaŋgal", "INANIMATE NATURE", "gwung-gul"));
        ngarigo.add(new Dictionary("wood", "galbga", "INANIMATE NATURE", "gulb-guh"));
        ngarigo.add(new Dictionary("snow", "gunuma", "INANIMATE NATURE", "goo-noo-muh"));
        ngarigo.add(new Dictionary("poison", "gurigan", "INANIMATE NATURE", "goo-ree-gun"));
        ngarigo.add(new Dictionary("money", "gurubuŋ", "INANIMATE NATURE", "goo-roo-bong"));
        ngarigo.add(new Dictionary("snow", "gunuma", "INANIMATE NATURE", "goo-noo-muh"));
        ngarigo.add(new Dictionary("koala", "dandial", "MAMMAL", "dun-dee-ul"));
        ngarigo.add(new Dictionary("dog", "mirigan", "MAMMAL", "mee-ree-gun"));
        ngarigo.add(new Dictionary("possum", "wadjan", "MAMMAL", "wuh-djun"));
        ngarigo.add(new Dictionary("kangaroo rat", "dambuluŋ", "MAMMAL", "dum-boo-loong"));
        ngarigo.add(new Dictionary("native cat", "bindjuluŋ", "MAMMAL", "been-djoo-loong"));
        ngarigo.add(new Dictionary("bandicoot", "manjug", "MAMMAL", "mun-joog"));
        ngarigo.add(new Dictionary("kangaroo", "ganjgruŋ", "MAMMAL", "gunj-groong"));
        ngarigo.add(new Dictionary("platypus", "djamalaŋ", "MAMMAL", "djuh-muh-lung"));
        ngarigo.add(new Dictionary("rabbit", "bud", "MAMMAL", "bood"));
        ngarigo.add(new Dictionary("sheep", "djambug", "MAMMAL", "djum-boog"));
        ngarigo.add(new Dictionary("hores", "yaraman", "MAMMAL", "yuh-ruh-mun"));
        ngarigo.add(new Dictionary("bird", "budjan", "BIRD", "boo-djun"));
        ngarigo.add(new Dictionary("kookaburra", "guginjala", "BIRD", "goo-geen-juh-luh"));
        ngarigo.add(new Dictionary("swan", "gunjug", "BIRD", "goon-joog"));
        ngarigo.add(new Dictionary("crane", "nilaŋgan", "BIRD", "nee-lung-gun"));
        ngarigo.add(new Dictionary("grey thrush", "djimaŋal", "BIRD", "gjee-muh-ngul"));
        ngarigo.add(new Dictionary("eel", "galgun", "FISH", "gul-goon"));
        ngarigo.add(new Dictionary("black-fish", "mandja", "FISH", "mun-djuh"));
        ngarigo.add(new Dictionary("small lizard", "djiralgal", "REPTILE", "djee-rul-gul"));
        ngarigo.add(new Dictionary("large lizard", "banburaŋ", "REPTILE", "bun-boo-rung"));
        ngarigo.add(new Dictionary("carpet snake", "djidjigan", "REPTILE", "djee-djee-gun"));
        ngarigo.add(new Dictionary("brown snake", "djuganj", "REPTILE", "djoo-gunj"));
        ngarigo.add(new Dictionary("wattle", "gabira", "PLANT", "guh-bee-ruh"));
        ngarigo.add(new Dictionary("bulrushes", "gamjag", "PLANT", "gum-jug"));
        ngarigo.add(new Dictionary("reeds", "yarunga", "PLANT", "yuh-roon-guh"));
        ngarigo.add(new Dictionary("candlebark", "djua", "PLANT", "djoo-uh"));
        ngarigo.add(new Dictionary("snow gum", "waraganj", "PLANT", "wuh-ruh-gunj"));
        ngarigo.add(new Dictionary("tomahawk", "ŋambaranj", "WEAPON & UTENSIL", "ngum-buh-runj"));
        ngarigo.add(new Dictionary("waddy shield", "ŋamal", "WEAPON & UTENSIL", "nguh-mul"));
        ngarigo.add(new Dictionary("net bag", "badjuŋ", "WEAPON & UTENSIL", "bud-joon"));
        ngarigo.add(new Dictionary("blanket", "bandja", "WEAPON & UTENSIL", "bund-juh"));
        ngarigo.add(new Dictionary("clothes", "bidja", "WEAPON & UTENSIL", "beed-juh"));
        ngarigo.add(new Dictionary("tea", "buŋa", "WEAPON & UTENSIL", "boo-nguh"));
        ngarigo.add(new Dictionary("trousers", "danda", "WEAPON & UTENSIL", "dun-duh"));
        ngarigo.add(new Dictionary("dead", "birug", "ADJECTIVE", "bee-roog"));
        ngarigo.add(new Dictionary("spirit", "birugbanj", "ADJECTIVE", "bee-roog-bunj"));
        ngarigo.add(new Dictionary("ghost", "mugan", "ADJECTIVE", "moo-gun"));
        ngarigo.add(new Dictionary("big", "ŋuyuŋ", "ADJECTIVE", "ngoo-yoong"));
        ngarigo.add(new Dictionary("good", "yalaganj", "ADJECTIVE", "yuh-luh-gunj"));
        ngarigo.add(new Dictionary("bad", "danaŋ", "ADJECTIVE", "duh-nung"));
        ngarigo.add(new Dictionary("stubborn", "gadjaran", "ADJECTIVE", "guh-djuh-run"));
        ngarigo.add(new Dictionary("fat", "bubulug", "ADJECTIVE", "boo-boo-loog"));
        ngarigo.add(new Dictionary("hot", "ŋulma", "ADJECTIVE", "ngool-muh"));
        ngarigo.add(new Dictionary("skinny", "garibal", "ADJECTIVE", "guh-ree-bul"));
        ngarigo.add(new Dictionary("sick", "bubil", "ADJECTIVE", "boo-beel"));
        ngarigo.add(new Dictionary("stinking", "buyuwa", "ADJECTIVE", "boo-yoo-wuh"));
        ngarigo.add(new Dictionary("pregnant", "bugmin", "ADJECTIVE", "boog-meen"));
        ngarigo.add(new Dictionary("deaf", "barariŋ", "ADJECTIVE", "buh-ruh-reeng"));
        ngarigo.add(new Dictionary("empty", "biman", "ADJECTIVE", "bee-mun"));
        ngarigo.add(new Dictionary("ugly", "bimbila", "ADJECTIVES", "beem-bee-luh"));
        ngarigo.add(new Dictionary("sticky", "bragbag", "ADJECTIVE", "brug-bug"));
        ngarigo.add(new Dictionary("dirty", "djiriridj", "ADJECTIVE", "djee-ree-reedj"));
        ngarigo.add(new Dictionary("beautiful", "damaradj", "ADJECTIVE", "duh-muh-rudj"));
        ngarigo.add(new Dictionary("idiot", "waŋan", "ADJECTIVE", "wung-un"));
        ngarigo.add(new Dictionary("hungry", "njaban", "ADJECTIVE", "njuh-bun"));
        ngarigo.add(new Dictionary("cheeky", "biŋgidj", "ADJECTIVE", "beeng-geejd"));
        ngarigo.add(new Dictionary("eat", "dambli", "VERB", "dum-blee"));
        ngarigo.add(new Dictionary("drink", "gulug", "VERB", "goo-loog"));
        ngarigo.add(new Dictionary("sleep", "gabug", "VERB", "guh-boog"));
        ngarigo.add(new Dictionary("sit", "ŋalag", "VERB", "nguh-lug"));
        ngarigo.add(new Dictionary("take", "maŋgai", "VERB", "mung-guh-ee"));
        ngarigo.add(new Dictionary("talk", "bala-bala", "VERB", "buh-luh-buh-luh"));
        ngarigo.add(new Dictionary("look", "dununag", "VERB", "doo-noo-nug"));
        ngarigo.add(new Dictionary("beat", "darag-ŋambi", "VERB", "duh-rug-ngum-bee"));
        ngarigo.add(new Dictionary("stare", "dununag", "VERB", "doo-noo-nug"));
        ngarigo.add(new Dictionary("listen", "dununag", "VERB", "doo-noo-nug"));
        ngarigo.add(new Dictionary("steal", "maŋgai", "VERB", "mung-guh-ee"));
        ngarigo.add(new Dictionary("cry", "gambawali", "VERB", "gum-buh-wuh-lee"));
        ngarigo.add(new Dictionary("jump", "bib-bib", "VERB", "beeb-beeb"));
        ngarigo.add(new Dictionary("dive", "djurug", "VERB", "djoo-roog"));
        ngarigo.add(new Dictionary("vomit", "duruduradj", "VERB", "doo-roo-doo-rudj"));
        ngarigo.add(new Dictionary("kill with evil magic", "ŋaribi", "VERB", "nguh-ree-bee"));
        ngarigo.add(new Dictionary("kill with magic stones", "gagari", "VERB", "guh-guh-ree"));
        ngarigo.add(new Dictionary("fidget", "ŋadjalanj", "VERB", "nguh-djuh-lunj"));
        ngarigo.add(new Dictionary("come here", "burbiyaliga", "PHRASE", "boor-bee-yuh-lee-guh"));
        ngarigo.add(new Dictionary("hey", "gugai", "PHRASE", "goo-guh-ee"));
        ngarigo.add(new Dictionary("you've got no shame", "guin muga", "PHRASE", "goo-een-moo-guh"));
        ngarigo.add(new Dictionary("yes, alright", "guli-gulaba", "PHRASE", "goo-lee-goo-luh-buh"));
        ngarigo.add(new Dictionary("someone is watching you", "gundul-bidjali", "PHRASE", "goon-dool-bee-djuh-lee"));
        ngarigo.add(new Dictionary("good job", "wur", "PHRASE", "woor"));
        ngarigo.add(new Dictionary("look out", "yabiyaliga", "PHRASE", "yuh-bee-yuh-lee-guh"));
        return ngarigo;
    }
}

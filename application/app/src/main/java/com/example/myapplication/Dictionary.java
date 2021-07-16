package com.example.myapplication;

import java.util.ArrayList;

public class Dictionary {
    private String engWord;
    private String firstNationsWord;
    private String category;

    public Dictionary(String engWord, String firstNationsWord, String category) {
        this.engWord = engWord;
        this.firstNationsWord = firstNationsWord;
        this.category = category;
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

    public static ArrayList<Dictionary> getNgunnawal() {
        ArrayList<Dictionary> ngunnawal = new ArrayList<>();
        ngunnawal.add(new Dictionary("man", "murrin", "PEOPLE"));
        ngunnawal.add(new Dictionary("husband", "ma-uŋ", "PEOPLE"));
        ngunnawal.add(new Dictionary("clever man / doctor", "muyuluŋ", "PEOPLE"));
        ngunnawal.add(new Dictionary("youth", "warrumbul", "PEOPLE"));
        ngunnawal.add(new Dictionary("boy", "bubal", "PEOPLE"));
        ngunnawal.add(new Dictionary("elder brother", "dyiddyaŋ", "PEOPLE"));
        ngunnawal.add(new Dictionary("younger brother", "gugan", "PEOPLE"));
        ngunnawal.add(new Dictionary("elder sister", "dhadduŋ", "PEOPLE"));
        ngunnawal.add(new Dictionary("younger sister", "gulwan", "PEOPLE"));
        ngunnawal.add(new Dictionary("woman", "bullan", "PEOPLE"));
        ngunnawal.add(new Dictionary("wife", "man", "PEOPLE"));
        ngunnawal.add(new Dictionary("girl", "mullaŋan", "PEOPLE"));
        ngunnawal.add(new Dictionary("child", "gudha", "PEOPLE"));
        ngunnawal.add(new Dictionary("children", "gudhaiar", "PEOPLE"));
        ngunnawal.add(new Dictionary("head", "guddagaŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("hair", "dherruŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("eye", "migalaity", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("nose", "nyigity", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("back of neck", "nhun", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("throat", "guddity", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("ear", "guri", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("mouth", "dhambir", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("teeth", "yerra", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("breast", "ŋumminyaŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("navel", "nyurra", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("belly", "bindhi", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("back", "beŋal", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("arm", "nhuruŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("hand", "murraŋga", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("finger", "yulu", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("nail", "birril", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("thigh", "dhurra", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("knee", "ŋumuŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("foot", "dyunna", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("heart", "gauar", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("blood", "dyiŋgi", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("fat", "bewan", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("bone", "wiak", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("penis", "dhun", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("testicle", "gurra", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("pubic hair", "buruwarri", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("semen", "buruŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("vulva", "binnan", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("anus", "dhula", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("excrement", "gunuŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("urine", "dyuŋur", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("venereal", "middyuŋ", "HUMAN BODY"));
        ngunnawal.add(new Dictionary("sun", "winyu", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("moon", "kubbadaŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("star", "dyurra", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("pleiades", "dyin-diŋ-gaŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("cloud", "gurraŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("sky", "mindyigari", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("thunder", "muruŋul", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("lightning", "meup-meup", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("rain", "garrit", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("dew", "dyiŋidyirraŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("frost", "dhugguru", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("water", "ŋadyuŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("ground", "dhaura", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("dust", "dhuŋul", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("mud", "muruŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("stone", "gurbuŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("sand", "dyardyar", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("charcoal", "murruŋga", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("light", "dhurrawaŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("darkness", "buranya", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("heat", "gunnama", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("cold", "gurrita", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("dawn", "birrimbigaŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("fire", "kanbi", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("smoke", "muril", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("food(flesh)", "ŋulli", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("food(vegetable)", "dyaraban", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("flower", "gamburra", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("day", "bural", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("night", "kagu", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("dusk", "dyirraŋgan", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("grass", "gurwai", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("leaf", "dyirraŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("egg", "kubbugaŋ", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("honey", "kauaŋgal", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("camp", "ŋuru", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("shadow of tree", "kumburu", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("shadow of man", "buak", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("summer", "winyuwaŋga", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("winter", "magarawaŋga", "INANIMATE NATURE"));
        ngunnawal.add(new Dictionary("koala", "gurabun, gula", "MAMMAL"));
        ngunnawal.add(new Dictionary("dog", "mirri", "MAMMAL"));
        ngunnawal.add(new Dictionary("possum", "wille", "MAMMAL"));
        ngunnawal.add(new Dictionary("kangaroo rat", "balbu", "MAMMAL"));
        ngunnawal.add(new Dictionary("native cat", "murugun", "MAMMAL"));
        ngunnawal.add(new Dictionary("bandicoot", "mundawari", "MAMMAL"));
        ngunnawal.add(new Dictionary("small rat", "gunnimaŋ", "MAMMAL"));
        ngunnawal.add(new Dictionary("wallaby", "burrai", "MAMMAL"));
        ngunnawal.add(new Dictionary("edchina", "burugun", "MAMMAL"));
        ngunnawal.add(new Dictionary("kangaroo", "buru", "MAMMAL"));
        ngunnawal.add(new Dictionary("platypus", "maluŋgaŋ", "MAMMAL"));
        ngunnawal.add(new Dictionary("flying squirrel", "baŋgu", "MAMMAL"));
        ngunnawal.add(new Dictionary("bat", "ŋuddya-ŋuddyan", "MAMMAL"));
        ngunnawal.add(new Dictionary("bird", "budyan", "BIRD"));
        ngunnawal.add(new Dictionary("crow", "wagulan", "BIRD"));
        ngunnawal.add(new Dictionary("swan", "dyinyuk", "BIRD"));
        ngunnawal.add(new Dictionary("kookaburra", "guginyal", "BIRD"));
        ngunnawal.add(new Dictionary("eaglehawk", "mulleun", "BIRD"));
        ngunnawal.add(new Dictionary("magpie", "karrugaŋ", "BIRD"));
        ngunnawal.add(new Dictionary("owl", "binit-binit", "BIRD"));
        ngunnawal.add(new Dictionary("parrot", "bunduluk", "BIRD"));
        ngunnawal.add(new Dictionary("crane", "galu", "BIRD"));
        ngunnawal.add(new Dictionary("pheasant", "dyagula", "BIRD"));
        ngunnawal.add(new Dictionary("perch", "dhinŋur", "FISH"));
        ngunnawal.add(new Dictionary("herring", "berrumbunnuŋ", "FISH"));
        ngunnawal.add(new Dictionary("eel", "yumba", "FISH"));
        ngunnawal.add(new Dictionary("gudgeon", "budaŋ", "FISH"));
        ngunnawal.add(new Dictionary("water iguana", "dhurrawarri", "REPTILE"));
        ngunnawal.add(new Dictionary("frog", "dyirrigurat", "REPTILE"));
        ngunnawal.add(new Dictionary("river lizard", "biddyiwaŋ", "REPTILE"));
        ngunnawal.add(new Dictionary("tree goanna", "wirria", "REPTILE"));
        ngunnawal.add(new Dictionary("sleepy lizard", "muggadhaŋ", "REPTILE"));
        ngunnawal.add(new Dictionary("small lizard", "bunburuŋ", "REPTILE"));
        ngunnawal.add(new Dictionary("death adder", "muddyawit", "REPTILE"));
        ngunnawal.add(new Dictionary("turtle", "gudamaŋ", "REPTILE"));
        ngunnawal.add(new Dictionary("carpet snake", "wagur", "REPTILE"));
        ngunnawal.add(new Dictionary("tree snake", "mulundyuluŋ", "REPTILE"));
        ngunnawal.add(new Dictionary("tree", "ŋulla", "PLANT"));
        ngunnawal.add(new Dictionary("pine", "buggumbul", "PLANT"));
        ngunnawal.add(new Dictionary("oak", "dulwa", "PLANT"));
        ngunnawal.add(new Dictionary("cherry tree", "mummadya", "PLANT"));
        ngunnawal.add(new Dictionary("honeysuckle", "dhulwa", "PLANT"));
        ngunnawal.add(new Dictionary("ironbark", "thirriwirri", "PLANT"));
        ngunnawal.add(new Dictionary("stingybark", "burin", "PLANT"));
        ngunnawal.add(new Dictionary("belrushes", "gummiuk", "PLANT"));
        ngunnawal.add(new Dictionary("gum tree", "yerradhaŋ", "PLANT"));
        ngunnawal.add(new Dictionary("wattle", "nummerak", "PLANT"));
        ngunnawal.add(new Dictionary("tomahawk", "mundubaŋ", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("spear", "dyuin", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("spear", "dyuin", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("spear shield", "bimbiaŋ", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("boomerang", "berrà", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("net bag", "goan", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("canoe", "mundaŋ", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("headband", "gamban", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("kilt", "burran", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("yamstick", "gaualaŋ", "WEAPON & UTENSIL"));
        ngunnawal.add(new Dictionary("alive", "mulaŋgari", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("dead", "burrakbaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("large", "buggarabaug", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("small", "nyerriguraŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("tall", "bamir", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("low", "guŋur", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("good", "yedduŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("bad", "gudba", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("red", "dhirrum", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("white", "duggurugurak", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("black", "buru", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("mad", "gauaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("crazy", "yugi-yugaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("stubborn", "wambaruŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("quick", "burrai", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("slow", "gunyan", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("strong", "yurwaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("tired", "yurrity", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("sharp", "midyir-midyir", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("mad", "gauaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("fat", "bewanbaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("skinny", "ŋauatyba", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("hot", "winyudha", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("cold", "gurrit", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("skinny", "ŋauatyba", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("angry", "yugo", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("sleepy", "guŋ-guŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("sorry", "ŋaralda", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("greedy", "merradhin", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("sick", "ger", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("true", "gundyaina", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("pregnant", "maliŋilimaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("little", "muiŋgaŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("much", "guruŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("stinking", "buguŋ", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("glad", "waddhir", "ADJECTIVE"));
        ngunnawal.add(new Dictionary("die", "berak", "VERB"));
        ngunnawal.add(new Dictionary("eat", "dhaimbaliri", "VERB"));
        ngunnawal.add(new Dictionary("drink", "wimbaliri", "VERB"));
        ngunnawal.add(new Dictionary("sleep", "ŋambori", "VERB"));
        ngunnawal.add(new Dictionary("stand", "dharri-iri", "VERB"));
        ngunnawal.add(new Dictionary("sit", "ŋulla-iri", "VERB"));
        ngunnawal.add(new Dictionary("talk", "dhuniai", "VERB"));
        ngunnawal.add(new Dictionary("tell", "dhuniuŋ", "VERB"));
        ngunnawal.add(new Dictionary("walk", "yerrabi", "VERB"));
        ngunnawal.add(new Dictionary("run", "munni", "VERB"));
        ngunnawal.add(new Dictionary("bring", "munnagali", "VERB"));
        ngunnawal.add(new Dictionary("take", "mali", "VERB"));
        ngunnawal.add(new Dictionary("make", "buŋi", "VERB"));
        ngunnawal.add(new Dictionary("break", "mudyat", "VERB"));
        ngunnawal.add(new Dictionary("beat", "ŋubi", "VERB"));
        ngunnawal.add(new Dictionary("see", "naŋi", "VERB"));
        ngunnawal.add(new Dictionary("cook", "dyandai", "VERB"));
        ngunnawal.add(new Dictionary("hear", "ŋurrambai", "VERB"));
        ngunnawal.add(new Dictionary("steal", "gurraŋi", "VERB"));
        ngunnawal.add(new Dictionary("sing", "yuŋgaballi", "VERB"));
        ngunnawal.add(new Dictionary("cry", "nyimali", "VERB"));
        ngunnawal.add(new Dictionary("climb", "bui-i", "VERB"));
        ngunnawal.add(new Dictionary("forget", "walagi", "VERB"));
        ngunnawal.add(new Dictionary("send", "iddyi", "VERB"));
        ngunnawal.add(new Dictionary("swim", "yerra", "VERB"));
        ngunnawal.add(new Dictionary("smell", "billai", "VERB"));
        ngunnawal.add(new Dictionary("bite", "burri", "VERB"));
        ngunnawal.add(new Dictionary("touch", "muŋga-ir", "VERB"));
        ngunnawal.add(new Dictionary("whistle", "windi", "VERB"));
        ngunnawal.add(new Dictionary("vomit", "windi", "VERB"));
        ngunnawal.add(new Dictionary("dance", "wagi", "VERB"));
        ngunnawal.add(new Dictionary("hunt", "gadali", "VERB"));
        ngunnawal.add(new Dictionary("burn", "gunnami", "VERB"));
        ngunnawal.add(new Dictionary("chop", "gudbaiiri", "VERB"));
        ngunnawal.add(new Dictionary("laugh", "birrigai", "VERB"));
        ngunnawal.add(new Dictionary("conceal", "buddai", "VERB"));
        return ngunnawal;
    }
}

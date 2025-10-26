package BTN;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Graph<String, EdgeInfo> BTS_Sukhumvit_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> BSukum1 = BTS_Sukhumvit_Line.insertVertex("Khu Khot");
        Vertex<String> BSukum2 = BTS_Sukhumvit_Line.insertVertex("Yaek Kor Por Aor");
        Vertex<String> BSukum3 = BTS_Sukhumvit_Line.insertVertex("Royal Thai Air Force Museum");
        Vertex<String> BSukum4 = BTS_Sukhumvit_Line.insertVertex("Bhumibol Adulyadej Hospital");
        Vertex<String> BSukum5 = BTS_Sukhumvit_Line.insertVertex("Saphan Mai");
        Vertex<String> BSukum6 = BTS_Sukhumvit_Line.insertVertex("Sai Yud");
        Vertex<String> BSukum7 = BTS_Sukhumvit_Line.insertVertex("Phahon Yothin 59");
        Vertex<String> BSukum8 = BTS_Sukhumvit_Line.insertVertex("Wat Phra Sri Mahathat");
        Vertex<String> BSukum9 = BTS_Sukhumvit_Line.insertVertex("11th Infantry Regiment");
        Vertex<String> BSukum10 = BTS_Sukhumvit_Line.insertVertex("Bang Bua");
        Vertex<String> BSukum11 = BTS_Sukhumvit_Line.insertVertex("Royal Forest Department");
        Vertex<String> BSukum12 = BTS_Sukhumvit_Line.insertVertex("Kasetsart University");
        Vertex<String> BSukum13 = BTS_Sukhumvit_Line.insertVertex("Sena Nikhom");
        Vertex<String> BSukum14 = BTS_Sukhumvit_Line.insertVertex("Ratchayothin");
        Vertex<String> BSukum15 = BTS_Sukhumvit_Line.insertVertex("Phahon Yothin 24");
        Vertex<String> BSukum16 = BTS_Sukhumvit_Line.insertVertex("Ha Yaek Lat Phrao");
        Vertex<String> BSukum17 = BTS_Sukhumvit_Line.insertVertex("Mo Chit");
        Vertex<String> BSukum18 = BTS_Sukhumvit_Line.insertVertex("Saphan Khwai");
        Vertex<String> BSukum19 = BTS_Sukhumvit_Line.insertVertex("Ari");
        Vertex<String> BSukum20 = BTS_Sukhumvit_Line.insertVertex("Sanam Pao");
        Vertex<String> BSukum21 = BTS_Sukhumvit_Line.insertVertex("Victory Monument");
        Vertex<String> BSukum22 = BTS_Sukhumvit_Line.insertVertex("Phaya Thai");
        Vertex<String> BSukum23 = BTS_Sukhumvit_Line.insertVertex("Ratchathewi");
        Vertex<String> BSukum24 = BTS_Sukhumvit_Line.insertVertex("Siam");
        Vertex<String> BSukum25 = BTS_Sukhumvit_Line.insertVertex("Chit Lom ");
        Vertex<String> BSukum26 = BTS_Sukhumvit_Line.insertVertex("Phloen Chit");
        Vertex<String> BSukum27 = BTS_Sukhumvit_Line.insertVertex("Nana");
        Vertex<String> BSukum28 = BTS_Sukhumvit_Line.insertVertex("Asok");
        Vertex<String> BSukum29 = BTS_Sukhumvit_Line.insertVertex("Thong Lo");
        Vertex<String> BSukum30 = BTS_Sukhumvit_Line.insertVertex("Ekkamai");
        Vertex<String> BSukum31 = BTS_Sukhumvit_Line.insertVertex("Phra Khanong");
        Vertex<String> BSukum32 = BTS_Sukhumvit_Line.insertVertex("On Nut");
        Vertex<String> BSukum33 = BTS_Sukhumvit_Line.insertVertex("Bang Chak");
        Vertex<String> BSukum34 = BTS_Sukhumvit_Line.insertVertex("Punnawithi");
        Vertex<String> BSukum35 = BTS_Sukhumvit_Line.insertVertex("Udom Suk");
        Vertex<String> BSukum36 = BTS_Sukhumvit_Line.insertVertex("Bang Na");
        Vertex<String> BSukum37 = BTS_Sukhumvit_Line.insertVertex("Bearing");
        Vertex<String> BSukum38 = BTS_Sukhumvit_Line.insertVertex("Samrong");
        Vertex<String> BSukum39 = BTS_Sukhumvit_Line.insertVertex("Pu Chao");
        Vertex<String> BSukum40 = BTS_Sukhumvit_Line.insertVertex("Chang Erawan");
        Vertex<String> BSukum41 = BTS_Sukhumvit_Line.insertVertex("Royal Thai Naval Academy");
        Vertex<String> BSukum42 = BTS_Sukhumvit_Line.insertVertex("Pak Nam");
        Vertex<String> BSukum43 = BTS_Sukhumvit_Line.insertVertex("Srinagarindra");
        Vertex<String> BSukum44 = BTS_Sukhumvit_Line.insertVertex("Phraek Sa");
        Vertex<String> BSukum45 = BTS_Sukhumvit_Line.insertVertex("Sai Luat");
        Vertex<String> BSukum46 = BTS_Sukhumvit_Line.insertVertex("Kheha");


        BTS_Sukhumvit_Line.insertEdge(BSukum1, BSukum2, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum2, BSukum3, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum3, BSukum4, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum4, BSukum5, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum5, BSukum6, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum6, BSukum7, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum7, BSukum8, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum8, BSukum9, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum9, BSukum10, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum10, BSukum11, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum11, BSukum12, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum12, BSukum13, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum13, BSukum14, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum14, BSukum15, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum15, BSukum16, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum16, BSukum17, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum17, BSukum18, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum18, BSukum19, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum19, BSukum20, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum20, BSukum21, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum21, BSukum22, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum22, BSukum23, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum23, BSukum24, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum24, BSukum25, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum25, BSukum26, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum26, BSukum27, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum27, BSukum28, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum28, BSukum29, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum29, BSukum30, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum30, BSukum31, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum31, BSukum32, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum32, BSukum33, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum33, BSukum34, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum34, BSukum35, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum35, BSukum36, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum36, BSukum37, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum37, BSukum38, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum38, BSukum39, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum39, BSukum40, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum40, BSukum41, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum41, BSukum42, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum42, BSukum43, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum43, BSukum44, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum44, BSukum45, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum45, BSukum46, new EdgeInfo(3, "BTS Sukhumvit Line"));

        BTS_Sukhumvit_Line.insertEdge(BSukum2, BSukum1, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum3, BSukum2, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum4, BSukum3, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum5, BSukum4, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum6, BSukum5, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum7, BSukum6, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum8, BSukum7, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum9, BSukum8, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum10, BSukum9, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum11, BSukum10, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum12, BSukum11, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum13, BSukum12, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum14, BSukum13, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum15, BSukum14, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum16, BSukum15, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum17, BSukum16, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum18, BSukum17, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum19, BSukum18, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum20, BSukum19, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum21, BSukum20, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum22, BSukum21, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum23, BSukum22, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum24, BSukum23, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum25, BSukum24, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum26, BSukum25, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum27, BSukum26, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum28, BSukum27, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum29, BSukum28, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum30, BSukum29, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum31, BSukum30, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum32, BSukum31, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum33, BSukum32, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum34, BSukum33, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum35, BSukum34, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum36, BSukum35, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum37, BSukum36, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum38, BSukum37, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum39, BSukum38, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum40, BSukum39, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum41, BSukum40, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum42, BSukum41, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum43, BSukum42, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum44, BSukum43, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum45, BSukum44, new EdgeInfo(3, "BTS Sukhumvit Line"));
        BTS_Sukhumvit_Line.insertEdge(BSukum46, BSukum45, new EdgeInfo(3, "BTS Sukhumvit Line"));

        Graph<String, EdgeInfo> BTS_Silom_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> BSi1 = BTS_Silom_Line.insertVertex("National Stadium");
        Vertex<String> BSi2 = BTS_Silom_Line.insertVertex("Siam");
        Vertex<String> BSi3 = BTS_Silom_Line.insertVertex("Ratchadamri");
        Vertex<String> BSi4 = BTS_Silom_Line.insertVertex("Sala Daeng");
        Vertex<String> BSi5 = BTS_Silom_Line.insertVertex("Chong Nonsi");
        Vertex<String> BSi6 = BTS_Silom_Line.insertVertex("Saint Louis");
        Vertex<String> BSi7 = BTS_Silom_Line.insertVertex("Surasak");
        Vertex<String> BSi8 = BTS_Silom_Line.insertVertex("Saphan Taksin");
        Vertex<String> BSi9 = BTS_Silom_Line.insertVertex("Krung Thon Buri");
        Vertex<String> BSi10 = BTS_Silom_Line.insertVertex("Wongwian Yai");
        Vertex<String> BSi11 = BTS_Silom_Line.insertVertex("Pho Nimit");
        Vertex<String> BSi12 = BTS_Silom_Line.insertVertex("Talat Phlu");
        Vertex<String> BSi13 = BTS_Silom_Line.insertVertex("Wutthakat");
        Vertex<String> BSi14 = BTS_Silom_Line.insertVertex("Bang Wa");


        BTS_Silom_Line.insertEdge(BSi1, BSi2, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi2, BSi3, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi3, BSi4, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi4, BSi5, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi5, BSi6, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi6, BSi7, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi7, BSi8, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi8, BSi9, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi9, BSi10, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi10, BSi11, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi11, BSi12, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi12, BSi13, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi13, BSi14, new EdgeInfo(3, "BTS Silom Line"));

        BTS_Silom_Line.insertEdge(BSi2, BSi1, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi3, BSi2, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi4, BSi3, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi5, BSi4, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi6, BSi5, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi7, BSi6, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi8, BSi7, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi9, BSi8, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi10, BSi9, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi11, BSi10, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi12, BSi11, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi13, BSi12, new EdgeInfo(3, "BTS Silom Line"));
        BTS_Silom_Line.insertEdge(BSi14, BSi13, new EdgeInfo(3, "BTS Silom Line"));

        Graph<String, EdgeInfo> MRT_Blue_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> MBlue1 = MRT_Blue_Line.insertVertex("Tha Phra");
        Vertex<String> MBlue2 = MRT_Blue_Line.insertVertex("Charan 13");
        Vertex<String> MBlue3 = MRT_Blue_Line.insertVertex("Fai Chai");
        Vertex<String> MBlue4 = MRT_Blue_Line.insertVertex("Bang Khun Non");
        Vertex<String> MBlue5 = MRT_Blue_Line.insertVertex("Bang Yi Khan");
        Vertex<String> MBlue6 = MRT_Blue_Line.insertVertex("Sirindhorn");
        Vertex<String> MBlue7 = MRT_Blue_Line.insertVertex("Bang Phlat");
        Vertex<String> MBlue8 = MRT_Blue_Line.insertVertex("Bang O");
        Vertex<String> MBlue9 = MRT_Blue_Line.insertVertex("Bang Pho");
        Vertex<String> MBlue10 = MRT_Blue_Line.insertVertex("Tao Poon");
        Vertex<String> MBlue11 = MRT_Blue_Line.insertVertex("Bang Sue");
        Vertex<String> MBlue12 = MRT_Blue_Line.insertVertex("Kamphaeng Phet");
        Vertex<String> MBlue13 = MRT_Blue_Line.insertVertex("Chatuchak Park");
        Vertex<String> MBlue14 = MRT_Blue_Line.insertVertex("Phahon Yothin");
        Vertex<String> MBlue15 = MRT_Blue_Line.insertVertex("Lat Phrao");
        Vertex<String> MBlue16 = MRT_Blue_Line.insertVertex("Ratchadaphisek");
        Vertex<String> MBlue17 = MRT_Blue_Line.insertVertex("Sutthisan");
        Vertex<String> MBlue18 = MRT_Blue_Line.insertVertex("Huai Khwang");
        Vertex<String> MBlue19 = MRT_Blue_Line.insertVertex("Thailand Cultural Centre");
        Vertex<String> MBlue20 = MRT_Blue_Line.insertVertex("Phra Ram 9");
        Vertex<String> MBlue21 = MRT_Blue_Line.insertVertex("Phetchaburi");
        Vertex<String> MBlue22 = MRT_Blue_Line.insertVertex("Sukhumvit");
        Vertex<String> MBlue23 = MRT_Blue_Line.insertVertex("Queen Sirikit National Convention Centre");
        Vertex<String> MBlue24 = MRT_Blue_Line.insertVertex("Khlong Toei");
        Vertex<String> MBlue25 = MRT_Blue_Line.insertVertex("Lumphini");
        Vertex<String> MBlue26 = MRT_Blue_Line.insertVertex("Si Lom");
        Vertex<String> MBlue27 = MRT_Blue_Line.insertVertex("Sam Yan");
        Vertex<String> MBlue28 = MRT_Blue_Line.insertVertex("Hua Lamphong");
        Vertex<String> MBlue29 = MRT_Blue_Line.insertVertex("Wat Mangkon");
        Vertex<String> MBlue30 = MRT_Blue_Line.insertVertex("Sam Yot");
        Vertex<String> MBlue31 = MRT_Blue_Line.insertVertex("Sanam Chai");
        Vertex<String> MBlue32 = MRT_Blue_Line.insertVertex("Itsaraphap");
        Vertex<String> MBlue33 = MRT_Blue_Line.insertVertex("Bang Phai");
        Vertex<String> MBlue34 = MRT_Blue_Line.insertVertex("Bang Wa");
        Vertex<String> MBlue35 = MRT_Blue_Line.insertVertex("Phetkasem 48");
        Vertex<String> MBlue36 = MRT_Blue_Line.insertVertex("Phasi Charoen");
        Vertex<String> MBlue37 = MRT_Blue_Line.insertVertex("Bang Khae");
        Vertex<String> MBlue38 = MRT_Blue_Line.insertVertex("Lak Song");

        MRT_Blue_Line.insertEdge(MBlue1, MBlue2, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue2, MBlue3, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue3, MBlue4, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue4, MBlue5, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue5, MBlue6, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue6, MBlue7, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue7, MBlue8, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue8, MBlue9, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue9, MBlue10, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue10, MBlue11, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue11, MBlue12, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue12, MBlue13, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue13, MBlue14, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue14, MBlue15, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue15, MBlue16, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue16, MBlue17, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue17, MBlue18, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue18, MBlue19, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue19, MBlue20, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue20, MBlue21, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue21, MBlue22, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue22, MBlue23, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue23, MBlue24, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue24, MBlue25, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue25, MBlue26, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue26, MBlue27, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue27, MBlue28, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue28, MBlue29, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue29, MBlue30, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue30, MBlue31, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue31, MBlue32, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue32, MBlue1, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue1, MBlue33, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue33, MBlue34, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue34, MBlue35, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue35, MBlue36, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue36, MBlue37, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue37, MBlue38, new EdgeInfo(3, "MRT Blue Line"));

        MRT_Blue_Line.insertEdge(MBlue2, MBlue1, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue3, MBlue2, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue4, MBlue3, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue5, MBlue4, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue6, MBlue5, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue7, MBlue6, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue8, MBlue7, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue9, MBlue8, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue10, MBlue9, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue11, MBlue10, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue12, MBlue11, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue13, MBlue12, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue14, MBlue13, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue15, MBlue14, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue16, MBlue15, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue17, MBlue16, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue18, MBlue17, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue19, MBlue18, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue20, MBlue19, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue21, MBlue20, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue22, MBlue21, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue23, MBlue22, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue24, MBlue23, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue25, MBlue24, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue26, MBlue25, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue27, MBlue26, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue28, MBlue27, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue29, MBlue28, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue30, MBlue29, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue31, MBlue30, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue32, MBlue31, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue1, MBlue32, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue33, MBlue1, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue34, MBlue33, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue35, MBlue34, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue36, MBlue35, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue37, MBlue36, new EdgeInfo(3, "MRT Blue Line"));
        MRT_Blue_Line.insertEdge(MBlue38, MBlue37, new EdgeInfo(3, "MRT Blue Line"));

        Graph<String, EdgeInfo> MRT_Purple_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> MPurple1 = MRT_Purple_Line.insertVertex("Khlong Bang Phai");
        Vertex<String> MPurple2 = MRT_Purple_Line.insertVertex("Talang Bang Yai");
        Vertex<String> MPurple3 = MRT_Purple_Line.insertVertex("Sam Yaek Bang Yai");
        Vertex<String> MPurple4 = MRT_Purple_Line.insertVertex("Bang Phli");
        Vertex<String> MPurple5 = MRT_Purple_Line.insertVertex("Bang Rak Yai");
        Vertex<String> MPurple6 = MRT_Purple_Line.insertVertex("Bang Rak Noi Tha It");
        Vertex<String> MPurple7 = MRT_Purple_Line.insertVertex("Sai Ma");
        Vertex<String> MPurple8 = MRT_Purple_Line.insertVertex("Phra Nang Klao Bridge");
        Vertex<String> MPurple9 = MRT_Purple_Line.insertVertex("Yaek Nonthaburi 1");
        Vertex<String> MPurple10 = MRT_Purple_Line.insertVertex("Bang Krasor");
        Vertex<String> MPurple11 = MRT_Purple_Line.insertVertex("Nonthaburi Civic Center");
        Vertex<String> MPurple12 = MRT_Purple_Line.insertVertex("Ministry of Public Health");
        Vertex<String> MPurple13 = MRT_Purple_Line.insertVertex("Yaek Tiwanon");
        Vertex<String> MPurple14 = MRT_Purple_Line.insertVertex("Wong Sawang");
        Vertex<String> MPurple15 = MRT_Purple_Line.insertVertex("Bang Son");
        Vertex<String> MPurple16 = MRT_Purple_Line.insertVertex("Tao Poon");

        MRT_Purple_Line.insertEdge(MPurple1, MPurple2, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple2, MPurple3, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple3, MPurple4, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple4, MPurple5, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple5, MPurple6, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple6, MPurple7, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple7, MPurple8, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple8, MPurple9, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple9, MPurple10, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple10, MPurple11, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple11, MPurple12, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple12, MPurple13, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple13, MPurple14, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple14, MPurple15, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple15, MPurple16, new EdgeInfo(3, "MRT Purple Line"));

        MRT_Purple_Line.insertEdge(MPurple2, MPurple1, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple3, MPurple2, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple4, MPurple3, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple5, MPurple4, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple6, MPurple5, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple7, MPurple6, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple8, MPurple7, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple9, MPurple8, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple10, MPurple9, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple11, MPurple10, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple12, MPurple11, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple13, MPurple12, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple14, MPurple13, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple15, MPurple14, new EdgeInfo(3, "MRT Purple Line"));
        MRT_Purple_Line.insertEdge(MPurple16, MPurple15, new EdgeInfo(3, "MRT Purple Line"));

        Graph<String, EdgeInfo> Airport_Rail_Link = new AdjacencyMapGraph<>(true);
        Vertex<String> ARL1 = Airport_Rail_Link.insertVertex("Phaya Thai");
        Vertex<String> ARL2 = Airport_Rail_Link.insertVertex("Ratchaprarop");
        Vertex<String> ARL3 = Airport_Rail_Link.insertVertex("Makkasan");
        Vertex<String> ARL4 = Airport_Rail_Link.insertVertex("Ramkhamhaeng");
        Vertex<String> ARL5 = Airport_Rail_Link.insertVertex("Hua Mak");
        Vertex<String> ARL6 = Airport_Rail_Link.insertVertex("Ban Thap Chang");
        Vertex<String> ARL7 = Airport_Rail_Link.insertVertex("Lat Krabang");
        Vertex<String> ARL8 = Airport_Rail_Link.insertVertex("Suvarnabhumi");

        Airport_Rail_Link.insertEdge(ARL1, ARL2, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL2, ARL3, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL3, ARL4, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL4, ARL5, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL5, ARL6, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL6, ARL7, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL7, ARL8, new EdgeInfo(3, "Airport Rail Link"));

        Airport_Rail_Link.insertEdge(ARL2, ARL1, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL3, ARL2, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL4, ARL3, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL5, ARL4, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL6, ARL5, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL7, ARL6, new EdgeInfo(3, "Airport Rail Link"));
        Airport_Rail_Link.insertEdge(ARL8, ARL7, new EdgeInfo(3, "Airport Rail Link"));

        Graph<String, EdgeInfo> MRT_Yellow_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> MYellow1 = MRT_Yellow_Line.insertVertex("Lat Phrao");
        Vertex<String> MYellow2 = MRT_Yellow_Line.insertVertex("Phawana");
        Vertex<String> MYellow3 = MRT_Yellow_Line.insertVertex("Chok Chai 4");
        Vertex<String> MYellow4 = MRT_Yellow_Line.insertVertex("Lat Phrao 71");
        Vertex<String> MYellow5 = MRT_Yellow_Line.insertVertex("Lat Phrao 83");
        Vertex<String> MYellow6 = MRT_Yellow_Line.insertVertex("Mahat Thai");
        Vertex<String> MYellow7 = MRT_Yellow_Line.insertVertex("Lat Phrao 101");
        Vertex<String> MYellow8 = MRT_Yellow_Line.insertVertex("Bang Kapi");
        Vertex<String> MYellow9 = MRT_Yellow_Line.insertVertex("Yaek Lam Sali");
        Vertex<String> MYellow10 = MRT_Yellow_Line.insertVertex("Si Kritha");
        Vertex<String> MYellow11 = MRT_Yellow_Line.insertVertex("Hua Mak");
        Vertex<String> MYellow12 = MRT_Yellow_Line.insertVertex("Kalantan");
        Vertex<String> MYellow13 = MRT_Yellow_Line.insertVertex("Si Nut");
        Vertex<String> MYellow14 = MRT_Yellow_Line.insertVertex("Srinagarindra 38");
        Vertex<String> MYellow15 = MRT_Yellow_Line.insertVertex("Suan Luang Rama IX");
        Vertex<String> MYellow16 = MRT_Yellow_Line.insertVertex("Si Iam");
        Vertex<String> MYellow17 = MRT_Yellow_Line.insertVertex("Si La Salle");
        Vertex<String> MYellow18 = MRT_Yellow_Line.insertVertex("Si Bearing");
        Vertex<String> MYellow19 = MRT_Yellow_Line.insertVertex("Si Dan");
        Vertex<String> MYellow20 = MRT_Yellow_Line.insertVertex("Si Thepha");
        Vertex<String> MYellow21 = MRT_Yellow_Line.insertVertex("Thipphawan");
        Vertex<String> MYellow22 = MRT_Yellow_Line.insertVertex("Samrong");

        MRT_Yellow_Line.insertEdge(MYellow1, MYellow2, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow2, MYellow3, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow3, MYellow4, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow4, MYellow5, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow5, MYellow6, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow6, MYellow7, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow7, MYellow8, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow8, MYellow9, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow9, MYellow10, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow10, MYellow11, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow11, MYellow12, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow12, MYellow13, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow13, MYellow14, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow14, MYellow15, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow15, MYellow16, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow16, MYellow17, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow17, MYellow18, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow18, MYellow19, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow19, MYellow20, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow20, MYellow21, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow21, MYellow22, new EdgeInfo(3, "MRT Yellow Line"));

        MRT_Yellow_Line.insertEdge(MYellow2, MYellow1, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow3, MYellow2, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow4, MYellow3, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow5, MYellow4, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow6, MYellow5, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow7, MYellow6, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow8, MYellow7, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow9, MYellow8, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow10, MYellow9, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow11, MYellow10, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow12, MYellow11, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow13, MYellow12, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow14, MYellow13, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow15, MYellow14, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow16, MYellow15, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow17, MYellow16, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow18, MYellow17, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow19, MYellow18, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow20, MYellow19, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow21, MYellow20, new EdgeInfo(3, "MRT Yellow Line"));
        MRT_Yellow_Line.insertEdge(MYellow22, MYellow21, new EdgeInfo(3, "MRT Yellow Line"));


        Graph<String, EdgeInfo> MRT_Pink_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> MPink1 = MRT_Pink_Line.insertVertex("Nonthaburi Civic Center");
        Vertex<String> MPink2 = MRT_Pink_Line.insertVertex("Khae Rai");
        Vertex<String> MPink3 = MRT_Pink_Line.insertVertex("Sanambin Nam");
        Vertex<String> MPink4 = MRT_Pink_Line.insertVertex("Samakkhi");
        Vertex<String> MPink5 = MRT_Pink_Line.insertVertex("Krom Chon Prathan");
        Vertex<String> MPink6 = MRT_Pink_Line.insertVertex("Yaek Pak Kret");
        Vertex<String> MPink7 = MRT_Pink_Line.insertVertex("Liang Mueang Pak Kret");
        Vertex<String> MPink8 = MRT_Pink_Line.insertVertex("Chaeng Watthana-Pak Kret 28");
        Vertex<String> MPink9 = MRT_Pink_Line.insertVertex("Si Rat");
        Vertex<String> MPink10 = MRT_Pink_Line.insertVertex("Muang Thong Thani");
        Vertex<String> MPink11 = MRT_Pink_Line.insertVertex("Chaeng Watthana 14");
        Vertex<String> MPink12 = MRT_Pink_Line.insertVertex("Government Complex");
        Vertex<String> MPink13 = MRT_Pink_Line.insertVertex("TOT");
        Vertex<String> MPink14 = MRT_Pink_Line.insertVertex("Lak Si");
        Vertex<String> MPink15 = MRT_Pink_Line.insertVertex("Rajabhat Phranakhon");
        Vertex<String> MPink16 = MRT_Pink_Line.insertVertex("Wat Phra Sri Mahathat");
        Vertex<String> MPink17 = MRT_Pink_Line.insertVertex("Ram Inthra 3");
        Vertex<String> MPink18 = MRT_Pink_Line.insertVertex("Lat Pla Khao");
        Vertex<String> MPink19 = MRT_Pink_Line.insertVertex("Ram Inthra Km. 4");
        Vertex<String> MPink20 = MRT_Pink_Line.insertVertex("Maiyalap");
        Vertex<String> MPink21 = MRT_Pink_Line.insertVertex("Vacharaphol");
        Vertex<String> MPink22 = MRT_Pink_Line.insertVertex("Ram Inthra Km. 6");
        Vertex<String> MPink23 = MRT_Pink_Line.insertVertex("Khubon");
        Vertex<String> MPink24 = MRT_Pink_Line.insertVertex("Ram Inthra Km. 9");
        Vertex<String> MPink25 = MRT_Pink_Line.insertVertex("Outer Ring Road-Ram Inthra");
        Vertex<String> MPink26 = MRT_Pink_Line.insertVertex("Nopparat");
        Vertex<String> MPink27 = MRT_Pink_Line.insertVertex("Bang Chan");
        Vertex<String> MPink28 = MRT_Pink_Line.insertVertex("Setthabutbamphen");
        Vertex<String> MPink29 = MRT_Pink_Line.insertVertex("Min Buri Market");
        Vertex<String> MPink30 = MRT_Pink_Line.insertVertex("Min Buri");

        MRT_Pink_Line.insertEdge(MPink1, MPink2, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink2, MPink3, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink3, MPink4, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink4, MPink5, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink5, MPink6, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink6, MPink7, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink7, MPink8, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink8, MPink9, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink9, MPink10, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink10, MPink11, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink11, MPink12, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink12, MPink13, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink13, MPink14, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink14, MPink15, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink15, MPink16, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink16, MPink17, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink17, MPink18, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink18, MPink19, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink19, MPink20, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink20, MPink21, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink21, MPink22, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink22, MPink23, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink23, MPink24, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink24, MPink25, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink25, MPink26, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink26, MPink27, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink27, MPink28, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink28, MPink29, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink29, MPink30, new EdgeInfo(3, "MRT Pink Line"));

        MRT_Pink_Line.insertEdge(MPink2, MPink1, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink3, MPink2, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink4, MPink3, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink5, MPink4, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink6, MPink5, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink7, MPink6, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink8, MPink7, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink9, MPink8, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink10, MPink9, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink11, MPink10, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink12, MPink11, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink13, MPink12, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink14, MPink13, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink15, MPink14, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink16, MPink15, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink17, MPink16, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink18, MPink17, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink19, MPink18, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink20, MPink19, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink21, MPink20, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink22, MPink21, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink23, MPink22, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink24, MPink23, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink25, MPink24, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink26, MPink25, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink27, MPink26, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink28, MPink27, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink29, MPink28, new EdgeInfo(3, "MRT Pink Line"));
        MRT_Pink_Line.insertEdge(MPink30, MPink29, new EdgeInfo(3, "MRT Pink Line"));


        Graph<String, EdgeInfo> SRT_Dark_Red_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> SDarkRed1 = SRT_Dark_Red_Line.insertVertex("Don Mueang");
        Vertex<String> SDarkRed2 = SRT_Dark_Red_Line.insertVertex("Kan Kheha");
        Vertex<String> SDarkRed3 = SRT_Dark_Red_Line.insertVertex("Lak Si");
        Vertex<String> SDarkRed4 = SRT_Dark_Red_Line.insertVertex("Thung Song Hong");
        Vertex<String> SDarkRed5 = SRT_Dark_Red_Line.insertVertex("Bang Khen");
        Vertex<String> SDarkRed6 = SRT_Dark_Red_Line.insertVertex("Wat Samian Nari");
        Vertex<String> SDarkRed7 = SRT_Dark_Red_Line.insertVertex("Chatuchak");
        Vertex<String> SDarkRed8 = SRT_Dark_Red_Line.insertVertex("Krung Thep Aphiwat");

        SRT_Dark_Red_Line.insertEdge(SDarkRed1, SDarkRed2, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed2, SDarkRed3, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed3, SDarkRed4, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed4, SDarkRed5, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed5, SDarkRed6, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed6, SDarkRed7, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed7, SDarkRed8, new EdgeInfo(3, "SRT Dark Red Line"));

        SRT_Dark_Red_Line.insertEdge(SDarkRed2, SDarkRed1, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed3, SDarkRed2, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed4, SDarkRed3, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed5, SDarkRed4, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed6, SDarkRed5, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed7, SDarkRed6, new EdgeInfo(3, "SRT Dark Red Line"));
        SRT_Dark_Red_Line.insertEdge(SDarkRed8, SDarkRed7, new EdgeInfo(3, "SRT Dark Red Line"));


        Graph<String, EdgeInfo> Gold_Line = new AdjacencyMapGraph<>(true);
        Vertex<String> Gold1 = Gold_Line.insertVertex("Krung Thon Buri");
        Vertex<String> Gold2 = Gold_Line.insertVertex("Charoen Nakhon");
        Vertex<String> Gold3 = Gold_Line.insertVertex("Khlong San");

        Gold_Line.insertEdge(Gold1, Gold2, new EdgeInfo(3, "Gold_Line"));
        Gold_Line.insertEdge(Gold2, Gold3, new EdgeInfo(3, "Gold_Line"));

        Gold_Line.insertEdge(Gold2, Gold1, new EdgeInfo(3, "Gold_Line"));
        Gold_Line.insertEdge(Gold3, Gold2, new EdgeInfo(3, "Gold_Line"));

        // -----------------------------------------------------------------
        // Combine g1 and g2 into a new combinedGraph
        // -----------------------------------------------------------------
        Graph<String, EdgeInfo> combinedGraph = new AdjacencyMapGraph<>(true);
        Map<String, Vertex<String>> vertexMap = new HashMap<>();

        // Call the new utility class
        GraphUtils.copyVertices(BTS_Sukhumvit_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(BTS_Silom_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(MRT_Blue_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(MRT_Purple_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(Airport_Rail_Link, combinedGraph, vertexMap);
        GraphUtils.copyVertices(MRT_Yellow_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(MRT_Pink_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(SRT_Dark_Red_Line, combinedGraph, vertexMap);
        GraphUtils.copyVertices(Gold_Line, combinedGraph, vertexMap);


        GraphUtils.copyEdges(BTS_Sukhumvit_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(BTS_Silom_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(MRT_Blue_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(MRT_Purple_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(Airport_Rail_Link, combinedGraph, vertexMap);
        GraphUtils.copyEdges(MRT_Yellow_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(MRT_Pink_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(SRT_Dark_Red_Line, combinedGraph, vertexMap);
        GraphUtils.copyEdges(Gold_Line, combinedGraph, vertexMap);


        try {
            // Crossing edge of BTS Sukhumvit Line-------------------------------------------------------
            Vertex<String> BSukum16_a = vertexMap.get("Ha Yaek Lat Phrao");
            Vertex<String> BSukum17_a = vertexMap.get("Mo Chit");
            Vertex<String> BSukum28_a = vertexMap.get("Asok");


            Vertex<String> MBlue13_a = vertexMap.get("Chatuchak Park");
            Vertex<String> MBlue14_a = vertexMap.get("Phahon Yothin");
            Vertex<String> MBlue22_a = vertexMap.get("Sukhumvit");

            combinedGraph.insertEdge(BSukum16_a, MBlue14_a, new EdgeInfo(10, "MRT Blue Line station Chatuchak Park"));
            combinedGraph.insertEdge(BSukum17_a, MBlue13_a, new EdgeInfo(10, "MRT Blue Line station Phahon Yothin"));
            combinedGraph.insertEdge(BSukum28_a, MBlue22_a, new EdgeInfo(10, "MRT Blue Line station Sukhumvit"));

            combinedGraph.insertEdge(MBlue14_a, BSukum16_a, new EdgeInfo(10, "BTS Sukhumvit Line station Ha Yaek Lat Phrao"));
            combinedGraph.insertEdge(MBlue13_a, BSukum17_a, new EdgeInfo(10, "BTS Sukhumvit Line station Mo Chit"));
            combinedGraph.insertEdge(MBlue22_a, BSukum28_a, new EdgeInfo(10, "BTS Sukhumvit Line station Asok"));

            // Crossing edge of BTS Silom Line-----------------------------------------------------------
            Vertex<String> BSi4_a = vertexMap.get("Sala Daeng");


            //crossesS
            Vertex<String> MBlue26_a = vertexMap.get("Si Lom");

            combinedGraph.insertEdge(BSi4_a, MBlue26_a, new EdgeInfo(10, "MRT Blue Line station Si Lom"));

            combinedGraph.insertEdge(MBlue26_a, BSi4_a, new EdgeInfo(10, "BTS Silom Line station Sala Daeng\""));


            // Crossing edge of MRT Blue Line-----------------------------------------------------------
            Vertex<String> MBlue11_a = vertexMap.get("Bang Sue");
            Vertex<String> MBlue21_a = vertexMap.get("Phetchaburi");

            //crossesS
            Vertex<String> SDarkRed8_a = vertexMap.get("Krung Thep Aphiwat");
            Vertex<String> ARL3_a = vertexMap.get("Makkasan");

            combinedGraph.insertEdge(MBlue11_a, SDarkRed8_a, new EdgeInfo(10, "SRT Dark Red Line station Krung Thep Aphiwat"));
            combinedGraph.insertEdge(MBlue21_a, ARL3_a, new EdgeInfo(10, "Airport Rail Link station Makkasan"));

            combinedGraph.insertEdge(SDarkRed8_a, MBlue11_a, new EdgeInfo(10, "MRT Blue Line station Bang Sue"));
            combinedGraph.insertEdge(ARL3_a, MBlue21_a, new EdgeInfo(10, "MRT Blue Line station Phetchaburi"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your station : ");
        String Start = scanner.nextLine();

        System.out.print("What's your destination : ");
        String End = scanner.nextLine();

        Vertex<String> start = vertexMap.get(Start);
        Vertex<String> end = vertexMap.get(End);

        if (start == null || end == null) {

            if (start == null) {
                System.out.println("\nError: The starting station '" + Start + "' could not be found.");
            }
            if (end == null) {
                System.out.println("Error: The destination station '" + End + "' could not be found.");
            }
            System.out.println("Please check your spelling and try again.");

        } else if (start.equals(end)) {

            System.out.println("\nYou are already at your destination!");

        } else {

            Set<Vertex<String>> known = new HashSet<>();
            Map<Vertex<String>, Edge<EdgeInfo>> forest = new HashMap<>();

            BFS.bfs(combinedGraph, start, known, forest);

            List<Edge<EdgeInfo>> path = BFS.getPathFromForest(combinedGraph, start, end, forest);

            if (path != null) {
                int totalTime = 0;
                String previousLineType = null;

                System.out.println("\n--- Shortest Path from " + Start + " to " + End + " ---");

                for (Edge<EdgeInfo> edge : path) {
                    EdgeInfo info = edge.getElement();
                    String currentLineType = info.getType();

                    if (currentLineType.contains(" station ")) {

                        int transferTime = info.getMinutes();
                        totalTime += transferTime;

                        System.out.println("    → Interchange to " + currentLineType + " (" + transferTime + " minutes)");

                        previousLineType = currentLineType;

                    } else {
                        if (previousLineType != null && !previousLineType.contains(currentLineType)) {
                            final int FALLBACK_PENALTY = 10;
                            totalTime += FALLBACK_PENALTY;
                            System.out.println("    → Interchange to " + currentLineType + " (" + FALLBACK_PENALTY + " minutes)");
                        }

                        System.out.println("  " + edge + " (Via: " + info.getType() + ")");
                        totalTime += info.getMinutes();

                        previousLineType = info.getType();
                    }
                }

                System.out.println("\nTotal time to get to your destination is around " + totalTime + " minutes");


                System.out.println("Sorry, no path could be found from " + Start + " to " + End + ".");
            }
        }
    }
    }
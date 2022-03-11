package devoteam.training.javaoneforall.javacore.Cmethodoverloading.test;


import devoteam.training.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("South Park", "TV", 12, "Finished");
//        anime.setName("South Park");
//        anime.setType("TV");
//        anime.setEpisodes(12);
        anime.print();
    }
}

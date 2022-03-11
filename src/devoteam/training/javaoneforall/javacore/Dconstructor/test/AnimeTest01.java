package devoteam.training.javaoneforall.javacore.Dconstructor.test;


import devoteam.training.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("South Park", "TV", 12, "Finished", "Production IG");
        anime.print();

    }
}

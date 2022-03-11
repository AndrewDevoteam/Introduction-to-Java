package devoteam.training.javaoneforall.javacore.Einitializationblock.test;

import devoteam.training.javaoneforall.javacore.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragonball");
        for (int episode: anime.getEpisodes()) {
            System.out.println(episode + " ");
        }

    }
}

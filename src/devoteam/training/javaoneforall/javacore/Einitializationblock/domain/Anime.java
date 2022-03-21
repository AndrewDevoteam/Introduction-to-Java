package devoteam.training.javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;
    //Process it follows
    // 1 - Memory is Allocated
    // 2 - Each class Attribute is initialized
    // 3 - Init block is executed
    // 4 - Constructor is executed

    {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episode : episodes) {
            System.out.println(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}


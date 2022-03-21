package devoteam.training.javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    //Process it follows
    // 0 - Static init block is executed when JVM loads the class and only once
    // 1 - Memory is Allocated
    // 2 - Each class Attribute is initialized
    // 3 - Init block is executed
    // 4 - Constructor is executed

    static {
        System.out.println("Inside Init Block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }
    static{
        System.out.println("Inside static init block 2 ");
    }
    static{
        System.out.println("Inside static init block 3 ");
    }
    static{
        System.out.println("Inside static init block 4 ");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episode : Anime.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }
}


import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {
        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced OOP", 2023, 120, "4K"));
        items.add(new PodcastEpisode("Tech Talk", 2023, 45, "Alice Johnson"));
        items.add(new PodcastEpisode("Coding Life", 2022, 60, "Bob Smith"));

        int currentYear = java.time.Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item + " | licenseCost=" + item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " + d.getMaxDownloadsPerDay());
            }

            System.out.println();
        }
    }
}
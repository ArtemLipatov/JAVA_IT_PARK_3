package ru.itpark;

import java.time.LocalTime;

public class Channel {
    private Program programs[];
    private LocalTime localTime = LocalTime.now();
    private int hour = localTime.getHour();
    private String nameChannel;
    private TvShows tvShow[];

    Channel(String nameChannel, TvShows[] tvShow) {
        this.nameChannel = nameChannel;
        this.tvShow = tvShow;
    }

    void searchTvShows(TvShows []tvShows) {
        for (int i = 0; i < tvShows.length; i++) {
            if (tvShows[i].getBeginTime() <= hour && tvShows[i].getEndTime() > hour) {
                System.out.println(tvShows[i].getName());
            }
        }
    }

    String getNameChannel() {
        return nameChannel;
    }

    public void setNameChannel(String nameChannel) {
        this.nameChannel = nameChannel;
    }

    TvShows[] getTvShow() {
        return tvShow;
    }

    public void setTvShows(TvShows[] tvShow) {
        this.tvShow = tvShow;
    }
}
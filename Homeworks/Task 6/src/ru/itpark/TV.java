package ru.itpark;

public class TV {


    private static final TV instance;

    private TV(){
    }

    static {
        instance = new TV();
    }

    static TV getInstance() {
        return instance;
    }

    void showChannels(Channel []channels){
        for (int i = 0; i < channels.length; i++){
            System.out.println(channels[i].getNameChannel());
        }
    }
    void searchChannels(Channel []channels, int x){
        if (x < 0 && x >= channels.length ){
            System.err.println("Такого канала не существует");
        }
        else
            channels[x].searchTvShows(channels[x].getTvShow());
    }
}
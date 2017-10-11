package ru.itpark;

public class TV {
    private Channel channels[];
    String channelsList[] = {"Первый", "СТС", "ТНТ", "Рен ТВ"};

    private static final TV instance;

    private TV() {
    }

    static {
        instance = new TV();
    }

    public static TV getInstance() {
        return instance;
    }
    public static void showChannelList(){
        for (int i =0; i < chanelList.length; i++){
            System.out.println(chanelList[i]);

        }
    }
}

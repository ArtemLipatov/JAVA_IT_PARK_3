package ru.itpark;

public class TvShows {
        private String name;
        private int beginTime;
        private int endTime;

        TvShows(String name, int beginTime, int endTime) {
            this.name = name;
            this.beginTime = beginTime;
            this.endTime = endTime;
        }

        String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        int getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(int beginTime) {
            this.beginTime = beginTime;
        }

        int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }
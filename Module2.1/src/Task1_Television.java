public class Task1_Television {
    public static class Television{
        private int channel;
        public Television() {
            this.channel = 0;
        }
        public int getChannel(){
            return channel;
        }
        public void setChannel(int num){
            this.channel = num;
        }
    }
    public static class TelevisionViewer{
        private boolean sleeping;
        private int stamina;
        public TelevisionViewer(){
            this.sleeping = true;
            this.stamina = 3;
        }
        public void bedTime(int day){
            if (this.sleeping){
                this.sleeping = false;
                System.out.printf("Woke up, day %d\n", day);
            } else{
                this.sleeping = true;
                System.out.println("Falling asleep");
            }
        }
        public void switchChannel(Television tv){
            int channel = tv.getChannel();
            channel++;
            tv.setChannel(channel);
            System.out.printf("Watching channel %d\n", channel);
        }
        public void watchTV(Television tv){
            while (this.stamina >= 1){

                this.stamina--;
            }
            if (this.stamina == 0){
                bedTime();
            }
        }

    }
    public static void main(String[] args) {
        Television telly = new Television();
        TelevisionViewer watcher = new TelevisionViewer();
        int day = 0;
        int
        while (day < 10){
            watcher.watchTV(telly);
            day++;
        }
    }
}
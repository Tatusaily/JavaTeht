class Tapahtuma {
    private final int age;
    public Tapahtuma(int age){
        this.age = age;
    }
    public int compareTo(Tapahtuma tap){
        return age - tap.age;
    }
    public int getAge(){
        return age;
    }

}

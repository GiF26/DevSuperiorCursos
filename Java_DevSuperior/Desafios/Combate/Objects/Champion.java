package Combate.Objects;

public class Champion {
    private String name ;
    private int life;
    private int atack;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Champion() {}

    public Champion(String name, int life, int atack, int armor) {
        this.name = name;
        this.life = life;
        this.atack = atack;
        this.armor = armor;
    }

    public void takeDamage(Champion otherChampion){

        int damage = otherChampion.getAtack() - armor;

        if(damage <= 0){
            life -=  1 ;
        }else {
            life -= damage;
        }

        if(getLife() < 0 ){
            setLife(0);
        }

    }

    public String status(){
        return  getName() + ": " + getLife() + " of health";
    }
}

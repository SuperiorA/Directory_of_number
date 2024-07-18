package Part3_OOP.Lection1.Ex006;

public class Magician extends BaseHero {            // Magician является гнаследником обобщенного класса BaseHero

    private int mana;
    private int maxMana;
    // super.name - обращение к элементам из базового класса, значит пойди и посмотри name в базовом классе
    // this.name - обращение внутри класса
    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);
        this.mana = maxMana;            
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}
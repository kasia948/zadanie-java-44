public class TestClass {

    public static void main(String[] args) {
        Procesor proc1= new Procesor("Intel", "Core i5", 2400);
        Memory mem1 = new Memory("Adata", "DDR", 16, 2500);
        Computer comp1= new Computer("Lenovo",proc1, mem1);
        System.out.println(comp1.name+", "+comp1.procesor.producer+", "+comp1.procesor.model+", "+comp1.procesor.timing
                +", "+comp1.memory.producer+", "+comp1.memory.model+", "+comp1.memory.quantity+", "+comp1.memory.timing);

        Procesor proc2= new Procesor("Intel", "Core i7", 2600);
        Memory mem2=new Memory("Crucial", "Ballistix", 4, 2300);
        Computer comp2= new Computer("HP", proc2, mem2);
        System.out.println(comp2.name+", "+comp2.procesor.producer+", "+comp2.procesor.model+", "+comp2.procesor.timing
                +", "+comp2.memory.producer+", "+comp2.memory.model+", "+comp2.memory.quantity+", "+comp2.memory.timing);

        Overclock overclock= new  Overclock();
        overclock.increaseCpuClock(comp1, 1000);
        System.out.println(comp1.name+", "+comp1.procesor.producer+", "+comp1.procesor.model+", "+comp1.procesor.timing
                +", "+comp1.memory.producer+", "+comp1.memory.model+", "+comp1.memory.quantity+", "+comp1.memory.timing);

        Overclock overclock1= new  Overclock();
        overclock.decreaseCpuClock(comp1,500);
        System.out.println(comp1.name+", "+comp1.procesor.producer+", "+comp1.procesor.model+", "+comp1.procesor.timing
                +", "+comp1.memory.producer+", "+comp1.memory.model+", "+comp1.memory.quantity+", "+comp1.memory.timing);
    }
}

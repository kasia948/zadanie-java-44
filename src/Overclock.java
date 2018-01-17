public class Overclock {

    void increaseCpuClock (Computer comp1, double x){
        comp1.procesor.timing= comp1.procesor.timing+x;
    }

    void decreaseCpuClock (Computer comp1, double x){
        comp1.procesor.timing= comp1.procesor.timing-x;
    }
}

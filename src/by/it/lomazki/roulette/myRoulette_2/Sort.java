package by.it.lomazki.roulette.myRoulette_2;

public class Sort {
    /* вероятность выпадения
    - числа             1/37
    - черное            18/37
    - красное           18/37
    - четное            18/37
    - нечетное          18/37
    - 1-18              18/37
    - 19-36             18/37
    - линия 1           12/37
    - линия 2           12/37
    - линия 3           12/37
    - треть перва       12/37
    - треть вторая      12/37
    - треть третья      12/37
    */

    Constant constant = new Constant();
    int[] Numeric = constant.setNUMERIC(constant.NUMERIC);
    int[] Black = constant.setBLACK(constant.BLACK);
    int[] Red = constant.setRED(constant.RED);
    int[] Third_1 = constant.setTHIRD_1(constant.THIRD_1);
    int[] Third_2 = constant.setTHIRD_2(constant.THIRD_2);
    int[] Third_3 = constant.setTHIRD_3(constant.THIRD_3);
    int[] Even = constant.setEVEN(constant.EVEN);
    int[] Odd = constant.setODD(constant.ODD);
    int[] FF_1 = constant.setFF_1(constant.FF_1);
    int[] FF_2 = constant.setFF_2(constant.FF_2);
    int[] Line_1 = constant.setLINE_1(constant.LINE_1);
    int[] Line_2 = constant.setLINE_2(constant.LINE_2);
    int[] Line_3 = constant.setLINE_3(constant.LINE_3);

}















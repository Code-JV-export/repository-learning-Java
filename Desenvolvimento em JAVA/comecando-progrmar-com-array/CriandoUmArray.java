public class CriandoUmArray {

    public static void main(String[] args) {

        //conceitos e declaração de arrays
        int[] meuArray = new int[7];

        int[] meuArray2 = {12,32,44,56,76,82,91};

        System.out.println(meuArray);
        System.out.println(meuArray2);

        for (int i = 0; i < meuArray2.length; i++) {
            System.out.println(meuArray2[i]);
        }
    }
}

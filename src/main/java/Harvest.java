public class Harvest {
    public static void main(String[] args) {
        int[] carrotPatches = {1, 2, 3, 4, 5};
        int maxCarry = 5;
        int moves = 10;
        int totalCarrots = 0;

        for (int i = 0; i < moves; i++) {
            int maxIndex = findMaxIndex(carrotPatches);
            int harvest = Math.min(carrotPatches[maxIndex], maxCarry);
            carrotPatches[maxIndex] -= harvest;
            totalCarrots += harvest;
        }

        System.out.println("Максимальное количество моркови, которое заяц может унести за 10 ходов: " + totalCarrots + " кг");
    }

    public static int findMaxIndex(int[] patches) {
        int maxIndex = 0;
        for (int i = 1; i < patches.length; i++) {
            if (patches[i] > patches[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

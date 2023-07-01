package home_work_5;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[6];
        arr[0] = "two";
        arr[1] = "on";
        arr[2] = "v";
        arr[3] = "program";
        arr[4] = "message";
        arr[5] = "java";
        DataContainer<String> data = new DataContainer<String>(arr);
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(data.get(i));
        }
        System.out.println("\n");
        // System.out.println("номер позиции " + data.add(" "));
        //  System.out.println("номер позиции " + data.add("777"));
        //   System.out.println(arr.length);
        System.out.println("После добавления: ");
//        System.out.println("номер позиции " + data.add("777"));

//        System.out.println("Метод get,индекс: "+data.get(6));
//        System.out.println("Метод getItems,массив из поля data: "+ Arrays.toString(data.getItems()));
//        System.out.println("Метод delete: "+ data.delete(3));
//        System.out.println("После удаления: "+ Arrays.toString(data.getItems()));
        System.out.println("Сортировка строк: ");
        ComparatorData comparatorData = new ComparatorData();
        String[] arr1 = data.sortArray(comparatorData);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
        Integer[] arrInt = new Integer[]{9, 2, 3, 7};

        DataContainer<Integer> dataInt = new DataContainer<Integer>(arrInt);
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(dataInt.get(i));
        }

        ComporatorInt comporatorInt = new ComporatorInt();
        System.out.println("Сортировка чисел: ");
        Integer[] arrInt1 = dataInt.sortArray(comporatorInt);
        for (int i = 0; i < arrInt1.length; i++) {
            System.out.println(arrInt1[i]);
        }
    }
}

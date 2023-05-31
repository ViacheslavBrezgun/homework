package home_work_5;


public class Main {
    public static void main(String[] args) {
        //  4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777).
        //  Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
//                String[] arr = new String[6];
//                arr[0] = "1";
//                arr[1] = "2";
//                arr[2] = "3";
//                arr[3] = null;
//                arr[4] = null;
//                arr[5] = null;
//
//                DataContainer<String> data = new DataContainer<String>(arr);
//                System.out.println("Исходный массив: ");
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println("\n");
//                System.out.println("номер позиции: " + data.add("777"));
        //---------------------------------------------------------------------------------------------


        //4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null, null, null].
        //Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
//         String[] arr = new String[6];
//         arr[0] = "1";
//         arr[1] = "2";
//         arr[2] = "3";
//         arr[3] = null;
//         arr[4] = null;
//         arr[5] = null;
//
//         DataContainer<String> data = new DataContainer<String>(arr);
//         System.out.println("Исходный массив: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//           }
//         System.out.println("\n");
//         System.out.println(  data.add(" "));
//---------------------------------------------------------------------------------------------------
        // 4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3, null, null, null].
        //Метод add вернёт число 1.
        //   String[] arr = new String[6];
        //    arr[0] = "1";
        //   arr[1] = null;
        //  arr[2] = "3";
        //  arr[3] = null;
        //  arr[4] = null;
        //  arr[5] = null;

        //  DataContainer<String> data = new DataContainer<String>(arr);
        //  System.out.println("Исходный массив: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        //   }
        // System.out.println("\n");
        // System.out.println(  data.add("777"));
//-------------------------------------------------------------------------------------------------------------------
        //  4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
//        String[] arr = new String[3];
//         arr[0] = "1";
//         arr[1] = "2";
//         arr[2] = "3";
//
//
//         DataContainer<String> data = new DataContainer<String>(arr);
//         System.out.println("Исходный массив: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//           }
//         System.out.println("\n");
//         System.out.println(  data.add("777"));
//--------------------------------------------------------------------------------------

//        arr[3] = "777";
//        arr[4] = "";.
//        arr[5] = "";
//         System.out.println("номер позиции " + data.add(" "));
//         System.out.println("номер позиции " + data.add("777"));
//         System.out.println(arr.length);

//        System.out.println("После добавления: ");----
//        int k=data.add("4");
//        System.out.println("номер позиции " + k);
//        System.out.println("Метод get,индекс: "+data.get(k));------

//        System.out.println("Метод getItems,массив из поля data: "+ Arrays.toString(data.getItems()));
//        System.out.println("Метод delete: "+ data.delete(3));
//        System.out.println("После удаления: "+ Arrays.toString(data.getItems()));


    }
}

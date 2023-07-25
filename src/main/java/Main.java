public class Main {


    public static void main(String[] args) {
        int decision=1;
        int secDec=2;

         Adscraper bookOne=new Adscraper(decision);

         bookOne.allLinks();
         bookOne.retrieveTitle();
         bookOne.retrieveDesc();
         bookOne.save();

         Adscraper bookTwo=new Adscraper(secDec);

        bookTwo.allLinks();
        bookTwo.retrieveTitle();
        bookTwo.retrieveDesc();
        bookTwo.save();







//        scrapper newScrp =new scrapper();

//        newScrp.connect();
//        newScrp.printHeaders();


//        TaskMngr newObj=new TaskMngr();
//
//        newObj.viewAll();



//        Scanner scanner = new Scanner(System.in);
//
//
////		newObj.Init();
//        newObj.populateArray();
//        newObj.viewAll();
//
//
//
//
//        while (true) {
//            System.out.println("Aby dodac zadanie wybierz 1.");
//            System.out.println("Aby usunąć zadanie wybierz 2.");
//            System.out.println("Aby zaznaczyć zadanie wybierz 3.");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//
//
//                case 1:
//
//                    System.out.println("Wpisz zadanie");
//
//                    String noweZadanie = scanner.next();
//
//                    newObj.addTasks(noweZadanie);
//
//                case 2:
//                    System.out.println("Które zadanie chcesz usunąć, wpisz numer");
//                    newObj.viewAll();
//
//                    //Wyświetl numery zadań i po wpisaniu numeru usun zadanie
//                    int numb = scanner.nextInt();
//                    newObj.del(numb);
//                    newObj.viewAll();
//                case 3:
//                    System.out.println("Które zadanie chcesz zaznaczyć?");
//                    int sign= scanner.nextInt();
//                    newObj.mark(sign);
//                    newObj.viewAll();
//
//
//
//            }
//
//
//
//        }
//
//




    }
}
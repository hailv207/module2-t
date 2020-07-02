public class MoneyAccountDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        while(!MoneyAccount.isEmpty()){
            t1.run();
            t2.run();
            t3.run();
        }


    }
    public static synchronized void credit() {
        if (MoneyAccount.isEmpty()){
            System.out.println("Your account has not enough balance.");
            return;
        }
        MoneyAccount.creditbalance(10);
        MoneyAccount.updateEmpty();
        System.out.println(MoneyAccount.getBalance());
    }


   static class MoneyAccount {
        private static int balance = 100;
        private static boolean isEmpty;
       public MoneyAccount(int amount){
           this.balance = amount;
           if (amount >0 ){
               isEmpty = false;
           }
       }

        public static int getBalance() {
            return balance;
        }

        public static void creditbalance(int amount) {
            balance -= amount;
        }

        public static boolean isEmpty() {
            return isEmpty;
        }

        public static void setEmpty(boolean empty) {
            isEmpty = empty;
        }
        public static void updateEmpty(){
           if (balance <= 0){
               setEmpty(true);
           }
        }
    }
    static class MyThread implements Runnable {
        @Override
        public void run() {
            credit();
        }
    }
}

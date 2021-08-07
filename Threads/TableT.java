package Threads;

// Use this editor to write, compile and run your Java code online


class TableT extends Thread{
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=2;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
    public void run() {
        printTable(5);
    }
    public static void main(String[] args) {
        TableT t1= new TableT();
        TableT t2= new TableT();
        t1.start();
        try {
            t1.join();
        }catch(Exception e){}
        t2.start();

    }
}
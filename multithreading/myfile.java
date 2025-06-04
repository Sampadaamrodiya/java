// class myrunnable implements Runnable{
//     public void run()
//     {
//         System.out.println("thread using runnable interface");
//     }
// }


// public class myfile {
//     public static void main(String[] args) {
//         myrunnable obj= new myrunnable();
//         Thread t1=new Thread(obj);
//         t1.start();
//         System.out.println("Main thread is running");
//     }
// }

class myrunnable implements Runnable {
    String file;
    public myrunnable(String file)
    {
        this.file=file;
    }
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(file + " downloading...." + (i * 20) + "%");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Error in downloading " + file);
            }
        }
        System.out.println(file + " done");
    }
}

public class myfile {
    public static void main(String[] args) {
       myrunnable obj= new myrunnable("file 1");
       myrunnable obj2=new myrunnable("file 2");
       Thread t1=new Thread(obj);
       Thread t2=new Thread(obj2);
       t1.start();
       t2.start();
      // myrunnable obj=new myrunnable("f2")
    }
}

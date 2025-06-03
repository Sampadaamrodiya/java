// class downloadFile{
//     public static void file(String file) {
//          for(int i=0;i<=5;i++)
//          {
//             System.out.println(file+" "+"downloading...."+(i*20)+"%");
         
//         try{
//             Thread.sleep(2000);
//         }
//         catch(Exception e)
//         {}
//     }
//         System.out.println(file+" done");
//     }
// }

// public class newfile {
//     public static void main(String[] args) {
//         downloadFile obj= new downloadFile();
//         obj.file("file A");
//         obj.file("file B");
 
        
//     }
// }


class DownloadFile extends Thread {
    String file;
    public DownloadFile(String file)
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

public class newfile {
    public static void main(String[] args) {
        DownloadFile fileA = new DownloadFile("File A");
        DownloadFile fileB = new DownloadFile("File B");

        fileA.start();
        fileB.start();
    }
}

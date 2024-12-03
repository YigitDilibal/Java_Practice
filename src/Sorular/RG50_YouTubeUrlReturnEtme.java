package Sorular;

public class RG50_YouTubeUrlReturnEtme {

    public static void main(String[] args) {

        /*50-----
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

     ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
    ID : XPEr1cArWRg

    youtubeId("https://youtu.be/BCDEDi5gDPo")
    ID : BCDEDi5gDPo

    youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
    ID : vxP3bY-XxY4
    */

        System.out.println(youtubeID("https://www.youtube.com/watch?v=XPEr1cArWRg"));
        System.out.println(youtubeID("https://youtu.be/BCDEDi5gDPo"));
        System.out.println(youtubeID("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));



    }

    public static String youtubeID(String link){

        if (link.contains("youtu.be")){
            return link.substring(link.lastIndexOf("/")+1);
        } else {
            return link.substring(link.lastIndexOf("=")+1);
        }


    }

}

package importData;

/**
 * Created by Henrik Berglund on 2018-02-01.
 */
public class TestDownload {

    public static void main(String[] args){

        try{
            ImportData importData = new ImportData();
            importData.deleteOld();
            importData.downloadAll();
        }
        catch(Exception e){
            System.out.println("Fail");
        }



    }

}

package Assignment_1;


import java.io.IOException;

public class MainClass
{
    public static void main (String[] args) throws IOException
    {


        ScraperLink scraperLink = new ScraperLink();
        GettingData gettingData = new GettingData();
        gettingData.ReadData();
        scraperLink.ReadData2();
        Pair_Table pairTable = new Pair_Table();
        pairTable.check(gettingData.getResult(),scraperLink.getResult2());
        pairTable.studentnotsubmitted(gettingData.getResult(),scraperLink.getResult2());
        WriteToExcel excel= new WriteToExcel();
        excel.WriteToExcel( pairTable.getstudentSub(), pairTable.getstudentNotSub());



    }
}


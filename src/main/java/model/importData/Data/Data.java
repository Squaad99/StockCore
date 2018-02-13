package model.importData.Data;


import model.Stock;

import java.io.File;


public class Data {

    public static Stock[] stock = new Stock[94];

    //1 Name 2 FileNamme 3 Extra name download
    public static String[][] stockName = new String[94][3];

    public Data() {

        stockName[0][0] = "";
        stockName[0][1] = "";

        stockName[1][0] = "ABB Ltd";
        stockName[1][1] = "ABB";

        stockName[2][0] = "Ahlsell";
        stockName[2][1] = "AHSL";

        stockName[3][0] = "Ahlstrom-Munksjö Oyj";
        stockName[3][1] = "AM1S";

        stockName[4][0] = "Alfa Laval";
        stockName[4][1] = "ALFA";

        stockName[5][0] = "ASSA ABLOY B";
        stockName[5][1] = "ASSA-B";

        stockName[6][0] = "AstraZeneca";
        stockName[6][1] = "AZN";

        stockName[7][0] = "Atlas Copco B";
        stockName[7][1] = "ATCO-B";

        stockName[8][0] = "Atrium Ljungberg B";
        stockName[8][1] = "ATRLJ-B";

        stockName[9][0] = "Attendo";
        stockName[9][1] = "ATT";

        stockName[10][0] = "Autoliv SDB";
        stockName[10][1] = "ALIV-SDB";

        stockName[11][0] = "Avanza Bank Holding";
        stockName[11][1] = "AZA";

        stockName[12][0] = "Axfood";
        stockName[12][1] = "AXFO";

        stockName[13][0] = "Axis";
        stockName[13][1] = "AXIS";

        stockName[14][0] = "Beijer Alma B";
        stockName[14][1] = "BEIA-B";

        stockName[15][0] = "Betsson B";
        stockName[15][1] = "BETS-B";

        stockName[16][0] = "BillerudKorsnäs";
        stockName[16][1] = "BILL";

        stockName[17][0] = "Boliden";
        stockName[17][1] = "BOL";

        stockName[18][0] = "Bonava B";
        stockName[18][1] = "BONAV-B";

        stockName[19][0] = "Bravida Holding";
        stockName[19][1] = "BRAV";

        stockName[20][0] = "Castellum";
        stockName[20][1] = "CAST";

        stockName[21][0] = "Collector";
        stockName[21][1] = "COLL";

        stockName[22][0] = "COM HEM HOLDING";
        stockName[22][1] = "COMH";

        stockName[23][0] = "DOMETIC GROUP";
        stockName[23][1] = "DOM";

        stockName[24][0] = "Electrolux B";
        stockName[24][1] = "ELUX-B";

        stockName[25][0] = "Elekta B";
        stockName[25][1] = "EKTA-B";

        stockName[26][0] = "Ericsson B";
        stockName[26][1] = "ERIC-B";

        stockName[27][0] = "ESSITY B";
        stockName[27][1] = "ESSITY-B";

        stockName[28][0] = "EVOLUTION GAMING GROUP";
        stockName[28][1] = "EVO";

        stockName[29][0] = "Fabege";
        stockName[29][1] = "FABG";

        stockName[30][0] = "Fast. Balder B";
        stockName[30][1] = "BALD-B";

        stockName[31][0] = "Fast. Balder B";
        stockName[31][1] = "BALD-B";

        stockName[32][0] = "Fenix Outdoor International B";
        stockName[32][1] = "FOI-B";

        stockName[33][0] = "Fingerprint Cards B";
        stockName[33][1] = "FING-B";

        stockName[34][0] = "Getinge B";
        stockName[34][1] = "GETI-B";

        stockName[35][0] = "Sv. Handelsbanken A";
        stockName[35][1] = "SHB-A";

        stockName[36][0] = "Hemfosa Fastigheter";
        stockName[36][1] = "HEMF";

        stockName[37][0] = "Hennes & Mauritz B";
        stockName[37][1] = "HM-B";

        stockName[38][0] = "HEXAGON B";
        stockName[38][1] = "HEXA-B";

        stockName[38][0] = "HEXPOL B";
        stockName[38][1] = "HPOL-B";

        stockName[39][0] = "Holmen B";
        stockName[39][1] = "HOLM-B";

        stockName[40][0] = "Holmen B";
        stockName[40][1] = "HOLM-B";

        stockName[41][0] = "Hufvudstaden A";
        stockName[41][1] = "HUFV-A";

        stockName[42][0] = "Husqvarna B";
        stockName[42][1] = "HUSQ-B";

        stockName[43][0] = "ICA Gruppen";
        stockName[43][1] = "ICA";

        stockName[44][0] = "Industrivärden C";
        stockName[44][1] = "INDU-C";

        stockName[45][0] = "Indutrade";
        stockName[45][1] = "INDT";

        stockName[46][0] = "Intrum";
        stockName[46][1] = "INTRUM";

        stockName[47][0] = "Investor B";
        stockName[47][1] = "INVE-B";

        stockName[48][0] = "JM";
        stockName[48][1] = "JM";

        stockName[49][0] = "Kindred Group";
        stockName[49][1] = "KIND-SDB";

        stockName[50][0] = "Kinnevik B";
        stockName[50][1] = "KINV-B";

        stockName[51][0] = "Klövern B";
        stockName[51][1] = "KLOV-B";

        stockName[52][0] = "Kungsleden";
        stockName[52][1] = "KLED";

        stockName[53][0] = "Latour B";
        stockName[53][1] = "LATO-B";

        stockName[54][0] = "Lifco B";
        stockName[54][1] = "LIFCO-B";

        stockName[55][0] = "Loomis B";
        stockName[55][1] = "LOOM-B";

        stockName[56][0] = "Lundbergföretagen B";
        stockName[56][1] = "LUND-B";

        stockName[57][0] = "Lundin Mining Corporation";
        stockName[57][1] = "LUMI";

        stockName[58][0] = "Lundin Petroleum";
        stockName[58][1] = "LUPE";

        stockName[59][0] = "Mr Green & Co";
        stockName[59][1] = "MRG";

        stockName[60][0] = "Modern Times Group B";
        stockName[60][1] = "MTG-B";

        stockName[61][0] = "Munters Group";
        stockName[61][1] = "MTRS";

        stockName[62][0] = "NCC B";
        stockName[62][1] = "NCC-B";

        stockName[63][0] = "NetEnt B";
        stockName[63][1] = "NET-B";

        stockName[64][0] = "NIBE Industrier B";
        stockName[64][1] = "NIBE-B";

        stockName[65][0] = "Nobia";
        stockName[65][1] = "NOBI";

        stockName[66][0] = "Nordea Bank";
        stockName[66][1] = "NDA-SEK";

        stockName[67][0] = "Pandox B";
        stockName[67][1] = "PNDX-B";

        stockName[68][0] = "Peab B";
        stockName[68][1] = "PEAB-B";

        stockName[69][0] = "Ratos B";
        stockName[69][1] = "RATO-B";

        stockName[70][0] = "Resurs Holding";
        stockName[70][1] = "RESURS";

        stockName[71][0] = "SAAB B";
        stockName[71][1] = "SAAB-B";

        stockName[72][0] = "Sagax B";
        stockName[72][1] = "SAGA-B";

        stockName[73][0] = "Sandvik";
        stockName[73][1] = "SAND";

        stockName[74][0] = "SCA B";
        stockName[74][1] = "SCA-B";

        stockName[75][0] = "SEB A";
        stockName[75][1] = "SEB-A";

        stockName[76][0] = "Securitas B";
        stockName[76][1] = "SECU-B";

        stockName[77][0] = "Skanska B";
        stockName[77][1] = "SKA-B";

        stockName[78][0] = "SKF B";
        stockName[78][1] = "SKF-B";

        stockName[79][0] = "SSAB A";
        stockName[79][1] = "SSAB-A";

        stockName[80][0] = "Stora Enso R";
        stockName[80][1] = "STE-R";

        stockName[81][0] = "SWECO B";
        stockName[81][1] = "SWEC-B";

        stockName[82][0] = "Swedbank A";
        stockName[82][1] = "SWED-A";

        stockName[83][0] = "Swedish Match";
        stockName[83][1] = "SWMA";

        stockName[84][0] = "Swedish Orphan Biovitrum";
        stockName[84][1] = "SOBI";

        stockName[85][0] = "Tele2 B";
        stockName[85][1] = "TEL2-B";

        stockName[86][0] = "Telia Company";
        stockName[86][1] = "TELIA";

        stockName[87][0] = "Thule Group";
        stockName[87][1] = "THULE";

        stockName[88][0] = "Tieto Oyj";
        stockName[88][1] = "TIEN";

        stockName[89][0] = "Trelleborg B";
        stockName[89][1] = "TREL-B";

        stockName[90][0] = "Volvo B";
        stockName[90][1] = "VOLV-B";

        stockName[91][0] = "Wallenstam B";
        stockName[91][1] = "WALL-B";

        stockName[92][0] = "Wihlborgs Fastigheter";
        stockName[92][1] = "WIHL";

        stockName[93][0] = "ÅF B";
        stockName[93][1] = "AF-B";

        for(int i = 0; i <94; i++) {
            stockName[i][2] = stockName[i][0];
        }

        //Speical name for stocks
        stockName[13][2] = "Axis (SEK)";
        stockName[22][2] = "Com Hem Holding (SEK)";
        stockName[23][2] = "Dometic Group (SEK)";
        stockName[27][2] = "Essity B (SEK)";
        stockName[28][2] = "Evolution Gaming Group (SEK)";


        for (int i = 0; i < 94; i++) {
            stock[i] = new Stock();
        }
    }

    public static String startDate = "";
    public static String endDate = "";

    public void setFileDates() {
        // This is from ABB must change if stock list change
        File folder = new File("C:\\Aktier");
        File[] listOfFiles = folder.listFiles();

        String fullName = "";

        for (int i = 0; i < 1; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());

                fullName = listOfFiles[i].getName();

            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

        startDate = fullName.substring(4, 14);
        endDate = fullName.substring(15, 25);
    }

}
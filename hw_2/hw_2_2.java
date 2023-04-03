//Дана строка:
//"фамилия":"Иванов","оценка":"5","предмет":"Математика" 
//"фамилия":"Петрова","оценка":"4","предмет":"Информатика" 
//"фамилия":"Краснов","оценка":"5","предмет":"Физика"
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;


public class hw_2_2 {
        public static String [] ReadLineFromFile(String pathway) throws Exception {
            BufferedReader br = new BufferedReader(new FileReader(pathway));
            String stroka;
            int size = 0;
            while (br.readLine() != null) {
                size +=1;
            }
            br.close();
            String [] listData = new String [size];

            int i = 0;
            BufferedReader br1 = new BufferedReader(new FileReader(pathway));
            while ((stroka = br1.readLine()) != null) {
                listData[i] = stroka;
                i += 1;
            }
            br1.close();
            return listData;
        }



        public static StringBuilder PrintLine(String line) {
            String line1 = line.replace("{", "");
            String line2 = line1.replace("}", "");
            String line3 = line2.replaceAll("\"", "");
            String line4 = line3.replace("]", "");
            StringBuilder result = new StringBuilder("");
            String [] arrayData = line4.split(",");
            String [] listName = {"Студент ", " получил ", " по предмету "};
            for (int i =0; i < arrayData.length; i++) {
                String[] arrData = arrayData[i].split(":");
                result.append(listName[i]);
                result.append(arrData[1]);
            }
            return result;
        }

    public static void main(String[] args) throws Exception {
        String [] arrayData =  ReadLineFromFile("file.txt");
        for(int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }
    }
    }
    
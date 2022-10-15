import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
 
//Сложно объяснить.
public class Writer {
 
	public static File createCsvFile(List<Object> head,List<List<Object>> dataList,
			String outPutPath,String filename){
		File csvFile = null;
		BufferedWriter csvWriter = null;
		try {
 
			csvFile = new File(outPutPath + File.separator + filename + ".csv");
			csvFile.createNewFile();
			csvWriter = new BufferedWriter(  
					new OutputStreamWriter(  
					new FileOutputStream(csvFile),"GB2312"),1024);  
			 
			writeRow(head, csvWriter); 
			 
			for(List<Object> row : dataList){
				writeRow(row, csvWriter);
			}
			csvWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				csvWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return csvFile;
	}
	
	private static void writeRow(List<Object> row,BufferedWriter csvWriter) throws IOException{
		for(Object data : row){
			  StringBuffer sb = new StringBuffer();
			  String rowStr = sb.append("\"").append(data).append("\",").toString();
			  csvWriter.write(rowStr);
		}
		csvWriter.newLine();
	}
}
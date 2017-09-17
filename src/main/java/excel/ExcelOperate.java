package excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MingYngLee on 2017/9/17
 * <p>
 * 选出每一列中的最大值，然后选出这些最大值中的最小值
 */
public class ExcelOperate {

    public static void main(String[] args) throws Exception {
        System.out.println("最小值：" + minOfMax("C:\\Users\\Leetosun\\Desktop\\demo.xlsx"));
    }

    /**
     * The minimum of each column maximum
     */
    private static String minOfMax(String filePath) throws Exception {
        List<List<List<String>>> lists = readExcelWithoutTitle(filePath);
        List<List<String>> columnList = new ArrayList<>();
        for (List<List<String>> lists1 : lists) { // 一共有多少列
            if (lists1.isEmpty()) {
                continue;
            }
            int i = 0;
            for (; i < lists1.get(0).size(); i++) { // 每行的数据
                int j = 0;
                List<String> stringList = new ArrayList<>();
                for (; j < lists1.size();) {
                    stringList.add(lists1.get(j).get(i));
                    j++;
                }
                columnList.add(stringList);
            }
        }

        List<String> columnMax = new ArrayList<>();
        for (List<String> columns : columnList) {
            for (int i = 0; i < columns.size(); i++) {
                for (int j = 0; j < columns.size() - 1; j++) {
                    if (Double.valueOf(columns.get(j + 1)) > Double.valueOf(columns.get(j))) {
                        double t = Double.valueOf(columns.get(j));
                        columns.set(j, columns.get(j + 1));
                        columns.set(j + 1, String.valueOf(t));
                    }
                }
            }
            columnMax.add(columns.get(0));
        }

        System.out.println("---------- 每列的最大值 ----------");
        for (String max : columnMax) {
            System.out.println(max);
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < columnMax.size() - 1; i++) {
            for (int j = 0; j < columnMax.size() - i - 1; j++) {
                if (Double.valueOf(columnMax.get(j)) > Double.valueOf(columnMax.get(j + 1))) {
                    columnMax.set(j,
                            String.valueOf(Double.valueOf(columnMax.get(j)) + Double.valueOf(columnMax.get(j + 1))));
                    columnMax.set(j + 1,
                            String.valueOf(Double.valueOf(columnMax.get(j)) - Double.valueOf(columnMax.get(j + 1))));
                    columnMax.set(j,
                            String.valueOf(Double.valueOf(columnMax.get(j)) - Double.valueOf(columnMax.get(j + 1))));
                }
            }
        }

        return columnMax.get(0);
    }

    /**
     * 读取excel
     */
    private static List<List<List<String>>> readExcelWithoutTitle(String filepath) throws Exception {
        String fileType = filepath.substring(filepath.lastIndexOf(".") + 1, filepath.length());
        InputStream is = null;
        Workbook wb = null;
        try {
            is = new FileInputStream(filepath);

            if (fileType.equals("xls")) {
                wb = new HSSFWorkbook(is);
            } else if (fileType.equals("xlsx")) {
                wb = new XSSFWorkbook(is);
            } else {
                throw new Exception("读取的不是excel文件");
            }

            List<List<List<String>>> result = new ArrayList<>();// 对应excel文件

            int sheetSize = wb.getNumberOfSheets();
            for (int i = 0; i < sheetSize; i++) {// 遍历sheet页
                Sheet sheet = wb.getSheetAt(i);
                List<List<String>> sheetList = new ArrayList<>();// 对应sheet页

                int rowSize = sheet.getLastRowNum() + 1;

                for (int j = 0; j < rowSize; j++) {// 遍历行
                    Row row = sheet.getRow(j);
                    if (row == null) {// 略过空行
                        continue;
                    }
                    int cellSize = row.getLastCellNum();// 行中有多少个单元格，也就是有多少列
                    List<String> rowList = new ArrayList<>();// 对应一个数据行
                    for (int k = 0; k < cellSize; k++) {
                        Cell cell = row.getCell(k);
                        String value = null;
                        if (cell != null) {
                            value = cell.toString();
                        }
                        rowList.add(value);
                    }
                    sheetList.add(rowList);
                }
                result.add(sheetList);
            }

            return result;
        } catch (FileNotFoundException e) {
            throw e;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

}
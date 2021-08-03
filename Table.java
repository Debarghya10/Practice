public class Table {
    public static class Row {
        private int rowNumber;
        private String data;
        public Row ( int rowNumber , String data){
            this.rowNumber = rowNumber;
            this.data = data;
        }
        public int getRowNumber(){
            return rowNumber;
        }
        public void setData(int rowNumber){
            this.rowNumber = rowNumber;
        }
        public String getData(){
            return data;
        }
        public void setData(String data){
            this.data = data;
        }
    }

    private Row[] rows;
    private int currentRow;

    public Table() {
        this.rows = new Row[100];
        this.currentRow = 0;
    }

    public void addRow(Row row) {
        this.rows[currentRow++] = row;
    }

    public Row getRow(int rowNumber) {
        return this.rows[rowNumber];
    }
}

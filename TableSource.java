public class TableSource {
    public static void main(String[] args) {
        Table table = new Table();

        Table.Row row0 = new Table.Row(0, "DM10");


        Table.Row row1 = new Table.Row(1, "Debarghya");
        Table.Row row2 = new Table.Row(2, "Dido");
        table.addRow(row0);
        table.addRow(row1);
        table.addRow(row2);

        Table.Row row;

        row = table.getRow(0);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());

        row = table.getRow(1);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());

        row = table.getRow(2);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());
    }
}

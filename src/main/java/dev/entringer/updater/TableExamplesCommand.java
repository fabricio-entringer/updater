package dev.entringer.updater;

import dev.entringer.updater.console.ConsoleColor;
import dev.entringer.updater.console.ShellPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.table.ArrayTableModel;
import org.springframework.shell.table.BorderStyle;
import org.springframework.shell.table.TableBuilder;
import org.springframework.shell.table.TableModel;

import java.util.Arrays;

@ShellComponent
public class TableExamplesCommand {

    public String[] CONTINENTS = {"Europe", "North America", "South America", "Africa", "Asia", "Austraila and Oceania"};
    public String[] COUNTRIES1 = {"Germany", "USA", "Brasil", "Nigeria", "China", "Australia"};
    public String[] COUNTRIES2 = {"France", "Canada", "Argentina", "Egypt", "India", "New Zeeland sadf asfd asf asf asf asf as fasf asf  asf sadf  tryh uh sdfglh ljsdgfn s"};

//    @Autowired
//    ShellHelper shellHelper;
    @Autowired
ShellPrinter shellPrinter;

    @ShellMethod(value= "Display sample tables", key = "table")
    public void sampleTables() {
        Object[][] sampleData = new String[][] {
                CONTINENTS,
                COUNTRIES1,
                COUNTRIES2
        };
        TableModel model = new ArrayTableModel(sampleData);
        TableBuilder tableBuilder = new TableBuilder(model);

        System.out.println("air border style");
        tableBuilder.addFullBorder(BorderStyle.air);
        System.out.println(tableBuilder.build().render(80));

        System.out.println("oldschool border style");
        tableBuilder.addFullBorder(BorderStyle.fancy_light_quadruple_dash);
        System.out.println(tableBuilder.build().render(80));

        Arrays.stream(BorderStyle.values()).forEach(style -> {
            shellPrinter.printInfo(style.name());
            tableBuilder.addFullBorder(style);
            System.out.println(tableBuilder.build().render(80));
        });

    }

    @ShellMethod(key = "styles")
    public void printStyles() throws InterruptedException {
        for (ConsoleColor color: ConsoleColor.values()) {
            System.out.println(" ");
            System.out.println(color.name());
            shellPrinter.printCustom("Test message checking the text style for messages.", color.getCode());
            Thread.sleep(100);

        }
    }

}

package com.shop.util;

import com.shop.domain.Person;

import java.util.List;
import java.util.Objects;

import static com.shop.util.Precondition.checkArgument;
import static java.util.Objects.requireNonNull;

/**
 * This class is responsible for converting person objects to textual table.
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-17
 */
public class PersonTablePrinter {

    private final int[] columnsWidth;

    public PersonTablePrinter(int[] columnsWidth) {
        requireNonNull(columnsWidth);
        checkArgument(columnsWidth.length == 3, "Columns array length is less than 3");
        for (int columnWidth : columnsWidth) {
            checkArgument(columnWidth > 7, "Column width is less than 8");
        }
        this.columnsWidth = columnsWidth;
    }

    public String print(List<Person> people) {
        StringBuilder builder = new StringBuilder();
        buildHeader(builder);
        buildRows(people, builder);
        return builder.toString();
    }

    private void buildHeader(StringBuilder builder) {
        builder.append(field("Full Name", columnsWidth[0])).append("|")
                .append(field("Phone Numbers", columnsWidth[1])).append("|")
                .append(field("Active", columnsWidth[2])).append("|")
                .append('\n')
                .append(repeat("-", tableWidth()))
                .append('\n');
    }

    private void buildRows(List<Person> people, StringBuilder builder) {
        for (Person person : people) {
            builder.append(field(person.getName(), columnsWidth[0])).append("|")
                    .append(field(buildPhoneNumber(person), columnsWidth[1])).append("|")
                    .append(field(String.valueOf(person.isActive()), columnsWidth[2])).append("|")
                    .append('\n');
        }
    }

    private String buildPhoneNumber(Person person) {
        String phoneNumber = "";
        if (!person.getPhoneNumbers().isEmpty()) {
            phoneNumber = person.getPhoneNumbers().get(0);
            phoneNumber += "(" + (person.getPhoneNumbers().size() - 1) + ")";
        }
        return phoneNumber;
    }

    private String field(String text, int width) {
        String trimmed = text.trim();
        if (trimmed.length() > width) {
            return trimmed.substring(0, width - 3) + "...";
        }
        int availableSpace = width - trimmed.length();
        int left  = availableSpace / 2;
        int right = availableSpace - left;
        return repeat(" ", left) + trimmed + repeat(" ", right);
    }

    private int tableWidth() {
        int sum = 0;
        for (int width : columnsWidth) {
            sum += width;
        }
        return sum + columnsWidth.length;
    }

    private String repeat(String text, int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(text);
        }
        return builder.toString();
    }
}

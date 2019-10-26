public class _05_StringBuilder {

    public static void main(String[] args) {
        // string builders are useful for optimizing memory

        // not thread safe
        StringBuilder builder = new StringBuilder();
        builder.append(1)
                .append(" ala ")
                .append(true)
                .append('s')
                .append(23.00);

        String str = builder.toString();
        System.out.println(str);
        System.out.println(builder);

        // thread safe builder
        StringBuffer buffer = new StringBuffer();
        buffer.append(1)
                .append(" ala ")
                .append(true)
                .append('s')
                .append(23.00);
        System.out.println(buffer);
    }
}

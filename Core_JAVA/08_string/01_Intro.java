class Intro {
    public static void main(String[] args) {
        // String name = "Sanish";
        // String name = new String("Sanish");
        // name = name + " Kumar";
        // System.out.println("Hello "+name);


        StringBuffer sb = new StringBuffer("Sanish");
        sb.append(" Kumar");

        sb.insert(6, " Java ");
        sb.setLength(30);

        System.out.println(sb);
        System.out.println(sb.capacity());

    }
}

// Mutable Strings
// Immutable Strings
// String Buffer(HERE)
// String Builder
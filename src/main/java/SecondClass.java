
    /*class StringBuilderAppend{
        public static void main (String args[])
        {
            StringBuilder sb = new StringBuilder("Hello ");
            sb.append("Iuliia");
            System.out.println(sb);
        }
    } */

   /* class StringBuilderDelete {
        public static void main (String args [])
        {
            StringBuilder str = new StringBuilder("Welcome Iuliia");

            System.out.println("Before removal String = "
            +str.toString());

            StringBuilder afterRemoval = str.delete(4, 7);

            System.out.println("After removal String = "
            +afterRemoval.toString());

        }

    } */

   /* class StringBuilderDeleteChart {
        public static void main (String[] args)
        {
            StringBuilder str = new StringBuilder("HelloIuliia");

            System.out.println("Before removal String = "
            +str.toString());

            StringBuilder afterRemoval = str.deleteCharAt(3);

           System.out.println("After removal String = "
            + "at index 7 = "
            + afterRemoval.toString());

        }
    } */

   /* class StringBuilderInsert {
        public static void main (String[] args)
        {
            StringBuilder stringBuilder = new StringBuilder("Hello ");

            boolean flag = true;
            stringBuilder.insert(5, flag);

            System.out.println(stringBuilder.toString());

        }

    } */

   /* class   StringBuilderReplace {
        public static void main (String[] args){
            StringBuilder sr = new StringBuilder("HelloIuliia");

            System.out.println("String = "
            +sr.toString());

            StringBuilder srReturn = sr.replace(0,5, "I'm " );

            System.out.println("AfterReplace() String = "
            +srReturn.toString());

        }
    } */

    /*class StringBuilderReverse {
        public static void main (String[] args)
            {
              StringBuilder st = new StringBuilder("HelloIuliia");

                System.out.println("String = "
                + st.toString());

                StringBuilder reverseSt = st.reverse();

                System.out.println("Reverse String = "
                +reverseSt.toString());
        }
    } */

   /* class StringBuilderSubstring {
        public static void main (String[] args)
        {
            StringBuilder strn = new StringBuilder("HelloIuliia");

            System.out.println("String contains ="
            + strn);

            System.out.println("SubSequence = "
            +strn.substring(5));
        }
    } */

    class StringBuilderSubstringIntStartIntEnd {
        public static void main (String[] args)
        {
            StringBuilder strng = new StringBuilder("HelloIuliiaHello");

            System.out.println("String contains ="
            + strng);

            System.out.println("SubSequence = "
            + strng.substring(5,11));
        }
    }





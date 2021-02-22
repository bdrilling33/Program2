public class Program2 {

    public static void main(String[] args) {

        name name1 = new name("Mr", "Brice", "Paul", "Drilling");
        name name2 = new name("Mrs", "Stacy", "Lynn", "Johnson");

        System.out.println("Name #1:");

        System.out.println("Short name: " + name1.getShortName());
        System.out.println("Full name: " + name1.getFullName());
        System.out.println("Formal name: " + name1.getFormalName());
        System.out.println("Initials: " + name1.getInitials());
        System.out.println("Last, First: " + name1.getLastCommaFirst());

        System.out.println("Name #2:");

        System.out.println("Short name: " + name2.getShortName());
        System.out.println("Full name: " + name2.getFullName());
        System.out.println("Formal name: " + name2.getFormalName());
        System.out.println("Initials: " + name2.getInitials());
        System.out.println("Last, First: " + name2.getLastCommaFirst());


    }
}

    class name {
        private String prefix;
        private String first;
        private String middle;
        private String last;

        // Constructors

        name(String pre, String f, String m, String l){
            this.prefix = pre;
            this.first = f;
            this.middle = m;
            this.last = l;

        }


        // getters
        public String getShortName() {
            return this.first+" "+this.last;
        }

        public String getFullName() {

            return this.first + " " + this.middle + " " + this.last;
        }

        public String getFormalName() {
            return this.prefix + " " + this.first + " " + this.middle + " " + this.last;
        }

        public String getInitials() {
            String f = this.first;
            String m = this.middle;
            String l = this.last;

            return f.charAt(0) + "" + m.charAt(0) + l.charAt(0);
        }

        public String getLastCommaFirst() {

            return this.last + ", " + this.first;
        }


        // setters = none
    }


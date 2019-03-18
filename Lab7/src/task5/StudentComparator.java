package task5;

public enum StudentComparator implements java.util.Comparator<Student>, LoginSupport {
    AGE {
        @Override
        public void log() {
            System.out.println(name());
        }

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    },

    NAME {
        @Override
        public void log() {
            System.out.println(name());
        }

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    },

    RESULT {
        @Override
        public void log() {
            System.out.println(name());
        }

        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAverageScore(), o2.getAverageScore());
        }
    }
}

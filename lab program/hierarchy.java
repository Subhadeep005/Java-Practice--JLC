 class student
{
        private int sno;
        private String sname;
        public void setstud(int no,String name)
        {
                sno = no;
                sname = name;
        }
        public void putstud()
        {
                System.out.println("Student No : " + sno);
                System.out.println("Student Name : " + sname);
        }
}
class marks extends students
{
        protected int mark1,mark2;
        public void setmarks(int m1,int m2)
        {
                mark1 = m1;
                mark2 = m2;
        }
        public void putmarks()
        {
                System.out.println("Mark1 : " + mark1);
                System.out.println("Mark2 : " + mark2);
        }
}
class finaltot extends marks
{
        private int total;
        public void calc()
        {
                total = mark1 + mark2;
        }
        public void puttotal()
        {
                System.out.println("Total : " + total);
        }
        public static void main(String args[])
        {
                finaltot f = new finaltot();
                f.setstud(100,"Nithya");
                f.setmarks(78,89);
                f.calc();
                f.putstud();
                f.putmarks();
                f.puttotal();
        }
}

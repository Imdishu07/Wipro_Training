public class Project{
    public static void main(String[] args) {
        int[] empNo = {1001,1002,1003,1004,1005,1006,1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] date = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2008"};
        char[] DesigC = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] Dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] Basic = {20000,30000,10000,12000,50000,23000,29000};
        int[] HRA = {8000,12000,8000,6000,20000,9000,12000};
        int[] IT = {3000,9000,1000,2000,20000,4400,10000};

        char[] DesigC1 = {'e', 'c', 'k', 'r', 'm'};
        String[] Desig = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] DA = {20000,32000,12000,15000,40000};

        int empno = Integer.parseInt(args[0]);
        String name = "", jdate = "", department = "", designation = "";
        int B = 0, H = 0, I = 0, DAA = 0;
        char designationCode = ' ';
        boolean flag = false;

        for (int j = 0; j < 7; j++) {
            if (empno == empNo[j]) {
                name = empName[j];
                jdate = date[j];
                designationCode = DesigC[j];
                department = Dept[j];
                B = Basic[j];
                H = HRA[j];
                I = IT[j];
                flag = true;
            }
            else{
                for (int i = 0; i < 4; i++) {
                    if (designationCode == DesigC1[i]) {
                        DAA = DA[i];
                        designation = Desig[i];
                    }
                }
            }
        }
            if(flag == false){
                System.out.println("There No Employee With Id : " +empno);
            }else{
            int salary = 0;
            salary = B+H+DAA-I;
            System.out.println("Emp No"+"      "+"Emp Name"+"      "+"Departement"+"      "+"Designation"+"      "+"salary");
            System.out.println(empno + "      " + name + "      " + "      " + department + "      " + designation + "      " + salary);
            }
    }
}

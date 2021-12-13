
    class Country{
        char Country_Id;
        int RegionId;
        String Country_Name;
    }
    class Departments{
        int Dept_Id;
        int Manager_Id;
        int Location_Id;
        String Dept_Name;
    }
    class Jobs{
        String Job_Id;
        String Job_Title;
        int Min_Salary, Max_Salary;
    }
    class Regions{
        int Region_Id;
        String Region_Name;
    }
    public class HiringManager{
        public static void main(String[] args){
            Country c1= new Country();
            c1.Country_Id = '1';
            c1.RegionId=33;
            c1.Country_Name="India";

            Departments d1= new Departments();
            d1.Dept_Id=21;
            d1.Manager_Id=31;
            d1.Location_Id=22;
            d1.Dept_Name="Education";

            Jobs j1= new Jobs();
            j1.Job_Id="33AB";
            j1.Job_Title="Associate software engineer";
            j1.Min_Salary=5000;
            j1.Max_Salary=7000;

            Regions r1=new Regions();
            r1.Region_Id=43;
            r1.Region_Name="KARNATAKA"; 

            System.out.println("Country_Id" +""+ c1.Country_Id);
            System.out.println("RegionId"+""+ c1.RegionId);
            System.out.println("Country_Name"+""+ c1.Country_Name);
            System.out.println("----------------");
            System.out.println("Dept_Id"+""+ d1.Dept_Id);
            System.out.println("Manager_Id"+""+ d1.Manager_Id);
             System.out.println("Location_Id"+""+ d1.Location_Id);
           System.out.println("Dept_Name"+ d1.Dept_Name);
           System.out.println("----------------");
            System.out.println("Job_Id"+""+ j1.Job_Id);
            System.out.println("Job_Title"+""+ j1.Job_Title);
              System.out.println("Min_Salary"+""+ j1.Min_Salary);
                System.out.println("Max_Salary"+""+ j1.Max_Salary);
                System.out.println("----------------");
                  System.out.println("Region_Id"+""+ r1.Region_Id);
                    System.out.println("Region_Name"+""+ r1.Region_Name);

        }
    }


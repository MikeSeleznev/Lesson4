public class employee {
    String FIO;
    String Position;
    String Email;
    int Telephone;
    int Salary;
    int Age;
    public employee(){
        Age = 30;
        Email = "test@test.ru";
        FIO = "Селезнев Михаил Николаевич";
        Position = "Programmer";
        Salary = 100;
        Telephone = 8921891;
    }

    public employee(String _FIO, String _Position, String _Email, int _Telephone, int _Salary, int _Age) {
        FIO = _FIO;
        Position = _Position;
        Email = _Email;
        Telephone = _Telephone;
        Salary = _Salary;
        Age = _Age;
    }

    public void PrintInfo(){
        System.out.println(FIO + Position + Email + Telephone + Salary + Age);
    }
}

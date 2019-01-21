#include<iostream>
using namespace std;
typedef struct student
{
    char name[50];
    int roll;
    int marks;
    char phno[10];
    int dob;
};
   void get_data(student s[],int n)
{
    for(int i=0;i<n;i++)
    {

    cout<<"enter the student details:"<<endl;
    cout<<"Enter the student roll number:"<<endl;
    cin>>s[i].roll;
   cout<<"Enter the student name:"<<endl;
    cin>>s[i].name;
    cout<<"Enter the student marks:"<<endl;
    cin>>s[i].marks;
    cout<<"Enter the student phone number number:"<<endl;
    cin>>s[i].phno;
    cout<<"Enter the student date of birth:"<<endl;
    cin>>s[i].dob;
    cout<<endl;
    }
}
void show_data(student s[],int n)
{
    for(int i=0;i<n;i++)
    {
    cout<<"Details of students:"<<endl;
        cout<<"Roll number"<<s[i].roll<<endl;
        cout<<"Student name:"<<s[i].name<<endl;
        cout<<"student marks"<<s[i].marks<<endl;
        cout<<"student phone number"<<s[i].phno<<endl;
        cout<<"student date of birth"<<s[i].dob<<endl;
        }
}
void search(student s[],int n)
{
    int rollnumber;
    cout<<"Enter the roll number:";
    cin>> rollnumber;
    for(int i=0;i<n;i++)
    {
        if( s[i].roll==rollnumber )
        {
        cout<<"Student details"<<endl;
        cout<<"Details of students:"<<endl;
        cout<<"Roll number"<<s[i].roll<<endl;
        cout<<"Student name:"<<s[i].name<<endl;
        cout<<"student marks"<<s[i].marks<<endl;
        cout<<"student phone number"<<s[i].phno<<endl;
        cout<<"student date of birth"<<s[i].dob<<endl;
        }
        else
        {
            cout<<"Student Roll number not found:";
        }
}
}



int main()
{
 student s[2];
    int choice;
    do
    {
        cout<<"MENU"<<endl;
        cout<<"1.enter the student details:"<<endl;
        cout<<"2.display the student details:"<<endl;
        cout<<"enter the choice"<<endl;
        cin>>choice;
        switch(choice)
        {
            case 1: get_data(s,2);
            break;
            case 2:show_data(s,2);
              break;
              case 3:search(s,2);
              break;
              case 4:
                return 0;
            default:cout<<"invalid_number";
        }
    }while(choice!=4);
    return 0;
}

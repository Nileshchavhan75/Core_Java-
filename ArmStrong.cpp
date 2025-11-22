// #include<iostream>
// using namespace std;
// int main(){
//     int a, r, sum = 0, temp;
//     cout<<"Enter Number to check it Armstrog or not: ";
//     cin>>a;

//     temp = a;
//     while (a>0)
//     {
//         r = a%10;
//         sum = sum + (r*r*r);
//         a = a/10;
//     }

//     if(temp == sum){
//         cout<<"Number is Armstrong number";
//     }else{
//         cout<<"Number is not Armstrong number";
//     }
    
// }
#include<iostream>
using namespace std;
int main(){
    int n = 998;

    while(n>9){
        int ans = 0, rem;
        while (n != 0){
        rem = n%10;
        n/=10;
        ans+=rem;
    }
    n = ans;
    }
    cout<<"sum: "<<n;
}
#include <iostream>
#include <limits.h>

using namespace std;

int int_fibonacci(int n){
    int a = 0;
    int b = 1;
    for(int i = 0; i<n;i++){
        int r = a + b;
        b = a;
        a = r;
    }
    return a;
}

long long long_fibonacci(long long n){
    long long a = 0;
    long long b = 1;
    for(long long i = 0; i<n;i++){
        long long r = a + b;
        b = a;
        a = r;
    }
    return a;
}

short short_fibonnacci(short n){
    short a = 0;
    short b = 1;
    for(short i = 0; i<n;i++){
        short r = a + b;
        b = a;
        a = r;
    }
    return a;
}




int main()
{
    cout<<"OVERFLOW"<<endl;
    int n = 0;
    for(int i = 1; i<INT_MAX-1;i++){
        int image = int_fibonacci(i);
        if (0>image||image>INT_MAX){
            n = i;
            i = INT_MAX-1;
        }
    }
    cout<<"Para INT produce Overflow en: "<<n<<endl;
    long lin = 0;
    for(long long i = 46 ; i<LONG_LONG_MAX-1;i++){
        long long image = long_fibonacci(i);
        if (0>image||image>LONG_LONG_MAX){
            lin = i;
            i = LONG_LONG_MAX-1;
        }
    }

    cout<<"Para LONG produce Overflow en: "<<lin<<endl;

    short sn = 0;

    for(short i = 1; i<SHRT_MAX-1;i++){
        short image = short_fibonnacci(i);
        if (0>image||image>SHRT_MAX){
            sn = i;
            i = SHRT_MAX-1;
        }
    }
    cout<<"Para SHORT INT produce Overflow en: "<<sn<<endl;






}

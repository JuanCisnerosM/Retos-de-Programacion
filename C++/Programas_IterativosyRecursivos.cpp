/*
    Programa que contiene funciones iterativas y recursivas
    de los siguientes programas: 
    - NumPrimoIterativo
    - FactorialIterativo
    - ConversionDec_BinIterativo
    - FibonacciIterativo
    - FactorialRec
    - NumPrimoRec
    - ConversionDec_BinRec
    - FibonacciRec
*/
// Programa1 v.1

#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

using namespace std;

void Menu();
void NumPrimoIterativo();
void FactorialIterativo();
void ConversionDec_BinIterativo();
void FibonacciIterativo();
int FactorialRec(int);
int NumPrimoRec(int, int);
void ConversionDec_BinRec(int);
int Fibonacci_Rec(int);

int main(){
    int numprimo;
    Menu();

    getchar();
    return 0;
}

void Menu(){
    int Opcion;
    int n;
    int numprimo;
    int divisor;

    do{
        cout<<"\nHecho por: Juan\n";
        cout<<"\tMenu\n";
        cout<<"1. NumPrimoIterativo\n";
        cout<<"2. FactorialIterativo\n";
        cout<<"3. ConversionDec_BinIterativo\n";
        cout<<"4. FibonacciIterativo\n";
        cout<<"5. FactorialRec\n";
        cout<<"6. NumPrimoRec\n";
        cout<<"7. ConversionDec_BinRec\n";
        cout<<"8. FibonacciRec\n";
        cout<<"9. Salir\n";
        cout<<"Opcion: ";
        cin>>Opcion;

        switch(Opcion){
            case 1: NumPrimoIterativo();
                    system("pause");
                    break;
            case 2: FactorialIterativo();
                    system("pause");
                    break;
            case 3: ConversionDec_BinIterativo();
                    system("pause");
                    break;
            case 4: FibonacciIterativo();
                    system("pause");
                    break;
            case 5: cout<<"\n Digite numero para buscar su factorial: ";
                    cin>>n;
                    FactorialRec(n);
                    printf("El factorial es: %d\n", FactorialRec(n));
                    system("pause");
                    break;
            case 6: cout<<"\n Digite numero para saber si es primo: ";
                    cin>>numprimo;
                    if(NumPrimoRec(numprimo, numprimo - 1))
                        printf("%d Es primo\n", numprimo);
                    else
                        printf("%d No es primo\n", numprimo);
                    system("pause");
                    break;
            case 7: cout<<"\n Digite numero para convertir en binario: ";
                    cin>>n;
                    ConversionDec_BinRec(n);
                    cout<<"\n";
                    system("pause");
                    break;
            case 8: cout<<"\n Digite un numero: ";
                    cin>>n;
                    // Fibonacci_Rec(n);
                    cout<<" 0 ";
                    for(int i = 1; i <= n; i++){
                        cout<<Fibonacci_Rec(i)<<" ";
                        // cout<<"\n";
                    }
                    cout<<"\n";
                    system("pause");
                    break;
        }
        system("cls");
    }while(Opcion != 9);
    
}

void NumPrimoIterativo(){
    int n = 6; // Se ingresa el numero manualmente. El numero a evaluar si es primo
    int divisor = 2;
    int residuo = 0;
    int cociente = 0;
    for (divisor = 2; divisor <= 7; divisor++){
        cociente = n / divisor;
        residuo = n - (cociente * divisor);                     
        if (residuo == 0 && n != divisor){
            printf (" %d No es primo \n", n);
            break;
        };
        if (residuo == 0 && n ==divisor){
            printf (" %d Es primo \n", n);
        };
    }
}


void FactorialIterativo(){
    int n = 10, fact = 1, i; // Se ingresa el numero manualmente. El numero a calcular su factorial
    for(i = 1; i <= n; i++ )
    fact = fact * i;
    printf("El factorial de %d = %d", n, fact);
    printf(" \n ");
}

void ConversionDec_BinIterativo(){
    int bin[10]; // Se ingresa el numero manualmente. El numero a convertir a binario
    int i = 0, num, divisor2, cociente, residuo;
    num = 18;
    divisor2 = 2;
    do {
        cociente = num / divisor2;
        residuo = num -(cociente * divisor2);
        bin[i]= residuo; i++;
        num = cociente;
    } while (cociente != 0);
    for (int j = i-1; j >=0; j--){
        printf(" %d", bin[j]);
    }
    printf(" \n");
}

void FibonacciIterativo(){
    int fib_n1 = 0, fib_n2 = 1, fib_n = 0;      //Fib(0) = 0, Fib(1) = 1, Fib(n) = ?
    // int n = 10;
    printf(" fib (%d) = %d \n fib (%d) = %d \n\n\n", 0, fib_n1, 1, fib_n2);
    for (int f=2; f<= 10; f++){
        fib_n = fib_n1 + fib_n2;
        printf(" fib (%d) = %d \n", f,fib_n);
        fib_n1 = fib_n2;                        // 1
        fib_n2 = fib_n;                         // 1
    }
    printf( " \n ");
}

int FactorialRec(int n){
    if (n == 0){
        return 1;
    }
    else{
       return (FactorialRec(n-1) * n);
    }
    //return n;
    

}

int NumPrimoRec(int numprimo, int divisor){
    int residuo = 0, cociente = 0;
    cociente = numprimo / divisor;
    residuo = numprimo - (cociente * divisor);
    printf(" %d divisor : %d \n", numprimo, divisor);
    if (residuo == 0 && divisor ==1){
        return 1;
    }
    else {
        if (residuo == 0 && divisor > 1)
        return 0;
        else{
            return (NumPrimoRec(numprimo, divisor - 1));
        }
        
    }
}

void ConversionDec_BinRec(int n){
    int cociente, residuo, divisor = 2;
    cociente = n / divisor;
    residuo = n - (cociente * divisor);
    if (n < 2) {
        printf( "binario: %d", n);
    } else {
        ConversionDec_BinRec(cociente);
        printf (" %d", residuo);
    }
}

int Fibonacci_Rec(int x){
    if(x == 1 || x == 2){
        return 1;
    }
    return Fibonacci_Rec(x-1) + Fibonacci_Rec(x-2);
}


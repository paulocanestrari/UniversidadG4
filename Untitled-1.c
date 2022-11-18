#include<stdio.h>
#include<conio.h>

void cargar(int vec[10])

{
    int x,a=1;
    for(x=0;x<10;x++)
    {
        vec[x]=a;
        a++;
    }
}
void sumarpares(int vec[10])

{
    int x,a=0, b, c;
    for(x=0;x<10;x++)
    {
        a= vec[x];
        b= a %2;
        if (b==0){
		c+=a;  
		}
		}printf("suma del vector");
		printf("%i ",&c );
    }



void imprimir(int vec[10])
{
    int x;
    printf("Vector: ");
     for(x=0;x<10;x++)
    {
        printf("%i ",vec[x]);
    }
}


int main()
{
    int vector[10];
    cargar(vector);
    sumarpares(vector);
    imprimir(vector);
    getch();
    return 0;
}
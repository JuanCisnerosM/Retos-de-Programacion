/*
	Equipo 5
*/

#include<stdio.h>
#include<stdlib.h>

// Recibe dos subarreglos y los une en uno ordenadamente.
// low = Left, high = right
void merge(int a[],int low,int mid ,int high)
{
	int b[20]; //same size of a[]
	int i,j,k;
	i=low,j=mid+1,k=low;
	while(i<=mid && j<=high)
	{
		if(a[i]<=a[j])
		    b[k++]=a[i++];
		else
		   b[k++]=a[j++]; 
	}
	while (i<=mid)
		b[k++]=a[i++];
	while 
		(j<=high) b[k++]=a[j++];
		for (k=low;k<=high;k++)
	        a[k]=b[k];
}

// Ordenar el arreglo
void mergesort(int a[],int low,int high)
{
	int mid;
	if(low>=high)
	  return;
	mid=(low+high)/2; 			// Encuentra el punto medio
	mergesort(a,low,mid);		// Llamada por pirmera vez para la primera mitad
	mergesort(a,mid+1,high);	// Llamada por segunda vez para la segunda parte
	merge(a,low,mid,high);		// Mezcla las dos partes orednadas de las llamadas anteriores
}

// Funcion main
int main()
{
	int a[7] = {843, 240, 829, 530, 115, 621, 111};
	int n = 7;

	mergesort(a, 0, n-1);	//Llamada al metodo pasando los parametros declarados anteriormente
	
	printf("\n 83, 20, 9, 50, 115, 61, 17 \n");
	printf("\n Numeros ordenados por fusion : \n");

	// Imprime el arreglo ordenado
	int k;
	for(k=0;k<7;k++)
	    printf("%d\t",a[k]);
	return 0;
}
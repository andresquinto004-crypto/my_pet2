#include<stdio.h>
void matriz(){
    int filas,columnas;
    puts("Ingresa numero de filas y columnas deseadas: ");
    scanf("%i %i",&filas,&columnas);
    double tabla[filas][columnas];
    for (int i = 0; i<filas; i++){
        for (int ii = 0; ii < columnas; ii++){
            puts("Ingresa los numeros: ");
            scanf("%lf",&tabla[i][ii]);
            }
    }
    for (int i = 0; i<filas; i++){
        for (int ii = 0; ii < columnas; ii++){
            printf("%.2lf |",tabla[i][ii]);
        }
        printf("\n");
    }
}
void repetir(){
   int op;
    do{
    matriz();
    puts("\nDesea realizar otra operacion:\n1.Si\n2.No");
        scanf("%i",&op);
    }while(op!=2);
}
int main(){
    repetir();
    return 0;
}
/*REALIZAUN PROGRAMA QUE SOLICITE AL USUARIO
LA DIMENSION DE UNA MATRIZ FILAS Y COLUMNAS,
SOLICITA VARIOS VALORES PARA LLENAR ESA MATRIZ, POSTERIOR
MUESTRALA SIMULANDO UNA TABLA CONSIDERANDO QUE LOS DATOS
QUE DEBE DE INGRESAR PARA LLENAR LA MATRIZ SON DECIMALES

LAS INDICACIONES SE DEBEN DE REPETIR CADA QUE EL USUARIO 
QUIERA

NOTA:
CONSIDERANDO QUE EN LA FUNCION PRINCIPAL SOLO SE DEBE INVOCAR UNA FUNCION
*/